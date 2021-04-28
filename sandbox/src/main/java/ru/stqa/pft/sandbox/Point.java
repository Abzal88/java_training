package ru.stqa.pft.sandbox;

public class Point {

  public static void main(String[] args) {

    Pointdata P = new Pointdata(3, 2, 6, 4);
    System.out.println("расстояние точек =" + distance(P));
   }

  public static double distance(Pointdata P) {
    return Math.sqrt((P.p3 - P.p1) * (P.p3 - P.p1) + (P.p4 - P.p2) * (P.p4 - P.p2));
  }
}
