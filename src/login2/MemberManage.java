package login2;
import java.util.*;

class MemberManage
{
	public static void main(String[] args) 
	{
		MemberHandler handler = new MemberHandler(100);

		while (true)
		{
			System.out.println("------- 메뉴 선택 -------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로 그 인");
			System.out.println("9. 프로그램 종료");

			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice)
			{
			case 1:
				handler.memberInsert(); break;
			case 2:
				handler.memberLogin(); break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			}

		}
	}
}