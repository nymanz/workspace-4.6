package entity;

public class User {
	private String name;
	private String password;
	private String sex;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User(String name, String password, String sex, String id) {
		super();
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.id = id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", sex=" + sex + ", id=" + id + "]";
	}
	
}
