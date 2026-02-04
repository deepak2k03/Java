public class Main {
    public static void main(String[] args) {
        //stringbuffer is thread safe but stringbuilder is not but rest is same
        StringBuffer str =new StringBuffer("Deepak");
        System.out.println(str.capacity());
        System.out.println(str.length());
    }
}
