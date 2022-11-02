package command;

import contract.Command;
import model.PlayerCharacter;

public class PlayerCharacterMoveRight implements Command {
    PlayerCharacter playerCharacter;

    public PlayerCharacterMoveRight(PlayerCharacter playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    @Override
    public void execute() {
        this.playerCharacter.moveRight();
    }
}
