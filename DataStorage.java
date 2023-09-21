import java.util.HashMap;
import java.util.Map;

public class DataStorage {
    private Map<Agent, Map<String, String>> storage;

    public DataStorage() {
        this.storage = new HashMap<>();
    }

    public void storeData(Agent agent, String data, String alteration) {
        storage.computeIfAbsent(agent, k -> new HashMap<>()).put(data, alteration);
    }

    public Map<Agent, Map<String, String>> getStorage() {
        return storage;
    }
}
