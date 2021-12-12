package data;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import model.Parameters;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class DataLoader {

    private static final String JSON_PATH = "src/main/resources/testData.json";

    public static List<Parameters> load() {
        List<Parameters> parameters = null;
        try (InputStream inputStream = new FileInputStream(JSON_PATH)) {
            JsonReader reader = new JsonReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            parameters = new Gson().fromJson(reader, new TypeToken<List<Parameters>>() {}.getType());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return parameters;
    }
}
