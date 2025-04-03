import java.util.Random;

class EasyGenerator {
    private static Random random = new Random();

    public static String GeneratePassword() {
        StringBuilder Password = new StringBuilder();
        {
            int RandomNumber = random.nextInt(100, 999);
            Password.append(RandomNumber);
        }
        return Password.toString();
    }
/**
    public static String AIPassword()
    {
        StringBuilder AIpassword = new StringBuilder();
        {
            //Continue to make random letters appear
        }
        //Need return statement here
    }
 */
}