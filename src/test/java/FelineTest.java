import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();

        Assert.assertEquals("Семество кошачьих ест не как хищник", expected, actual);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();

        Assert.assertEquals("Не верно указанно семейство", expected, actual);
    }

    @Test
    public void getKittensWithOutCount() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();

        Assert.assertEquals("Не верное колличество котят, должно быть 1", expected, actual);
    }
}
