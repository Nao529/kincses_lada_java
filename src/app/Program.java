package app;

import controller.JatekController;
import model.JatekModel;
import view.JatekView;

public class Program {

    public static void main(String[] args) {
        JatekModel model = new JatekModel();
        JatekView view = new JatekView();

        JatekController controller = new JatekController(model, view);
        controller.jatekInditasa();
    }
}

