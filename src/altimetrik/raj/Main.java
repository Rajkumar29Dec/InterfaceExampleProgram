package altimetrik.raj;

public class Main {

    public static void main(String[] args) {
        ICalculator calculator;
        //CALCULATOR CLASS
        calculator=new Calculator();
        System.out.println(calculator.Add(5,8));
        //HOtelBILL CALC CLASS
        calculator=new HotelBillCalc();
        System.out.println(calculator.Multiply(120,5));
    }
}
