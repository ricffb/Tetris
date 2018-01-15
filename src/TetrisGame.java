public class TetrisGame {

    public static final int WIDTH = 15;
    public static final int HEIGHT = 20;
    public TetrisBoard board;

    public TetrisGame() {
        board = new TetrisBoard(WIDTH, HEIGHT);
    }
}
