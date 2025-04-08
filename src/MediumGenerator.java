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

    //Creates 5 Random Letters
    public static String FiveLetterGen()
    {
        StringBuilder MediumPassGen = new StringBuilder();
        {
            for(int i = 0; i < 6; i++)
            {
                char RandomLetter =  (char) (random.nextInt(26) + 'A');
                MediumPassGen.append(RandomLetter);
            }
        }
        return MediumPassGen.toString();
    }
}
