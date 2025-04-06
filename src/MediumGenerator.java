import java.util.Random;

public class MediumGenerator {
    private static Random random = new Random();

    //Generates 5 random numbers
    public static String MediumGen()
    {
        StringBuilder MediumPassword = new StringBuilder();
        {
            int FiveRandomNumber = random.nextInt(10000,99999);
            MediumPassword.append(FiveRandomNumber);
        }
        return MediumPassword.toString();
    }
}
