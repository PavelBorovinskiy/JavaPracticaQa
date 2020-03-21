package ru.pavel;

public class MyProgram {

  public static void main(String[] args) {
    hello("Pavel");
    System.out.println();

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangel r = new Rectangel(8,1);

    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

  }

  public static void hello(String somebody) {

    System.out.println("Hello, " + somebody);
  }

}
