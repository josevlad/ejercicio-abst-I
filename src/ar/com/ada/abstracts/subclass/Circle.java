package ar.com.ada.abstracts.subclass;

import ar.com.ada.abstracts.abst.Figure;

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
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle that = (Circle) o;
        return radio.equals(that.radio);
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
