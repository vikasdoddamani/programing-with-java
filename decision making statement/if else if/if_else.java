// (co-of https://github.com/vikasdoddamani/programing-with-java)

// program to display who having more salary. there are four people in room, let check who earning more then 50 rs and above

class if_else
{
	public static void main(String[] args)
	 {

	 	int vikas=20;
	 	int shresha=10;
	 	int arabaz=50;
	 	int hriki=40;


System.out.println("there are four people in room");			//program start from here and it display a message
System.out.println("vikas, shreesha, arabaz and hriki");
System.out.println("vikas have " +vikas+ " rs ");				// + is overload operator that specify a vlaue of varibale which we defined in it under vikas variable
System.out.println("shreesha have "+shresha+" rs");	
System.out.println("arabaz have "+arabaz+" rs");	
System.out.println("hriki have "+hriki+" rs");
System.out.println("let check who earning more then 50 rs");
System.out.println();
System.out.println("else if statement process form here");
System.out.println();

if (vikas>=50) {
	System.out.println("vikas is earning above 50 rs ");
	}

else if(shresha>=50)
{
	System.out.println("shresha is earning above 50 rs ");
	}

else if(arabaz>=50)
{
	System.out.println("arabaz is earning above 50 rs ");
	}
else if(hriki>=50)
{
	System.out.println("hriki is earning above 50 rs ");
	}
	else
	{
		System.out.println("nobody are earning");
	}


}
	
}