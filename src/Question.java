import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Question {
    private String enonce;
    private int etat;
    private ArrayList<String> reponse = new ArrayList();

    Question(String enonce){
        this.enonce = enonce;
    }
    public void ajouterReponse(String rep, boolean bon){
        this.reponse.add(rep);
        if (bon) {
            etat = reponse.size();
        }
    }
    public void afficherQuest(String entete){
        System.out.println(entete+" " + enonce+":");
        reponse.forEach((rep) -> {
            System.out.println(rep);
        });
    }
    public boolean lireReponseAuClavier(){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String r = this.reponse.get(etat);
        return str.equals(r);
    }
    @Override
    public String toString() {
        return "Question [enonce = " +enonce+", indiceBonneReponse = " +etat+ ", reponses=" + reponse + "]";
    }
}
