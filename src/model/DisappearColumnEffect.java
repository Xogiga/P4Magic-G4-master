package model;

/**
 *
 * @author Tristan
 */
public class DisappearColumnEffect extends Effect{
    
    public void playEffect(int line, int column, Game game) {
    
        while (line <= 9) {
            game.getBoard().getTileIJ(line, column).setStatus(-1);
            line++;
        }
    }
}
