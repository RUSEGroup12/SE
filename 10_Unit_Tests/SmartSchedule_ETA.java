/* Brian Ellsworth
 * The main method executes a request using the Google Maps API.
 * The jsonToMinutes method is passed the JSON from Google and 
 * returns the estimated time of arrival (ETA) in minutes. 
 * The main method then prints the ETA. 
 */

package smartSchedule;
import org.json.*;
import java.net.*;
import java.io.*;

public class SmartSchedule_ETA {

	public static void main(String[] args) {

		String input = executePost("https://maps.googleapis.com/maps/api/directions/json?origin=Toronto&destination=Montreal&key=AIzaSyCpl9VDsbJ_-tmb2askZQ-nABj_pj6PVh4","");
		System.out.println(jsonToMinutes(input));
		return;
	
	}


public static int jsonToMinutes(String input){


			int duration = 0 ;

		try{

			JSONObject googleJSON  = new JSONObject(input); // json
			duration = googleJSON.getJSONArray("routes").getJSONObject(0).getJSONArray("legs").getJSONObject(0).getJSONObject("duration").getInt("value");
			duration /= 60;
			return duration;

		}catch(JSONException pe){

			System.out.println("position: " + pe.getMessage());
			System.out.println(pe);
		}	
		
		return 0; // return 0 if try statement fails
	
	}

public static String executePost(String targetURL, String urlParameters) {
	  HttpURLConnection connection = null;

	  try {
	    //Create connection
	    URL url = new URL(targetURL);
	    connection = (HttpURLConnection) url.openConnection();
	    connection.setRequestMethod("POST");
	    connection.setRequestProperty("Content-Type", 
	        "application/x-www-form-urlencoded");

	    connection.setRequestProperty("Content-Length", 
	        Integer.toString(urlParameters.getBytes().length));
	    connection.setRequestProperty("Content-Language", "en-US");  

	    connection.setUseCaches(false);
	    connection.setDoOutput(true);

	    //Send request
	    DataOutputStream wr = new DataOutputStream (
	        connection.getOutputStream());
	    wr.writeBytes(urlParameters);
	    wr.close();

	    //Get Response  
	    InputStream is = connection.getInputStream();
	    BufferedReader rd = new BufferedReader(new InputStreamReader(is));
	    StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
	    String line;
	    while ((line = rd.readLine()) != null) {
	      response.append(line);
	      response.append('\r');
	    }
	    rd.close();
	    return response.toString();
	  } catch (Exception e) {
	    e.printStackTrace();
	    return null;
	  } finally {
	    if (connection != null) {
	      connection.disconnect();
	    }
	  }
	}

}