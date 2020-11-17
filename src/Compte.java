import java.util.Date;

public abstract class Compte {
   private String c_id, c_nom, c_mdp,c_mail;
   private Date dateNaiss;
   private int Cin, tel;
   public static Integer Cnbr =0;

    public Compte( String c_nom, String c_mdp, String c_mail, Date dateNaiss, int cin, int tel) {
        this.c_id = this.genererID();
        this.c_nom = c_nom;
        this.c_mdp = c_mdp;
        this.c_mail = c_mail;
        this.dateNaiss = dateNaiss;
        Cin = cin;
        this.tel = tel;
    }


    public abstract String genererID();

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_nom() {
        return c_nom;
    }

    public void setC_nom(String c_nom) {
        this.c_nom = c_nom;
    }

    public String getC_mdp() {
        return c_mdp;
    }

    public void setC_mdp(String c_mdp) {
        this.c_mdp = c_mdp;
    }

    public String getC_mail() {
        return c_mail;
    }

    public void setC_mail(String c_mail) {
        this.c_mail = c_mail;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public int getCin() {
        return Cin;
    }

    public void setCin(int cin) {
        Cin = cin;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    public boolean authentifier(String mail, String mdp){
        return true;
    }


}
