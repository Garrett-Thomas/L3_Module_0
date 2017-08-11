package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	HashMap<Integer, String> logBook = new HashMap<Integer, String>();
	int ID;
	String Name;
	int Entry;
	String listOfUsers;

	public static void main(String[] args) {
		LogSearch log = new LogSearch();
		log.anOriginalMethodName();
	}

	public void anOriginalMethodName() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.setVisible(true);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(0);
		button1.setText("Add Entry");
		button2.setText("Search by ID");
		button3.setText("View List");
		button4.setText("Remove Entry");
		frame.pack();
	}

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. Button 1: Add Entry When this button is
	 * clicked, use an input dialog to ask the user to enter an ID number. After
	 * an ID is entered, use another input dialog to ask the user to enter a
	 * name. Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog
	 * to ask the user to enter an ID number. If that ID exists, display that
	 * name to the user. Otherwise, tell the user that that entry does not
	 * exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list
	 * in a message dialog in the following format: ID: 123 Name: Harry Howard
	 * ID: 245 Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4:
	 * Remove Entry When this button is clicked, prompt the user to enter an ID
	 * using an input dialog. If this ID exists in the HashMap, remove it.
	 * Otherwise, notify the user that the ID is not in the list.
	 *
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			ID = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID Number: "));
			Name = JOptionPane.showInputDialog("Enter a Name: ");
			logBook.put(ID, Name);
		}
		if (e.getSource() == button2) {
			Entry = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID Number: "));
			if (logBook.containsKey(Entry)) {
				JOptionPane.showMessageDialog(null, logBook.get(Entry));
			} else {
				JOptionPane.showMessageDialog(null, "User doesn't exist");
			}
		}
		if (e.getSource() == button3) {
			for (int i = 0; i < logBook.size(); i++) {
				listOfUsers = listOfUsers + "\n ID: " + i + " Name: " + logBook.get(i);
			}
			JOptionPane.showMessageDialog(null, listOfUsers);
			listOfUsers = "";

		}
		if (e.getSource() == button4) {
			Entry = Integer.parseInt(JOptionPane.showInputDialog("Enter an ID Number: "));
			if (logBook.containsKey(Entry)) {
				JOptionPane.showMessageDialog(null, logBook.remove(Entry) + " has been removed");
			} else {
				JOptionPane.showMessageDialog(null, "User doesn't exist");
			}
		}
	}
}
