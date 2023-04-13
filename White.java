public abstract class White extends Fichas{
    
    abstract  void move();
    abstract boolean canMove();
    abstract void eat(Fichas ficha);
    abstract boolean canEat(Fichas ficha);

}
