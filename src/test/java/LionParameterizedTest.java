import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class LionParameterizedTest {
    Lion lion;

    @ParameterizedTest
    @DisplayName("Проверка создания льва с разным полом")
    @ValueSource(strings = {"Самец", "Самка"})
    void createLionWithDifferentSex(String sex) {
        try {
            lion = new Lion(sex, new Feline());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        boolean b = lion.doesHaveMane();
        if (sex.equals("Самец")) {
            assertTrue(b, "У самца должна быть грива");
        } else {
            assertFalse(b, "У самки не должно быть гривы");
        }
    }
}

