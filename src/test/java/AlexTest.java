import com.example.Alex;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AlexTest {

    @Test
    public void getFriendsTest() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        List<String> expected = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");

        List<String> actual = alex.getFriends();

        Assert.assertEquals("У Alex что-то не так с друзьями", expected, actual);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception{
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        String expected = "Нью-Йоркский зоопарк";

        String actual = alex.getPlaceOfLiving();

        Assert.assertEquals("Alex сменил место жительства", expected, actual);
    }

    @Test
    public void getKittensAlexTest() throws Exception {
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        int expected = 0;

        int actual = alex.getKittens();

        Assert.assertEquals("У Alex появились дети", expected, actual);
    }
}
