package formdata.entity;

public class FormData {

String userName;
String email;
String password;
public FormData() {
	super();
	// TODO Auto-generated constructor stub
}
public FormData(String userName, String email, String password) {
	super();
	this.userName = userName;
	this.email = email;
	this.password = password;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "FormData [userName=" + userName + ", email=" + email + ", password=" + password + "]";
}


}
