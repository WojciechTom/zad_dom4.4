package Odcinek;

public class Line {
    String nazwaOdc;
    Point p1;
    Point p2;

    public Line(String nazwaOdc, Point p1, Point p2) {
        this.nazwaOdc = nazwaOdc;
        this.p1 = p1;
        this.p2 = p2;
    }

    public String getNazwaOdc() {
        return nazwaOdc;
    }

    public void setNazwaOdc(String nazwaOdc) {
        this.nazwaOdc = nazwaOdc;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }
}
