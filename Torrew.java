import java.util.ArrayList;

public class Torrew extends White{

        String name = "Torre";
    @Override
    boolean canMove() {
            return  this.y+1==0||this.x==0;
    }

    private ArrayList<Integer> movementsY(){
        int inicio = this.y;
        ArrayList<Integer> posicionesY = new ArrayList<Integer>();
        for(int i = this.y; i<8;i++){
            if(canMove()){
                posicionesY.add(i);
            }
            this.y++;
        }
        this.y=inicio;
        return posicionesY;
    }

    @Override
    void move() {
        
    }

    @Override
    void eat(Fichas ficha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }

    @Override
    boolean canEat(Fichas ficha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'canEat'");
    }
    
}
