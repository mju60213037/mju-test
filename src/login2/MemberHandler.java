package login2;
import java.util.*;

class MemberHandler
{
	private MemberInfo[] members;
	private int idx;

	public MemberHandler(int num){
		members = new MemberInfo[num];
		idx = 0;
	}

	public void memberInsert(){ //회원가입용 메소드
		String uid, pwd, name;
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : "); uid = sc.nextLine();
		System.out.print("암 호 : "); pwd = sc.nextLine();
		System.out.print("이 름 : "); name = sc.nextLine();

		members[idx] = new MemberInfo(uid, pwd, name);
		idx++;
		System.out.println("가입 완료!! \n");
	}
	public void memberLoginEx(){ // 회원로그인용 메소드
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : "); String uid = sc.nextLine();
		System.out.print("패스워드 : "); String pwd = sc.nextLine();

		for (int i = 0 ; i < idx ; i++)
		{
			if (members[i].getUid().equals(uid) && members[i].getPwd().equals(pwd))
			{
				System.out.println("환영합니다.");
				System.out.println("로그인에 성공하였습니다. \n");
				return;
			}else if (!members[i].getUid().equals(uid))
			{
				System.out.println("존재하지 않는 아이디입니다. \n");
				return;
			}
			else if (members[i].getUid().equals(uid) && !members[i].getPwd().equals(pwd))
			{
				System.out.println("암호가 잘못되었습니다. \n");
				return;
			}
		}
		// System.out.println("아이디와 비밀번호를 확인해주세요.");

		/*
		로그인 성공시 : "로그인 되었습니다." 메세지 출력
		로그인 실패시 : "존재하지 않는 아이디 입니다." or "암호가 잘못되었습니다." 중 하나를 출력
		*/
	}

	public void memberLogin(){
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : "); String uid = sc.nextLine();
		System.out.print("패스워드 : "); String pwd = sc.nextLine();
		String msg = "존재하지 않는 아이디 입니다.";

		for (int i = 0 ; i < idx ; i++ )
		{
			if (members[i].getUid().equals(uid))
			{// members배열에 입력한 아이디가 있으면
				if (members[i].getPwd().equals(pwd))
				{
					msg = "로그인 되었습니다.";
				} else{
					msg = "로그인에 실패하였습니다. 다시 입력해주세요.";
				}
			}
		}
		System.out.println(msg);
	}
}