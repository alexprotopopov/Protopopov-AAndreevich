package ru.job4j.condition;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double period(double ab, double ac, double bc) {
        ab = a.distanceTo(b);
        ac = a.distanceTo(c);
        bc = b.distanceTo(c);
        double p = (ab + ac + bc) / 2;
        return p;
    }

    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
        } else {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    private boolean exist(double ab, double ac, double bc) {
        return false;
    }
}
		