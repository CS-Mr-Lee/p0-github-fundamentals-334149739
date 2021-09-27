//requires Drawer.java
class Main {
  public static void main(String[] args) {
    Drawer ctx = new Drawer();
    fract(ctx, 0, 0, 0);
    /*house
    ctx.rect(-50, -100, 100, 100);
    ctx.moveTo(-60, 0);
    ctx.lineTo(60, 0);
    ctx.lineTo(0, 25);
    ctx.lineTo(-60, 0);
    ctx.rect(-30, -100, 14, 40);
    ctx.rect(10, -45, 30, 30);
    ctx.moveTo(25, -45);
    ctx.lineTo(25, -15);
    ctx.moveTo(10, -30);
    ctx.lineTo(40, -30);
    ctx.rect(30, 0, 15, 40);
    */
    //ctx.fillRect(20, 20, 80, 30);
    //ctx.fillSquare(20, 20, 25);
  }
  public static void fract(Drawer ctx, double relX, double relY, int depth){
    if(depth < 5){
      double size = 200 / Math.pow(3, depth);
      ctx.rect(relX - size / 2, relY - size / 2, size, size);
      size /= 3;
      for(int x = 0;x < 3;x++){
        for(int y= 0;y < 3;y++){
          if(x != 1 || y != 1){
            fract(ctx, relX + (x - 1) * size, relY + (y - 1) * size, depth + 1);
          }
        }
      }
    }
  }
}
