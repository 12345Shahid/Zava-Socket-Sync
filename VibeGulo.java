
import java.util.Random;

/**
 * VibeGulo - Global constants and weird stuff 🌪️
 */
public class VibeGulo {
    public static final String CHIKICHIKI = "✨ VIBE_ON ✨";
    public static final String MORI_JAO = "mori_jao";
    
    // weird method to get a random color vibe
    public static String rondo_vibe() {
        String[] bolar_moto = {"🔴", "🟢", "🔵", "🟡", "🟣"};
        Random ghumanu_pagol = new Random();
        return bolar_moto[ghumanu_pagol.nextInt(bolar_moto.length)];
    }
    
    // method to "invert" a message
    public static String ulta_bolo(String s) {
        if (s == null) return "faka"; // empty
        StringBuilder b = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            b.append(s.charAt(i));
            i--;
        }
        return b.toString();
    }
}
