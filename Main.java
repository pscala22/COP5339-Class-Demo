import java.util.Date;
  
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
  // new DATE object with current time
  Date dateNow = new Date();

  Date dateCopy = (Date) dateNow.clone();

  //Equality Testing
/*
  public boolean equals(Greeter other)
  {
    if (this == other) return true;
    return name.equals(other.name);
  }
*/


  //The Garbage Collector
  /**
 A class for illustrating object lifecycle.
 */
public class LifeSample {
  /**
    main function executed by java.
   */
  public static void main(String[] args)
  {
    // create new objects x and y:
    LifeSample x = new LifeSample("X");
    LifeSample y = new LifeSample("Y");

    x.printName();      // display x

    // remove reference to object X
    x = null;

    // 
    // create temporary object. No reference to "Z" will remain after this statement
    new LifeSample("Z").printName();

    // display y:
    y.printName();

    // invoke garbage collector. Y will not be affected:
    System.gc();
  }

  /**
    Constructor.
    @param name a String representing the object name.
   */
  public LifeSample(String name)
  {
    // save name. Note use of "this" to address instance variable "name":
    this.name = name;

    System.out.println("Object " + name + " was created");
  }
  /**
   Prints object name to stdout.
   */
  public void printName()
  {
    System.out.println("printName invoked for object " + this.name);
  }

  /**
    Object finalizer - invoked by the GC before  object is destroyed and memory    reclaimed.
   */
  protected void finalize()
  {
    System.out.println("object " + this.name + " is finalized");
    this.name = null;       // lose reference to member
  }

  /**
   Instance variable name.
   */
  private String name;
}	    
}