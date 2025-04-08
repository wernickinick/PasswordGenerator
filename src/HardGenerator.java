import java.util.Random;

public class HardGenerator {
    private static Random random = new Random();

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
}
