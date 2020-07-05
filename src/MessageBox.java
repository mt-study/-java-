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
    	StyleConstants.setAlignment(bSet, StyleConstants.ALIGN_RIGHT);//右对齐
		doc.setParagraphAttributes(doc.getLength(),message.length(), bSet, false);//内容如何出现，没有这行没有输出！！！
    	try {
//			System.out.println("messstimeR="+doc.getLength());
			doc.insertString(doc.getLength(), message, bSet);//内容追加
		} catch (BadLocationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    }  
    public String Tostring(String p) {
		return p;
    	
    }
}  