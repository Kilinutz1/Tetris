
import java.awt.*;
import javax. swing. *;

/**
 * Der Rand um das Spielfeld.
 * Das Fenster wird bei Bedarf generiert.
 *
 * @author Albert Wiedemann
 * @version 1.0
 * @author Martina Ottinger
 * @version (11.05.2019)
 */
class RANDSYMBOL
{
    /** Das Anzeigefenster. */
    private OBERFLAECHE fenster;
    
    /** Anzeigegröße für das Randelement */
    private int groesse;

    /** Interna */
    private JComponent anzeige;
    private int xMin, xMax, yMin, yMax;
    private boolean wertGesetzt;
    private int punkte = 0;
    private boolean endemeldungGesetzt;
    private String endeMeldung = "";

    /**
     * Standardkonstruktor für Objekte der Klasse RANDSYMBOL.
     * Er erzeugt einen grauen Rand um das Spielfeld.
     * Das Fenster wird bei Bedarf angelegt.
     * @param breite gewünschte Breite des Spielfelds
     * @param hoehe gewünschte Höhe des Spielfelds
     */
    RANDSYMBOL(int breite, int hoehe)
    {
        wertGesetzt = false;
        endemeldungGesetzt = false;
        fenster = OBERFLAECHE. FensterGeben ();
        groesse = fenster.RasterGroesseGeben();
        anzeige = new JComponent () {
            // Stellt das Rumpfelement auf dem Fenster dar.
            public void paintComponent (Graphics g)
            {
                g. setColor (Color. gray);
                int [] xKoord = {0, getWidth (), getWidth (), 0, 0, groesse, groesse, getWidth () - groesse, getWidth () - groesse, groesse, 0};
                int [] yKoord = {0, 0, getHeight (), getHeight (), 0, groesse, getHeight () - groesse, getHeight () - groesse, groesse, groesse, 0};
                g. fillPolygon(xKoord, yKoord, xKoord.length);
            if (wertGesetzt)
                {
                    Font font = new Font ("Helvetica", Font.BOLD, 14);
                    g. setFont (font);
                    g. setColor (Color. blue);
                    g. drawString ("Punkte: " + punkte, 4, (int) (.5 * groesse));
                }
            if (endemeldungGesetzt)
                {
                    Font font = new Font ("Helvetica", Font.BOLD, 24);
                    g. setFont (font);
                    g. setColor (Color. red);
                    g. drawString (endeMeldung, groesse * 2, getHeight () / 4);
                }
            }
        };
        anzeige. setVisible (true);
        fenster.frameGeben().add (anzeige, 0);
        GroesseSetzen (breite, hoehe);
    }

    /**
     * Setzt die Breite und Hoehe des Randelements.
     * Die Maximalkoordinaten des Spielfelds werden ermittelt.
     * @param breite Spielfeldbreite in Kästchen
     * @param hoehe Spielfeldhöhe in Kästchen
     */
    void GroesseSetzen (int breite, int hoehe)
    {
        xMax = breite / 2 - 1;
        yMax = hoehe / 2 - 1;
        if (breite % 2 == 0)
        {
            xMin = - xMax - 1;
        }
        else
        {
            xMin = -xMax - 2;
        }
        if (hoehe % 2 == 0)
        {
            yMin = - yMax - 1;
        }
        else
        {
            yMin = -yMax - 2;
        }
        anzeige. setSize ((breite+2)*groesse, (hoehe+2)*groesse);
        anzeige. setLocation (fenster. FensterBreiteGeben () / 2 - (breite / 2 + 1 + breite % 2) * groesse, fenster. FensterHoeheGeben () / 2 - (hoehe / 2 + 1 + hoehe % 2) * groesse);
    }

    /**
     * Entfernt die Figur aus der Anzeige
     */
    void Entfernen ()
    {
        (fenster.frameGeben ()). remove (anzeige);
    }
    
    /**
     * Meldet die maximale x-Koordinate des Spielfelds.
     * @return maximale x-Koordinate
     */
    int XMaxGeben ()
    {
        return xMax;
    }
    
    /**
     * Meldet die minimale x-Koordinate des Spielfelds.
     * @return minimale x-Koordinate
     */
    int XMinGeben ()
    {
        return xMin;
    }
    
    /**
     * Meldet die maximale y-Koordinate des Spielfelds.
     * @return maximale y-Koordinate
     */
    int YMaxGeben ()
    {
        return yMax;
    }
    
    /**
     * Meldet die minimale y-Koordinate des Spielfelds.
     * @return minimale y-Koordinate
     */
    int YMinGeben ()
    {
        return yMin;
    }
    /**
     * Setzt den Punktestand für die Anzeige
     * @param punkte der anzuzeigende Punktestand
     */
    void PunkteSetzen (int punkte)
    {
        this.punkte = punkte;
        wertGesetzt = true;
        anzeige. invalidate();
        anzeige.repaint();
    }
    
    
    /**
     * Punkteausgabe ausschalten
     */
    public void punkteAusschalten() {
        wertGesetzt = false;
        anzeige.invalidate();
        anzeige.repaint();
    }
    
    /**
     * Setzt die Endemeldung für die Anzeige
     * @param die anzuzeigende Endemeldung
     */
    void EndemeldungSetzen (String meldung)
    {
        endeMeldung = meldung;
        endemeldungGesetzt = true;
        anzeige. invalidate();
        anzeige.repaint();
    }
}