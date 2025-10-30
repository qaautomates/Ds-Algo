package utilities;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
	
    private HashMap<String, String> dataMap = new HashMap<>();

    public void setContext(String key, String value) {
        dataMap.put(key, value);
    }

    public String getContext(String key) {
        return dataMap.get(key);
    }
}
	


