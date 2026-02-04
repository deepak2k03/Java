
public class loop {
    public static void main(String[] args) {
        
        System.out.println("this is while loop");
        
        int c=0;
        while (c<5) {
            System.out.printf("This is %d",c);
            c++;
            System.out.println();
        }
        
        System.out.println("this is do while loop");
        
        do{
            System.out.println(c);
            c++;
        }while(c<=10);
        
        System.out.println("this is for loop");
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}
