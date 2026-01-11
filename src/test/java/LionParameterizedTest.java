import com.example.Feline;
import com.example.Kittens;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LionTest {
    Lion lion;

    {

    }


    @ParameterizedTest
    @ValueSource(strings = {"Самец", "Самка"})
    void hasManeTest(String s) {
        try {
            lion = new Lion(s, new Feline());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        boolean b = lion.doesHaveMane();
        if (s.equals("Самец")) {
            assertEquals(true, b, "У самца должна быть грива");
        } else {
            assertEquals(false, b, "У самки не должно быть гривы");
        }
    }
    
}

