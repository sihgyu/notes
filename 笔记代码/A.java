/*************************************************************************
	> File Name: A.java
	> Author: 
	> Mail: 
	> Created Time: Tue Apr 30 20:07:55 2019
 ************************************************************************/
public class A{

    public static void main(String[] args){
        Soup1 s =  Soup1.makeS();
        Soup1 s1 = Soup1.makeS();
        System.out.println(s.i);

    }
}
class Soup1{
    public static int i = 0;

    private Soup1(){

    }
    public static Soup1 makeS(){
    
        i ++;
        return new Soup1();
    }
}
