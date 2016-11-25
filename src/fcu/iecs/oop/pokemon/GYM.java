package fcu.iecs.oop.pokemon;

import java.util.Random;

public  class GYM {
	    /*此類別只提供一個靜態方法如下:
		此方法會隨機從二個輸入的Pokemon物件中選一個為贏家
		此方法會將贏家的name印在console上
		i.e. “Winner is [name of Pokemon].”
		此外贏家的cp值會增加500
        */
	    public static void fight(Pokemon p1, Pokemon p2)
	    {
	    	Random ran = new Random();
	    	int out ;
	    	out = ran.nextInt(2);
	    	if ( (out+1)%2 == 0)
	    	{
	    		System.out.println("winner is "+"\""+p1.getName()+"\"");
	    		p1.setCp();
	    		System.out.println(p1.getName()+"cp = "+p1.getCp());
	    	}
	    	else
	    	{
	    		System.out.println("winner is "+"\""+p2.getName()+"\"");
	    		p2.setCp();
	    		System.out.println(p2.getName()+" cp = "+p2.getCp());
	    	}
	    	
	    }

}
