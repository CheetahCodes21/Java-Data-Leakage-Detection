import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get agent details
        System.out.print("Enter Agent ID: ");
        String agentId = scanner.nextLine();

        System.out.print("Enter Agent Name: ");
        String agentName = scanner.nextLine();

        // Create agent
        Agent agent = new Agent(agentId, agentName);

        // Get allocated data details
        System.out.print("Enter Allocated Data: ");
        String allocatedData = scanner.nextLine();

        System.out.print("Enter Alteration: ");
        String alteration = scanner.nextLine();

        // Allocate data to agent
        agent.allocateData(allocatedData, alteration);

        // Create data storage
        DataStorage dataStorage = new DataStorage();
        dataStorage.storeData(agent, allocatedData, alteration);

        // Simulate data leakage
        System.out.print("Enter Simulated Leaked Data: ");
        String leakedData = scanner.nextLine();

        System.out.print("Enter Simulated Alteration: ");
        String leakedAlteration = scanner.nextLine();

        // Detect leakage and trace the source
        LeakageDetector leakageDetector = new LeakageDetector(dataStorage);
        leakageDetector.detectLeakage(leakedData, leakedAlteration);

        scanner.close();
    }
}
