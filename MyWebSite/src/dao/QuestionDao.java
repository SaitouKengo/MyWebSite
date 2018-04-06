package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beans.Question;

public class QuestionDao {

    //全てのメッセージ情報を取得する

    public List<Question> findMessage() {
        Connection conn = null;
        List<Question> messageList = new ArrayList<Question>();

        try {
            // データベースへ接続
            conn = DBManager.getConnection();

            // SELECT文を準備

            String sql = "SELECT * FROM  questions WHERE user_id NOT IN ('') ";

             // SELECTを実行し、結果表を取得
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);


            while (rs.next()) {
                int id = rs.getInt("id");
                String userId = rs.getString("user_id");
                String mentorId = rs.getString("mentor_id");
                String userName = rs.getString("user_name");
                String mentorName = rs.getString("mentor_name");
                String subject = rs.getString("subject");
                String question = rs.getString("question");
                String questionDate = rs.getString("question_date");
                String reply = rs.getString("reply");
                String replyData = rs.getString("reply_date");

                Question questions = new Question(id, Integer.parseInt(userId), Integer.parseInt(mentorId), userName, mentorName, subject, question, questionDate, reply, replyData);

                messageList.add(questions);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            // データベース切断
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return messageList;
    }


    //メッセージ検索用
    public List<Question> findMessage(String userId,  String subject, String questionDate) {
        Connection conn = null;
        List<Question> messageList = new ArrayList<Question>();

        try {

            conn = DBManager.getConnection();

         String sql = "SELECT * FROM questions WHERE user_id NOT IN ('admin') ";

            if(!userId.equals("")) {
            	sql += " and login_id = '" + userId + "'";
            }

            if(!subject.equals("")) {
            	sql += " and name LIKE '" + '%' + subject + '%' + "'";
            }

            if(!questionDate.equals("")) {
            	sql += " and birth_date = '" + questionDate + "'";
            }

            System.out.println(sql);



            // SELECTを実行し、結果表を取得
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery(sql);

           // 結果表に格納されたレコードの内容を
           // Userインスタンスに設定し、ArrayListインスタンスに追加
           while (rs.next()) {
               int id = rs.getInt("id");
               String userIdData = rs.getString("user_id");
               String mentorIDData = rs.getString("mentor_id");
               String userNameData = rs.getString("user_name");
               String mentorNameData = rs.getString("mentor_name");
               String subjectData = rs.getString("subject");
               String questionData = rs.getString("question");
               String questionDateData = rs.getString("question_date");
               String replyData = rs.getString("reply");
               String replyDateData = rs.getString("reply_date");

               Question question = new Question(id, Integer.parseInt(userIdData), Integer.parseInt(mentorIDData), userNameData, mentorNameData,  subjectData, questionData,
            		   questionDateData, replyData,replyDateData);

               messageList.add(question);
           }


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            // データベース切断
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    return null;
                }
            }


        }

        return messageList;

    }

  //相談登録用メソッド
  		public static boolean messageInsert(int userId, int mentorId, String userName, String mentorName, String subject,String question, String questionDate) {
  			Connection conn = null;
  		try {
  			conn = DBManager.getConnection();



  			String sql = "INSERT INTO questions(user_id, mentor_id, user_name, mentor_name, subject, question, question_date) VALUES (?, ?, ?, ?, ?, ?, NOW())";

  			PreparedStatement pStmt = conn.prepareStatement(sql);
  			pStmt.setInt(1, userId);
  	        pStmt.setInt(2, mentorId);
  	        pStmt.setString(3, userName);
	        pStmt.setString(4, mentorName);
  			pStmt.setString(5, subject);
  	        pStmt.setString(6, question);


  	        pStmt.executeUpdate();

  			return true;

  		}catch(SQLException e) {
  			e.printStackTrace();
  			return false;
  		}finally {
  			//データベース切断
  			if(conn!=null) {
  				try {
  					conn.close();
  				}catch(SQLException e) {
  					e.printStackTrace();
  					return false;
  				}
  			}
  	    }
  	}


  	//返信登録用メソッド
  		public static boolean replyInsert(String reply,String id) {
  			Connection conn = null;
  		try {
  			conn = DBManager.getConnection();



  			String sql = "UPDATE questions SET reply = ? WHERE id = ?";

  			PreparedStatement pStmt = conn.prepareStatement(sql);
  			pStmt.setString(1, reply);
  			pStmt.setString(2, id);

  	        pStmt.executeUpdate();

  			return true;

  		}catch(SQLException e) {
  			e.printStackTrace();
  			return false;
  		}finally {
  			//データベース切断
  			if(conn!=null) {
  				try {
  					conn.close();
  				}catch(SQLException e) {
  					e.printStackTrace();
  					return false;
  				}
  			}
  	    }
  	}




  		 public Question findByQuestionInfo(String detailId) {
  	        Connection conn = null;
  	        try {
  	            // データベースへ接続
  	            conn = DBManager.getConnection();

  	            // SELECT文を準備
  	            String sql = "SELECT * FROM questions WHERE id = ?";

  	             // SELECTを実行し、結果表を取得
  	            PreparedStatement pStmt = conn.prepareStatement(sql);
  	            pStmt.setString(1, detailId);




  	            ResultSet rs = pStmt.executeQuery();


  	             // 主キーに紐づくレコードは1件のみなので、rs.next()は1回だけ行う
  	            if (!rs.next()) {
  	                return null;
  	            }


  	          int id = rs.getInt("id");
              String userIdData = rs.getString("user_id");
              String mentorIDData = rs.getString("mentor_id");
              String userNameData = rs.getString("user_name");
              String mentorNameData = rs.getString("mentor_name");
              String subjectData = rs.getString("subject");
              String questionData = rs.getString("question");
              String questionDateData = rs.getString("question_date");
              String replyData = rs.getString("reply");
              String replyDateData = rs.getString("reply_date");

              Question question = new Question(id, Integer.parseInt(userIdData), Integer.parseInt(mentorIDData), subjectData, userNameData, mentorNameData, questionData,
           		   questionDateData, replyData, replyDateData);

  	            return question;

  	        } catch (SQLException e) {
  	            e.printStackTrace();
  	            return null;
  	        } finally {
  	            // データベース切断
  	            if (conn != null) {
  	                try {
  	                    conn.close();
  	                } catch (SQLException e) {
  	                    e.printStackTrace();
  	                    return null;
  	                }
  	            }
  	        }
  	    }




}
