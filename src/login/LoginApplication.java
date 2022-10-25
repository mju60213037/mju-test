package login;
import java.util.Scanner;

public class LoginApplication {
    private static int usernum = 0;
    private static User user[] = new User[10];
    private static Scanner scanner = new Scanner(System.in);
    private static String inputId, inputPassword, inputname;
    public static void main(String[] args) {
        for (int i=0;i<10;i++) //최대 10개의 아이디 저장 가능
            { user[i] = new User(); } //NullpointerException방지 배열 초기화

        boolean run = true;

        do {
            System.out.println("원하는 메뉴를 숫자로 입력하여 선택하세요: ");
            System.out.println("1.회원가입 2.로그인 3.종료");
            System.out.print("선택 > ");

            int select = scanner.nextInt();
            if (select == 1){ //1.회원가입 선택
                if (usernum == 10) {
                    System.out.println("용량 초과 회원가입 실패");
                    break;
                }
                else
                    createAccount();
            } else if (select == 2) {    //2.로그인 선택
                loginAccount();
            } else {                     //그외.종료 선택
                run = false;
            }
        }while (run);
        System.out.println("프로그램 종료");
    }

    private static void createAccount() {    //회원가입 선택
        System.out.print("아이디를 입력하세요 : ");
        inputId = scanner.next(); user[usernum].setId(inputId);
        System.out.print("비밀번호를 입력하세요 : ");
        inputPassword = scanner.next(); user[usernum].setPassword(inputPassword);
        System.out.print("닉네임을 입력하세요 : ");
        inputname = scanner.next(); user[usernum].setname(inputname);

        usernum++;
    }

    private static void loginAccount() {    //로그인 선택
        System.out.print("아이디를 입력하세요 : ");
        inputId = scanner.next();
        System.out.print("비밀번호를 입력하세요 : ");
        inputPassword = scanner.next();

        int loginSuccess = 0;
        for (int i=0;i < user.length;i++){
            if (inputId.equals(user[i].getId())&&inputPassword.equals(user[i].getPassword()))
            {
                System.out.println("로그인 성공");
                System.out.println(user[i].getId() + " " + user[i].getname());
                loginSuccess = 1;
                break;
            }
        }
        if (loginSuccess == 0)
            System.out.println("로그인 실패");
    }
}
