package thomis1.bit.example.placesinnewzealand;

/**
 * @author Isaac Thomas
 * @date 17/6/2020
 * The question class is the bass class for the application which is used to create an array in the
 * main activity
 */
public class Question {
    private int picture1;
    private int picture2;
    private int picture3;
    private int picture4;
    private int answer;
    private String question;
    private String response1;
    private String response2;
    private String response3;
    private String response4;

    /**
     * @param picture1  the first picture in the question (top left)
     * @param picture2  the second picture in the question (top right)
     * @param picture3  the third picture in the question (bottom left)
     * @param picture4  the fourth picture in the question (bottom right)
     * @param answer    the answer to the question in textviewid
     * @param question  string for the question to be displayed
     * @param response1 string for the response if wrong answer is chosen in the top left (picture 1)
     * @param response2 string for the response if wrong answer is chosen in the top left (picture 2)
     * @param response3 string for the response if wrong answer is chosen in the botom left (picture 3)
     * @param response4 string for the response if wrong answer is chosen in the bottom right (picture 4)
     */

    public Question(int picture1, int picture2, int picture3, int picture4, int answer, String question, String response1, String response2, String response3, String response4) {
        this.picture1 = picture1;
        this.picture2 = picture2;
        this.picture3 = picture3;
        this.picture4 = picture4;
        this.answer = answer;
        this.question = question;
        this.response1 = response1;
        this.response2 = response2;
        this.response3 = response3;
        this.response4 = response4;
    }

    public int getPicture1() {
        return picture1;
    }

    public int getPicture2() {
        return picture2;
    }

    public int getPicture3() {
        return picture3;
    }

    public int getPicture4() {
        return picture4;
    }

    public int getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getResponse1() {
        return response1;
    }

    public String getResponse2() {
        return response2;
    }

    public String getResponse3() {
        return response3;
    }

    public String getResponse4() {
        return response4;
    }
}
