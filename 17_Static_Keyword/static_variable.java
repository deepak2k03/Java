class static_variable {

    static String college = "KNIT"; // static variable

    public static void main(String[] args) {
        static_variable s1 = new static_variable();
        static_variable s2 = new static_variable();

        //call static variable by class not s1.coolege
        System.out.println(static_variable.college);
    }
}
