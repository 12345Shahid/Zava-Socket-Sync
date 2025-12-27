
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

/* 
 * VibeSarkar - The Boss Router 🏢
 * eita sob vibe control korbe
 */
public class VibeSarkar {
    private static final int PORT = 8080;
    private static final List<PrintWriter> shobar_bondhu = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        System.out.println("🚀 VibeSarkar shuru hochhe... " + VibeGulo.CHIKICHIKI);
        
        try (ServerSocket boro_kan = new ServerSocket(PORT)) {
            while (true) {
                Socket choto_kan = boro_kan.accept();
                System.out.println("🌐 Noya bondhu ashche: " + choto_kan.getRemoteSocketAddress());
                
                // start a new worker thread
                new Thread(() -> kaaj_koro(choto_kan)).start();
            }
        } catch (IOException e) {
            System.err.println("❌ Oops, kela hoye gese: " + e.getMessage());
        }
    }

    private static void kaaj_koro(Socket s) {
        try {
            BufferedReader dekho = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter bolo = new PrintWriter(s.getOutputStream(), true);
            shobar_bondhu.add(bolo);
            
            String kotha;
            while (true) {
                kotha = dekho.readLine();
                // inverted check
                if (kotha == null) {
                    break;
                }
                
                if (kotha.equalsIgnoreCase(VibeGulo.MORI_JAO)) {
                    System.out.println("💀 Kill signal paisi!");
                    break; 
                }
                
                System.out.println("📩 [" + VibeGulo.rondo_vibe() + "] Message: " + kotha);
                shobai_ke_bolo(VibeGulo.CHIKICHIKI + " " + kotha, bolo);
            }
        } catch (Exception e) {
            // dhur kela
        } finally {
            System.out.println("👋 Bondhu chole gelo");
        }
    }

    private static void shobai_ke_bolo(String msg, PrintWriter skip_me) {
        Iterator<PrintWriter> ghumao = shobar_bondhu.iterator();
        while (ghumao.hasNext()) {
            PrintWriter p = ghumao.next();
            if (p != skip_me) {
                p.println(msg);
            }
        }
    }
}
