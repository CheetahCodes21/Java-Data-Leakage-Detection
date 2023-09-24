# Java-Data-Leakage-Detection
---
# Data Leakage Detection and Traceability

This project, titled "DataLeak Trace," is a Java-based application designed to address data leakage detection and traceability. It empowers users to allocate data to agents with undetectable alterations, allowing for efficient detection and tracing of leaked data sources.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Usage](#usage)
- [Logic](#logic)
- [Problem Statement](#problem-statement)

## Features

- **Agent Management (`Agent.java`):**
  - The `Agent` class represents users in the system.
  - It handles properties like agent ID, agent name, and allocated data.
  - Methods within this class facilitate data allocation to agents and retrieval of agent information.

- **Data Storage (`DataStorage.java`):**
  - The `DataStorage` class manages storage and retrieval of allocated data.
  - A map is utilized to associate allocated data with agents and their undetectable alterations.
  - Methods enable data storage and retrieval for each agent.

- **Leakage Detector (`LeakageDetector.java`):**
  - The `LeakageDetector` class detects data leakages and traces the source of leaked data.
  - It performs comparisons between leaked data and alterations with allocated data to determine the source of leakage.

- **Main Application (`Main.java`):**
  - The `Main` class serves as the entry point for the application.
  - It handles user input, agent creation, data allocation, simulated leakage, and invokes the leakage detection process.

## Prerequisites

- Java Development Kit (JDK) installed on your machine.

## Setup

1. Clone the repository to your local machine.

```bash
git clone https://github.com/CheetahCodes21/Java-Data-Leakage-Detection.git
```

2. Navigate to the project directory.

```bash
cd Java-Data-Leakage-Detection
```

## Usage

1. Compile the Java files.

```bash
javac *.java
```

2. Run the application.

```bash
java Main
```

3. Follow the on-screen prompts to input agent details, allocated data, and simulated leaked data.

## Logic

- **Agent Management:**
  - Agents are assigned unique IDs and names.
  - Data is allocated to agents along with undetectable alterations.
  
- **Data Allocation:**
  - Agents allocate data with specific alterations, mimicking real-world scenarios.
  
- **Data Storage:**
  - Allocated data and alterations are securely stored for each agent.
  
- **Leakage Detection:**
  - The system detects data leakages by analyzing leaked data and alterations.
  
- **Source Tracing:**
  - The system traces back the source of leaked data to the respective agent.

## Problem Statement

### Problem Statement: Data Leakage Detection and Traceability

Develop a system that enables organizations to track and identify the source of leaked data in various file formats. The system involves allocating data to agents with undetectable alterations, allowing for effective detection and tracing of leaked information.

### Features to Implement:

1. **Agent Management:**
   - Implement a mechanism to manage agent details, including unique IDs and names.

2. **Data Allocation:**
   - Design a system that allows agents to allocate data along with undetectable alterations.

3. **Data Storage:**
   - Create a data storage mechanism to associate allocated data with agents and their respective alterations.

4. **Leakage Detection:**
   - Develop a method to detect data leakages by analyzing leaked data and alterations.

5. **Source Tracing:**
   - Enable the system to trace back the source of leaked data to the respective agent.

6. **File Format Support:**
   - Support detection of data leakages in common file formats such as .txt, .jpg, and .bmp.

### Constraints:

- Ensure the system is efficient and can handle a significant number of agents and data allocations.
- The undetectable alterations should be robust and reliable for accurate source tracing.

### Evaluation Criteria:

- Accuracy of source tracing: The system should accurately identify the source of leaked data.
- Efficiency and scalability: The system should handle a large number of agents and data allocations efficiently.
- User-friendliness: The system should be easy to use and understand, with appropriate input prompts and error handling.

## Sample Input and Output

To demonstrate the functionality of the application, we'll provide a sample input and the expected output for the data leakage detection process.

### Sample Input:

```plaintext
Enter Agent ID: 001
Enter Agent Name: Pathan
Enter Allocated Data: Credit Card Number
Enter Alteration: Encrypted
Enter Simulated Leaked Data: Credit Card Number
Enter Simulated Alteration: Encrypted
```

### Expected Output:
```plaintext
Data leaked from Agent: 001
```

Explanation of the expected output:

- An agent with ID "001" and name "Pathan" is created and allocated the data "Credit Card Number" with the alteration "Encrypted."
- In the simulation, "Credit Card Number" with alteration "Encrypted" is considered as leaked data.
- The 'LeakageDetector' is used to check if the leaked data matches the allocated data for any agent. In this case, it matches with agent ID "001", so the program outputs that the data leaked from this agent.


Please note that the actual input and output may vary based on the specific input values provided during runtime.


---

This README provides an overview of the "DataLeak Trace" project, detailing its features, prerequisites, setup, usage, logic, and the problem statement it aims to address.

--- 
`https://github.com/CheetahCodes21/Java-Data-Leakage-Detection` 
[Cheetah 🐾](https://github.com/CheetahCodes21)
