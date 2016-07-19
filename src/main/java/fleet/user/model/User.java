package fleetmanagement.user.model;

public class User {


	
	private String username;
		
		
	private String password;
		
		
	private String userRole;

	public String getUsertype() {
			return userRole;
		}

		public void setUsertype(String usertype) {
			this.userRole = usertype;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	


}
