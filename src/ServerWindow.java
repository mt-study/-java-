import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.text.JTextComponent;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow {

    public static void main(String[] args) {
     JFrame win=new JFrame("Tencent QQ");
     win.setLayout(null);
     win.setBounds(200, 100, 1100, 800);//窗口的大小定义
     String name=JOptionPane.showInputDialog("请输入您的名字");
     win.setVisible(true);
     win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
     //输入的面板
     JTextPane panel=new JTextPane();
     JScrollPane scrollPane=new JScrollPane(panel);
     scrollPane.setBounds(0, 0, 1100, 400);
     win.add(scrollPane);
         
     //输出的面板
     JPanel panel2=new JPanel();
     panel2.setLayout(null);
     panel2.setBounds(0, 400, 1100, 400);
     panel2.setBackground(Color.red);
     JTextField a2=new JTextField(60);
     a2.setBounds(300, 200, 500, 50);
     panel2.add(a2);
      //按钮“发送”
     JButton Song=new JButton("发送");
     panel2.add(Song);
     win.add(panel2);
	 Server b=new Server(a2,name,panel);
     
    }

}
