package ca.qc.lbpsb.fusion.fcmnotification.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 12/3/2017.
 */


public class Movies {


    private List<String> quizAnswers;
    private String correctAnswer;
    private String imagePoster;

    //-------------------------------------------

    public Movies() {
    }

    public Movies(List<String> quizAnswers, String correctAnswer, String imagePoster) {
        this.quizAnswers = quizAnswers;
        this.correctAnswer = correctAnswer;
        this.imagePoster = imagePoster;
    }

    public Movies(String correctAnswer, String imagePoster) {
        this.quizAnswers = new ArrayList<>();
        this.correctAnswer = correctAnswer;
        this.imagePoster = imagePoster;
    }


    //--------------------------------------------

    public List<String> getQuizAnswers() {
        return quizAnswers;
    }

    public void setQuizAnswers(List<String> quizAnswers) {
        this.quizAnswers = quizAnswers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getImagePoster() {
        return imagePoster;
    }

    public void setImagePoster(String imagePoster) {
        this.imagePoster = imagePoster;
    }


    //------------------------------------------


}
