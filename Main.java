import java.lang.*;
import java.util.*;
import java.util.Date;

class Main
{
    public static void main(String args[])
    {   
    int fareprice = 50,Ticket = 0;
    int Operation;
    boolean b = false;
    String Name;
    int PIN;
    String train = " ";
    String PNR = " ";
Scanner sc = new Scanner(System.in);
System.out.println("******Welcome to Online ticket Booking******");
System.out.println(" \'ENTER 1 TO BOOK TICKETS\' ");
         int n = sc.nextInt();
         int pin[] = new int[n];
         String name[] = new String[n];
System.out.println("Press \n 1.Create Account \n 2.Login");

Operation = sc.nextInt();
switch(Operation)
{
    case 1:
    {
        System.out.println("******LOGIN FORM******");
          System.out.println("---Enter the details to create account---");
          for(int i = 0;i<n;i++)
          {
            System.out.println("Enter Name");
            sc.nextLine();
            name[i] = sc.nextLine();
            System.out.println("Enter Pin");
             pin[i] = sc.nextInt();
             
            
          }
            
       
        System.out.println("-----Your details were recorded plz login to continue-----");
        break;
    }
    case 2:
    {
      
        name[0] = "BHUSHAN";
        pin[0] = 1234;
        break;
    }
}

             
              
             while(true)
            { 
               System.out.println(">>>>>>Login into page for booking tickets<<<<<<");
          System.out.println("Enter Your Name");
            
               Name = sc.next();
               sc.nextLine();
             System.out.println("Enter the PIN");
              PIN = sc.nextInt();
              for(int i = 0;i<n;i++)
              {
           
           if ((PIN == pin[0]) && Name.equals(name[0]) )
            {
                System.out.println("---Your login is Successfull---\n ---Happy Booking---");
                b = true;
                 break;
           }
           
           else
             {
                    System.out.println("---Your login is not Successfull---\n Try again---");
             }
            
              }
              
   
    if(b == true)
        {
          System.out.println("...Choose Train...\n 1.Nagpur Express\n 2.Mumbai rajdhani Express\n3.Madgao Express\n4.Dhrontreo Express\n5.Pune Rajdhani Express");
          int Option = sc.nextInt();
            switch(Option)
               {
             case 1:
             {
              train ="Nagpur Express";
              PNR = "789-45612336";
              break;
             }
               case 2:
             {
                train ="Mumbai rajdhani Express";
                PNR = "785-12396582";
              break;
             }
              case 3:
             {
               train ="Madgao Express";
               PNR = "365-123485632";
               break;
             }
              case 4:
             {
                train ="Dhrontreo Express";
                 PNR = "146-1236856";
               break;
             }
              case 5:
             {
                train ="Pune Rajdhani Express";
               PNR = "786-1232596512";
               break;
             }
               }
            System.out.println("Please Enter.. \n1.FOR AC \n2.FOR NON-AC");
            int AC = sc.nextInt();
         if(AC==1)
    {
          Ticket = fareprice+10;
    }
    else
    {
          Ticket = fareprice;
    }
    System.out.println("Please Enter.. \n1.Sleeper\n2.NON-Sleeper");
    int window = sc.nextInt(); 
     if(window==1)
     {
     Ticket = Ticket+10;
    }
    else
    {
     Ticket = Ticket;
    }
     System.out.println("                               ---- IRCTC-----");
    System.out.println("                       JOURNEY CUM RESERVATION TICKET");
    System.out.println("                 "+train +"                PNR:"+PNR+" ");
     
    Date date = new Date();
     System.out.println("                       "+ date.toString());
     System.out.println("                           Fare price = 50");
     System.out.printf( "                        -Please pay  %d FOR THE TICKET-", Ticket);
     System.out.println("\n");
     
     System.out.println("ENTER 1 TO CANCEL THE TICKET \n ENTER 0 to exit");
     int u = sc.nextInt();
       if(u == 1)
     {
        
     System.out.println("----Your Ticket Has Been Cancelled----");
     } 
    if(u == 0)
     {
        System.exit(0);
     } 
}          
}
}
}