package Array;

import java.util.HashMap;
import java.util.Map;

public class TestTaker{

    public static String findMatchingKey(String doorString, String[] codes) {
        String[] doorFittings = doorString.split(",");
        Map<String, String> doorKeyMap = new HashMap<>();

        for (String code : codes) {
            String door = code.substring(0, code.length() - 2);
            String key = code.substring(code.length() - 2);
            doorKeyMap.put(door, key);
        }

        StringBuilder result = new StringBuilder();

        for (String door : doorFittings) {
            int lowercaseCount = door.replaceAll("[^a-z]", "").length();
            boolean containsRoom = door.toLowerCase().contains("room");
            int digitCount = door.replaceAll("\\D", "").length();

            for (Map.Entry<String, String> entry : doorKeyMap.entrySet()) {
                String key = entry.getValue();
                int lowercaseDigits = Integer.parseInt(key.substring(0, 2));
                boolean roomCheck = key.charAt(2) == '1';
                int digitDigits = Integer.parseInt(key.substring(3));

                if (lowercaseCount == lowercaseDigits && containsRoom == roomCheck && digitCount == digitDigits) {
                    result.append(door).append("-").append(entry.getKey()).append(",");
                }
            }
        }

        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1); // Remove the trailing comma
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String doorString = "Door to 7th heaven,Test case room,Another Door fitting,Non-room fitting";
        String[] codes = { "1301", "1412", "1705" };

        String matchingKey = findMatchingKey(doorString, codes);
        System.out.println(matchingKey);
    }
}