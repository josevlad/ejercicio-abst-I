package ar.com.ada.figures.subclass;

import ar.com.ada.figures.abst.Figure;

import java.util.Objects;

public class Circle extends Figure {
    private Double radio;

    public Circle() {
    }

    public Circle(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calculateArea() {
        this.area = Math.PI * Math.pow(this.radio, 2);
        return this.area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle that = (Circle) o;
        return radio.equals(that.radio) &&
                super.equals(that);
    }

    @Override
    public int hashCode() {
        return -2 * Objects.hash(this.radio);
    }

    @Override
    public String toString() {
        return "Circle { radio = " + radio + ", area = " + area + " }";
    }
}
