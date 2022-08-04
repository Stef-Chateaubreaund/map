import java.util.HashMap;
import java.util.Set;

public class MapHashFirst{
    public static void main(String[] args) {

        // hashmap = song title : lyrics
        HashMap<String, String> trackList = new HashMap<String, String>();

        // add songs to tracklist hashmap
        trackList.put("Mr. Brightside", "Coming out of my cage, And I've been doing just fine...");
        trackList.put("Wonderwall", "Today is gonna be the day that they're gonna throw it back to you...");
        trackList.put("Can't Help Falling in Love", "Wise men say Only fools rush in, But I can't help falling in love with you..");
        
        String val = trackList.get("Wonderwall");

        for (String key : trackList.keySet()) {
            System.out.println(String.format("track:   %s        lyrics:    %s", key, trackList.get(key)));
            System.out.println("");
}
}
}