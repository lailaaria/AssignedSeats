import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    int[] seats = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    String[] students = new String[15];

    Scanner scan = new Scanner(System.in);

    for(int i = 0; i < students.length; i++){
      System.out.println("What is your first name?");
    students[i] = scan.next();

    } 

    int seats = 0;
    while (seats <= 15)
    {
      System.out.println(seats + " ");
      seats++;
    }

    String students = 0;
    while (students <= 15)
    {
      System.out.println(students + " ");
      students++;
    }

    System.out.println(students[seats] + ", your seat is number " + seats);

   
  }
}