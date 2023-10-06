import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample
  extends Frame
  implements KeyListener, WindowListener {

  Label l;
  TextArea area;

  KeyListenerExample() {
    l = new Label("");

    area = new TextArea();
    area.setBounds(10, 70, 300, 300);

    add(l);
    add(area);

    area.addKeyListener(this);

    // Add window close event listener
    addWindowListener(this);

    setSize(500, 400);
    setLayout(null);
    setVisible(true);
  }

  public void keyPressed(KeyEvent e) {
    l.setText("Pressed!");
    l.setBackground(Color.cyan);
  }

  public void keyReleased(KeyEvent e) {
    l.setText("Released");
    l.setBackground(Color.yellow);
  }

  public void keyTyped(KeyEvent e) {
    l.setText("Typed");
    l.setBackground(Color.green);
  }

  // WindowListener methods
  public void windowOpened(WindowEvent e) {}

  public void windowClosing(WindowEvent e) {
    dispose(); // Close the window
    System.exit(0); // Exit the application
  }

  public void windowClosed(WindowEvent e) {}

  public void windowIconified(WindowEvent e) {}

  public void windowDeiconified(WindowEvent e) {}

  public void windowActivated(WindowEvent e) {}

  public void windowDeactivated(WindowEvent e) {}

  public static void main(String[] args) {
    new KeyListenerExample();
  }
}
