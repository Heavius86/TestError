import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String fileName = "src\\input.txt";
        List<String> list = new ArrayList<>();
        String[] splitStr;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            String str;
            while((str = reader.readLine()) != null ){
                if(!str.isEmpty()){
                    list.add(str);
                    System.out.println(str);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        for(String g : list ) {
            splitStr = g.split(" ");
            System.out.println(g);
        };


//        Scanner sc = new Scanner(System.in);

//        try{
//            double a = sc.nextDouble();
//            String s = sc.next();
//            double b = sc.nextDouble();
//            System.out.println(res(a,s,b));
//        }
//        catch (InputMismatchException e){
//            System.out.println("Error! Not number");
//        }
//        catch (ArithmeticException e ){
//            System.out.println("Error! Division by zero");
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("The end!");
//        }
    }
   static double res(double a, String s, double b ) throws Exception {
       double result = 0;
       switch (s){
           case ("+"):
               result = a+b;
               break;
           case ("-"):
               result = a-b;
               break;
           case ("*"):
               result = a*b;
               break;
           case ("/"):
               if (b == 0) throw new ArithmeticException();
               result = 1.0*a/b;
               break;
           default:
               throw new Exception("Operation Error!");
       };
       return  result;
    }
}



