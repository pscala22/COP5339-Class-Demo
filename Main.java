import java.util.Date;
  
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
  // new DATE object with current time
  Date dateNow = new Date();

  Date dateCopy = (Date) dateNow.clone();
}