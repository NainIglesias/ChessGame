public class Peonw extends White {

    String name = "Peon";
    @Override
    void move() {
        if(canMove()){
            this.y+=1;
        }
    }

    @Override
    void eat(Fichas ficha) {
            if(canEat(ficha)){
                this.x=ficha.x;
                this.y=ficha.y;
            }
    }

    @Override
    boolean canMove() {
        return this.y+1==0;    
    }

    @Override
    boolean canEat(Fichas ficha) {
        return (ficha.x ==this.x+1 || ficha.x ==this.x-1)&&ficha.y==this.y+1;    
    }


}
