package rover;

public enum  Direction {
    NORTH("N"),
    EAST("E"),
    SOUTH("S"),
    WEST("W");

    static {
        NORTH.left = WEST;
        NORTH.right = EAST;
        EAST.left = NORTH;
        EAST.right = SOUTH;
        SOUTH.left = EAST;
        SOUTH.right = WEST;
        WEST.left =  SOUTH;
        WEST.right = NORTH;
    }

    private String symbol;
    private Direction left;
    private Direction right;
    Direction(String symbol) {
        this.symbol = symbol;
    }


    public Direction getLeft(){
        return this.left;
    }

    public Direction getRight() {
        return right;
    }

    public String getSymbol() {
        return symbol;
    }
}
