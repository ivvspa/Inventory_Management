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
        enter.setFont(new Font("Arial", Font.BOLD, 20));


        buttons.add(enter);


        //panel for label
        JPanel results = new JPanel(new FlowLayout());
        JLabel label = new JLabel("Welcome to the Guessing Game!");
        label.setFont(new Font("Arial", Font.BOLD, 15));
        results.add(label);
        frame.add(textPanel);
        frame.add(buttons);
        frame.add(results);

        frame.setVisible(true);

        enter.addActionListener(new ActionListener() {
            int n = 0;
            public void actionPerformed(ActionEvent e) {
               play(num, label,textBox1, n);
               n++;
            }
        });
    }

public static void play(int num, JLabel label, JTextField textBox1, int n){
    int guess;
    while (true) { //n: 0
        guess = Integer.parseInt(textBox1.getText());
        if (guess == num) {
            label.setText("Congratulations! You win!");
            label.setText("You won in " + n + " guesses.");
           break;
        } else if (guess < num) {
            label.setText("Nope! Your guess is too low! Try again.");
           break;
        } else {
            label.setText("Nope!. Your guess is too high! Try again.");
            break;
        }
    }
}
}




