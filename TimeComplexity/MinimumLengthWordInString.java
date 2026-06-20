package TimeComplexity;

public class MinimumLengthWordInString
{
    public static void main(String[] args)
    {
        String str="abc de ghihjk a uvw h j ";
        int min=Integer.MAX_VALUE,count=0,index=0,i;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                count++;
            }
            else {
                if (count < min) {
                    min = count;
                    index = i;
                }
                count=0;
            }
        }
        if ( str.charAt(i-1)!=' ' && count < min) {
            min = count;
            index = i;
        }
        String minString="";
        for(int j=index-min;j<index;j++)
        {
            minString+=str.charAt(j);
        }
        System.out.println(minString);

    }
}
