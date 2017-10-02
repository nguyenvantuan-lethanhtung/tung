package doan;
import java.awt.*; 
import javax.swing.*; 
public class Button extends JFrame{
	JFrame frame= new JFrame();
	JMenuBar mb=new JMenuBar();
	JTextField t=new JTextField(1);
	JButton b1=new JButton("click");
	public void Buttondemo (String title){
		this.setJMenuBar(mb);
		mb.add(b1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buttondemo b=

}
