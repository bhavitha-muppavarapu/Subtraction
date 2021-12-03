public class Subtraction {
    //Declare the instance method sub with two parameters x and y having datatype int
    void sub(int x, int y)
    {
        int a = x-y;
        System.out.println("Subtraction of two numbers:"+ a);
        return ;
    }
    //Declare an instance method sub with two parameters x and y having datatype double.
    double sub(double x, double y){
        double b= x-y;
        System.out.println("Subtraction of two numbers:"+b);
        return b;
    }
    public static void main(String[] args){
        Subtraction s = new Subtraction();
        s.sub(5,10);//it will call sub() method to calculate the subtraction of two int type arguments
        s.sub(20.8,10.9); //it will call sub() method to calculate the subtraction of two double parameters
    }
}
