import java.util.Scanner;

public class OnBoardComputer implements BurnStream {
    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;

        if (status.Altitude > 1){
            int accel = (status.Velocity * status.Velocity) / (2 * status.Altitude);
            burn = accel + 100;
            if (burn > 200){
                burn = 200;
            }
        } else {
            burn = 100;
        }

        System.out.println(burn); /*hack!*/
        return burn;
    }

}
