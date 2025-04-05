import java.util.Random;

class EasyGenerator {
    private static Random random = new Random();

    //private String Letters = ["a","b","c"]

    public static String GeneratePassword() {
        StringBuilder Password = new StringBuilder();
        {
            int RandomNumber = random.nextInt(100, 999);
            Password.append(RandomNumber);
        }
        return Password.toString();
    }

    public static String AIPassword()
    {
        StringBuilder AIPassword = new StringBuilder();
        {
            //int RanomLetters = random.toString()
            //Continue to make random letters appear
        }
        //Need return statement here
    }
}