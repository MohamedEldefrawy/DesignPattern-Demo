package command;

import contract.Command;
import model.PlayerCharacter;

public class PlayerCharacterCrouchCommand implements Command {
    private PlayerCharacter playerCharacter;

    public PlayerCharacterCrouchCommand(PlayerCharacter playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    @Override
    public void execute() {
        this.playerCharacter.crouch();
    }
}
