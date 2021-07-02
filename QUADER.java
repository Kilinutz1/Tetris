
import java.awt.*;
import java. awt. geom. *;
import javax. swing. *;

//Goldene Banane
//Verschimmelt
/**
 * Das Symbol eines Blockquaders.
 * Das Fenster wird bei Bedarf generiert.
 *
 * @author Albert Wiedemann
 * @version 1.0
 */
class QUADER
{
    /** Das Anzeigefenster. */
    private OBERFLAECHE fenster;

    /** Anzeigegröße für das Quaderelement */
    private int groesse; 

    /** Interna */
    private int x;  
    private int y;
    private JComponent anzeige;
    private Color farbe;

    /**
     * Standardkonstruktor für Objekte der Klasse QUADER.
     * Er erzeugt ein Quadersymbol an Postion (0 | 0).
     * Das Fenster wird bei Bedarf angelegt.
     */
    QUADER(int x, int y, String neueFarbe)
    {
        fenster = OBERFLAECHE. FensterGeben ();
        groesse = fenster.RasterGroesseGeben ();
        farbe = Color.black;
        anzeige = new JComponent () {
            // Stellt das Rumpfelement auf dem Fenster dar.
            public void paintComponent (Graphics g)
            {
                AffineTransform old;
                Graphics2D g2;
                g2 = (Graphics2D) g;
                old = g2. getTransform ();
                g. setColor (farbe);
                //Rechteck
                g.fillRect (0, 0, groesse -1, groesse - 1);
                //Rahmenlinie
                g.setColor(Color.white);
                g.drawLine(0, 0, 0, groesse - 1);
                g.drawLine(0, 0, groesse-1, 0);
                g.drawLine(groesse-1, 0, groesse-1, groesse-1);
                g.drawLine(0, groesse-1, groesse-1, groesse-1);
                g2.setTransform (old);
            }
        };
        anzeige. setVisible (true);
        this.x = x;
        this.y = y;
        fenster.frameGeben(). add (anzeige, 0);
        farbeSetzen(neueFarbe);
    }

    /**
     * TODO
     * Die Farbe soll nach einer Eingabe (z.B. String) geändert werden.
     */
    public void farbeSetzen(String neueFarbe) {
        //Farben: Color. gefolgt von white, yellow, pink, cyan, blue, green, gray, black, ...
        // mit (new Color (200, 0, 0)) können alle rgb-Farben adressiert werden.
        switch (neueFarbe) {
            case "black": farbe = Color.black; break;
            case "violett": farbe = Color.magenta; break;
            case "gruen": farbe = Color.green; break;
            case "pink": farbe = Color.pink; break;
            case "blau": farbe = Color.cyan; break;
            case "gelb": farbe = Color.yellow; break;
            case "orange": farbe = Color.orange; break;
            case "rot": farbe = Color.red; break;
            default: farbe = Color.black;
        }
        zeichne();
    }

    /**
     * Ordnet das Element gemäß Ausrichtung und Position so an, dass die Zunge "über das Kästchen raus hängt".
     */
    public void zeichne()
    {
        anzeige. setSize (groesse * 2, groesse);
        anzeige. setLocation (x * groesse, y * groesse);
        //anzeige. setLocation (fenster. FensterBreiteGeben () / 2 + x * groesse, fenster. FensterHoeheGeben () / 2 + y * groesse);
        anzeige.invalidate();
        anzeige.repaint();
    }

    /**
     * Setzt die Position des Quaderelements. Der Ursprung liegt in der Mitte des
     * Fensters, die y-Achse zeigt nach unten. (x /y) bedeutet das
     * Kästchen rechts unterhalb der Gitterlinien.
     * @param x x-Position
     * @param y y-Position
     */
    void PositionSetzen (int x1, int y1)
    {
        this. x = x1;
        this. y = y1;
        zeichne();
    }

    /**
     * Gibt den X-Wert der Position des Quader elements.
     * @return x-Position
     */
    int XPositionGeben ()
    {
        return x;
    }

    /**
     * Gibt den Y-Wert der Position des Quaderelements.
     * @return y-Position
     */
    int YPositionGeben ()
    {
        return y;
    }

    /**
     * Entfernt das Quaderelement aus der Anzeige
     */
    void Entfernen ()
    {
        (fenster. FensterGeben ()).frameGeben(). remove (anzeige);
    }
}