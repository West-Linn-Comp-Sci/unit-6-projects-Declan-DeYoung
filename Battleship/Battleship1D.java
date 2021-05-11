
/**
 * Makes the battleship
 *
 * Declan DeYoung
 * 5/5/21
 */
public class Battleship1D
{
    private boolean[] sea = new boolean[7];
    public Battleship1D(){
        for(int i = 0; i < 7; i++){
            sea[i] = false;
        }
    }
    public void randomShip(){
        int placement = (int)(Math.random()*5);
        sea[placement] = true;
        sea[placement + 1] = true;
        sea[placement + 2] = true;
    }
    public boolean[] getSea(){
        return sea;
    }
}
