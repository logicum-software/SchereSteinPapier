package sample;

import java.util.Random;

public class SpielLogik {

    // 0 = nicht gewählt, 1 = Schere, 2 = Stein, 3 = Papier
    public int iComputer;
    public int iSpieler;

    public SpielLogik() {

        iComputer = 0;
        iSpieler = 0;
    }

    public String zugComputer() {

        Random rand = new Random();
        String strLabel = "";

        int n = rand.nextInt(3);
        n++;

        switch (n) {
            case 1: strLabel = "Schere";
            break;

            case 2: strLabel = "Stein";
            break;

            case 3: strLabel = "Papier";
            break;

            default: strLabel = "Computer...";
            break;
        }

        return strLabel;
    }
}
