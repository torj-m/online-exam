import java.util.Date;

public class Prof extends Compte {
    String depart;

    @Override
    public String genererID() {
        Cnbr++;
        return "P"+Cnbr;
    }
    public Prof(String  c_nom, String c_mdp, String c_mail, Date dateNaiss, int cin, int tel, String depart){
        super( c_nom, c_mdp, c_mail, dateNaiss, cin, tel);

        this.depart=depart;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }
}
