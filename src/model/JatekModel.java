
package model;

import java.util.ArrayList;

public class JatekModel {
    private ArrayList<LadaModel> ladak;

    public JatekModel() {
        ladak = new ArrayList<>();

        ladak.add(new LadaModel("Arany", "Én rejtem a kincset.", false));
        ladak.add(new LadaModel("Ezüst", "Nem én rejtem a kincset.", true));
        ladak.add(new LadaModel("Bronz", "Az arany hazudik.", false));
    }

    public ArrayList<LadaModel> getLadak() {
        return ladak;
    }

    public boolean ellenorzes(String valasz) {
        if(valasz == "b"){
            return true;
        }
        return false;
    }
}
