import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AnimalCharacteristicsTest {
    Feline feline= new Feline();
    @Test
    public void getFamilyTest (){
      String family = feline.getFamily();
        assertEquals("Кошачьи", family,"Полученное значение не соответствует Кошачьим");
    }
@Test
     void getKittensTest (){
        int kittens=feline.getKittens();
        assertEquals(1,kittens,"Количество котят не соответствует не равен 1");
    }

    @Test
    void eatMeatTest() throws Exception {
        List<String> actualFood=feline.eatMeat();
        List<String>expectedFood= List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood,actualFood, "Тип питания не соответствует виду животного");
    }
}
