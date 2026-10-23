package model;

public class LadaModel {
    private String szin;
    private String felirat;
    private boolean kincsetRejt;

    public LadaModel(String szin, String felirat, boolean kincsetRejt) {
        this.szin = szin;
        this.felirat = felirat;
        this.kincsetRejt = kincsetRejt;
    }

    public String getSzin() {
        return szin;
    }
    public String getFelirat() {
        return felirat;
    }
    public boolean isKincsetRejt() {
        return kincsetRejt;
    }
}