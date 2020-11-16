import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    int[] seats = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    String[] students = new String[15];

    for(int i = 0; i < students.length; i++){
      System.out.println(students[i]);
    }  

    Scanner scan = new Scanner(System.in);   

    System.out.println("What is your first name?");
    String name = scan.next();

    students[0] = name; 

    while(int i = 0){
      System.out.println(students + " sits in seat #" + seats);
    }
  }
}