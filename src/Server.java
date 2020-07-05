 

import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.StyledDocument;
 
public class Server {
	ServerSocket server;
	Socket socket;
	JTextField a2;//发送信息文本框
	JTextArea area;//接受文本框
	String name=null;
	int getout;
	JTextPane jPanel;
	StyledDocument doc;
	MessageBox p;
	public Server(JTextField a2,String name,JTextPane jPanel) {
		this.a2=a2;
		this.name=name;
		this.jPanel=jPanel;
		doc=jPanel.getStyledDocument();
		MessageBox p=new MessageBox(doc);

		try {
			server=new ServerSocket(5858);
			socket = server.accept();
			In ta=new In(socket,area,p);
			Out te=new Out(socket,a2,p);
			new Thread(ta).start();
			new Thread(te).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}