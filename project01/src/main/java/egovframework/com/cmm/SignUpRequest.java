package egovframework.com.cmm;

import java.io.Serializable;

import egovframework.let.sym.cal.service.Restde;

public class SignUpRequest extends Restde implements Serializable {



	private static final long serialVersionUID = 1702587637960557534L;
	
	private String userId;
	private String username;
    private String password;
	/** 사용자구분 */
	private String userSe;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getUserSe() {
		return userSe;
	}
	public void setUserSe(String userSe) {
		this.userSe = userSe;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "SignUpRequest [userId=" + userId + ", username=" + username + ", password=" + password + ", userSe="
				+ userSe + "]";
	}
    

    
}
