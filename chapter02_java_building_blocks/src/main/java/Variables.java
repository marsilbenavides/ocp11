public class Variables {

  public void casting() {
    System.out.println("--- Casting ---");
    long goat = 10;
    short sheep = 5;

    // Does not compile
    //sheep = sheep * goat;

    System.out.println("long goat = " + goat + ";");
    System.out.println("short sheet = " + sheep + ";");
    sheep *= goat;
    System.out.println("sheep *= goat; // " + sheep);
  }

  public void assignment() {
    System.out.println("--- Assignment ---");
    long wolf = 5;
    long coyote = (wolf = 3);
    System.out.println("long wolf = 5;");
    System.out.println("long coyote = (wolf = 3);");
    System.out.println("// wolf = " + wolf);
    System.out.println("// coyote = " + coyote);
  }

  public void comparing() {
    System.out.println("--- Comparing ---");
    String s1 = "";
    String s2 = "";
    String s3 = new String();
    String s4 = new String();
    String s5 = null;
    System.out.println("String s1 = \"\";");
    System.out.println("String s2 = \"\";");
    System.out.println("String s2 = new String();");
    System.out.println("String s4 = new String();");
    System.out.println("String s5 = null;");
    System.out.println("(s1 == s2) // " + (s1 == s2));
    System.out.println("(s1 == s3) // " + (s1 == s3));
    System.out.println("(s3 == s4) // " + (s3 == s4));
    System.out.println("(null == null) // " + (null == null));
    System.out.println("(s5 == null) // " + (s5 == null));

    // Does not compile
    // System.out.println("(s5 == (Integer)null) // " + (s5 == (Integer)null));
    System.out.println("Doesn't compile: (s5 == (Integer)null)");
  }
  
  public static void main(String... args) {
    Variables variables = new Variables();
    variables.casting();
    variables.assignment();
    variables.comparing();
  }

}
