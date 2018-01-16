public class TetrisPiece {

    public Tetromino parent;
    public int distance;
    public Direction direction;
    private int x,y ;
    public TetrisPiece(int distance, Direction direction) {
        this.distance = distance;
        this.direction = direction;
    }
//          011
    //      1
    public void setParent(Tetromino parent) {
        this.parent = parent;

        x = parent.getX()+ distance * direction.x;
        y = parent.getY()+ distance * direction.y;


    }

    public TetrisPiece copy(){
        return new TetrisPiece(distance, direction);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
