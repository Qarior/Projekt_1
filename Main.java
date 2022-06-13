import java.io.*;

public class Main
{
   public static void main(String[] args)
   throws IOException
 {
  int a, b, c;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Program sprawdzający czy podane boki tworzą trójkąt prostokątny");
   System.out.println("Podaj długość boku a (przyprostokątna):");
   a = Integer.parseInt(br.readLine());
   System.out.println("Podaj długość boku b (przyprostokątna):");
   b = Integer.parseInt(br.readLine());
   System.out.println("Podaj długość boku c (przeciwprostokątna):");
   c = Integer.parseInt(br.readLine());
   if ((a*a+b*b) == c*c) 
{
   System.out.println("Boki");
   System.out.println("a = " + a);
   System.out.println("b = " + b);
   System.out.println("c = " + c);
   System.out.println("Podane długości boków tworzą trójkąt prostokątny.");
}
   else 
  {
   System.out.println("Boki");
   System.out.println("a = " + a);
   System.out.println("b = " + b);
   System.out.println("c = " + c);
   System.out.println("Podane długości boków nie tworzą trójkąta prostokątnego.");
  }
 }
}