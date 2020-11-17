import java.util.Date;

public class Eleve extends Compte {
    private String niv;

    @Override
    public String genererID() {
        Cnbr++;
        return "E"+Cnbr;
    }

    public Eleve(String  c_nom, String c_mdp, String c_mail, Date dateNaiss, int cin, int tel, String niv){
        super( c_nom, c_mdp, c_mail, dateNaiss, cin, tel);

        this.niv=niv;
    }

    public String getNiv() {
        return niv;
    }

    public void setNiv(String niv) {
        this.niv = niv;
    }


}
