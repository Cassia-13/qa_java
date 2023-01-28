import com.example.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class MockTest {

    @Mock
    Feline feline;

    @Test
    public void leafForHerbivores() throws Exception {
        List<String> expected = List.of("Трава", "Различные растения");
        Mockito.when(feline.eatMeat()).thenReturn(expected);

        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void allFamily() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Mockito.when(feline.getFamily()).thenReturn(expected);

        String actual = feline.getFamily();
        Assert.assertEquals(expected, actual);
    }
}
