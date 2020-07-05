import java.awt.Frame;
import java.util.Scanner;

import javax.swing.*;  
import javax.swing.text.*;  
   
public class MessageBox  { 
	private StyledDocument doc;
    public MessageBox(StyledDocument doc)  
    {  
    	this.doc=doc;
    }
    public void LeftMessage(String message) {

    	SimpleAttributeSet aSet=new SimpleAttributeSet();
    	StyleConstants.setAlignment(aSet, StyleConstants.ALIGN_LEFT);
		doc.setParagraphAttributes(doc.getLength(),message.length(), aSet, true);
    	
    	try {

			doc.insertString(doc.getLength(), message, aSet);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
    public void RightMessage(String message) {
    	SimpleAttributeSet bSet=new SimpleAttributeSet();
    	StyleConstants.setAlignment(bSet, StyleConstants.ALIGN_RIGHT);//�Ҷ���
		doc.setParagraphAttributes(doc.getLength(),message.length(), bSet, false);//������γ��֣�û������û�����������
    	try {
//			System.out.println("messstimeR="+doc.getLength());
			doc.insertString(doc.getLength(), message, bSet);//����׷��
		} catch (BadLocationException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
    }  
    public String Tostring(String p) {
		return p;
    	
    }
}  