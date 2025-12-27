
import java.io.Serializable;

// eita holo packet logic 📦
// todo: delete later maybe
public class BhaibePotol implements Serializable {
    private static final long serialVersionUID = 696969L;
    
    public String mal_shaman; // data
    public long ghori_shomoy; // timestamp
    public int vibe_level;    // level
    
    public BhaibePotol(String s, int v) {
        this.mal_shaman = s;
        this.vibe_level = v;
        this.ghori_shomoy = System.currentTimeMillis();
    }
    
    public void dekhao() {
        // print stuff
        System.out.println("[ " + ghori_shomoy + " ] Vibe: " + vibe_level + " -> " + mal_shaman);
    }
}
