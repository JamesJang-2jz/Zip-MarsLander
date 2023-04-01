import java.util.Scanner;

public class OnBoardComputer implements BurnStream {
    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;
        if (status.getAltitude() > 1000 && status.getVelocity() > 100){
            burn = 200;
            return burn;
        }
        if (status.getAltitude() < 1000 && status.getVelocity() < 100){
            burn = 100;
            return burn;
        }
        // if

//        System.out.println(burn); /*hack!*/
        return burn;
    }






}
