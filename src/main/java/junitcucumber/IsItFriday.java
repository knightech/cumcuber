package junitcucumber;

public class IsItFriday {

  /**
   * First stub
   *
  class IsItFriday {
    static String isItFriday(String today) {
      return null;
    }
  }*/

  /**
   * Second hardcoded fix for test (simplest possible thing to make the scenario pass)
   *
  static String isItFriday(String today) {
    return "Nope";
  }*/

  /**
   * Final implementation
   */
  public static String isItFriday(String today) {
    if (today.equals("Friday")) {
      return "TGIF";
    }
    return "Nope";
  }
  
}
