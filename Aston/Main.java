package Lesson_9;

public class Main {
 /*   public  void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    } */

 /*    public  void checkSumSign() {
        int a = 5;
        int b = -8;
        if ((a + b) >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    } */
 /*    public  void printColor() {
        int value = 100;
        if (value <= 0)
        {  System.out.println("Красный");}
        else if (value > 0 & value <= 100)
        { System.out.println("Желтый"); }
        else
        {System.out.println("Зеленый");}

    } */

  /*   public  void compareNumders() {
        int a = 8;
        int b = 51;
        if (a >= b)
        {  System.out.println("a >= b");}
        else
        {System.out.println("a < b");}

    } */

 /*     public static boolean  checkSum(int a, int b) {
        int sum = a + b;
        return sum > 10 && sum <= 20;

    } */

  /*   public void checkTypeNumber(int a) {
        if (a >= 0)
        {  System.out.println("Число положительное");}
        else if (a < 20)
        {System.out.println("Отрицательное");}
    } */

 /*    public static boolean checkTypeNumberBool(int a) {
        return a >= 0;
    } */

   /*   public void inputString(int a, String str) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        } */

  /*  public static boolean checkLepYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else
                    return false;
            }
            return true;
        } else
            return false;
    } */

    /*   public void  arrayReplacement() {
           int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] == 0) {
                   arr[i] = 1;
               } else if (arr[i] == 1) {
                   arr[i] = 0;
               }
               System.out.println(arr[i]);
           }
       } */
/*  public void  fillingReplacement() {
     int[] arr = new int[100];
     for (int i = 1; i < 101; i++) {
         arr[i] = i;
         System.out.println(arr[i]);
     }
     } */
 /*  public void  multiplyArray() {
     int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8,9,1};
     for (int i = 0; i < arr.length; i++) {
         if (arr[i] < 6) {
             arr[i] = arr[i]*2;
         }
         System.out.println(arr[i]);
     }
 } */
  /*   public void  twodimensionalArray() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            arr[i][i] = 1;
            arr[i][10 - 1 - i] = 1;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    } */
    public void  createArray(int len,int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println(arr[i]);
        }

    }


    public static void main(String[] args) {
        Main main = new Main();
        //   main.printThreeWords();
        //   main.checkSumSign();
        //   main.printColor();
        //   main.compareNumders();
        //   System.out.println(main.checkSum(2,18));
        //    main.checkTypeNumber(-2);
        //     System.out.println(main.checkTypeNumberBool(5));
        //    main.inputString(5,"Привет Мир!");
        //   System.out.println(main.checkLepYear(2025));
        //     main.arrayReplacement();
        //       main.fillingReplacement();
        //   main.multiplyArray();
        // main.twodimensionalArray();
        main.createArray(10,25);

    }





}