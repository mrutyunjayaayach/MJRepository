
import java.util.Scanner;


class mtdovrld
{
   void rect(String a1, String b1)
   {
      System.out.println("name is:"+a1+"\n"+"Address:"+b1);
      System.out.println("Submit\n");
   }

   void rect(String a2,String b2,int c2 , String c1 ,int c3)
   {
      System.out.println("name:"+a2+"\n"+"Address:"+b2+"\n"+"Gender:"+c1+"\n"+"Registraton no:"+c2+"\n"+"pincode:"+c3);
   }
}

class HelloWorld {
    public static void main(String[] args)
    {
         mtdovrld zo = new mtdovrld();
        String a1,a2,b1,b2,c1;
		int c2,c3;
           
          @SuppressWarnings("resource")
		Scanner SC1=new Scanner(System.in);
          @SuppressWarnings("resource")
		Scanner SC2=new Scanner(System.in);
          
          
              System.out.print("Enter user1 Name: ");
          a1=SC1.nextLine();
          System.out.print("Enter Address: ");
          b1=SC1.nextLine();
 
             System.out.print("Enter user2 Name: ");
          a2=SC2.nextLine();
          System.out.print("Enter Address: ");
          b2=SC2.nextLine();
          System.out.print("Gender: ");
          c1=SC1.nextLine();
          System.out.print("Enter Mobno: ");
          c2=SC2.nextInt();
          System.out.print("Enter pincode:");
          c3=SC2.nextInt();
          System.out.print("_ _ _ _ _ _ _ _ _ _ _ _\n ");

          zo.rect(a1,b1);
          zo.rect(a2,b2,c2,c1,c3);
    }
}