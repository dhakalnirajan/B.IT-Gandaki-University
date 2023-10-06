import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class MouseEventExample extends Frame implements MouseListener {

  Label label;

  MouseEventExample() {
    label = new Label();
    label.setBounds(20, 50, 100, 20);
    add(label);

    addMouseListener(this);

    setSize(400, 300);
    setLayout(null);
    setVisible(true);
  }

  public void mouseClicked(MouseEvent e) {
    label.setText("Mouse Clicked!");
    label.setBackground(Color.red);
  }

  public void mouseEntered(MouseEvent e) {
    label.setText("Mouse Entered!");
    label.setBackground(Color.green);
  }

  public void mouseExited(MouseEvent e) {
    label.setText("Mouse Exited!");
    label.setBackground(Color.cyan);
  }

  public void mousePressed(MouseEvent e) {
    label.setText("Mouse Pressed!");
    label.setBackground(Color.orange);
  }

  public void mouseReleased(MouseEvent e) {
    label.setText("Mouse Released!");
    label.setBackground(Color.yellow);
  }

  public static void main(String[] args) {
    new MouseEventExample();
  }
}
