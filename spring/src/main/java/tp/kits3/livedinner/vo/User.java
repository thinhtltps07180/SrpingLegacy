package tp.kits3.livedinner.vo;

public class User {
	private String username;
	private String password;
	private String email;
	private Integer role;

	public User(String username, String password, String email, Integer roleId) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = roleId;
	}

	public User() {
		super();
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the roleId
	 */
	public Integer getRoleId() {
		return role;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Integer roleId) {
		this.role = roleId;
	}

}
