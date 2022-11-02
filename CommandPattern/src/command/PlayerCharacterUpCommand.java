package command;

import contract.Command;
import model.PlayerCharacter;

public class PlayerCharacterUpCommand implements Command {

    private PlayerCharacter playerCharacter;

    public PlayerCharacterUpCommand(PlayerCharacter playerCharacter) {
        this.playerCharacter = playerCharacter;
    }

    @Override
    public void execute() {
        this.playerCharacter.jump();
    }
}
