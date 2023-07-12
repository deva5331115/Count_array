import java.util.Scanner;

public class CountArray {
    public int arraysCount(int arr[]){
        int max=Integer.MIN_VALUE,cnt=0;

        for (int a:arr
             ) {
            if(max<a){
                max=a;
            }



        }
        for (int array:arr
             ) {
            if(max==array){
                cnt++;
            }

        }
        return arr.length-cnt;

    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();

        }
        CountArray count=new CountArray();
        System.out.println(count.arraysCount(array));


    }
}
