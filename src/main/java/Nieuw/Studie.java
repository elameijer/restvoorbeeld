package Nieuw;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Studie {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String studienaam;
    private String docent;
    private int punten;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudienaam() {
        return studienaam;
    }

    public void setStudienaam(String studienaam) {
        this.studienaam = studienaam;
    }

    public String getDocent() {
        return docent;
    }

    public void setDocent(String docent) {
        this.docent = docent;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }
}
