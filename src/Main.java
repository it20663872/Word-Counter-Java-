import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Word Counter");
        jFrame.setLayout(null);
        jFrame.setBounds(100,100,500,500);
        jFrame.setVisible(true);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50,50,300,200);

        JButton button = new JButton("Check");
        button.setBounds(180, 300, 100, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // 1- Get text from textArea...
                String text = textArea.getText();

                // 2- Splitting up the string and storing word into an array...
                if(!text.equals("")){
                    String[] word = text.split("\\s");

                    // 3- Display the result of words
                    JOptionPane.showMessageDialog(jFrame, "Total words: " +word.length);
                }
            }
        });

        jFrame.add(textArea);
        jFrame.add(button);
    }
}