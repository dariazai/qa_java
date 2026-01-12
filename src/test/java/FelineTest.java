import com.example.Feline;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FelineTest {
    Feline feline = new Feline();

    @Test
    @DisplayName("getFamily() должен возвращать 'Кошачьи' для представителя семейства")
    public void getFamilyFelineSuccess() {
        String family = feline.getFamily();
        assertEquals("Кошачьи", family, "Полученное значение не соответствует Кошачьим");
    }

    @Test
    @DisplayName("getKittens() должен возвращать 1. Позитивная проверка")
    void returnOfTheNumberOfKittens() {
        int kittens = feline.getKittens();
        assertEquals(1, kittens, "Количество котят не соответствует не равен 1");
    }

    @Test
    @DisplayName("eatMeat() должен возвращать список питания для хищников. Позитивная проверка")
    void returnOfFoodForPredators() throws Exception {
        List<String> actualFood = feline.eatMeat();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, actualFood, "Тип питания не соответствует виду животного");
    }
}
