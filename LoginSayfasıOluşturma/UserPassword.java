import java.util.HashMap;

public class UserPassword {
	
	HashMap<String, String > logininfo = new HashMap<String, String>();
	
	public UserPassword() {

		logininfo.put("Muhammed", "Bingol");
		logininfo.put("Alper", "Kama");
		logininfo.put("Zuhat", "Soylemez");
		
	}
	
	public HashMap getLoginInfo() {
		return logininfo;
		
	}
	

}
