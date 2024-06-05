package entities;

public class Professeur {
    private int idProf;
    private String nomProf;
    private String prenomProf;
    private String tel;
    public int getIdProf() {
        return idProf;
    }
    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }
    public String getNomProf() {
        return nomProf;
    }
    public void setNomProf(String nomProf) {
        this.nomProf = nomProf;
    }
    public String getPrenomProf() {
        return prenomProf;
    }
    public void setPrenomProf(String prenomProf) {
        this.prenomProf = prenomProf;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
}
