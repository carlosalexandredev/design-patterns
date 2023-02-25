package dev.carlos.designpatters.behavioral.state.pacman.states;


import dev.carlos.designpatters.behavioral.state.pacman.Ghost;

public interface GhostStates {
	void spotPacman(Ghost ghost);
	void losePacman(Ghost ghost);
	void pacmanTurnsSpecial(Ghost ghost);
	void pacmanTurnsNormal(Ghost ghost);
	void eatenByPacman(Ghost ghost);
	void reachTheBase(Ghost ghost);
}
