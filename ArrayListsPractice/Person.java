import java.util.ArrayList;
public class Person{
  private int myAge;
  private String myName;
  public Person(int age, String name){
      myAge = age;
      myName = name;
  }
  public int getAge(){
    return myAge;
  }
  public String getName(){
   	return myName;
  }
  public static String findMin(ArrayList<Person> list){
    int min = 0;
    for(int i = 1; i < list.size(); i++){
      Person small = list.get(min);
      Person thisGuy = list.get(i);
    		if(thisGuy.getAge() < small.getAge()){
    			min = i;
        }
    }
    Person smallPerson = list.get(min);
    return smallPerson.getName();
  }
}
