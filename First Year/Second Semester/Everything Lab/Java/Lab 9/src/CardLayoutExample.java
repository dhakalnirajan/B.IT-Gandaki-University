import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class CardLayoutExample {

  private CardLayout cardLayout;
  private JPanel cardPanel;

  public CardLayoutExample() {
    JFrame frame = new JFrame("CardLayout Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a JPanel to hold cards and set its layout to CardLayout
    cardPanel = new JPanel();
    cardLayout = new CardLayout();
    cardPanel.setLayout(cardLayout);

    // Create two cards (JPanels) with different content
    JPanel card1 = createCard("Card 1", Color.RED);
    JPanel card2 = createCard("Card 2", Color.BLUE);

    // Add cards to the cardPanel
    cardPanel.add(card1, "Card1");
    cardPanel.add(card2, "Card2");

    // Create buttons to switch between cards
    JButton showCard1Button = new JButton("Show Card 1");
    JButton showCard2Button = new JButton("Show Card 2");

    // Add action listeners to the buttons to switch cards
    showCard1Button.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          cardLayout.show(cardPanel, "Card1");
        }
      }
    );

    showCard2Button.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          cardLayout.show(cardPanel, "Card2");
        }
      }
    );

    // Create a main panel and add components to it
    JPanel mainPanel = new JPanel();
    mainPanel.add(showCard1Button);
    mainPanel.add(showCard2Button);

    // Add the main panel and cardPanel to the frame
    frame.add(mainPanel, BorderLayout.NORTH);
    frame.add(cardPanel, BorderLayout.CENTER);

    // Set the frame size and make it visible
    frame.setSize(400, 300);
    frame.setVisible(true);

    // Add a window close event handler
    frame.addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          System.exit(0);
        }
      }
    );
  }

  private JPanel createCard(String cardName, Color color) {
    JPanel card = new JPanel();
    card.setBackground(color);
    JLabel label = new JLabel(cardName);
    label.setFont(new Font("Arial", Font.PLAIN, 24));
    card.add(label);
    return card;
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          new CardLayoutExample();
        }
      }
    );
  }
}
