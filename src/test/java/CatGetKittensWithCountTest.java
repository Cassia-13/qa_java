import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CatGetKittensWithCountTest {
    private final int count;

    public CatGetKittensWithCountTest(int count) {
        this.count = count;
    }

    @Parameterized.Parameters(name = "Количество котят {0}")
    public static Object[][] getCount() {
        return new Object[][]{
                {1},
                {0},
                {15},
                {-5}
        };
    }

    @Test
    public void getKittensWithCountTest() {
        Feline feline = new Feline();
        int expected = count;
        int actual = feline.getKittens(count);

        Assert.assertEquals("Вернулось не то колличество, что переданно в метод", expected, actual);
    }
}
