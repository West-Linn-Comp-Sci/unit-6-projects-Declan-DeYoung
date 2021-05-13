
public class Purse { 
  private ArrayList coins; 
 
  public Purse() { 
    coins = new ArrayList(); 
  }
 
  public void add(Coin aCoin) { 
    coins.add(aCoin); 
  } 
 
// returns total value of all coins in purse 
  public double getTotal() { 
    double sum = 0;
    for(int i = 0; i < coins.size(); i++){
      Coin whichCoin = coins.get(i);
      sum += whichCoin.getValue();
    }
  } 
 
// returns the number of coins in the Purse that matches aCoin 
// (both myName & myValue) 
  public int count(Coin aCoin) {
    
   } 
 
// returns the name of the Coin in the Purse that has the smallest value 
  public String findSmallest(){

  }
}
