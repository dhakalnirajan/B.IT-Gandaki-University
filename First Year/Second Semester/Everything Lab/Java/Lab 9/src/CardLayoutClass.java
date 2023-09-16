import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutClass {

  public static void main(String[] args) {
    JFrame aWindow = new JFrame();

    aWindow.setBounds(200, 200, 200, 200);
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container content = aWindow.getContentPane();
    content.add(new CardLayoutPanel());
    aWindow.setVisible(true);
  }
}

class CardLayoutPanel extends JPanel implements ActionListener {

  CardLayout card = new CardLayout(50, 50);

  public CardLayoutPanel() {
    setLayout(card);
    JButton button;

    for (int i = 1; i <= 6; i++) {
      add(button = new JButton("Press " + i), "Card " + i);
      button.addActionListener(this);
    }
  }

  // Handle Button Events

  public void actionPerformed(ActionEvent e) {
    card.next(this);
  }
}
