package rover;

public class Position {
    private int x;
    private int y;
    private static int STEP = 1;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(Direction direction) {
        switch (direction) {
            case NORTH:
                y = y + STEP;
                break;
            case SOUTH:
                y = y - STEP;
                break;
            case EAST:
                x = x + STEP;
                break;
            case WEST:
                x = x - STEP;
                break;
        }
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
