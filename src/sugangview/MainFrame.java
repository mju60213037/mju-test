package sugangview;

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		this.setSize(400, 600);
		
		LayoutManager layoutManager = new BorderLayout();
		this.setLayout(layoutManager);
		
		LoginPanel loginPanel = new LoginPanel();
		this.add(loginPanel, BorderLayout.NORTH);
		
		SugansincheongPanel sugansincheongPanel = new SugansincheongPanel();
		this.add(sugansincheongPanel, BorderLayout.CENTER);
	}
}
