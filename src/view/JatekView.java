package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.LadaModel;

public class JatekView {
    
    static Scanner beolv = new Scanner(System.in);  
    
    public void megjelenitFeliratok(ArrayList<LadaModel> ladak) {
        for (int i = 0; i < ladak.size(); i++) {
            System.out.println((char)('a' + i) + ") "
                    + ladak.get(i).getSzin() + ": "
                    + ladak.get(i).getFelirat());
        }
    }
    
    public String bekerValasz() {
        System.out.printf("Szerinted melyikben van a kincs? (a, b, c)\n");
        String be = beolv.next();
        
        while(be != "a" || be != "b" || be != "c"){
            System.out.printf("Hibás tippet adtál be, kérlek a következők közül válassz: a, b, c\n");
            be = beolv.next();
        }
        
        return be;
    }

    public void megjelenitEredmeny(boolean helyes) {
        if(helyes){
            System.out.printf("Helyesen választottál a ládák közülo, ebben van a kincs!\n");
        }
        else{
            System.out.printf("Sajnos nem ebben a ládában van a kincs, próbáld újra!\n");
        }
    }
    
}
