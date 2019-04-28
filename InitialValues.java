public class InitialValues{
    boolean b;
    char c;
    byte by;
    int i;
    float f;
    double d;
    void printValue(){
        System.out.println(b+" " + c + " " + by + " " + i + " " + f + " " + d);
    }
    public static void main(String[] args){
        InitialValues ii = new InitialValues();
        ii.printValue();
    }
}