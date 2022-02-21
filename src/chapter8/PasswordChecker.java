package chapter8;

public class PasswordChecker {

  public static void main(String[] args){

    String username = "admin";
    String newPassword = "P1abcderf";
    String oldPassword = "something";

    boolean validity = passwordValid(username, newPassword,oldPassword);
    String response = String.format("Password is valid?:%b", validity);
    System.out.println(response);
  }

  /**
   * @param username
   * @param newPassword
   * @param oldPassword
   * @return boolean if password is valid or not
   */
  public static boolean passwordValid(String username,String newPassword,String oldPassword){
  return
    validLength(newPassword) &&
    containsUppercase(newPassword) &&
    containsSpecial(newPassword) &&
    containsUsername(newPassword,username) &&
    isOldPassword(newPassword,oldPassword);
  }

  private static boolean validLength(String password) {
    int minimumLength = 8;
    return password.length() >= minimumLength;
  }

  private static boolean containsUppercase(String password) {
    var modifiedText = new StringBuilder(password);
    boolean containsUppercase = false;

    // Check if Character is uppercase
    for (int i = 0; i < modifiedText.length() ;i++){
      if (Character.isUpperCase(modifiedText.charAt(i))){
        containsUppercase = true;
        break;
      }
    }
    return containsUppercase;
  }

  // TODO: Find good way to check for special chars.
  private static boolean containsSpecial(String password) {
    return true;
  }

  private static boolean containsUsername(String newPassword, String username) {
    return !newPassword.contains(username);
  }

  private static boolean isOldPassword(String newPassword, String oldPassword) {
    return !newPassword.equals(oldPassword);
  }
}
