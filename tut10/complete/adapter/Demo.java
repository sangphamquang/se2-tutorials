package tuts.tut10.complete.adapter;

import tuts.tut10.complete.adapter.adapter.SquarePegAdapter;
import tuts.tut10.complete.adapter.round.RoundHole;
import tuts.tut10.complete.adapter.round.RoundPeg;
import tuts.tut10.complete.adapter.square.SquarePeg;

/**
 * Somewhere in client code...
 */
public class Demo {
	public static void main(String[] args) {
		//TO-DO: Create 2 instances of RoundHole and RoundPeg with same radius
		RoundHole roundHole = new RoundHole(5);
                RoundPeg roundPeg = new RoundPeg(5);
		//TO-DO: If RoundHole instance "fits" with RoundPeg instance => show a message
                if(roundHole.fits(roundPeg))System.out.println("Fit");
		//TO-DO: Create 2 instances of SquarePeg with 2 different widths
                SquarePeg sp1 = new  SquarePeg(1);
                SquarePeg sq2 = new SquarePeg(6);
		//Note: You can't make RoundHole instance "fit" with SquarePeg instance
		//Therefore, we need to use Adapter for solving the problem.
		//TO-DO: Create 2 corresponding instances of SquarePegAdapter
		SquarePegAdapter adapter2 = new SquarePegAdapter(sq2);
		SquarePegAdapter adapter1 = new SquarePegAdapter(sp1);  
		//TO-DO: Check whether RoundHole instance "fit" or not "fit" with "small" RoundPeg instance 
                if(roundHole.fits(adapter1)){
                    System.out.println("fit");
                }else
                    System.out.println("not fit");
                //then show a suitable message
                
		//TO-DO: Do similar with "big" RoundPeg instance
                if(roundHole.fits(adapter2)){
                    System.out.println("fit");
                }else
                    System.out.println("not fit");
	}
}