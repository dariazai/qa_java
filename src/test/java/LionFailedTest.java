import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LionFailedTest {

    @Test
    @DisplayName("Проверка ошибки при создании льва с некорректным полом")
    void createLionWithWrongSex() {
        Exception exception = assertThrows(
                Exception.class,
                () -> new Lion("НЛО", new Feline()));
        assertEquals(
                "Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
