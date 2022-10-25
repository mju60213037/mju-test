package lecture_1019ver2;

public class PMainFrame {

	private PLogin pLogin;
	
	public PMainFrame() {
		this.pLogin = new PLogin();
	}

	public void show() {
		VLogin vLogin = this.pLogin.show();
	}

}
