package dev.carlos.designpatters.behavioral.state.pacman;


import dev.carlos.designpatters.behavioral.state.pacman.states.GhostStates;
import dev.carlos.designpatters.behavioral.state.pacman.states.WanderMazeState;

public class Ghost {
	private GhostStates state = WanderMazeState.getInstance();

	public GhostStates getState() {
		return state;
	}

	public void setState(GhostStates state) {
		System.out.println(String.format("Changing from %s to %s", 
				this.state.getClass().getSimpleName(), 
				state.getClass().getSimpleName()));
		this.state = state;
	}
	
	public void spotPacman() {
		state.spotPacman(this);
	}

	public void losePacman() {
		state.losePacman(this);
	}

	public void pacmanTurnsSpecial() {
		state.pacmanTurnsSpecial(this);		
	}

	public void pacmanTurnsNormal() {
		state.pacmanTurnsNormal(this);
	}

	public void eatenByPacman() {
		state.eatenByPacman(this);
	}

	public void reachTheBase() {
		state.reachTheBase(this);
	}
}
