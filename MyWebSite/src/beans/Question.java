package beans;

/**
 * questionsテーブルのデータを格納するためのBeans
 */
public class Question {
	private int id;
	private int userId;
	private int mentorId;
	private String userName;
	private String mentorName;
	private String subject;
	private String question;
	private String questionDate;
	private String reply;
	private String replyDate;




	// 全てのデータをセットするコンストラクタ
	public Question(int id, int user_id, int mentor_id, String user_name, String mentor_name, String subject, String question,
			 String question_date, String reply, String reply_date) {
		this.id = id;
		this.userId = user_id;
		this.mentorId = mentor_id;
		this.userName = user_name;
		this.mentorName = mentor_name;
		this.subject = subject;
		this.question = question;
		this.questionDate = question_date;
		this.reply = reply;
		this.replyDate = reply_date;

	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getUserId() {
		return userId;
	}




	public void setUserId(int userId) {
		this.userId = userId;
	}




	public int getMentorId() {
		return mentorId;
	}




	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getMentorName() {
		return mentorName;
	}




	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}




	public String getSubject() {
		return subject;
	}




	public void setSubject(String subject) {
		this.subject = subject;
	}




	public String getQuestion() {
		return question;
	}




	public void setQuestion(String question) {
		this.question = question;
	}




	public String getQuestionDate() {
		return questionDate;
	}




	public void setQuestionDate(String questionDate) {
		this.questionDate = questionDate;
	}




	public String getReply() {
		return reply;
	}




	public void setReply(String reply) {
		this.reply = reply;
	}




	public String getReplyDate() {
		return replyDate;
	}




	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}

}



