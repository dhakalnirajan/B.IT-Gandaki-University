/* Program 1. Create a class named CheckBatch.Also, create a frame with a button, two labels and a textfield. The first label says
" Enter your batch: ". User should enter a batch in the textfield and click the
button. If the batch name is "BIT2023" then display "Permission granted" in the
second label with blue background. If the batch name is incorrect then display
"You have no permission" with red background.
*/

import java.awt.*;
import java.awt.event.*;

public class CheckBatch extends Frame implements ActionListener {

  Button b;
  Label l1, l2;
  TextField t;

  CheckBatch() {
    b = new Button("OK");
    l1 = new Label("Enter your batch:");
    l2 = new Label();
    t = new TextField(10);
    setLayout(new FlowLayout());
    add(l1);
    add(t);
    add(b);
    add(l2);

    b.addActionListener(this);

    setTitle("Check Batch");
    setSize(300, 150);

    // Add window close event listener
    addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          dispose(); // Close the window
          System.exit(0); // Exit the application
        }
      }
    );

    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    String s = e.getActionCommand();
    String batch;
    if (s.equals("OK")) {
      batch = t.getText();
      if (batch.equals("BIT2023")) {
        l2.setText("Permission granted");
        l2.setBackground(Color.blue);
      } else {
        l2.setText("You have no permission");
        l2.setBackground(Color.red);
      }
    }
  }

  public static void main(String args[]) {
    new CheckBatch();
  }
}
