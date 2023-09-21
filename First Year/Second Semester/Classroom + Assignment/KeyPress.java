/* Program 2:Write a program which receives the generated event when you press any key to
the object and displays it.Use awt event.
*/

import java.awt.*;
import java.awt.event.*;

public class KeyPress extends Frame {

  Label label;
  TextField txtField;

  public static void main(String[] args) {
    new KeyPress();
  }

  public KeyPress() {
    super("Key Press Event Frame");
    label = new Label();
    txtField = new TextField(20);
    txtField.addKeyListener(new MyKeyListener());
    add(label, BorderLayout.NORTH);
    add(txtField, BorderLayout.CENTER);

    // Add window close event listener
    addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
          dispose(); // Close the window
          System.exit(0); // Exit the application
        }
      }
    );

    setSize(400, 400);
    setVisible(true);
  }

  public class MyKeyListener extends KeyAdapter {

    public void keyPressed(KeyEvent ke) {
      char i = ke.getKeyChar();
      String str = Character.toString(i);
      label.setText(str);
    }
  }
}
