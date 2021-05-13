public class Coin {  
  private double myValue; 
  private String myName; 
  public Coin(double value, String name) { 
    myValue = value; 
    myName = name; 
  }  
  public double getValue() { 
    return myValue; 
  } 
  public String getName() { 
    return myName;
  }
  public boolean equals(Coin aCoin) { 
    String otherName = aCoin.getName();
    double otherMoney = aCoin.getValue();
    boolean isSame = false;
    if(otherMoney == myValue && otherName.equals(myName)){
      isSame = true;
    }
    return isSame;
  }
}
