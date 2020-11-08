class railrev
{
    int b[][]=new int[10][5];
    public railrev()
    {
        for(int r=0;r<10;r++)
        {
            for(int c=0;c<5;c++)
            {
                b[r][c]=0;
            }
        }
    }

    public void disp()
    {
        System.out.println("*********************Seats vacant=0: Seats reserved=1**************");
        System.out.println("*********************~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~**************");
        for(int r=0;r<10;r++)
        {
            for(int c=0;c<5;c++)
            {
                System.out.print(" "+b[r][c]+" ");
            }
            System.out.println();
        }
    }
    //enter row and column no. of seat
//you want to reserve.
    public void check(int r,int c)

    {
        boolean flag=false;
        r=r-1;
        c=c-1;
        if(r<0||r>=10||c<0||c>=5)
        {
            System.out.println("Sorry........................There are only 10 rows and 5 columns");

        }
        else if(b[r][c]==0)
        {

            b[r][c]=1;
            System.out.println(" Requested Confirmed......Wish you a Well Journey ");
            disp();


        }
        else if(b[r][c]==1)
        {
            for(int j=0;j<5;j++)
            {
                if(b[r][j]==0)
                {
                    b[r][j]=1;
                    System.out.println("You have been given an alternative seat.Your seat number is at row= "+(r+1)+" and column= "+(j+1));
                    flag=true;
                    break;
                }
            }
            if(flag==false) System.out.println("Sorry no seat is vacant in this row please select another row");




            disp();
        }


    }
}
