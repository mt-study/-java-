import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import javax.swing.JTextField;

public class Out implements Runnable{
	Scanner sc=new Scanner(System.in);
	private Socket socket;
	private String text;
	JTextField a2;
	String name=null;
	private MessageBox p;
	public Out(Socket socket,JTextField a2,MessageBox p) {
	this.socket=socket;
	this.a2=a2;
	this.p=p;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		OutputStream out;
		try {
			out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
			PrintWriter pw = new PrintWriter(osw, true);
			a2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO 自动生成的方法存根
					String Temptext=a2.getText();
					pw.println(Temptext);
					a2.setText("");
					p.RightMessage(Temptext+"\n");
				}
			});
			
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}			
		
	}
	}