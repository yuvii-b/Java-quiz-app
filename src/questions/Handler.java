package questions;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Handler {
    ObjectMapper mapper = new ObjectMapper();
    Scanner sc = new Scanner(System.in);

    public void generateQuestions(String topic, int count){
        try{
            QuestionsByTopic jsonQuestions = mapper.readValue(new File("src/questions/questions.json"), QuestionsByTopic.class);
            Map<String, List<Question>> questionsMap = jsonQuestions.getQuestions();
            List<Question> questions = questionsMap.get(topic.toLowerCase());
            for(int i = 0; i < Math.min(count, questions.size()); ++i){
                Question question = questions.get(i);
                List<String> options = question.getOptions();
                System.out.println(question.getQuestion());
                for(int j = 0; j < options.size(); ++j){
                    System.out.println("Option " + (j + 1) + ": " + options.get(j));
                }
                System.out.println("Answer: " + question.getAnswer());
                System.out.println();
            }


        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
