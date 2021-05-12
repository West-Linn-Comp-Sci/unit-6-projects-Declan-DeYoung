
public class Person{
  private int myAge;
  private String myName;
  public Person(){
  }
  public int getAge(){
    return myAge;
  }
  public String getName(){
   	return myName;
  }
  public String findMin(ArrayList list){
    int min = 0;
    for(int i = 1; i < list.size(); i++){
      Person small = list.get(min);
      Person thisGuy = list.get(i);
    		if(thisGuy.getAge() < small.getAge()){
    			min = i;
        }
    }
    Person smallPerson = list.get(min);
    return smallPerson.getName;
  }
}
