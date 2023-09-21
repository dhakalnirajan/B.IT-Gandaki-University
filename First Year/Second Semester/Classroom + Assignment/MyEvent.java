/* Program 3: Write a program using the swing to handle the mouse click on Frame. 
Add a button in the Frame. Implement ActionListener so that when you
click on the button change the display text of the button.
*/

import java.awt.event.*;
import javax.swing.*;

public class MyEvent extends JFrame {

  JButton b1;

  // Main Method
  public static void main(String arg[]) {
    MyEvent event = new MyEvent();
  }

  //Constructor for the event derived class
  public MyEvent() {
    super("Window Title: Event Handling");
    b1 = new JButton("Click Me");
    //place the button object on the window
    getContentPane().add(b1);

    //Register the listener for the button
    ButtonListener listen = new ButtonListener();
    b1.addActionListener(listen);
    //display the window in a specific size
    setVisible(true);
    setSize(200, 200);
  }

  //The Listener Class
  class ButtonListener implements ActionListener {

    //Definition for ActionPerformed() method
    public void actionPerformed(ActionEvent evt) {
      JButton source = (JButton) evt.getSource();
      source.setText("Button is clicked");
    }
  }
}
