
public class Purse { 
  private ArrayList coins; 
 
  public Purse() { 
    coins = new ArrayList(); 
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
 
// returns the number of coins in the Purse that matches aCoin 
// (both myName & myValue) 
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
 
// returns the name of the Coin in the Purse that has the smallest value 
  public String findSmallest(){
    Coin smallest = coins.get(0)
    double min = smallest.getValue();
    for(int i = 1; i < coins.size(); i++){
      double temp = coins.get(i).getValue;
      if(temp < min){
        min = temp;
        smallest = coint.get(i);
      }
    }
    return smallest.getName();
  }
}
