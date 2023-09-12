package fakenews;


// Now apparently there is some kind of flaw in this code. The assignment is to find the bug and fix it!


// -Jordy: the bug is somewhere in the while loop. the second phrase in the song is incorrect.
// "bottles" is being printed instead of "bottle" until our beerNum is equal to 1.
// also its repeating the first sout statement instead of moving on to the next one.
public class BeerSong {

    public static void main(String[] args) {

        // the old head song when you on a road trip
        int beerNum = 99;

        String word = "bottles";


        while (beerNum > 0){
            if (beerNum == 1){
                word = "bottle";


            }


            // CRTL D TO DUPLICATE
            System.out.println(beerNum + " " + word + " of beer on the wall \n");
            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer\n");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
//            System.out.println(beerNum -  1 + " " + word + " of beer on the wall\n");


            beerNum = beerNum -1;

            //updating this if condition from (beerNum > 0) to (beerNum == 0) fixes the bug. also  Else statement was not needed.
            if (beerNum == 0) {
                System.out.println("No more bottles of beer on the wall");
//                System.out.println(beerNum + " " + word + " of beer on the wall"); -Jordy: THIS STATEMENT IS NOT NEEDED
            }
        } // end while loop
    } // end main method
} // end class
