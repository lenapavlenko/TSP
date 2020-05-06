public class Calculating {
    private double x;

    public Calculating(double x) throws Except {

        if (x <= -2.018 || x >= 63.482) throw new Except("Wrong range", x);
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double equation1() {
        double y;
        y = Math.pow(x, 4) * 1.798 + Math.pow(x, 3) * 4.341 - Math.pow(x, 2) * 5.205 + x * 4.848;
        return y;
    }

    public double equation2() {
        double y;
        y = Math.pow(x, 3) * 6.955 - Math.pow(x, 2) * 3.268 + x * 8.392;
        return y;
    }

    public double equation3() {
        double y;
        y = Math.pow(x, 2) * 4.078 - x * 2.614;
        return y;
    }

    public double equation4() {
        double y;
        y = x * 5.632;
        return y;
    }

}
