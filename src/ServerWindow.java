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
     win.setBounds(200, 100, 1100, 800);//���ڵĴ�С����
     String name=JOptionPane.showInputDialog("��������������");
     win.setVisible(true);
     win.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
     //��������
     JTextPane panel=new JTextPane();
     JScrollPane scrollPane=new JScrollPane(panel);
     scrollPane.setBounds(0, 0, 1100, 400);
     win.add(scrollPane);
         
     //��������
     JPanel panel2=new JPanel();
     panel2.setLayout(null);
     panel2.setBounds(0, 400, 1100, 400);
     panel2.setBackground(Color.red);
     JTextField a2=new JTextField(60);
     a2.setBounds(300, 200, 500, 50);
     panel2.add(a2);
      //��ť�����͡�
     JButton Song=new JButton("����");
     panel2.add(Song);
     win.add(panel2);
	 Server b=new Server(a2,name,panel);
     
    }

}
