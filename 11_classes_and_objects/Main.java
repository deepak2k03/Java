class calc{
    int x=5;
    public int add(int x, int y){
        return x+y;
    }
}
public class Main {
    public static void main(String[] args) {
        calc obj=new calc();
        System.out.println(obj.add(3, 4));
    }
}
