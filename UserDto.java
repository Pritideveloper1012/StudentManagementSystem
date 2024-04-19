package admin_user.dto;

public class UserDto {
	private Long id;
	private String email;
	private String password;
	private String role;
	private String fullName;
	
	public UserDto(Long id, String email, String password, String role, String fullName) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.role = role;
		this.fullName = fullName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	

}
