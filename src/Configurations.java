import java.io.FileReader;
import java.util.prefs.Preferences;

// Importing json packaes
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Configurations {
  Preferences preferences = 
      Preferences.userNodeForPackage(Configurations.class);

  public void setCredentials(String host, String port, String username, String password) {
	  
	//Host can contain ip and port: e.g : 192.168.1.1:3306
	preferences.put("host", host); //.parseJson();
    preferences.put("port", port);
	preferences.put("username", username);
    preferences.put("password", password);
  }
  
  public String getUusername() {
    return preferences.get("username", null);
  }

  public String getPassword() {
    return preferences.get("password", null);
  }
  
  public String getHost() {
	  return preferences.get("host", null);
  }
  
  public String getPortt() {
	  return preferences.get("port", null);
  }
  
  
  public void ReadFile() {
	  
      JSONParser jsonParser = new JSONParser();
  

	  try {
		  
		  // Indsæt stien til config filen her.
		  Object obj = jsonParser.parse(new FileReader("/path/FindStienHer"));
	      JSONObject jsonObject = (JSONObject) obj;
	      
	      
	      String host = (String) jsonObject.get("host");
	      String port = (String) jsonObject.get("port");
	      String username = (String) jsonObject.get("username");
	      String password = (String) jsonObject.get("password");
	      
	      jsonObject.get("host");
	      jsonObject.get("port");
	      jsonObject.get("username");
	      jsonObject.get("password");
	      
	  } catch (ParseException ex) {
	      ex.printStackTrace();
	  } catch (NullPointerException ex) {
	      ex.printStackTrace();
	  }
	  
  }
  
}
  


