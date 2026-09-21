package worldcup;

/**
 *  Class to define the player
 */

public class Player { 
    String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void passBall(){
            System.out.println("Passing the ball");
    }
}