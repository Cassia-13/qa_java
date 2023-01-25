import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class LionSexExceptionTest {
    private final String sex;

    public LionSexExceptionTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters(name = "Входные параметры пола {0}")
    public static Object[][] getSex() {
        return new Object[][]{
                {"Сам"},
                {"453"},
                {"&*"}
        };
    }

    @Test
    public void lionSexExceptionTest() throws Exception {
        Feline feline = new Feline();
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        String actual = "";
        try {
            Lion lion = new Lion(feline, sex);
            fail();
        } catch (Exception exception) {
            actual = exception.getMessage();
        }

        Assert.assertEquals(expected, actual);
    }
}
