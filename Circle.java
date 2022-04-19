public class Circle {
 
   float radius; //Declarando a variavel radius do tipo float
 
  Circle(float radius){ //Construtor
        this.radius = radius;
    }
 
  public double area() { //Metodo publico area
      return Math.PI * radius *radius;
   }
 
  public double circumference() { //Metodo publico circumference
      return Math.PI * radius *2;
   }
   public static void main(String[] args) {  //Main da funcao
      Circle c = new Circle(2);
      System.out.println("Area do circulo: " + c.area());
    System.out.println("Circumferencia do circulo: " + c.circumference());
   }
}
