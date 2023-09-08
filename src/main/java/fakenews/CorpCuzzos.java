package fakenews;
//my implmentation of the PhraseOMatic class in the book
public class CorpCuzzos {


    //could be like a group generator mixing up different tracks
    public static void main(String[] args) {
        //keep in mind i dont know everyone track


        //Make 3 sets if names to choose from
        String[] appDev = {"Jordy", "Blanca", "Naiya",
                "Julio", "Bryan", "Devon",
                "Kuma", "Dante", "Tilmar",
                "Yaw", "Jordan Vargas", "Andy",
                "Ki", "Abu", "Wini",
                "Tanzir", "Kalil", "Wyatt",
                "Kierah", "Henry"};

        String[] dataAnalysts = {
                "Shay", "Emonye'", "Larra",
                "Dominique", "Stan", "Shawn",
                "Damian", "Matt", "Lashawn",
                "Tae", "Nailah", "Myrah",
                "Shariff", "Jordan Sanders", "Malik",
                "Mikey", "Mike B", "Kate",
                "Mahima", "Hudson"
        };

        String[] investmentOps = {
          "Trinity", "Kasai", "Dej",
          "Myyah", "Vanessa", "Brenda",
          "Thea", "Keisha", "Betty"
        };

        // find how many names in each list
        int adLength = appDev.length;
        int dALength = dataAnalysts.length;
        int ioLength = investmentOps.length;


        // generate 3 random numbers
        int rand1 = (int) (Math.random() * adLength);
        int rand2 = (int) (Math.random() * dALength);
        int rand3 = (int) (Math.random() * ioLength);


        //now build a group
        String group = appDev[rand1] + " " +
                dataAnalysts[rand2] + " " + investmentOps[rand3];



        //print out the group
        System.out.println("Here is the Group created: " + group);

    }
}
