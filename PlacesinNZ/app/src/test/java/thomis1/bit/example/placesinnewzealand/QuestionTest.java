package thomis1.bit.example.placesinnewzealand;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionTest {
    Question One = new Question(R.drawable.townhall, R.drawable.anglican, R.drawable.larnarch, R.drawable.firstchurch, R.id.textView2, "Click on the Picture of the Anglican Church");
    Question Two = new Question(R.drawable.octagon, R.drawable.stkilda, R.drawable.stclair, R.drawable.baldwinst, R.id.textView4, "Click on the Picture of Baldwin Street");
    Question Three = new Question(R.drawable.anglican, R.drawable.otagouni, R.drawable.firstchurch, R.drawable.larnarch, R.id.textView3, "Click on the Picture of the First Church");

    @Test
    public void getPicture1Test() {
    assertEquals(R.drawable.townhall, One.getPicture1());
    }

    @Test
    public void getPicture2Test() {
        assertEquals(R.drawable.anglican, One.getPicture2());
    }

    @Test
    public void getPicture3Test() {
        assertEquals(R.drawable.larnarch, One.getPicture3());
    }

    @Test
    public void getPicture4Test() {
        assertEquals(R.drawable.firstchurch, One.getPicture4());
    }

    @Test
    public void getAnswerTest() {
        assertEquals(R.id.textView2, One.getAnswer());
    }

    @Test
    public void getQuestionTest() {
        assertEquals("Click on the Picture of the Anglican Church", One.getQuestion());
    }
}