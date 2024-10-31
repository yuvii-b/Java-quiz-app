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
        user_topic = new Label();
        user_topic.setBounds(200, 290, 500, 30);
        user_topic.setFont(new Font("Serif", Font.BOLD, 20));
        user_ques = new Label();
        user_ques.setBounds(200, 350, 500, 30);
        user_ques.setFont(new Font("Serif", Font.BOLD, 20));

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
        start = new Button("START ==>");
        start.setBounds(340, 420, 130, 60);
        start.setFont(new Font("Serif", Font.BOLD, 20));
        start.setFocusable(false);
        start.addActionListener(this);

        //adding components
        frame.add(heading);
        frame.add(topic);
        frame.add(tech);
        frame.add(general);
        frame.add(num_questions);
        frame.add(start);
        frame.add(user_topic);
        frame.add(user_ques);

        //frame properties
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String topic = "";
        int no_questions = 0;
        if(e.getSource() == tech){
                topic = tech.getLabel();
                user_topic.setText("Topic: " + topic);
        }
        if(e.getSource() == general){
            topic = general.getLabel();
            user_topic.setText("Topic: " + topic);
        }
        for(int i = 0; i < 4; ++i){
            if(e.getSource() == questions[i]){
                user_ques.setText("No of questions: " + questions[i].getLabel());
                no_questions = Integer.parseInt(questions[i].getLabel());
            }
        }
        if(e.getSource() == start){
            new GameWindow(topic, no_questions);
        }
    }
}

