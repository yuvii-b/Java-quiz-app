package questions;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Handler {
    public static void main(String[] args){
        ObjectMapper mapper = new ObjectMapper();
        Scanner sc = new Scanner(System.in);
        try {
            QuestionsByTopic questions = mapper.readValue(new File("src/questions/questions.json"), QuestionsByTopic.class);
            Map<String, List<Question>> questionsMap = questions.getQuestions();
            System.out.println("Enter topic: ");
            String topic = sc.nextLine().toLowerCase();
            if (!questionsMap.containsKey(topic)) {
                System.out.println("Invalid topic. Available topics are: " + questionsMap.keySet());
                return;
            }
            System.out.print("Enter the number of questions: ");
            int numQuestions = sc.nextInt();
            List<Question> questionList = questionsMap.get(topic);

            for (int i = 0; i < Math.min(numQuestions, questionList.size()); i++) {
                Question question = questionList.get(i);
                System.out.println("Question: " + question.getQuestion());

                List<String> options = question.getOptions();
                for (int j = 0; j < options.size(); j++) {
                    System.out.println("Option " + (j + 1) + ": " + options.get(j));
                }

                System.out.println("Answer: " + question.getAnswer());
                System.out.println();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
