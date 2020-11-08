import java.io.*;
class railway
{
    String name[]=new String[6];
    String age[]=new String[6];
    String gen[]=new String[6];

    String train;
    String dj,ds,ss,code;
    public void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter train name :-");
        train=br.readLine();
        System.out.println("Enter coach no.:-");
        code=br.readLine();

        System.out.println("Enter max. Six persons name:-");
        for(int i=0;i<6;i++)
        {
            System.out.print("person name: "+(i+1)+")");
            name[i]=br.readLine();
        }
        System.out.println("Enter Age:-");
        for(int i=0;i<6;i++)
        {
            System.out.print("age: "+(i+1)+")");
            age[i]=br.readLine();
        }
        System.out.println("Enter Gender:-");
        for(int i=0;i<6;i++)
        {
            System.out.print("person: "+(i+1)+")");
            gen[i]=br.readLine();

        }
        System.out.println("Enter start station:-");
        ss=br.readLine();

        System.out.println("Enter destination station:-");
        ds=br.readLine();
//System.out.println("Enter date of journey:-");
//dj=br.readLine();

    }
}