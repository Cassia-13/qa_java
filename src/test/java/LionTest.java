import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {

    private final String sex;

    public LionTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters(name = "Входные параметры пола {0}")
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец"},
                {"Самка"},
        };
    }

    @Test
    public void getKittensWithCountTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sex);
        int expected = 1;
        int actual = lion.getKittens();
        Assert.assertEquals("Не верное колличество котят, должно быть 1", expected, actual);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sex);

        boolean expected = sex.equals("Самец");

        boolean actual = lion.doesHaveMane();

        Assert.assertEquals("Что-то не то с гривой", expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sex);

        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        List<String> actual = lion.getFood();

        Assert.assertEquals("Кошка ест не как хищник", expected, actual);
    }
}
