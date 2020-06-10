package thomis1.bit.example.placesinnewzealand;

import java.util.Random;

public class Question {
    private int number1;
    private int number2;
    private int answer;

    public Question()
    {
        Random rand = new Random();
        number1 = rand.nextInt(13);
        number2 = rand.nextInt(12);
        answer = number1*number2;

    }

    public int getAnswer()
    {
        return answer;
    }
    public String equation()
    {
        return number1 + " * " + number2;
    }
}
