import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    Cat cat = new Cat(new Feline());

    @Test
    @DisplayName("Позитивная проверка метода, возвращающего голос кошки")
    void getCatSoundSuccess() {
        String actualSound = cat.getSound();
        String expectedSound = "Мяу";
        assertEquals(expectedSound, actualSound, "Кошка неверно говорит");
    }

    @Test
    @DisplayName("Позитивная проверка метода, возвращающего питание для кошки")
    void getCatFoodSuccess() throws Exception {
        List<String> actualFood = cat.getFood();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, actualFood, "Тип питания не соответствует виду животного");
    }
}
