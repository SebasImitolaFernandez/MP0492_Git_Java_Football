package worldcup;

import java.util.ArrayList;

/**
 * Class to define the team
 */

public class Team {
    String name;
    Coach coach;
    ArrayList<Player> players;    
    
    public void play(){
            System.out.println("playing");
    }

    public Team(String name) {
		super();
		this.name = name;
	}

	public void attack(){
        System.out.println("attacking");
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
    
}
