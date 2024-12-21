package Swing;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
public class Eg1 {
 Eg1()
 {
	 JFrame f=new JFrame();
	 DefaultListModel<String>l1 = new DefaultListModel<>();
	 l1.addElement("Zishan");
	 l1.addElement("Vishal");
	 l1.addElement("Quadir");
	 l1.addElement("Adil");
	 JList<String> list = new JList<>(l1);
	 list.setBounds(100,100,75,75);
	 f.add(list);
	 f.setSize(400,400);
	 f.setLayout(null);
	 f.setVisible(true);
	 
 }
 public static void main(String d[])
 {
	 new Eg1();
 }
}
