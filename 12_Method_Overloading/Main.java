class calc{
    int x=5;
    public int add(int x, int y){
        return x+y;
    }
    public int add(int x, int y,int z){
        return x+y+z;
    }
}
public class Main {
    public static void main(String[] args) {
        calc obj=new calc();
        System.out.println(obj.add(3, 4));
        System.out.println(obj.add(1, 2, 3));
    }
}
