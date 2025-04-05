import java.util.Random;

class EasyGenerator {
    private static Random random = new Random();

    //Creates 3 Random Numbers
    public static String GeneratePassword() {
        StringBuilder Password = new StringBuilder();
        {
            int RandomNumber = random.nextInt(100, 999);
            Password.append(RandomNumber);
        }
        return Password.toString();
    }

    //Creates 4 random Letters
    public static String AIPassword()
    {
        StringBuilder RandomLetters = new StringBuilder();
        {
            for(int i = 0; i < 4; i++)
            {
                char RandomLetter = (char) (random.nextInt(26) + 'A');
                RandomLetters.append(RandomLetter);
            }
        }
        return RandomLetters.toString();
    }
}