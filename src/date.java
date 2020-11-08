import java.util.Calendar;
import java.util.Date;
import java.io.*;
public class date
{
    int yy,mm,dd;

    boolean f;
    public void displ()throws IOException
    {
        Calendar c=Calendar.getInstance();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(;;)
        {
            System.out.println("Enter year:-");
            yy=Integer.parseInt(br.readLine());
            System.out.println("Enter month:-");
            mm=Integer.parseInt(br.readLine());
            System.out.println("Enter day:-");
            dd=Integer.parseInt(br.readLine());
            System.out.println("Today is:-"+c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));


            int mmst=c.get(Calendar.MONTH)+1;
            int md=mm-mmst;
            int ddst=c.get(Calendar.DATE);

            int ddd=(dd-ddst)+md*30;

            System.out.println("differ date="+ddd);
            System.out.println("requested date is:-"+dd+"/"+mm+"/"+yy);

            if(ddd>=60||ddd<1)
            {
                System.out.println("Not possible before 60 days or before current date:RenEnter new date");

            }
            else{
                System.out.println("VALID DATE...NOW CHECK THE VACANT BERTH");
                break;
            }
        }
    }
}
