import java.util.Map;

public class LeakageDetector {
    private DataStorage dataStorage;

    public LeakageDetector(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void detectLeakage(String leakedData, String alteration) {
        boolean leakDetected = false;

        for (Map.Entry<Agent, Map<String, String>> entry : dataStorage.getStorage().entrySet()) {
            Agent agent = entry.getKey();
            Map<String, String> agentData = entry.getValue();

            for (Map.Entry<String, String> dataEntry : agentData.entrySet()) {
                String allocatedData = dataEntry.getKey();
                String allocatedAlteration = dataEntry.getValue();

                if (leakedData.equals(allocatedData) && alteration.equals(allocatedAlteration)) {
                    System.out.println("Data leaked from Agent: " + agent.getAgentId());
                    leakDetected = true;
                    break;
                }
            }
        }

        if (!leakDetected) {
            System.out.println("Source of leaked data not found.");
        }
    }
}
