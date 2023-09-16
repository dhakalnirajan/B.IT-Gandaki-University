import java.awt.*;
import javax.swing.*;

public class ButtonGridColor {

  JFrame f;

  ButtonGridColor() {
    f = new JFrame();

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");

    // Define an array of colors
    Color[] colors = {
      Color.RED,
      Color.GREEN,
      Color.BLUE,
      Color.YELLOW,
      Color.ORANGE,
      Color.PINK,
      Color.MAGENTA,
      Color.CYAN,
      Color.LIGHT_GRAY,
    };

    // Set different background colors for each button
    b1.setBackground(colors[0]);
    b2.setBackground(colors[1]);
    b3.setBackground(colors[2]);
    b4.setBackground(colors[3]);
    b5.setBackground(colors[4]);
    b6.setBackground(colors[5]);
    b7.setBackground(colors[6]);
    b8.setBackground(colors[7]);
    b9.setBackground(colors[8]);

    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(b7);
    f.add(b8);
    f.add(b9);

    f.setLayout(new GridLayout(3, 3));
    f.setSize(500, 500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new ButtonGridColor();
  }
}
