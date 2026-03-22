enum Status{
    Running, Completed, Failed
}
public class demo {
    public static void main(String[] args) {
        //enum wiuth switch and if-else statements
        Status s1 = Status.Running;
        if(s1 == Status.Running){
            System.out.println("The status is Running");
        }else if(s1 == Status.Completed){
            System.out.println("The status is Completed");
        }else if(s1 == Status.Failed){
            System.out.println("The status is Failed");
        }else{
            System.out.println("Invalid status");
        }

        switch(s1){
            case Running:
                System.out.println("The status is Running");
                break;
            case Completed:
                System.out.println("The status is Completed");
                break;
            case Failed:
                System.out.println("The status is Failed");
                break;
            default:
                System.out.println("Invalid status");
        }
    }
}
