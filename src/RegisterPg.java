import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static constants.Constants.*;

public class RegisterPg implements ActionListener {
    RegisterPg(Frame frame){
        //frame
        frame = new Frame("SIGN UP");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //labels
        heading = new Label("REGISTER");
        heading.setBounds(145, 50, 200, 30);
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        name = new Label("NAME: ");
        name.setBounds(40, 110, 100, 30);
        name.setFont(new Font("Brush Script MT", Font.BOLD, 24));
        email = new Label("E-MAIL ID: ");
        email.setBounds(40, 170, 200, 30);
        email.setFont(new Font("Brush Script MT", Font.BOLD, 24));
        age = new Label("AGE: ");
        age.setBounds(40, 230, 100, 30);
        age.setFont(new Font("Brush Script MT", Font.BOLD, 24));
        password = new Label("PASSWORD: ");
        password.setBounds(40, 290, 200, 30);
        password.setFont(new Font("Brush Script MT", Font.BOLD, 24));
        rePassword = new Label("PASSWORD(again): ");
        rePassword.setBounds(40, 350, 200, 30);
        rePassword.setFont(new Font("Brush Script MT", Font.BOLD, 20));
        result = new Label();
        result.setBounds(130, 460, 300, 30);
        result.setFont(new Font("Agency FB", Font.BOLD, 20));

        //TextFields
        nameInput = new TextField();
        nameInput.setBounds(250, 110, 240, 30);
        nameInput.setFont(new Font("Brush Script MT", Font.PLAIN, 20));
        emailInput = new TextField();
        emailInput.setBounds(250, 170, 240, 30);
        emailInput.setFont(new Font("Brush Script MT", Font.PLAIN, 20));
        ageInput = new TextField();
        ageInput.setBounds(250, 230, 240, 30);
        ageInput.setFont(new Font("Brush Script MT", Font.PLAIN, 20));
        passwordInput = new TextField();
        passwordInput.setBounds(250, 290, 240, 30);
        passwordInput.setFont(new Font("Brush Script MT", Font.PLAIN, 20));
        rePassInput = new TextField();
        rePassInput.setBounds(250, 350, 240, 30);
        rePassInput.setFont(new Font("Brush Script MT", Font.PLAIN, 20));


        //button
        submit = new Button("SUBMIT");
        submit.setBounds(200, 420, 100, 30);
        submit.setFocusable(false);
        submit.addActionListener(this);
        submit.setFont(new Font("Brush Script MT", Font.PLAIN, 15));
        back = new Button("BACK");
        back.setBounds(10, 35, 100, 30);
        back.setFont(new Font("Serif", Font.PLAIN, 15));
        back.addActionListener(this);
        back.setForeground(new Color(0, 100, 100));

        //adding components to the frame
        frame.add(heading);
        frame.add(name);
        frame.add(email);
        frame.add(age);
        frame.add(password);
        frame.add(rePassword);
        frame.add(nameInput);
        frame.add(emailInput);
        frame.add(ageInput);
        frame.add(passwordInput);
        frame.add(rePassInput);
        frame.add(submit);
        frame.add(result);
        frame.add(back);

        //frame features
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}