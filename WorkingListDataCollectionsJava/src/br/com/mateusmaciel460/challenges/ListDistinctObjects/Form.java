package br.com.mateusmaciel460.challenges.ListDistinctObjects;

interface IForm {
    double calculateArea();
}

class Form {
    private String name;

    public String getName() {
        return name;
    }

    public Form(String name) {
        this.name = name;
    }
}

class Circle extends Form implements IForm {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Square extends Form implements IForm {
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}