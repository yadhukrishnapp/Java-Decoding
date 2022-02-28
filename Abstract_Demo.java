abstract class sport {
    abstract void game();
}

class hockey extends sport {
    void game() {
        System.out.println("We play hockey");
    }
}

class football extends sport {
    void game() {
        System.out.println("We play football");
    }
}

class cricket extends sport {
    void game() {
        System.out.println("We play cricket");
    }
}

public class Abstract_Demo {
    public static void main(String[] args) {
        sport s1 = new hockey();
        sport s2 = new football();
        sport s3 = new cricket();
        s1.game();
        s2.game();
        s3.game();
    }
}