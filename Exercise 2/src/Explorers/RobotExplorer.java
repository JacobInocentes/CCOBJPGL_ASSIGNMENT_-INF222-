package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {

    public void visit(Mars mars) {
        System.out.println("Robot landed on Mars");

    }

    public void visit(Saturn saturn) {

        System.out.println("Robot landed on Saturn");
    }

    public void visit(Mercury mercury) {
        System.out.println("Robot landed on Mercury");
    }

    public void visit(Earth earth) {
        System.out.println("Robot landed on earth");
    }

    public void visit(Jupiter jupiter) {
        System.out.println("Robot landed on jupiter");
    }

    public void visit(Venus venus) {
        System.out.println("Robot landed on Venus");
    }

    public void visit(Neptune neptune) {
        System.out.println("Robot landed on Neptune");
    }

    public void visit(Pluto pluto) {
        System.out.println("Robot landed on Pluto");
    }

    public void visit(Uranus uranus) {
        System.out.println("Robot landed on uranus");
    }
}