package hellostyle;

/**
* What I plan to do next year and how I feel about it.
*
* @author  Keiden B
* @version 1.0
* @since   2023-02-08
*/

public final class HelloStyle {
    /**
    * Neccessary to prevent HideUtilityClass Error.
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */
    private HelloStyle() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Main lines of code.
    *
    * @param args a placeholder value when making the main function
    */
    public static void main(String[] args) {
        System.out.println("Next year, I'm going to Uni for Comp Sci.");
        System.out.println("I'm pretty excited? Hoping for good "
                         + "roommates if I have to live on campus.");
    }
}
