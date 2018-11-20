

public class llegalCredentialsException extends Exception{
    public static final int MIN_USERNAME = 6;
    public static final int MAX_USERNAME = 12;
    public static final int MIN_PASSWORD = 8;

    public llegalCredentialsException(){
        super("Ilegal Credentials. The CREDENTIALS MUST BE IN THE RANGE "+MIN_USERNAME+" and "+MAX_USERNAME);
    }


}
