package fi.arcada.projekt_chi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Deklarera 4 Button-objekt

    // Deklarera 4 heltalsvariabler för knapparnas värden, t.ex.
    // val1, val2, val3, val4



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisera Button-objekten med referens till knapparna i layouten


    }

    /**
     *  Klickhanterare för knapparna
     */
    public void buttonClick(View view) {

        // Skapa ett Button-objekt genom att type-casta (byta datatyp)
        // på det View-objekt som kommer med knapptrycket, t.ex.
        // Button btn = (Button) view;

        // Kontrollera vilken knapp som klickats, öka värde på rätt vaiabel
        // T.ex. för att kolla om man tryckt på knappen med id "button1":
        //  if (view.getId() == R.id.button1)

        // Slutligen, kör metoden som ska räkna ut allt!
        calculate();
    }

    /**
     * Metod som uppdaterar layouten och räknar ut själva analysen.
     */
    public void calculate() {

        // Uppdatera knapparnas text med de nuvarande värdena,
        // du kan använda .setText() på ett button-objekt.

        // Mata in värdena i Chi-2-uträkningen och ta emot resultatet, t.ex:
        //  double chi2 = Significance.chiSquared(val1, val2, val3, val4);

        // Mata in chi2-resultatet i getP() och ta emot p-värdet, t.ex:
        // double pValue = Significance.getP(chi2);

        /**
         *  - Visa chi2 och pValue åt användaren på ett bra och tydligt sätt!
         *
         *  - Visa procentuella andelen jakande svar inom de olika grupperna.
         *    T.ex. (val1 / (val1+val3) * 100) och (val2 / (val2+val4) * 100
         *
         *  - Analysera signifikansen genom att jämföra p-värdet
         *    med signifikansnivån, visa reultatet åt användaren
         *
         */

    }


}