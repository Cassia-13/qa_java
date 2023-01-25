import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatTest {
    @Test
    public void getSoundTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        String expected = "Мяу";
        String actual = cat.getSound();

        Assert.assertEquals("Кошка говорит не 'Мяу'", expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        List<String> actual = cat.getFood();

        Assert.assertEquals("Кошка ест не как хищник", expected, actual);
    }
}
