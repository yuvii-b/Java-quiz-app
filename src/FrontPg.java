import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static constants.Constants.*;

class MainContent implements  ActionListener{
    MainContent(){
        //frame
        frame = new Frame("QUIZ APPLICATION!");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //labels
        heading = new Label("QUIZ.IO");
        heading.setBounds(145, 100, 200, 30);
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        info = new Label("Test and Assess your Knowledge!");
        info.setBounds(100, 130, 300, 30);
        info.setFont(new Font("Serif", Font.BOLD, 20));
        registerMessage = new Label("New User? Register Here!  ");
        registerMessage.setBounds(100, 200, 300, 30);
        registerMessage.setFont(new Font("Brush Script MT", Font.BOLD, 24));
        loginMessage = new Label("Already an User? Login Here!  ");
        loginMessage.setBounds(90, 310, 400, 30);
        loginMessage.setFont(new Font("Brush Script MT", Font.BOLD, 24));


        //buttons
        register = new Button("REGISTER");
        register.setBounds(190, 250, 100, 30);
        register.setFocusable(false);
        register.addActionListener(this);
        register.setFont(new Font("Brush Script MT", Font.PLAIN, 15));
        login = new Button("LOGIN");
        login.setBounds(190, 350, 100, 30);
        login.setFocusable(false);
        login.addActionListener(this);
        login.setFont(new Font("Brush Script MT", Font.PLAIN, 15));

        //adding components
        frame.add(heading);
        frame.add(info);
        frame.add(registerMessage);
        frame.add(loginMessage);
        frame.add(register);
        frame.add(login);

        // frame properties
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource() == register){
                frame.removeAll();
                new RegisterPg(frame);

        }
            if(e.getSource() == login){
                frame.removeAll();
                new LoginPg(frame);
            }
    }
}

public class FrontPg {
    public static void main(String[] args) {
        new MainContent();
    }
}
