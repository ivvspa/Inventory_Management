import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        int num = random.nextInt(100);

        //frame
        JFrame frame = new JFrame("Guessing Game");
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3, 1));

        //panel for textboxes
        JPanel textPanel = new JPanel(new FlowLayout());
        JTextField textBox1 = new JTextField(8);
        textPanel.add(textBox1);

        //panel for buttons
        JPanel buttons = new JPanel(new FlowLayout());
        JButton enter = new JButton("Enter");

        buttons.add(enter);

        //panel for label
        JPanel results = new JPanel(new FlowLayout());
        JLabel label = new JLabel("Welcome to the Guessing Game!");
        results.add(label);
        frame.add(textPanel);
        frame.add(buttons);
        frame.add(results);


        frame.setVisible(true);


       /*private static void buttonStyle (JButton buttons){
           button.setFont(new Font("Arial", Font.BOLD, 32));
           button.setForeground(Color.BLUE);


       buttonStyle(enter);
       }
        */

        enter.addActionListener(new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                int guess = Integer.parseInt(textBox1.getText());
                int n=0;
                while (n >= 0) {

                        if (guess == num) {

                            label.setText("Congratulations! You win!");
                            label.setText("You won in " + (n + 1) + " guesses.");
                            System.exit(0);

                        } else if (guess < num) {

                            label.setText("Nope! Your guess is too low! Try again.");
                            n++;

                        } else {

                            label.setText("Nope!. Your guess is too high! Try again.");
                            n++;

                        }
                    }
                }
        });
    }
}