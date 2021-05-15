import java.util.*;
public class Password
{
    public static void ini()
    {
        char a[]={'A','9','z','B','8','y','C','7','x','D','6','w','E','5','v','F','4','u','G','3','t','H','2','s','I','1','r','J','0','q','K','p','L','"','o','M','&','n','N','@','m','O',']','l','P','[','k','Q','j','R',',','i','S',':','h','T',';','g','U','$','f','V','.','e','W','=','d','X','^','c','Y','b','Z','a','/','>','#','-','<','|','+','%','?',')','(',' ','*','_','~','!'};
        System.out.println("=");
        Scanner c=new Scanner(System.in);
        String b=c.next();
        String d="",f="";
        int j,e=0;
        for(int i=0;i<b.length();i++)
        {
            for(j=00;j<90;j++)
            {
               if(b.charAt(i)==a[j])
               {
                   if(j<10)
                       d="0"+Integer.toString(j);
                   else
                       d=Integer.toString(j);
                       f=f+d;
                       e=e+j;
                       System.out.println("char ind="+d);
                       System.out.println("f="+f);
                       System.out.println("sm="+e);
                       break;
               }
            }
        }
        aftncry(f,e,b);
    }
    public static String aftncry(String t,int s,String ac)
    {
        String ep="",sq=Integer.toString(s);
        char q[]={0,0,0,0};
        for(int i=0;i<4;i++)
        q[i]=(char)(int)(Math.random()*89);
        ep=t.substring(0,4)+sq.charAt(0)+t.substring(4,8)+(q[0]+q[1]+q[2]+q[3]);
        System.out.println("0-3"+t.substring(0,4));
        System.out.println("4"+sq.charAt(0));
        System.out.println("5-8"+t.substring(4,8));
        System.out.println("ramdom"+q[0]+q[1]+q[2]+q[3]);
        //System.out.println("ep="+ep);
        //System.out.println("ep="+ep);
        System.out.println("ep="+ep);
        return ep;
    }
}
