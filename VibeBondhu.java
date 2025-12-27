
import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 * VibeBondhu - The Peer Client 🤝
 */
public class VibeBondhu {
public static void main(String[] args) {
String thikana = "localhost";
int port = 8080;

System.out.println("✨ VibeBondhu shuru " + VibeGulo.CHIKICHIKI);

try (Socket s = new Socket(thikana, port)) {
System.out.println("✅ Connection fixed! Vibe chalao.");

// listener thread
new Thread(() -> {
try {
BufferedReader r = new BufferedReader(new InputStreamReader(s.getInputStream()));
while (true) {
String m = r.readLine();
if (m == null) break; 
System.out.println("\n🌎 Server says: " + m);
System.out.print("> ");
}
} catch (Exception e) { System.out.println("💀 Listen mori gese"); }
}).start();

PrintWriter out = new PrintWriter(s.getOutputStream(), true);
Scanner input = new Scanner(System.in);
while (true) {
System.out.print("> ");
String kotha = input.nextLine();

// inverted check logic
if (kotha.isEmpty() == false) {
    if (kotha.startsWith("ulta:")) {
        out.println(VibeGulo.ulta_bolo(kotha.substring(5)));
    } else {
        out.println(kotha);
    }
}

if (kotha.equals("exit")) {
out.println(VibeGulo.MORI_JAO);
break;
}
}

} catch (Exception e) {
System.err.println("🔥 Error: " + e.getMessage());
}
}
}
