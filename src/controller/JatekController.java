package controller;

import model.JatekModel;
import view.JatekView;

public class JatekController {
    private JatekModel model;
    private JatekView view;

    public JatekController(JatekModel model, JatekView view) {
        this.model = model;
        this.view = view;
    }

    public void jatekInditasa() {
        view.megjelenitFeliratok(model.getLadak());
        String valasz = view.bekerValasz();
        boolean helyes = model.ellenorzes(valasz);
        view.megjelenitEredmeny(helyes);
    }
}