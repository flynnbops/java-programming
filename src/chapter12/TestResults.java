package chapter12;

import java.util.HashMap;
import java.util.Map;

public class TestResults {

  public static Map getOriginalGrades(){

    Map grades = new HashMap();
    grades.put("Angie", 24);
    grades.put("Dave", 32);
    grades.put("Lisi", 80);
    grades.put("Raja", 50);
    grades.put("Shashi", 79);
    grades.put("Bas", 40);
    grades.put("Carlos", 59);
    grades.put("Amber", 55);
    grades.put("Rex", 95);
    grades.put("Jason", 63);
    grades.put("Nikolay", 32);

    return grades;
  }
  public static Map getMakeUpGrades() {

    Map grades = new HashMap();
    grades.put("Angie", 97);
    grades.put("Dave", 82);
    grades.put("Lisi", 76);
    grades.put("Raja", 89);
    grades.put("Shashi", 79);
    grades.put("Bas", 98);
    grades.put("Carlos", 80);
    grades.put("Amber", 95);
    grades.put("Rex", 90);
    grades.put("Jason", 62);
    grades.put("Nikolay", 79);

    return grades;
  }

  public static Map<String, Integer> updateGrades(Map<String, Integer> originalGrades, Map<String, Integer> makeUpGrades) {
    Map<String, Integer> updatedGrades = originalGrades;

    for (var entry: originalGrades.entrySet()){
      Integer originalGrade= originalGrades.get(entry.getKey());
      Integer makeUpGrade= makeUpGrades.get(entry.getKey());

      if (makeUpGrade > originalGrade){
        updatedGrades.put(entry.getKey(), makeUpGrade);
      }
    }
    return updatedGrades;
  }

  public static void main(String[] args){
    Map<String, Integer> newGrades = updateGrades(getOriginalGrades(), getMakeUpGrades());

    for (var entry: newGrades.entrySet()){
      System.out.println("Person " + entry.getKey() + ", best score: " + entry.getValue());
    }

  }
}
