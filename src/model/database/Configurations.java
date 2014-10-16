import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Importing json packaes
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Configurations {
	private String host;
	private String port;
	private String username;
	private String password;
	
	public String getHost() {
		return host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
    
	public void ReadFile() {
		JSONParser jsonParser = new JSONParser();

		try {
			FileReader json = new FileReader("config.json");

			Object obj = jsonParser.parse(json);
			JSONObject jsonObject = (JSONObject) obj;

			setHost((String) jsonObject.get("host"));
			setPort((String) jsonObject.get("port"));
			setUsername((String) jsonObject.get("username"));
			setPassword((String) jsonObject.get("password"));

		} catch (ParseException ex) {
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
  
 
  
}
