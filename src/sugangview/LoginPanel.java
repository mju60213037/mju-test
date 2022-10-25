package sugangview;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JTextField tfId;
	private JPasswordField tfPassword;
	private SLogin sLogin;

	public LoginPanel() {
		LayoutManager layoutManager = new GridLayout(3, 2);
		this.setLayout(layoutManager);
		JLabel lbId = new JLabel("아이디");
		this.add(lbId);
		this.tfId = new JTextField();
		this.tfId.setColumns(10);
		this.add(this.tfId);
		
		JLabel lbPassword = new JLabel("비밀번호");
		this.add(lbPassword);
		this.tfPassword = new JPasswordField();
		this.tfPassword.setColumns(10);
		this.add(this.tfPassword);
		
		JButton btLogin = new JButton("로그인");
		this.add(btLogin);
		
		ActionHandler actionHandler = new ActionHandler();
		btLogin.addActionListener(actionHandler);
		
		this.sLogin = new SLogin();
	}
	
	private void login() {
		String id = this.tfId.getText();
		String password = this.tfPassword.getText();
		
		VLogin vLogin = sLogin.login(id, password);
		if (vLogin == null) {
			System.out.println("아이디가 존재하지 않거나 틀린 비밀번호 입니다.");
		}
		if (vLogin != null) {
			System.out.printf("로그인 되었습니다. 환영합니다 " + id + "님");
		}
		
	}

	private class ActionHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			login();
		}		
	}
}

