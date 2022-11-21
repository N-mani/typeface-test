import java.util.*;

public class 2 {

    public static int find(String s1, String s2)
    {
        int len1=s1.length()-1;
        int len2=s2.length()-1;
        int count=0;
        char ch=s2.charAt(len2);
        for(int i=0;i<len1;i++)
        {
            if(ch==s1.charAt(i))
            {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        System.out.println(find(str1,str2));
        
    }
}
