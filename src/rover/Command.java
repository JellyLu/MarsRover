package rover;

public enum Command {
    M() {
        @Override
        public void excute(MarsRover marsRover) {
            marsRover.getPosition().move(marsRover.getDirection());
        }
    },
    R() {
        @Override
        public void excute(MarsRover marsRover) {
            marsRover.setDirection(marsRover.getDirection().getRight());
        }
    },
    L() {
        @Override
        public void excute(MarsRover marsRover) {
            marsRover.setDirection(marsRover.getDirection().getLeft());
        }
    };

    public abstract void excute(MarsRover marsRover);


}
