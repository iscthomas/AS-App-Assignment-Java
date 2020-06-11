package thomis1.bit.example.placesinnewzealand;

public class Question {
    private int picture1;
    private int picture2;
    private int picture3;
    private int picture4;
    private int answer;
    private String question;

    public Question(int picture1, int picture2, int picture3, int picture4, int answer, String question) {
        this.picture1 = picture1;
        this.picture2 = picture2;
        this.picture3 = picture3;
        this.picture4 = picture4;
        this.answer = answer;
        this.question = question;
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
}
