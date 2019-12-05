import java.util.*;
/**
 * Beschreiben Sie hier die Klasse Mensch.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Mensch
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String vorname; private String zuname; private boolean bezahlt;
    

    /**
     * Konstruktor für Objekte der Klasse Mensch
     */
    public Mensch()
    {
        // Instanzvariable initialisieren
        
    }
    //Setter Getter Zuname
     public String getZuname()
    {
        return this.zuname;
    }
    
    public void setZuname(String zuname)
    {
        this.zuname = zuname;
    }
    
    //Setter Getter Vorname
    public void setVorame(String vorname)
    {
        this.vorname = vorname;
    }
    
     public String getVorname()
    {
        return this.vorname;
    }
    
    //Settter Gettter bezahlt?
    public void setBezahlt(boolean bezahlt)
    {
        this.bezahlt = bezahlt;
    }
    
    public boolean getBezahlt()
    {
        return this.bezahlt;
    }
}
