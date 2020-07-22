public class App 
{
    public static void main( String[] args )
    {
        //taking inputs from Class Class for io
        Classforio io=new Classforio();
        float[] arr=io.takeip();

        //Calculating
        Operations calc=new Operations();
        String res=calc.compute(arr);

        //Printing Output
        io.printop(res);
    }
}