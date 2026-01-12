import com.example.LionAlex;
import com.example.Kittens;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionAlexTest {
    private Kittens kittens;
    LionAlex lion;

    {
        try {
            lion = new LionAlex(kittens);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Позитивная проверка. Метод должен возвращать Нью-Йоркский зоопарк")
    void getPlaceOfLivingLionAlex() {
        assertEquals("Нью-Йоркский зоопарк", lion.getPlaceOfLiving(), "Неверно указано место проживания");
    }

    @Test
    @DisplayName("Позитивная проверка. Метод должен возвращать 0")
    void getKittensLionAlex() {
        assertEquals(0, lion.getKittens(), "Алекс-самец у него не может быть котят");
    }

    @Test
    @DisplayName("Позитивная проверка. Метод возвращает друзей льва Алекса")
    void getFriendsLionAlex() {
        List<String> alexFriends = List.of("Марти", "Глория", "Мелман");
        assertEquals(alexFriends, lion.getFriends(), "Проверьте список друзей");
    }
}

