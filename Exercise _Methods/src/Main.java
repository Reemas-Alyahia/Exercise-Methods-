import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------1th---------");
        Scanner input=new Scanner(System.in);
        //Write a Java method to find the smallest number among three
        //numbers.
//        System.out.println("Input the first number: ");
//        int fnum=input.nextInt();
//        System.out.println("Input the Second number: ");
//        int snum=input.nextInt();
//        System.out.println("Input the third number: ");
//        int tnum=input.nextInt();
//        System.out.println(" The smallest number is : "+smallest(fnum,snum,tnum));
        System.out.println("-----------------2th---------");
//         Write a Java method that check if the entered number is negative or
//        positive or zero.
//        System.out.println("Enter any number u think about it :");
//        int num=input.nextInt();
//              check(num);
        System.out.println("-----------------3th---------");
        //Write a Java method to check whether a string is a valid password.
        //Password rules:
//        ArrayList <String>names=new ArrayList<>();
//        System.out.println("Enter your passwords: ");
//        String pass=input.nextLine();
//        names.add(pass);
//        System.out.println(check2(names));
//        System.out.println(check3(names));
//        System.out.println(check4(names));


    }////////////main^^^

//    public static int smallest(int n1,int n2,int n3){
//        int smallest=0;
//        if(n1<n2&&n1<n3){ smallest=n1;
//        }
//        else if(n2<n1&&n2<n3) {smallest=n2;}
//        else smallest=n3;
//  return smallest;  }
    //*************

//public static void check(int n){
//      if(n==0){
//          System.out.println("it's Zero");}
//      else if (n>0) {
//          System.out.println("it's postive");}
//      else System.out.println("it's nigative");
//}
//public static String checkpass(String[] word){
//
//}

    public static ArrayList <String> check2(ArrayList <String> name){
        ArrayList <String>nn=new ArrayList<>();
        for(String n:name){
            if(n.matches("[a-zA-Z0-9]+")){
                nn.add(n) ; }
            else{ System.out.println("A password consists of only letters and digits.");
            }
        } //for
        return nn;
        }


    public static ArrayList <String> check3(ArrayList <String> name){
        ArrayList <String>nn=new ArrayList<>();
        for(String n:name){
            if(n.length()>=8){
                nn.add(n) ; }
            else {System.out.println("A password must have at least eight characters.");
            }
        } //for
        return nn; }

    public static ArrayList <String> check4(ArrayList <String> name){
        ArrayList <String>nn=new ArrayList<>();
        for(String n:name){

            int count = 0;
            for (char c : n.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            if (count >= 2) {
            nn.add(n);}
            else {
     System.out.println("A password must contain at least two digits ");
       }
    }
    return nn;
}



}