import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

public class ApiReader {

    public static String getCapitalCity(String code) {
        InputStream api;
        String result = null;
        try {
            api = new URL("https://restcountries.eu/rest/v2/callingcode/" + code).openStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(api, Charset.forName("UTF-8")));
            String jsonText = rd.readLine();

            JSONObject jsonObject = (JSONObject) new JSONArray(jsonText).get(0);
            result = jsonObject.get("capital").toString();
        } catch (Exception e){
            result = "Invalid city code";
        }
        finally {
            return result;
        }
    }
}
