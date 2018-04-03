package beans;

import java.util.Date;

/**
 * userテーブルのデータを格納するためのBeans
 */
public class User {
	private int id;
	private String loginId;
	private String name;
	private Date birth_date;
	private String password;
	private String create_date;
	private String update_date;
	private String profile;
	private String picture;
	private int user_type;

	// ログインセッションを保存するためのコンストラクタ
	public User(int id, String login_Id, String name) {
		this.id = id;
		this.loginId = login_Id;
		this.name = name;
	}

	// 全てのデータをセットするコンストラクタ
	public User(int id, String login_Id, String name, Date birth_date, String password,
			String create_date, String update_date,String profile, String picture, int user_type) {
		this.id = id;
		this.loginId = login_Id;
		this.name = name;
		this.birth_date = birth_date;
		this.password = password;
		this.create_date = create_date;
		this.update_date = update_date;
		this.profile = profile;
		this.picture = picture;
		this.user_type = user_type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getUser_type() {
		return user_type;
	}

	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}
}
