package com.company;

class Stack<T extends Object> {
    private int maxSize;
    private T[] stackArr;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArr = (T[]) new Object[maxSize];
        this.top = -1;
    }

    public boolean isStackEmpty() {
        return (top == -1);
    }

    public boolean isStackFull() {
        return (top == maxSize - 1);
    }

    public void push(T elements) {
        if (this.isStackFull()) {
            System.out.println(("Stack is full"));
        }
        System.out.println("В стек добавлен элемент");
///        System.out.println("В стек добавлен элемент: " + elements);
        this.stackArr[++top] = elements;
    }

    public void pop() {
        if (this.isStackEmpty()) {
            System.out.println("Stack is empty");
        }
        T elements = this.stackArr[top--];
        System.out.println("Удалённый элемент: " + elements);
    }
};

class FIGURE {
    public double calc_square() {
        return 0;
    }
    public String fig() {
        return null;
    }
///    public FIGURE(String fig) {
///        this.fig = fig;
///   }
}

class Triangle extends FIGURE {
    private double p, a, b, c, square;
    private String name_fig = "Треугольник";
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
///        super(fig);
   }
    public double calc_square() {
        p = (a + b + c) / 2;
        square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return square;
    }
    public String fig() {
        return name_fig;
    }
}

class Circle extends FIGURE {
    private double square, r;
    private String name_fig = "Круг";
    public Circle(double r){
        this.r = r;
    }
///    public Circle(String fig) {
///        super(fig);
///    }
    public double calc_square() {
        square = Math.PI * r * r;
        return square;
    }
    public String fig() {
        return name_fig;
    }
}

public class Main {
    public static void main(String[] args) {
        FIGURE[] figure = {
                new Triangle(3, 5, 7),
                new Circle(4)
        };
        Stack<String> stack = new Stack<String>(2);

        for (FIGURE Fig : figure) {
            String f1 = Fig.fig() + ": площадь S = " + Fig.calc_square();
            stack.push(f1);
            //System.out.println(Fig.fig() + ": Площадь S = " + Fig.calc_square());
        }
        System.out.println(" ");

        for (int i = 0; i < figure.length; i++)
        {
            stack.pop();
        }
    }
}
