import java.util.Random;

public class HardGenerator {
    private static Random random = new Random();

    //Generates hard random
    public static String ComplexGen()
    {
        StringBuilder HardPassword = new StringBuilder();
        {
            for(int i =0; i < 15; i++)
            {
                char RandomComplex = (char) (random.nextInt(26) + '!');
                HardPassword.append(RandomComplex);
            }
        }
        return HardPassword.toString();
    }

    //Generates hard for include in
    public static String ComplexShortGen()
    {
        StringBuilder HardIncludePassword = new StringBuilder();
        {
            for(int i =0; i < 7; i++)
            {
                char RandomComplex = (char) (random.nextInt(26) + '!');
                HardIncludePassword.append(RandomComplex);
            }
        }
        return HardIncludePassword.toString();
    }
}
