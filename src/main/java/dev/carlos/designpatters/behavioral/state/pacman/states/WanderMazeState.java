package dev.carlos.designpatters.behavioral.state.pacman.states;


import dev.carlos.designpatters.behavioral.state.pacman.Ghost;

public class WanderMazeState implements GhostStates {
	private static final WanderMazeState instance = new WanderMazeState();
	private WanderMazeState() {};
	
	public static WanderMazeState getInstance() {
		return instance;
	}

	@Override
	public void spotPacman(Ghost ghost) {
		
	}

	@Override
	public void losePacman(Ghost ghost) {
		
	}

	@Override
	public void pacmanTurnsSpecial(Ghost ghost) {
		
	}

	@Override
	public void pacmanTurnsNormal(Ghost ghost) {
		
	}

	@Override
	public void eatenByPacman(Ghost ghost) {
		
	}

	@Override
	public void reachTheBase(Ghost ghost) {
		
	}
}
