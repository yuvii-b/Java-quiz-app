package questions;

import java.util.List;
import java.util.Map;

public class QuestionsByTopic {
    private Map<String, List<Question>> questions;

    public Map<String, List<Question>> getQuestions() {
        return questions;
    }

    public void setQuestions(Map<String, List<Question>> questions) {
        this.questions = questions;
    }
}
