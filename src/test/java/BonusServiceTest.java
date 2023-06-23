import org.example.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

   @Test
   void shouldCalculateForRegisteredAndUnderLimit(){
       BonusService service = new BonusService();
       long amount = 1000;
       boolean registered = true;
       long expected = 30;

       long actual = service.calculate(amount, registered);

       Assertions.assertEquals(expected, actual);
   }

    @Test
    void shoudCalculateForRegisteredAndOverLimit(){
       BonusService service = new BonusService();

       long amount = 1_000_000;
       boolean registered = true;
       long expected = 500;

       long actual = service.calculate(amount, registered);

       Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForUnregisteredAndUnderLimit(){
       BonusService service = new BonusService();

       long amount = 5_000;
       boolean registered = true;
       long expected = 50;

       long actual = service.calculate(amount,false);

       Assertions.assertEquals(expected, actual);
    }

    @Test

    void shouldForUnregisteredAndOverLimit(){
       BonusService service = new BonusService();

       long amount = 70_000_000;
       boolean registered = true;
       long expected = 500;

       long actual = service.calculate(amount, false);

       Assertions.assertEquals(expected, actual);

    }
}

