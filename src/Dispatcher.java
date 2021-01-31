public class Dispatcher {
    Penguin creator = new Penguin();
    Penguin p1 =  creator.createBird();
    Penguin p2 =  creator.createBird();
    Penguin[] pArray = {p1, p2};

    public static void main(String[] args) {
        Swallow s = new Swallow("Alesha");
        Bird str = new Strauss();
        Bird p = new Penguin();
        Bird c = new Crocozyablic();
        Bird[] birds = {s, str, p, c};
        System.out.print("Swallows name is " + s.name + ". ");
        for (Bird i : birds) {
            polyMoves(i);
        }
        Penguin p3 = new Penguin();
        p3.move();

    }

    static void polyMoves(Bird bird) {
 //       bird.move();
    }

}
