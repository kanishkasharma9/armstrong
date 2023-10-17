import java.util.Scanner;

public class Function_armstrong {
    static int arms (int num,int arm){
        while(num!=0){
            int rem=num%10;
            arm+=Math.pow(rem,3);
            num=num/10;

        }
        return arm;

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        
        int temp=num;
        int arm=0;
        int r=arms(num,arm);
        if(r==temp){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
        
        
        
       
    }
    
}
