import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static constants.Constants.*;

public class Intro implements ActionListener {
    Intro(String name){
        //frame
        frame = new Frame("WELCOME TO QUIZ IO!");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //label
        heading = new Label("Hello, " + name + " !");
        heading.setBounds(130, 30, 500, 50);
        heading.setFont(new Font("Serif", Font.BOLD, 30));
        topic = new Label("SELECT YOUR TOPIC FOR THE QUIZ");
        topic.setBounds(10, 100, 500, 30);
        topic.setFont(new Font("Serif", Font.BOLD, 20));
        num_questions = new Label("SELECT THE NUMBER OF QUESTIONS");
        num_questions.setBounds(10, 220, 500, 30);
        num_questions.setFont(new Font("Serif", Font.BOLD, 20));

        //buttons
        tech = new Button("TECH");
        tech.setBounds(25, 150, 100, 60);
        tech.setFont(new Font("Serif", Font.BOLD, 20));
        tech.setFocusable(false);
        tech.addActionListener(this);
        general = new Button("GENERAL");
        general.setBounds(200, 150, 130, 60);
        general.setFont(new Font("Serif", Font.BOLD, 20));
        general.setFocusable(false);
        general.addActionListener(this);
        for(int i = 0; i < 4; ++i){
            questions[i].setBounds(25, 250 + (i * 60), 60, 40);
            questions[i].setFont(new Font("Serif", Font.BOLD, 20));
            questions[i].setFocusable(false);
            questions[i].addActionListener(this);
            frame.add(questions[i]);
        }

        //adding components
        frame.add(heading);
        frame.add(topic);
        frame.add(tech);
        frame.add(general);
        frame.add(num_questions);

        //frame properties
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tech) System.out.println("TECH");
        if(e.getSource() == general) System.out.println("GENERAL");
        for(int i = 0; i < 4; ++i){
            if(e.getSource() == questions[i]){
                int no_questions = Integer.parseInt(questions[i].getLabel());
                System.out.println(no_questions);
            }
        }
    }
}

