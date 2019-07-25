package pojo;

public class User {
	
	private Credentials credential;
	private AccountInfo accountInfo;

	public User() {
		credential = new Credentials();
		accountInfo = new AccountInfo();
	}

	public Credentials getCredential() {
		return credential;
	}

	public AccountInfo getAccountInfo() {
		return accountInfo;
	}
}
