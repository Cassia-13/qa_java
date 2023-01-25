import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class AnimalFoodExceptionTest {

    private final String animalKind;

    public AnimalFoodExceptionTest(String animalKind) {
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters(name = "Тип животного: {0}")
    public static Object[][] getSex() {
        return new Object[][]{
                {"Хищ"},
                {"Трав"},
                {"453"},
                {"&*"}
        };
    }

    @Test
    public void animalFoodExceptionTest() throws Exception {
        Animal animal = new Animal();
        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        String actual = "";
        try {
            animal.getFood(animalKind);
            fail();
        } catch (Exception exception) {
            actual = exception.getMessage();
        }
        Assert.assertEquals(expected, actual);
    }
}
