package lift;

public class LiftImpl implements LiftOperations{

    Lift lift = new Lift(0, Directions.STILL);

    @Override
    public Lift getState() {
        return lift;
    }
}
