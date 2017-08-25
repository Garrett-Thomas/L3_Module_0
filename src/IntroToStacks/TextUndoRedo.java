package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String ch;
	Stack<String> characters = new Stack<String>();
	Stack<String> undo = new Stack<String>();
	Stack<String> redo = new Stack<String>();

	public static void main(String[] args) {
		TextUndoRedo txt = new TextUndoRedo();
		txt.anOriginalMethodName();
	}

	public void anOriginalMethodName() {
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
		frame.setVisible(true);
		frame.setSize(400, 400);
		label.setSize(350, 350);
		label.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
		 if (e.getKeyCode() == 8) {
			undo.add(characters.peek());
			characters.pop();
			label.setText("");
			for (int i = 0; i < characters.size(); i++) {
				label.setText(label.getText() + characters.get(i));
			}
		 }
		 if(e.getKeyCode() == 48) {
			 for (int i = 0; i < undo.size(); i++) {
				 label.setText(label.getText() + undo.get(i));
			}
		 }
			else {
				characters.add(e.getKeyChar() + "");
				label.setText(label.getText() + characters.peek());
			}
		}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
