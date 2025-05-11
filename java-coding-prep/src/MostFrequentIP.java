import java.util.*;

public class MostFrequentIP {

    public static String findMostFrequentIPs(List<String> logs) {
        Map<String, Integer> ipCountMap = new HashMap<>();

        // Step 1: Count each IP address
        for (String log : logs) {
            String ip = log.split(" ")[0]; // extract IP
            ipCountMap.put(ip, ipCountMap.getOrDefault(ip, 0) + 1);
        }

        // Step 2: Find max frequency
        int maxCount = Collections.max(ipCountMap.values());

        // Step 3: Collect IPs with max frequency
        List<String> resultIps = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : ipCountMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                resultIps.add(entry.getKey());
            }
        }

        // Step 4: Sort and return as comma-separated string
        Collections.sort(resultIps);
        return String.join(",", resultIps);
    }

    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
                "10.0.0.1 - GET 2020-08-24",
                "10.0.0.1 - GET 2020-08-24",
                "10.0.0.2 - GET 2020-08-20"
        );

        String result = findMostFrequentIPs(logs);
        System.out.println(result); // Output: 10.0.0.1
    }
}
