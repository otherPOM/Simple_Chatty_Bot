package bot;

public class SimpleBot {
    private static String botName = "Charlie";
    private static int botBirthYear = 2020;
    public static void main(String[] args) {
        System.out.printf("Hello! My name is %s.\n" +
                "I was created in %d.\n", botName, botBirthYear);
    }
}
