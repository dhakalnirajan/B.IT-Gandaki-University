import java.awt.*;
import java.awt.event.*;

public class KeyPress extends Frame {

  Label label;
  TextField tf;

  public static void main(String[] args) {
    new KeyPress();
  }

  public KeyPress() {
    super("Key Press Event");
    Panel panel = new Panel();
    label = new Label();
    tf = new TextField(20);
    tf.addKeyListener(new MyKeyListener());
    add(label, BorderLayout.NORTH);
    panel.add(tf, BorderLayout.CENTER);
    add(panel, BorderLayout.CENTER);

    addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          System.exit(0);
        }
      }
    );

    setSize(500, 500);
    setVisible(true);
  }

  // class which inherits Frame class and implements KeyListener interface
  public class MyKeyListener extends KeyAdapter {

    public void keyPressed(KeyEvent ke) {
      char i = ke.getKeyChar();
      String str = Character.toString(i);
      label.setText(str);
    }
  }
}
