/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antti.teht22;

/**
 *
 * @author antti
 */
public class FlipUpCommand implements Command {
    private Valkokangas light;
    public FlipUpCommand(Valkokangas light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
