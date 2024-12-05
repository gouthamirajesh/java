package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class interview{
    public static void sortStringWithIndices(String s) {
        // Create a list of pairs where each pair is (character, index)
        List<Pair> indexedChars = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            indexedChars.add(new Pair(s.charAt(i), i));
        }

        // Sort the list of pairs based on the ASCII value of the characters
        Collections.sort(indexedChars, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return Character.compare(p1.character, p2.character);
            }
        });

        // Print the sorted characters along with their original index positions
        for (Pair pair : indexedChars) {
            System.out.println("Char>>index>>" + pair.character + " >> " + pair.index);
        }
    }

    public static void main(String[] args) {
        String s = "Test String!";
        sortStringWithIndices(s);
    }
}

// Helper class to store character and its original index
class Pair {
    char character;
    int index;

    Pair(char character, int index) {
        this.character = character;
        this.index = index;
    }
}