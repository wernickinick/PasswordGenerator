import java.util.Random;
import java.util.random.RandomGenerator;

class EasyGenerator {
    Random random = new Random();
    String IncludeinPassword;
    int RandomNumberRange = random.nextInt();

    public EasyGenerator(String includeinPassword, int easy)
    {
        IncludeinPassword = includeinPassword;
    }

    int randomNumberRange = random.nextInt(100);




}
