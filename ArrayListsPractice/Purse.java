import java.util.ArrayList;
public class Purse { 
  private ArrayList<Coin> coins;
  public Purse() { 
    coins = new ArrayList<Coin>(); 
  }
  public void add(Coin aCoin) { 
    coins.add(aCoin); 
  } 
  public double getTotal() { 
    double sum = 0;
    for(int i = 0; i < coins.size(); i++){
      Coin whichCoin = coins.get(i);
      sum += whichCoin.getValue();
    }
    return sum;
  } 
  public int count(Coin aCoin) {
    int matching = 0;
    for(int i = 0; i < coins.size(); i++){
      boolean same = coins.equals(i);
      if(same){
        matching++;
      }
    }
    return matching;
  } 
  public String findSmallest(){
    Coin smallest = coins.get(0);
    double min = smallest.getValue();
    for(int i = 1; i < coins.size(); i++){
      double temp = coins.get(i).getValue();
      if(temp < min){
        min = temp;
        smallest = coins.get(i);
      }
    }
    return smallest.getName();
  }
}
