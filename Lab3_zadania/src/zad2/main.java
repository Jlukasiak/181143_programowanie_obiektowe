package zad2;

public class main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 3;
        p1.y = 4;

        Point p2 = new Point();
        p2.x = 0;
        p2.y = 0;

        System.out.println("Przed obliczeniem odległości:");
        double dist = p1.distance(p2);
        System.out.println("Odległość między punktami: " + dist);
        System.out.println("Po obliczeniu odległości");
    }
}
