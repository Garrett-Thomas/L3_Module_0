package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener, MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	String joptionName = "";
	String listOfNames;

	// HashMap<Integer, Double> logBook = new HashMap<Integer, Double>();
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.anOriginalMethodName();
		// Create a GUI with two buttons. One button reads "Add Name" and the
		// other button reads "View Names".
		// When the add name button is clicked, display an input dialog that
		// asks the user to enter a name. Add
		// that name to an ArrayList. When the "View Names" button is clicked,
		// display a message dialog that displays
		// all the names added to the list. Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
	}

	public void anOriginalMethodName() {
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(0);
		button.setText("Add Name");
		button1.setText("View Names");
		frame.pack();
	}

	public String createListOfNames() {
		for (int i = 0; i < names.size(); i++) {
			listOfNames = listOfNames + "\n Guest " + i + ": " + names.get(i);
		}
		return listOfNames;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			joptionName = JOptionPane.showInputDialog("Enter a name below: ");
			names.add(joptionName);
		}
		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, createListOfNames());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
