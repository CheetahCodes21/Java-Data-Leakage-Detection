import java.util.HashMap;
import java.util.Map;

public class Agent {
    private String agentId;
    private String agentName;
    private Map<String, String> allocatedData;

    public Agent(String agentId, String agentName) {
        this.agentId = agentId;
        this.agentName = agentName;
        this.allocatedData = new HashMap<>();
    }

    public String getAgentId() {
        return agentId;
    }

    public void allocateData(String data, String alteration) {
        allocatedData.put(data, alteration);
    }

    @Override
    public String toString() {
        return "Agent{" +
                "agentId='" + agentId + '\'' +
                ", agentName='" + agentName + '\'' +
                ", allocatedData=" + allocatedData +
                '}';
    }
}
