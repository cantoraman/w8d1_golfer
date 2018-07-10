import db.DBGolfer;
import models.Golfer;

public class Runner {


    public static void main(String[] args) {

        Golfer golfer1 = new Golfer("Tiger", "Woods", 45);
        DBGolfer.save(golfer1);
        Golfer golfer2 = new Golfer ("Can", "Toraman", 33);

        DBGolfer.save(golfer2);


       System.out.println(DBGolfer.find(golfer2.getId()).getFirstName());




    }
}
