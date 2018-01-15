import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

import javafx.scene.canvas.Canvas;

public class TetrisView{

    private static final int SCALE = 30;
    private TetrisGame game;
    private GraphicsContext g;
    private double time;

    public TetrisView (TetrisGame game){
        this.game = game;
    }

    public Parent getContent(){
        Pane root = new Pane();
        root.setPrefSize(game.WIDTH*SCALE, game.HEIGHT*SCALE);

        Canvas canvas =new Canvas(game.WIDTH*SCALE, game.HEIGHT*SCALE);
        g = canvas.getGraphicsContext2D();

        root.getChildren().addAll(canvas);

        this.createContent();

        spawn();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                time += 0.017;

                if (time >= 0.5) {
                    update();
                    render();
                    time = 0;
                }
            }
        };
        timer.start();


        return root;
    }

    /**
     * Creates the asset of original Pieces
     */
    private void createContent(){
        //TODO
    }

    /**
     * Spawns a new Tile
     */
    private void spawn(){
        //TODO
    }

    /**
     * Updates the scene, moves tile down
     */
    private void update(){
        //TODO
    }

    /**
     * Draws all tiles to the Scene
     */
    public void render(){
        //TODO
    }
}
