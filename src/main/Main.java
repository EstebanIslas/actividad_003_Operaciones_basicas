package main;

import model.ModelCalculadora;
import view.ViewCalculadora;
import controller.ControllerCalculadora;

public class Main {

    public static void main(String[] args) {
        ModelCalculadora modelCalculadora = new ModelCalculadora();
        ViewCalculadora viewCalculadora = new ViewCalculadora();
        ControllerCalculadora controllerCalculadora = new ControllerCalculadora(modelCalculadora, viewCalculadora);
    }
}
