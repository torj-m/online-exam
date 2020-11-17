import java.util.Date;

public class Admin extends Compte{
    @Override
    public String genererID() {
        Cnbr++;
        return "A"+Cnbr;
    }
    public Admin(String  c_nom, String c_mdp, String c_mail, Date dateNaiss, int cin, int tel){
        super( c_nom, c_mdp, c_mail, dateNaiss, cin, tel);
    }



}
