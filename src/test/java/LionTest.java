import com.example.Kittens;
import com.example.Lion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    private Kittens kittens;

    public Lion getLion() {
        Lion lion;
        try {
            lion = new Lion("Самка", kittens);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return lion;
    }

    @Test
    @DisplayName("Проверка с Мок возращаемого списка еды для хищников")
    void mokGetFoodPredator() throws Exception {
        List<String> testFood = List.of("Корни", "Камни");
        when(kittens.getFood("Хищник")).thenReturn(testFood);
        List<String> actualFood = getLion().getFood();

        assertEquals(testFood, actualFood, "Тип питания не соответствует виду животного");
    }

    @Test
    @DisplayName("Проверка с Мок возвращаемого количества котят")
    void mokGetKittens() {
        int testValue = 5;
        when(kittens.getKittens()).thenReturn(testValue);
        int kittens = getLion().getKittens();

        assertEquals(testValue, kittens, "Количество котят не соответствует не равен 1");
    }
}


