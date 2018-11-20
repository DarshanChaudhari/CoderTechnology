
public class CheckException {


    public static void validateUsername(String name) throws Exception{
      //  boolean result = false;
        int namelen = name.length();
        if(namelen<llegalCredentialsException.MIN_USERNAME || namelen>llegalCredentialsException.MAX_USERNAME)
            throw new llegalCredentialsException();

        for (int i = 0; i<name.length();i++){
            char c = name.charAt(i);
            if (c == ' '){
                throw new Exception("USERNAME SHOULD NOT CONTAIN SPACE");
            }

    }

    }

    public static void validatePassword(String password) throws Exception{

        int passlen = password.length();
        if(passlen<llegalCredentialsException.MIN_PASSWORD)
            throw new Exception("PASSWORD MUST BE GREATER THAN 8 CHARACTERS");


      /*  for (int i = 0; i<passlen;i++){
            char c = password.charAt(i);
            if ((c >= '0' && c <= '9')){
                throw new Exception("PASSWORD MUST CONTAIN ATLEAST ONE CHARACTER");
            }
            else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ){
                throw new Exception("PASSWORD MUST CONTAIN ATLEAST ONE DIGIT");
            }

        }*/

        if (password.matches("[0-9]")) {
           // conditions = conditions + 10;
            //throw new Exception("PASSWORD MUST CONTAIN ATLEAST ONE DIGIT");
        }
        else{
            throw new Exception("PASSWORD MUST CONTAIN ATLEAST ONE CHARACTER");
        }

        if (password.matches("[a-z]") || password.matches("[A-Z]")){
           // conditions = conditions + 26;
            throw new Exception("PASSWORD MUST CONTAIN ATLEAST ONE DIGIT");
        }



   }
    }


