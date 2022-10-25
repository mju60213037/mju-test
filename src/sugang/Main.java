package sugang;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(400, 600);
		
		JLabel label = new JLabel("Test");
		mainFrame.add(label);
		JTextArea textId = new JTextArea("id");
		textId.setSize(10, 4); //이거 수정해야함. 교수님도 ㅁ?ㄹ
		mainFrame.add(textId);
		
		mainFrame.setVisible(true);
				
		
		
		
		PMainFrame pMainFrame = new PMainFrame();
		pMainFrame.show();
	}
}
