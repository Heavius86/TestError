import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String fileName = "input.txt";
        List<String> list = new ArrayList<>();
        String[] splitStr;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
            String str;
            while((str = reader.readLine()) != null ){
                if(!str.isEmpty()){
                    list.add(str);
                   // System.out.println(str);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }



        try{
            for(String l : list ) {
                splitStr = l.split(" ");
                System.out.println(l);
                double a = Double.valueOf(splitStr[0]);
                String s = splitStr[1];
                double b = Double.valueOf(splitStr[2]);
                System.out.println(res(a,s,b));
            };


        }
        catch (InputMismatchException e){
            System.out.println("Error! Not number");
        }
        catch (ArithmeticException e ){
            System.out.println("Error! Division by zero");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("The end!");
        }
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



