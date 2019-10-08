package ar.com.ada.abstracts.subclass;

import ar.com.ada.abstracts.abst.Figure;

import java.util.Objects;

public class Triangle extends Figure {
    private Double heigth;
    private Double width;

    public Triangle() {
    }

    public Triangle(Double heigth, Double with) {
        this.heigth = heigth;
        this.width = with;
    }

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public Double calculateArea() {
        return (this.heigth * this.width) / 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle that = (Triangle) o;
        return width.equals(that.width) &&
                heigth.equals(that.heigth);
    }

    @Override
    public int hashCode() {
        return -5 * Objects.hash(this.heigth, this.width);
    }

    @Override
    public String toString() {
        return "Triangle { heigth = " + heigth + ", width = " + width + ", area = " + area + " }";
    }
}
