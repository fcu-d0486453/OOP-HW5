package fcu.iecs.oop.pokemon;

import java.util.Random;

public  class GYM {
	    /*�����O�u���Ѥ@���R�A��k�p�U:
		����k�|�H���q�G�ӿ�J��Pokemon���󤤿�@�Ӭ�Ĺ�a
		����k�|�NĹ�a��name�L�bconsole�W
		i.e. ��Winner is [name of Pokemon].��
		���~Ĺ�a��cp�ȷ|�W�[500
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
