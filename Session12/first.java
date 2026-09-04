package Session12;

public class first
{
    static String maskUsername(String username)
    {
        String masked = "";
        for (int i = 0; i < username.length() - 4; i++)
        {
            masked = masked + "*";
        }
        masked = masked + username.substring(username.length() - 4);
        return masked;
    }
    public static void main(String[] args)
    {
        String username = "insta_rockstar123";
        String result = maskUsername(username);
        System.out.println("Original Username: " + username);
        System.out.println("Masked Username: " + result);
    }
}