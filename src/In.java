import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.StyledDocument;

public class In implements Runnable {
	private Socket socket;
	private JTextArea area;
	private MessageBox p;
	public In(Socket socket,JTextArea area,MessageBox p) {
		this.socket=socket;
		this.area=area;
		this.p=p;
		
	}
	
	public void run() {
		// TODO 自动生成的方法存根
		try {
			
			while(true) {
			InputStream is = socket.getInputStream();//
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			p.LeftMessage(br.readLine()+"\n");
	
		} }catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
