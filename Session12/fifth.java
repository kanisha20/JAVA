package Session12;

public class fifth
{
    static String maskWalletID(String walletID)
    {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < walletID.length() - 4; i++)
        {
            result.append("*");
        }
        result.append(walletID.substring(walletID.length() - 4));
        return result.toString();
    }

    public static void main(String[] args)
    {
        String walletID = "WAL12345678";
        String maskedID = maskWalletID(walletID);
        System.out.println("Wallet ID: " + walletID);
        System.out.println("Masked ID: " + maskedID);
    }
}