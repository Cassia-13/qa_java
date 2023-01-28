import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTest {

    private final String animalKind;

    public AnimalTest(String animalKind) {
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters(name = "Тип животного: {0}")
    public static Object[][] getSex() {
        return new Object[][]{
                {"Травоядное"},
                {"Хищник"},
        };
    }

    @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();

        List expected;
        if (animalKind.equals("Травоядное")) {
            expected = List.of("Трава", "Различные растения");
        } else {
            expected = List.of("Животные", "Птицы", "Рыба");
        }

        List<String> actual = animal.getFood(animalKind);

        Assert.assertEquals("Хивотные едят что-то не то", expected, actual);
    }

    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();

        Assert.assertEquals("Неверные види животных", expected, actual);
    }
}
