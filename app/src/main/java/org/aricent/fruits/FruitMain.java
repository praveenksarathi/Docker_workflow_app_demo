/***********************************************************************
                         Aricent Technologies Proprietary
 
This source code is the sole property of Aricent Technologies. Any form of utilization
of this source code in whole or in part is  prohibited without  written consent from
Aricent Technologies
 
File Name			  :FruitMain.java
Principal Author	  :PRAVEEN KUMAR KRISHNAMOORTHY
Subsystem Name        :Core Java Training
Module Name           :
Date of First Release : Jan 17, 2017 2017 11:34:15 AM
Author                :PRAVEEN KUMAR KRISHNAMOORTHY
Description           :

Version               :1.0
Date(DD/MM/YYYY)      :Jan 17, 2017 2017 11:34:15 AM
Modified by           : PRAVEEN KUMAR KRISHNAMOORTHY
Description of change :Initial Version
 
***********************************************************************/

package org.aricent.fruits;

import org.aricent.fruitFunctions.FruitFunctions;

/**
 * @name	: 
 * @author  : PRAVEEN KUMAR KRISHNAMOORTHY
 * @see	    : fruits
 * @version : Text 1.0
 * @since	: Jan 17, 2017 2017 11:34:15 AM
 */
public class FruitMain {

	/**      
	 * 		@Description : 
	 * 		@name		 : main
	 *		@Return 	 : void
	 *      @see 		 : FruitMain.java
	 *      @version 	 : 1.0
	 *      @author 	 : PRAVEEN KUMAR KRISHNAMOORTHY
	 *      @since 		 : Jan 17, 2017 2017 11:34:15 AM 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitFunctions object = new FruitFunctions();
		
		/** FOR ADDING MEMBERS TO THE SET */
		System.out.println("ADDING FRUITS TO THE SET");
		object.AddFruit();
		System.out.println();
		/** DISPLAYING ALL ADDED FRUITS */
		object.display();
		System.out.println();
		System.out.println("REMOVING STRAWBERRY AND BLUEBERRY");
		/** REMOVING SELECTIVE FRUITS (STRAWBERRY AND BLUEBERRY) FROM THE LIST */
		object.RemoveSelect();
		System.out.println();
		/** DISPLAY THE REMAINING LIST */
		object.display();
		System.out.println();
		System.out.println("REMOVING ALL ELEMENTS");
		/** REMOVE ALL ELEMENTS IN SINGLE FUNCTION */
		object.RemoveAll();
		System.out.println();
		/** DISPLAY SET IS EMPTY */
		object.display();
		System.out.println();
	}

}
