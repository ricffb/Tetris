import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Tetromino {
    private int x;
    private int y;
    private Color color;
    private ArrayList<TetrisPiece> pieces;

    public Tetromino(ArrayList<TetrisPiece> pieces, Color color){
      this.pieces = pieces;
      this.color = color;

      for (TetrisPiece p: this.pieces){
          p.setParent(this);
      }

    }

    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
