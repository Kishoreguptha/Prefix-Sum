import java.util.Scanner;

public class PreArr {
    static int n;
    public static int [] PreArr(int arr[]){
        int f[] = new int[n];
        f[0]=arr[0];
        for(int i=1;i<n;i++){
            f[i]=f[i-1]+arr[i];
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int pre[]=PreArr(arr);
        for(int i=0;i<n;i++){
            System.out.println(pre[i]+" ");
        }
    }
}
