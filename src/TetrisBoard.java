import java.util.function.Consumer;

public class TetrisBoard {
    private int max_x;
    private int max_y;

    public TetrisBoard(int max_x, int max_y) {
        this.max_x = max_x;
        this.max_y = max_y;
    }

    public void makeMove(Consumer<Tetromino> onSuccess, boolean endMove){
        //TODO
    }
}
