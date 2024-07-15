package modle;

public class UserModle extends AbstractModle<UserModle>{
	
	private String userName;
	private String fullName;
	private String password;
	private int status;
	private long roleId;
	private RoleModle role = new RoleModle();
	
	public RoleModle getRole() {
		return role;
	}
	public void setRole(RoleModle role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
