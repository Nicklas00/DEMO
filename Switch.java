public class Switch {

  public static void main(String[] args) {
    int number = 1;
    String word ="";
    switch (number) {
      case 1:
        word = "one";
        break;
      case 2:
        word = "two";
        break;
      case 3:
        word = "three";
        break;
      default:
        word = "unknown";
        break;
    }
  }
}
