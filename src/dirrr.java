import java.net.StandardSocketOptions;
import java.util.Date;

public class dirrr {
    public static void main(String[] args){
        Date d=new Date();
        Compte C=new Eleve("ahmed","123","ll",d, 1,4,"aa");
        System.out.println(C.getC_id());
        Compte C1=new Eleve("hamdamin","123","ll",d, 1,4,"bb");
        System.out.println(C1.getC_id());
        Compte p=new Prof("ahmed","123","ll",d, 1,4,"aa");
        System.out.println(p.getC_id());


    }
}
