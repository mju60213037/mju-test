package login3;

//https://www.youtube.com/watch?v=Hiv3gwJC5kw&ab_channel=BroCode

import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("mju1","60213037");
		logininfo.put("mju2","ict");
		logininfo.put("mju3","abc123");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}