package loginpage;
import java.util.HashMap;
public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Vishnu","571");
        logininfo.put("MaheshBabu","SS");
        logininfo.put("Mahi","abc123");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}