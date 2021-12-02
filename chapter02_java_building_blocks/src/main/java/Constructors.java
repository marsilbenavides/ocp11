public class Constructors {

  static {
    System.out.println("@Static initializer 1.");
  }

  private int finalInt;

  static {
    System.out.println("@Static initializer 2.");
  }

  {
    System.out.println("@Instance initializer 1 (this.notFinalInt=" + this.notFinalInt + ").");
    // Cannot use in here
    // this.finalInt = 0; 
  }

  private int notFinalInt;

  public static void main(String[] args) {
    System.out.println("@Main method.");
    Constructors constructors = new Constructors();
    constructors.Constructors();
  }

  {
    System.out.println("@Instance initializer 2 (this.notFinalInt=" + this.notFinalInt + ").");
    // Cannot use in here
    // this.finalInt = 0;
    this.notFinalInt = 1;
  }

  {
    System.out.println("@Instance initializer 3 (this.notFinalInt=" + this.notFinalInt + ").");
  }

  public Constructors() {
    System.out.println("@Constructor.");
    this.finalInt = 1;
    this.notFinalInt = 1;
  }

  public void Constructors() {
    System.out.println("@Method named Constructors.");
  }

  {
    System.out.println("@Instance initializer 4 (this.notFinalInt=" + this.notFinalInt + ").");
    System.out.println("@Instance initializer 4 (finalInt=" + finalInt + ").");
  }

}