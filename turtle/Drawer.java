public class Drawer{
  Turtle turtle;
  public Drawer(){
    turtle = new Turtle();
    turtle.penColor("red");
    turtle.width(1);
    turtle.speed(0);
    turtle.hide();
  }
  public void lineWidth(double width){
    turtle.width(width);
  }
  public void moveTo(double x, double y){
    turtle.up();
    turtle.setPosition(x, y);
  }
  public void lineTo(double x, double y){
    turtle.down();
    turtle.setPosition(x, y);
    turtle.up();
  }
  public void rect(double x, double y, double width, double height){
    this.moveTo(x, y);
    turtle.down();
    turtle.setDirection(0);
    for(int i = 0;i < 2;i++){
      turtle.forward(width);
      turtle.left(90);
      turtle.forward(height);
      turtle.left(90);
    }
    turtle.up();
  }
  public void fillRect(double x, double y, double width, double height){
    this.rect(x, y, width, height);
    turtle.width(5);
    for(int i = 4;i < width;i += 5){
      this.moveTo(x + i, y);
      this.lineTo(x + i, y + height);
    }
    turtle.width(1);
  }
  public void fillSquare(double x, double y, double width){
    this.fillRect(x, y, width, width);
  }
}
