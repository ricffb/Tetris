public enum Direction {

    UP (0,-1),
    DOWN (0, 1),
    RIGHT(1, 0),
    LEFT (-1, 0);

    int x, y;

    Direction(int x, int y) {
        this.x = x;
        this.y = y;
    }


}
