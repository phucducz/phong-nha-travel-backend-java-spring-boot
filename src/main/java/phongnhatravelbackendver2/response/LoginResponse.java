package phongnhatravelbackendver2.response;

public class LoginResponse {
	String accessToken;
	String tokenType = "Bearer";
	
	public LoginResponse(String accessToken) {
		super();
		this.accessToken = accessToken;
	}
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
}
