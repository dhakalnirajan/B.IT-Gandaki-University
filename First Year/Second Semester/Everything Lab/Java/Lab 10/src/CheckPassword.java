import java.awt.*;
import java.awt.event.*;

public class CheckPassword
  extends Frame
  implements ActionListener, WindowListener {

  Button b;
  Label l1, l2;
  TextField t;
  GridLayout glay;

  CheckPassword() {
    b = new Button("OK");
    l1 = new Label("Enter Password: ");
    l2 = new Label();
    t = new TextField(10);
    glay = new GridLayout(4, 1);
    setSize(300, 200);
    setLayout(glay);
    add(l1);
    add(l2);
    add(t);
    add(b);
    b.addActionListener(this);

    // Add the window close event listener
    addWindowListener(this);
  }

  public void actionPerformed(ActionEvent e) {
    String s = e.getActionCommand();
    String psw;
    if (s.equals("OK")) {
      psw = t.getText();
      if (psw.equals("BIT")) {
        l2.setText("Correct Password");
        l2.setBackground(Color.cyan);
      } else {
        l2.setText("Incorrect Password");
        l2.setBackground(Color.red);
      }
    }
  }

  public void windowOpened(WindowEvent e) {}

  public void windowClosing(WindowEvent e) {
    dispose(); // Close the window and release resources
    System.exit(0); // Exit the application
  }

  public void windowClosed(WindowEvent e) {}

  public void windowIconified(WindowEvent e) {}

  public void windowDeiconified(WindowEvent e) {}

  public void windowActivated(WindowEvent e) {}

  public void windowDeactivated(WindowEvent e) {}

  public static void main(String[] args) {
    CheckPassword cp = new CheckPassword();
    cp.setVisible(true);
  }
}
