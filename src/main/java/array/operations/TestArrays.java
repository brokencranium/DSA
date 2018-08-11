package array.operations;

import java.util.Scanner;

public class TestArrays {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    ArraysOperations arrays = new ArraysOperations(size);
    arrays.initialize();
    System.out.println("Print initialize");
    arrays.print();

    arrays = new ArraysOperations(size);
    arrays.add(10);
    arrays.add(20);
    arrays.add(5);
    System.out.println("Print elements added");
    arrays.print();

    arrays = new ArraysOperations(size);
    arrays.add(10);
    arrays.add(20);
    arrays.add(5);
    System.out.println("Print elements added");
    arrays.print();
    System.out.println("Print elements removed");
    arrays.remove(20);
    arrays.print();
  }

}
