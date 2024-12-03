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
        JLabel label = new JLabel("Result");
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
                int textBox1 = Integer.parseInt(label.getText());  //reads the value of the label and converts it to int and assigns it to the variable called number
                while (textBox1 >= 0) {






                    int guess = scan.nextInt();
                    System.out.println("Your guess is " + guess + "?");
                    System.out.println("Drumroll, please......");




                    if (guess == random) {


                        System.out.println("Congratulations! You win!");
                        System.out.println("You won in " + (n + 1) + " guesses.");
                        System.exit(0);


                    } else if (guess < random) {


                        System.out.println("Nope! Your guess is too low! Try again.");
                        n++;


                    } else {


                        System.out.println("Nuh-uh. Your guess is too high! Try again.");
                        n++;


                    }


                    label.setText(String.valueOf(n));




           else if (textBox1.hasNext() && textBox1.next().equals("quit")) {


                        System.out.println("Really? Welp, see you soon! \nOh, by the way, it was " + randomNum);
                        System.exit(0);


                    }


                    else {


                        String invalidInput = scan.nextLine();
                        System.out.println("Error: This is not a valid number.");
                        System.out.println("Try not breaking the game next time.");
                        System.exit(0);


                    }


                }
                label.setText(String.valueOf(n));
            }
        });
    }
}



















