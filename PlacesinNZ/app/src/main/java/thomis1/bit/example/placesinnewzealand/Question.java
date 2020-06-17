package thomis1.bit.example.placesinnewzealand;

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

    public String getResponse1() { return response1; }

    public String getResponse2() { return response2; }

    public String getResponse3() { return response3; }

    public String getResponse4() { return response4; }
}
