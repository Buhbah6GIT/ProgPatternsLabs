package Q1_1;

/**
 * @author Anthony
 */
public class Gamer {
   private String name;
   private int score;
    
   public Gamer(String name, int score) {
       this.name = name;
       this.score = score;
   }
   
   @Override
   public String toString() {
       return String.format("Name: %s\nScore: %d\n", name, score);
   }

    public int getScore() {
        return score;
    }
}
