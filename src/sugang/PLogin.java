package sugang;
import java.util.Scanner;

public class PLogin {

	private SLogin sLogin;
	public PLogin() {
		this.sLogin = new SLogin();
	}
	public VLogin show() {
		System.out.print("아이디를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.next();
		scanner.close();
		
		VLogin vLogin = sLogin.login(id);
		if (vLogin == null) {
			//아이디가 업거나 비밀번호가 틀렸습니다.
			System.out.println("아이디가 없거나 비밀번호가 틀렸습니다.");
		}
		return vLogin;		
	
	}

}
