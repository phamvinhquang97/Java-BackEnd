package thuy.dto;

// DATA TRANSFER OBJECT
public class User {
	// access modifier public/private/protected/default
	public String name;
	public String mobile;
	public String date;

	public User(String name, String mobile, String date) {
		this.name = name;
		this.mobile = mobile;
		this.date = date;
	}

}
