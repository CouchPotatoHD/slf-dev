import lift.Directions;
import lift.Lift;
import lift.LiftImpl;
import lift.LiftOperations;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LiftTest {

    @Test
    public void shouldRespondToTheCall(){

        LiftOperations liftOperations = new LiftImpl();

        assertThat(liftOperations.getState().getSourceFloor()).isEqualTo(0);
        assertThat(liftOperations.getState().getDirection()).isEqualTo(Directions.STILL);

    }

    @Test
    public void hasAFloorAttribute(){

    }

    @Test
    public void hasDeliveredPassengersToRequestedFloor(){

    }

    @Test
    public void couldRetrieveCurrentFloor(){

    }

    @Test
    public void couldRetrieveCurrentDirection(){

    }

    @Test
    public void notifiesWhenTheDoorsAreOpening(){

    }

    @Test
    public void notifiesWhenTheDoorsAreClosing(){

    }

    @Test
    public void notifiesWhenTheLiftArrivesAtTheRequestedFloor(){

    }
}
