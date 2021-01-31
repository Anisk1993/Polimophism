public class Bird {
    private void move() {
        System.out.println("Different ways");
    }

    Bird createBird() {
        return new Bird();
    }
}

class Swallow extends Bird {
    String name;

    Swallow(String name) {
        this.name = name;
    }

     void move() {
        System.out.println("Swallow fly");
    }

    Bird createBird() {
        return new Swallow(name);
    }
}

class Penguin extends Bird {
     void move() {
        System.out.println("\nPenguin swim");
    }
    Penguin createBird() {
        return new Penguin();
    }
}

class Strauss extends Bird {
     void move() {
        System.out.println("Strauss run");
    }
    Bird createBird() {
        return new Strauss();
    }
}

class Crocozyablic extends Bird {
     void move() {
        System.out.println("Another way");
    }
    Bird createBird() {
        return new Crocozyablic();
    }
}