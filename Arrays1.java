//demonstration of the 1D array
class Arrays{
    public static void main(String[] args) {
        int month[] = new int [12];
        month[0] = 31;
        month[1] = 28;
        month[2] = 31;
        month[3] = 30;
        month[4] = 31;
        month[5] = 30;
        month[6] = 31;
        month[7] = 31;
        month[8] = 30;
        month[9] = 31;
        month[10] = 30;
        month[11] = 31;
        System.err.println(" April has"+ month[3]+" days");

    }
}
//the following code shoes the different ways that an array can be declared and initailized
public class ArrayDefinitionDemo{
    public static void main(String args[]){
        float x[];
        x = new float[100];
        args = new String[10];
        boolean[] isPrime = new boolean[1000];
        int fib[] = {0,1,1,2,3,5,8,13};
        short[][][] b = new short[4][10][5];
        double a[][] = {{1.1,2.2},{3.3,4.4},null,{5.5,6.6},null};
        a[4] = new double[66];
        a[4][65] = 3.14;
        object[] objects = {x,args,isprime,fib,b,a};
    }
}
    
