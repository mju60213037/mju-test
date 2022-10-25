package lecture_1019;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LayoutManager layoutManager = new BorderLayout();
		this.setLayout(layoutManager);
		
		SugansincheongPanel sugansincheongPanel = new SugansincheongPanel();
		this.add(sugansincheongPanel, BorderLayout.CENTER);
		
		LoginDialog loginPanel = new LoginDialog(this);
		loginPanel.setVisible(true);
	}
}
