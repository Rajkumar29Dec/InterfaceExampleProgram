package altimetrik.raj;

public interface ICalculator {
    default int Add(int a,int b){
        return a+b;
    }
    default int Sub(int a,int b){
        return a-b;
    }
    default int Multiply(int a,int b){
        return a*b;
    }
    default int Multiply(int a,int b,int c){
        return a*b*c;
    }
    default int Divide(int a,int b){
        if (b!=0){
            return a/b;
        }
        else {
            return -1;
        }
    }
}
