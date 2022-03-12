import processing.core.PApplet;

public class Processing extends PApplet {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int diameter = 10;
    private static int a = 0;
    private static int b = 0;
    private static int c = 0;
    private static int d = 0;

    public static void main(String[] args) {
        PApplet.main("Processing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ellipse(0, (HEIGHT / 5), diameter, diameter);
        ellipse(0, (HEIGHT / 5) * 2, diameter, diameter);
        ellipse(0, (HEIGHT / 5) * 3, diameter, diameter);
        ellipse(0, (HEIGHT / 5) * 4, diameter, diameter);
    }

    @Override
    public void draw() {
        movingBalls4();
    }

    private void movingBalls4() {
        ellipse(a, (HEIGHT / 5), diameter, diameter);
        a++;

        ellipse(b, (HEIGHT / 5) * 2, diameter, diameter);
        b = b + 2;

        ellipse(c, (HEIGHT / 5) * 3, diameter, diameter);
        c = c + 3;

        ellipse(d, (HEIGHT / 5) * 4, diameter, diameter);
        d = d + 4;
    }
}
