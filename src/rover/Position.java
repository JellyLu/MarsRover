package rover;

public class Position {
    private final int x;
    private final int y;
    private static int STEP = 1;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position move(Direction direction) {
        if (direction.equals(Direction.NORTH))
            return new Position(x, y + STEP);

        if (direction.equals(Direction.SOUTH))
            return new Position(x, y - STEP);

        if (direction.equals(Direction.EAST))
            return new Position(x + STEP, y);

        return new Position(x - STEP, y);
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
