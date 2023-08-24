package chapter9;

public class Person {

  private String name;
  private String gender;
  private int age;

  public Person(){
    System.out.println("In Person default constructor.  ");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
