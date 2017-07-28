package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.anOriginalMethodName();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
	public void anOriginalMethodName(){
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		frame.setVisible(true);
		frame.setSize(300, 300);
		button.setText("Add Name");
		button1.setText("View Names");
		frame.pack();
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button){
			names.add(JOptionPane.showInputDialog(null, "Enter Name Below: "));
		}
		if(e.getSource() == button1){
			for(int i = 0; 0 < names.size(); i++){
				
			}
		}
	}
}
