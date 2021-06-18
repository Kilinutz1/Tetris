
import java. awt. *;
import javax. swing. *;

/**
 * Verwaltet das Ausgabefenster.
 * 
 * @author Albert Wiedemann
 * @version 1.0
 */
class OBERFLAECHE
{
    /** Anzeigegröße für eine Rasterkachel */
    private int rasterGroesse;
    /** Höhe des Anzeigefensters */
    private int hoeheFenster;
    /** Breite des Anzeigefensters */
    private int breiteFenster;
    private static OBERFLAECHE o = null;
    private JFrame fenster = null;

    /**
     * Baut die Bedienoberfläche auf
     */
    private OBERFLAECHE (int rastergroesse)
    {
        this.rasterGroesse = rastergroesse;
        hoeheFenster = rasterGroesse * 20;
        breiteFenster = rasterGroesse * 26;
        fenster = new JFrame ("Zeichenfläche");
        fenster. setResizable (false);
        fenster. setVisible (true);
        fenster. setLayout (null);
        fenster. getContentPane (). setBackground (new Color (240, 240, 240));
        Insets i = fenster.getInsets();
        fenster. setSize (breiteFenster, hoeheFenster + i.top);         // Ausgleich für Fenstertitel
        JComponent hintergrund = new JComponent ()
        {
             /**
             * Zeichnet das Hintergrundmuster.
             */
            public void paintComponent (Graphics g)
            {
                g. setColor (Color. lightGray);
                for (int i = 1; i <= hoeheFenster / (rasterGroesse); i++)
                {
                    g. drawLine (0, i * rasterGroesse, breiteFenster - 1, i * rasterGroesse);
                }
                for (int i = 1; i <= breiteFenster / (rasterGroesse); i++)
                {
                    g. drawLine (i * rasterGroesse, 0, i * rasterGroesse, hoeheFenster - 1);
                }
            }
        };
        hintergrund. setVisible (true);
        hintergrund. setSize (breiteFenster, hoeheFenster);
        hintergrund. setLocation (0, 0);
        fenster. add (hintergrund);
    }

    /**
     * Gibt das Ausgabefenster zurück und erzeugt es gegebenenfalls.
     * @return Ausgabefenster
     */
    static OBERFLAECHE FensterGeben ()
    {
        if (o == null)
        {
            o = new OBERFLAECHE (30);
        }
        return o;
    }
    
    JFrame frameGeben() {
        return o.fenster;
    }

    /**
     * Gibt die Rastergröße zurück.
     * @return Ausgabefenster
     */
    int RasterGroesseGeben ()
    {
        return rasterGroesse;
    }

    /**
     * Gibt die Breite des Fensters zurück.
     * @return Fensterbreite
     */
    int FensterBreiteGeben ()
    {
        return breiteFenster;
    }

    /**
     * Gibt die Höhe des Fensters zurück.
     * @return Fensterhöhe
     */
    int FensterHoeheGeben ()
    {
        return hoeheFenster;
    }
}
