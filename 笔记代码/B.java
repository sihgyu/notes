public class B{
    public static void main(String[] args) {
        Dnf dnf = new Dnf(1);

    }
}

class Game{
    Game(int i){
        System.out.println("调用 Game构造器");
    }
}

class Dnf extends Game{

    Dnf(int i){
        super(11);
        System.out.println("调用Dnf构造器");
    }
}