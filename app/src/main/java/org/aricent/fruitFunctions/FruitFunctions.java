/***********************************************************************
                         Aricent Technologies Proprietary
 
This source code is the sole property of Aricent Technologies. Any form of utilization
of this source code in whole or in part is  prohibited without  written consent from
Aricent Technologies
 
File Name			  :FruitFunctions.java
Principal Author	  :PRAVEEN KUMAR KRISHNAMOORTHY
Subsystem Name        :Core Java Training
Module Name           :
Date of First Release : Jan 17, 2017 2017 11:39:05 AM
Author                :PRAVEEN KUMAR KRISHNAMOORTHY
Description           :

Version               :1.0
Date(DD/MM/YYYY)      :Jan 17, 2017 2017 11:39:05 AM
Modified by           : PRAVEEN KUMAR KRISHNAMOORTHY
Description of change :Initial Version
 
***********************************************************************/

package org.aricent.fruitFunctions;

import java.util.HashSet;

/**
 * @name	: 
 * @author  : PRAVEEN KUMAR KRISHNAMOORTHY
 * @see	    : fruits
 * @version : Text 1.0
 * @since	: Jan 17, 2017 2017 11:39:05 AM
 */
public class FruitFunctions {
	
	HashSet<String> fruits = new HashSet<String>();
	
	/**
	 * @name AddFruit method 
	 * @param NIL
	 * @return description : void
	 * @see FruitFunctions
	 * @version 1.0
	 * @author PRAVEEN KUMAR KRISHNAMOORTHY
	 * @since  17-Jan-2017
	 */
	public void AddFruit()
	{
		fruits.add("PEAR");
		fruits.add("BANANA");
		fruits.add("TANGERINE");
		fruits.add("STRAWBERRY");
		fruits.add("BLACKBERRY");
	}
	
	/**
	 * @name ElementNumber method 
	 * @param NIL
	 * @return description : void
	 * @see FruitFunctions
	 * @version 1.0
	 * @author PRAVEEN KUMAR KRISHNAMOORTHY
	 * @since  17-Jan-2017
	 */

	public void ElementNumber()
	{
		int count;
		count = fruits.size();
		System.out.println("The Number of elements in the Set is :"+count);
	}
	
	/**
	 * @name RemoveSelect method 
	 * @param NIL
	 * @return description : void
	 * @see FruitFunctions
	 * @version 1.0
	 * @author PRAVEEN KUMAR KRISHNAMOORTHY
	 * @since  17-Jan-2017
	 */

	public void RemoveSelect()
	{
		fruits.remove("STRAWBERRY");
		fruits.remove("BLACKBERRY");
	}
	
	/**
	 * @name RemoveAll method 
	 * @param NIL
	 * @return description : void
	 * @see FruitFunctions
	 * @version 1.0
	 * @author PRAVEEN KUMAR KRISHNAMOORTHY
	 * @since  17-Jan-2017
	 */
	public void RemoveAll()
	{
		fruits.removeAll(fruits);
	}
	
	/**
	 * @name Display method 
	 * @param NIL
	 * @return description : void
	 * @see FruitFunctions
	 * @version 1.0
	 * @author PRAVEEN KUMAR KRISHNAMOORTHY
	 * @since  17-Jan-2017
	 */
	public void display()
	{
		if(fruits.isEmpty())
		{
			System.out.println("The List is Empty");
		}
		for (String display : fruits)
		{
			System.out.println(display);
		}
	}

}
