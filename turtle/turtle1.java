import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Turtle turtle = new RGBTurtle();

    Turtle.bgcolor("lightblue");
    turtle.penColor("red");
    turtle.width(10);

    while(true){
      String input = scanner.next();
      double amt, amt2;
      switch(input){
        case "f":
          amt = scanner.nextInt();
          turtle.forward(amt);
          break;
        case "l":
          amt = scanner.nextInt();
          turtle.left(amt);
          break;
        case "r":
          amt = scanner.nextInt();
          turtle.right(amt);
          break;
        case "hide":
          turtle.up();
          break;
        case "show":
          turtle.down();
          break;
        case "sd":
          amt = scanner.nextInt();
          turtle.setDirection(amt);
          break;
        case "sp":
          amt = scanner.nextInt();
          amt2 = scanner.nextInt();
          turtle.setPosition(amt, amt2);
          break;
        default:
          try{
            int i = Integer.parseInt(input);
          }catch(Exception e){
            System.out.println("invalid command");
          }
      }
    }

//for the below files just copy paste into console

/*Weird Rectangle
f 100
l 90
f 150
l 90
f 20
l 90
f 50
r 90
f 80
l 90
f 100
*/

/*Broken Square
f 20
hide f 20
show f 30
hide f 20
show f 20
l 90
f 20
hide f 20
show f 30
hide f 20
show f 20
l 90
f 20
hide f 20
show f 30
hide f 20
show f 20
l 90
f 20
hide f 20
show f 30
hide f 20
show f 20
*/
    
    

    /*below is a reference for the functions are are not related to the project
      bob.forward(distance)
      bob.backward(distance)
      bob.left(angle)
      bob.right(angle)

      bob.up()
      bob.down()

      bob.setDirection(angle)
      bob.home()
      bob.hide()
      bob.show()
      bob.face(x, y)
      bob.setPosition(x, y)

      bob.tilt(angle)
      bob.width(width)
      bob.penColor("colour")
      bob.bgcolor("colour")
      
      bob.stamp()
      bob.dot()
      bob.dot("colour")
      bob.dot("colour", dotsize)
    */
  }
}
