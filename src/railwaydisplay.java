import java.util.*;
import java.io.*;
class railwaydisplay extends date
{int row,col;
    public void display()throws IOException
    {
        Calendar c=Calendar.getInstance();
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        railway ob=new railway();
        for(;;)
        {
            displ();
            ob.input();

            railrev ob1=new railrev();
            System.out.println("SEE THE VACANT POSITION AND THEN BOOK THE BERTH");
            ob1.disp();
            System.out.println("\nEnter ROW NO.OF BERTH:- ");
            row=Integer.parseInt(r.readLine());
            System.out.println("AND COLUMN NO. OF BERTH.:-");
            col=Integer.parseInt(r.readLine());

            ob1.check(row,col);
            System.out.println("\f");
            System.out.println("_________________________________________________________________");
            System.out.println("NAME "+" "+" AGE "+" "+" GENDER");
            for(int i=0;i<6;i++)
            {
                System.out.println(ob.name[i]+" "+ob.age[i]+" "+ob.gen[i]+" ");
            }

            System.out.println("_________________________________________________________________");
            System.out.println("Train name: "+ ob.train);

            System.out.println("date of journey :"+ dd+"/"+mm+"/"+yy);
            System.out.println("Departure from:"+ob.ss);
            System.out.println("Destination :"+ob.ds);
            System.out.println("coach no."+ob.code);
            System.out.println("=================================================================");
            System.out.println("Today is:-"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));

            System.out.println(" HAVE A HAPPY JOURNEY ");
            System.out.println("_________________________________________________________________");
            System.out.println("Do you want to continue(y/n)?");
            String ch=(r.readLine());
            if(ch.equalsIgnoreCase("n"))
                break;
            else
                ob1.disp();
        }
    }

}
