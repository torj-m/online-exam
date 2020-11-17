import java.io.IOException;
import java.util.*;
public class Examen {

    private ArrayList<Question> quest = new ArrayList();
    private double total;
    int numeroQuestionEnCours;

    Examen(double total){this.total=total;}
    public void ajouterQuest(Question qst){
        quest.add(qst);
    }
    public boolean resteDesQuestions(){
        return numeroQuestionEnCours != quest.size()-1;
    }
    public void afficherQuestionSuivante() {
        if (numeroQuestionEnCours < quest.size() - 1) {
            numeroQuestionEnCours++;
            quest.get(numeroQuestionEnCours)
                    .afficherQuest("Question " + (numeroQuestionEnCours + 1) + ". ");
        }
    }
    public void lireReponseQuestion() throws NumberFormatException, IOException {
        boolean bonneReponse = quest.get(numeroQuestionEnCours).lireReponseAuClavier();
        if (bonneReponse) {
            total++;
        }
    }
    public double geTotal(){return this.total;}
    public void calculerTotal(){}
}