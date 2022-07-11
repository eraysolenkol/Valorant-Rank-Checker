package valorantrankchecker;

import java.io.IOException;
import java.net.MalformedURLException;

import org.json.JSONException;
import org.json.JSONObject;

public class ApiConnection {

    public static String API_BASE = "https://api.henrikdev.xyz/valorant/v1/mmr/";


    public static Player getPlayerByName(String name, String tag, String region) throws MalformedURLException, IOException, JSONException {
        String API_URL = API_BASE + region + "/" + name + "/" + tag;
        JSONObject json = JsonReader.readJsonFromUrl(API_URL);

        if (json.getInt("status") == 200) {
            JSONObject data = json.getJSONObject("data");
            Player player = new Player(
                data.getString("name"),
                data.getString("tag"),
                data.getString("currenttierpatched"),
                data.getInt("currenttier"),
                data.getInt("ranking_in_tier"),
                data.getInt("elo"),
                data.getInt("mmr_change_to_last_game"),
                data.getBoolean("old")
            );

            return player;
        }
        return null;
    }
}
