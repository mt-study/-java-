import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.StyledDocument;
 
public class Client {
	Socket socket;
	JTextField a2;
	JTextArea area;
	private String name=null;
	private JTextPane jPane;
	StyledDocument doc;
	MessageBox p;
	public Client(JTextField a2,String name,JTextPane jPanel) {
	this.a2=a2;
	this.name=name;
	doc=jPanel.getStyledDocument();
	p=new MessageBox(doc);
	try {
		socket =new Socket("localhost",5858);
		System.out.println("连接成功！");
		In ta=new In(socket,area,p);
		Out te=new Out(socket,a2,p);
		new Thread(ta).start();
		new Thread(te).start();
	} catch (UnknownHostException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	} catch (IOException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	}
}