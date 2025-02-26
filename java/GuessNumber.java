import java.util.Random;


import java.util.Scanner;



public class GuessNumber {


    public static void GuessNumber(){
        Random random = new Random();

        int guess = random.nextInt(1,100);

        Scanner scanner = new Scanner(System.in);


         int total = 0;

         while (true) {
             System.out.print("请输入你的数字：");

             int res = scanner.nextInt();
             if (guess > res) {
                 System.out.println("小了");
                 total += 1;
             } else if (guess < res) {
                 System.out.println("大了");
                 total += 1;

             } else {System.out.print("猜对了");
             break;}
         }

         if(total >= 8){
             System.out.print("智商不够用");
         }



    }

    public static void main(String[]args){

        GuessNumber();

    }



}
