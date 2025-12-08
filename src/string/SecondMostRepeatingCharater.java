package string;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.*;

public class SecondMostRepeatingCharater {
    public static void main(String[] args) {
        String s = "apple";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        // Max heap sorted by frequency
        PriorityQueue<Map.Entry<Character,Integer>> pq =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(map.entrySet());

        // Remove highest frequency
        pq.poll();

        // Now top of heap is second most frequent
        Map.Entry<Character,Integer> second = pq.poll();

        System.out.println("Second most frequent: " +
                second.getKey() + " (count = " + second.getValue() + ")");
    }
    }

