import javax.swing.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LamdaTimerJFrame lamdaTimerJFrame = new LamdaTimerJFrame();
        lamdaTimerJFrame.setTitle("Timer");
        lamdaTimerJFrame.setSize(300, 100);
        lamdaTimerJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel();
        lamdaTimerJFrame.add(jLabel);

        lamdaTimerJFrame.setVisible(true);

        Timer timer = new Timer(1000, event ->{
            Date date = new Date();
            System.out.println(date.toString());
            jLabel.setText(date.toString());
        });
        timer.start();

    }
}
