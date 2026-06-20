package Arrays;

public class MinimumPlatformsRequiredMethod1
{
    static int findPlatform(int arr[], int dep[]) {
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int cnt=1;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(arr[i]>=arr[j] && dep[j]>=arr[i])
                    {
                        cnt++;
                    }
                }
            }
            ans=Math.max(cnt,ans);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[]={900,940,950,1100,1500,1800};
        int dep[]={910,1200,1120,1130,1900,2000};
        System.out.println(findPlatform(arr,dep));
    }
}
