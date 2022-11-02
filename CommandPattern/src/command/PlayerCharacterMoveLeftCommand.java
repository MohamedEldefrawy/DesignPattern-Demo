package command;

import contract.Command;
import model.PlayerCharacter;

public class PlayerCharacterMoveLeftCommand implements Command {
    private PlayerCharacter playerCharacter;

    public PlayerCharacterMoveLeftCommand(PlayerCharacter playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    @Override
    public void execute() {
        this.playerCharacter.moveLeft();
    }
}
