
package antti.teht22;


public class FlipDownCommand implements Command {
    private Valkokangas light;
    public FlipDownCommand(Valkokangas light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }

}
