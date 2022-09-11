import java.util.*;


public class BookStoreSystem {

    public static void main (String args [])
    {

		//declare part
		boolean condi = true;
		char ch1 = 'y' , ch;
		String bname="" , userTry = "admin" , passTry = "admin123";
		int scode ,  login = 0, day , month , year , quantity , counterB = 0 , counterC = 0 , counterDB = 0 , counterSB = 0;
		double total=0.0 , change=0.0 , cash=0.0;


        //Array
        //Damage Books
        int [] DBookC = {};
    	String [] DAuthor = {};
        String [] DTittle = {};
        double [] DPrice = {};
        int [] DQuantity = {};

        //SALE books
        int [] SBookC = {};
        String [] SAuthor = {};
        String [] STittle = {};
        double [] SPrice = {};


		//Inventory

		int [] BookC = {};
      	String [] Author = {};
        String [] Tittle = {};
        double [] Price = {};
        int [] BookQ = {};

//     	int [] BookC = {1111,1112,1113,1114};
//  		String [] Author = {"Cong Velasques","Junnie Dad","Pau Sepagan","Cong Velasques"};
//      	String [] Tittle = {"CongTv Book","Giyang na Giyang","RoggerRaker Tutorial","Billioners Mind"};
//     	double [] Price = {450.00,350.60,420.30,520.00};
//    	int [] BookQ = {21,30,20,40};

        //Sales
	    int [] Month = {};
		int [] Day = {};
		int [] Year = {};
		String [] SalesC = {};
		double [] SalesP = {};
		int [] SalesBC = {};

//		int [] Month = {11,11,11,11,11};
//		int [] Day = {19,20,21,22,23};
//		int [] Year = {2019,2019,2019,2019,2019};
//		String [] SalesC = {"john","john","john","mark","john"};
//		double [] SalesP = {1092.2,1029.3,1002.7,1242.2,3000.3};
//		int [] SalesBC = {1111,1111,1114,1114,1113};

		//Cashier
        String [] Cashier = {};
		String [] CPass = {};

// 		String [] Cashier = {"jericho","jane"};
//		String [] CPass = {"admin","admin"};

		//input part
		Scanner n = new Scanner (System.in);
		Scanner in = new Scanner (System.in);


		boolean UpCondition = true;
  	do{
		System.out.println("\t\tLog In");
		do{System.out.println("[1] Admin\n[2] Cashier");
		System.out.print("Enter your choice :");
		login = n.nextInt();} while(login < 1 || login > 2 );

		if(login == 1)
		{
			do{
			System.out.print("Username   :");
			String user = n.nextLine();
			System.out.print("Password   :");
			String pass = n.nextLine();

			if(user.equals(userTry) && pass.equals(passTry))
			{
			do{

				System.out.println("\n\t\t\t\tAdministrator");
		    	System.out.println("[1] Add\n[2] Edit\n[3] Delete\n[4] Search\n[5] Sort\n[6] Inventory\n[7] Sales\n[8] Log out");

		    	System.out.print("Enter your transaction:");
		    	int trans= in.nextInt();

				if (trans == 1)
					{
					boolean condi1 = true;
					do{
					System.out.println("----------------  ADD  ----------------");
					System.out.println("[1] Books\n[2] Cashier");
					System.out.print("Enter your choice :");
					int choi = in.nextInt();
						if(choi == 1)
						{
							Scanner in2 = new Scanner (System.in);
							String author;
							do{
							System.out.print("Enter the Book Author : ");
					   	 	author = in2.nextLine();
							}while(!author.matches("[a-zA-Z_ ]+"));

							System.out.print("Enter the Book Title : ");
							String tittle = in2.nextLine();
							boolean condition = true;
							int bookc;
							do{
							System.out.print("Enter the Book Code : ");
							bookc = in2.nextInt();
							int xx = 0;
							for (int x = 0; x<counterB; x++)
							{
								if(BookC[x] == bookc)
								{
									xx = 1;
								}
							}
								if(xx == 1)
								{
									System.out.println("Book Code Already Used!");
								}
								else
								{
									condition = false;
								}
							}while(condition);
							System.out.print("Enter the Price : ");
							double price = in2.nextDouble();

							System.out.print("Enter the Book Quantity : ");
							int bookq = in2.nextInt();

							if(counterB > 0)
							{
								double [] newPrice = new double [counterB +1];
								String [] newAuthor = new String [counterB +1];
								String [] newTittle = new String [counterB +1];
								int [] newBookC = new int [counterB +1];
								int [] newBookQ = new int [counterB +1];

								for(int i=0; i<counterB; i++)
								{
									newPrice[i] = Price[i];
									newTittle[i] = Tittle[i];
									newAuthor[i] = Author[i];
									newBookC[i] = BookC[i];
									newBookQ[i] = BookQ[i];
								}
								newPrice[newPrice.length - 1] = price;
								newAuthor[newAuthor.length - 1] = author;
								newTittle[newTittle.length - 1] = tittle;
								newBookC[newBookC.length - 1] = bookc;
								newBookQ[newBookQ.length - 1] = bookq;

								Price = newPrice;
					    		Tittle = newTittle;
					    		Author = newAuthor;
					    		BookC  = newBookC;
					    		BookQ  = newBookQ;
					    	counterB++;
							}
							else
							{
								double [] newPrice = new double [1];
								String [] newAuthor = new String [1];
								String [] newTittle = new String [1];
								int [] newBookC = new int [1];
								int [] newBookQ = new int [1];

								for(int i=0; i<1; i++)
									{
										newPrice[i] = price;
										newTittle[i] = tittle;
										newAuthor[i] = author;
										newBookC[i] = bookc;
										newBookQ[i] = bookq;
									}

								Price = newPrice;
					    		Tittle = newTittle;
					    		Author = newAuthor;
					    		BookC  = newBookC;
					    		BookQ  = newBookQ;
							counterB++;
							}
						}
						else if (choi == 2)
						{
							Scanner in2 = new Scanner (System.in);

					   	 	System.out.print("Enter the Cashier Name : ");
					   	 	String cashier = in2.nextLine();

							System.out.print("Enter the Password     : ");
							String cpass = in2.nextLine();

							if(counterC > 0)
							{
								String [] newCashier = new String [counterC +1];
								String [] newCPass = new String [counterC +1];

								for(int i=0; i<counterC; i++)
								{
									newCashier[i] = Cashier[i];
									newCPass[i] = CPass[i];
								}
								newCashier[newCashier.length - 1] = cashier;
								newCPass[newCPass.length - 1] = cpass;


								Cashier = newCashier;
					    		CPass = newCPass;
					    		counterC++;
							}
							else
							{
								String [] newCashier = new String [1];
								String [] newCPass = new String [1];

								for(int i=0; i<1; i++)
								{
									newCashier[i] = cashier;
									newCPass[i] = cpass;
								}

								Cashier = newCashier;
					    		CPass = newCPass;
					    		counterC++;
							}


						}
						else
						{
							System.out.println("Invalid Choice!");
						}

						char ch2;
				    	System.out.print("\nDo you want to Add again? [y]-Yes [n]-No :");
						ch2 = in.next().charAt(0);
							if(ch2 == 'y' || ch2 == 'Y'){
								continue;
							}
							else if(ch2 == 'n' || ch2 == 'N'){
							condi1 = false;
							}
							else{
								System.out.println("Invalid Choice!");
							condi1 = false;
							}

				   	 	}while(condi1);
			   		}
			   	else if (trans==2)
			   	 	{
			   	 		boolean condi1 = true;
			   	 		do
			   	 		{
			   	 		System.out.println("----------------  EDIT  ----------------");
			   	 		System.out.println("[1] Books\n[2] Cashier");
			   	 		System.out.print("Enter your choice : ");
			   	 		int choi = n.nextInt();

						if (choi == 1)
						{
					    	System.out.print("Enter the Book Code you want to edit :");
					    	int holdbcode = n.nextInt();
					    	boolean condi3 = true;
							do{
						    	int index = 0 , newbcode = 0;
						    	for(int x = 0; x<BookC.length; x++)
						    	{
						    		if(holdbcode == BookC[x])
						    		{
						    			index = x;
						    			newbcode = BookC[x];
						    		}
						    	}

								if (holdbcode == newbcode)
								{
									do{
							    	System.out.println("[1] Author\n[2] Title\n[3] Price\n[4] Quantity");
							    	System.out.print("Enter you choice: ");
							    	int choi1 = n.nextInt();

							    	Scanner in2 = new Scanner(System.in);

							    	if(choi1 == 1)
									{
										String up;
										do{
										System.out.print("Enter the Book Author : ");
								   	 	up = in2.nextLine();
										}while(!up.matches("[a-zA-Z_]+"));
										int y = index + 1;
										for(int x = index; x<y; x++)
										{
											Author[x] = up;
										}
									}
									else if (choi1 == 2)
									{
										System.out.print("Enter the new Title :");
										String up = in2.nextLine();
										int y = index + 1;
										for(int x = index; x<y; x++)
										{
											Tittle[x] = up;
										}
									}
									else if (choi1 == 3)
									{
										System.out.print("Enter the new Price :");
										double up = in2.nextDouble();
										int y = index + 1;
										for(int x = index; x<y; x++)
										{
											Price[x] = up;
										}
									}
									else if (choi1 == 4)
									{
										System.out.print("Enter the Quantity :");
										int up = in2.nextInt();
										int y = index + 1;
										for(int x = index; x<y; x++)
										{
											BookQ[x] += up;
										}
									}
									else
									{
										System.out.println("Invalid Choice!!");
									}

									System.out.print("\nDo you want to edit the book again? [y]Yes [n]No :");
									ch= in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										condi3 = false;
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

									}while(ch == 'y' || ch =='Y');
								}
								else
								{
									System.out.println("Invalid Book Code!");
									condi3  = false;
								}

							}while(condi3);
						}
						else if(choi == 2)
						{
							Scanner n2 = new Scanner (System.in);
							boolean condi3 = true;
							do{

								System.out.print("Enter the Cashier name you want to edit : ");
								String holdname = n2.nextLine();
								int index = 0;
								String testname = "";

						    	for(int x = 0; x<Cashier.length; x++)
						    	{
						    		if(holdname.equals(Cashier[x]))
						    		{
						    			index = x;
						    			testname = Cashier[x];
						    		}
						    	}

								if(holdname.equals(testname))
								{
							    	do{
							    		System.out.println("[1] Cashier Name\n[2] Password");
								    	System.out.print("Enter you choice: ");
								    	int choi1 = n.nextInt();

								    	Scanner in2 = new Scanner(System.in);

								    	if(choi1 == 1)
										{
											System.out.print("Enter the new Cashier name :");
											String up = in2.nextLine();
											int y = index + 1;
											for(int x = index; x<y; x++)
											{
												Cashier[x] = up;
											}
										}
										else if (choi1 == 2)
										{
											System.out.print("Enter the new Password :");
											String up = in2.nextLine();
											int y = index + 1;
											for(int x = index; x<y; x++)
											{
												CPass[x] = up;
											}
										}
										else
										{
											System.out.println("Invalid Choice!");
										}

								    	System.out.print("\nDo you want to edit the cashier again? [y]-Yes [n]-No :");
										ch= in.next().charAt(0);
											if(ch == 'y' || ch == 'Y'){
												continue;
											}
											else if(ch == 'n' || ch == 'N'){
												condi3 = false;
											}
											else{
												System.out.print("\n");
												System.out.println("Invalid Choice!");
											}

										}while(ch == 'y' || ch=='Y');
								}
								else
								{
									System.out.println("Invalid Cashier Name!");
								}

							}while(condi3);
						}
						else
						{
							System.out.println("Invalid Choice!");
						}

							char ch2;
					    	System.out.print("\nDo you want to Edit again? [y]-Yes [n]-No :");
							ch2= in.next().charAt(0);
								if(ch2 == 'y' || ch2 == 'Y'){
									continue;
								}
								else if(ch2 == 'n' || ch2 == 'N'){
								condi1 = false;
								}
								else{
									System.out.println("Invalid Choice!");
								condi1 = false;
								}

					   	 	}while(condi1);

		    		}
		    	else if(trans == 3)
			    	{
		    		boolean condi1 = true;
		   	 		do
		   	 		{
		   	 		System.out.println("----------------  DELETE  ----------------");
		   	 		System.out.println("[1] Books\n[2] Cashier");
		   	 		System.out.print("Enter your choice : ");
		   	 		int choi = n.nextInt();

		   	 		if (choi == 1)
		   	 		{

							boolean condi3 = true;
							do{
					    	System.out.print("Enter the Book Code you want to delete :");
					    	 int holdbcode = n.nextInt();

						    	int index = 0 , newbcode = 0;
						    	for(int x = 0; x<BookC.length; x++)
						    	{
						    		if(holdbcode == BookC[x])
						    		{
						    			index = x;
						    			newbcode = BookC[x];
						    		}
						    	}

								if (holdbcode == newbcode)
								{
						            for(int i = index; i < counterB; i++)
						            	{
								            if(BookC[i] == holdbcode)
								            	{
							            		if(i == counterB -1 )
							            		{
							            			double [] newPrice = new double [counterB +1];
													String [] newAuthor = new String [counterB +1];
													String [] newTittle = new String [counterB +1];
													int [] newBookC = new int [counterB +1];
													int [] newBookQ = new int [counterB +1];

													for(int a=0; a<counterB-1; a++)
													{
														newPrice[a] = Price[a];
														newTittle[a] = Tittle[a];
														newAuthor[a] = Author[a];
														newBookC[a] = BookC[a];
														newBookQ[a] = BookQ[a];
													}

													Price = newPrice;
										    		Tittle = newTittle;
										    		Author = newAuthor;
										    		BookC  = newBookC;
										    		BookQ  = newBookQ;
										    		counterB--;
							            		}
								            	else
								            	{
									                for(int j = i ; j < counterB-1; j++)
									                {
								                       BookC[j] = BookC[j+1];
								                       Author[j] = Author[j+1];
								                       Tittle[j] = Tittle[j+1];
								                       Price[j] = Price[j+1];
								                       BookQ[j] = BookQ[j+1];
								                       counterB--;
									                }
								           		 }
								                break;
								            	}
							       		}
								}
								else
								{
									System.out.println("Invalid Book Code!");
								}
								System.out.print("\nDelete another book? [y]Yes [n]No :");
								ch= in.next().charAt(0);
									if(ch == 'y' || ch == 'Y'){
										continue;
									}

									if(ch == 'n' || ch == 'N'){
									condi3 = false;
									}
									else{
										System.out.print("\n");
										System.out.println("Invalid Choice!");
										condi3 = false;
									}
							}while(condi3);
						}
					else if (choi == 2)
						{
							Scanner n2 = new Scanner (System.in);
							boolean condi3 = true;
							do{

								System.out.print("Enter the Cashier name you want to delete : ");
								String holdname = n2.nextLine();
								int index = 0;
								String testname = "";

						    	for(int x = 0; x<Cashier.length; x++)
						    	{
						    		if(holdname.equals(Cashier[x]))
						    		{
						    			index = x;
						    			testname = Cashier[x];
						    		}
						    	}

								if(holdname.equals(testname))
								{
									for(int i = index; i < counterC; i++)
						            	{
								            if(holdname == testname)
								            	{
							            		if(i == counterC -1 )
							            		{
							            			String [] newCashier = new String [counterC +1];
													String [] newCPass = new String [counterC+1];

													for(int a=0; a<counterC-1; a++)
													{
														newCashier[a] = Cashier[a];
														newCPass[a] = CPass[a];
													}

													Cashier = newCashier;
										    		CPass = newCPass;
										    		counterC--;
							            		}
								            	else
								            	{
									                for(int j = i ; j < counterC-1; j++)
									                {
								                       Cashier[j] = Cashier[j+1];
								                       CPass[j] = CPass[j+1];
								                       counterC--;
									                }
								           		 }
								                break;
								            	}
							       		}
								}
								else
								{
									System.out.println("Invalid Cashier!");
								}

								System.out.print("\nDelete another cashier again? [y]Yes [n]No :");
									ch= in.next().charAt(0);
										if(ch == 'y' || ch == 'Y'){
											continue;
										}
										else if(ch == 'n' || ch == 'N'){
										condi3 = false;
										}
										else{
										System.out.print("\n");
										System.out.println("Invalid Choice!");
										condi3 = false;
										}
							}while(condi3);
						}
						else
						{
							System.out.println("Invalid Choice!");
						}

					char ch2;
			    	System.out.print("\nDo you want to Delete again? [y]-Yes [n]-No :");
					ch2= in.next().charAt(0);
						if(ch2 == 'y' || ch2 == 'Y'){
							continue;
						}
						if(ch2 == 'n' || ch2 == 'N'){
						condi1 = false;
						}
						else{
						System.out.println("Invalid Choice!");
						condi1 = false;
						}

			   	 	}while(condi1);
			    	}
			    else if(trans == 4)
			    	{
			    		System.out.println("----------------  SEARCH  ----------------");
			    		boolean condi1 = true;
			   	 		do
			   	 		{
			    		System.out.println("[1] Books\n[2] Cashier");
						System.out.print("Enter your choice : ");
						int choi = in.nextInt();
						System.out.println();

						if (choi == 1)
							{
								Scanner n2 = new Scanner (System.in);
								System.out.print("Enter name of the Book or Author (Complete) : ");
								String ser1 = n2.nextLine();
									for(int x = 0; x<counterB; x++)
									{
										if(ser1.equalsIgnoreCase(Author[x]) || ser1.equalsIgnoreCase(Tittle[x]))
										{
											System.out.println("Book Code : " + BookC[x]);
											System.out.println("Author    : " + Author[x]);
											System.out.println("Title     : " + Tittle[x]);
											System.out.println("Price     : " + Price[x]);
											System.out.println("Quantity  : " + BookQ[x]);
											System.out.println("---------------------------------------");
										}
									}
							}
						else if (choi == 2)
							{
								System.out.print("Enter name of the Cashier (Complete) : ");
								String ser1 = n.nextLine();
								for(int x = 0; x<counterC; x++)
									{
										if(ser1.equalsIgnoreCase(Cashier[x]))
										{
											System.out.println("Cashier     : " + Cashier[x]);
											System.out.println("Password    : " + CPass[x]);
											System.out.println("----------------------");
										}

									}
							}
						else
						{
							System.out.print("Invalid Choice!");
						}

						char ch2;
				    	System.out.print("\nDo you want to Search again? [y]-Yes [n]-No :");
						ch2= in.next().charAt(0);
							if(ch2 == 'y' || ch2 == 'Y'){
								continue;
							}
							else if(ch2 == 'n' || ch2 == 'N'){
							condi1 = false;
							}
							else{
								System.out.println("Invalid Choice!");
							condi1 = false;
							}

				   	 	}while(condi1);


			    	}
			    else if (trans==5)
				    {
				    	boolean condi1 = true;
				    	do
				    	{
					    	System.out.println("----------------  SORT  ----------------");
					    	System.out.println("[1] Book Code\n[2] Book Price\n[3] Book Title\n[4] Book Author");
					    	System.out.print("Enter your choice : ");
					    	int choi = in.nextInt();

					    	if(choi == 1 )
					    	{
			    				double [] newPrice = new double [counterB];
								String [] newAuthor = new String [counterB];
								String [] newTittle = new String [counterB];
								int [] newBookC = new int [counterB];
								int [] newBookQ = new int [counterB];

									for(int i=0; i<counterB; i++)
									{
										newPrice[i]  = Price[i];
										newTittle[i] = Tittle[i];
										newAuthor[i] = Author[i];
										newBookC[i]  = BookC[i];
										newBookQ[i]  = BookQ[i];
									}
									String author, tittle; int bookc , bookq; double price;

									for(int l=0; l<newBookC.length; l++)
									{
										for (int j = l+1; j<newBookC.length; j++)
										{
											if(newBookC[l] > newBookC[j])
											{
												author = newAuthor[l];
												tittle = newTittle[l];
												price  = newPrice[l];
												bookc  = newBookC[l];
												bookq  = newBookQ[l];

												newAuthor[l] = newAuthor[j];
												newTittle[l] = newTittle[j];
												newPrice[l]  =  newPrice[j];
												newBookC[l]  =  newBookC[j];
												newBookQ[l]  =  newBookQ[j];

												newAuthor[j] = author;
												newTittle[j] = tittle;
												 newPrice[j] = price;
												 newBookC[j] = bookc;
												 newBookQ[j] = bookq;

											}
										}
									}

									for(int j = 0; j<counterB; j++)
									{
										System.out.println("Book Code : " + newBookC[j]);
										System.out.println("Author    : " + newAuthor[j]);
										System.out.println("Title     : " + newTittle[j]);
										System.out.println("Price     : " + newPrice[j]);
										System.out.println("Quantity  : " + newBookQ[j]);
										System.out.println("---------------------------------------");
									}
					    	}
					    	else if(choi == 2 )
					    	{
			    				double [] newPrice = new double [counterB];
								String [] newAuthor = new String [counterB];
								String [] newTittle = new String [counterB];
								int [] newBookC = new int [counterB];
								int [] newBookQ = new int [counterB];

									for(int i=0; i<counterB; i++)
									{
										newPrice[i]  = Price[i];
										newTittle[i] = Tittle[i];
										newAuthor[i] = Author[i];
										newBookC[i]  = BookC[i];
										newBookQ[i]  = BookQ[i];
									}
									String author, tittle; int bookc , bookq; double price;

									for(int l=0; l<newBookC.length; l++)
									{
										for (int j = l+1; j<newBookC.length; j++)
										{
											if(newPrice[l] > newPrice[j])
											{
												author = newAuthor[l];
												tittle = newTittle[l];
												price  = newPrice[l];
												bookc  = newBookC[l];
												bookq  = newBookQ[l];

												newAuthor[l] = newAuthor[j];
												newTittle[l] = newTittle[j];
												newPrice[l]  =  newPrice[j];
												newBookC[l]  =  newBookC[j];
												newBookQ[l]  =  newBookQ[j];

												newAuthor[j] = author;
												newTittle[j] = tittle;
												 newPrice[j] = price;
												 newBookC[j] = bookc;
												 newBookQ[j] = bookq;

											}
										}
									}

									for(int j = 0; j<counterB; j++)
									{
										System.out.println("Book Code : " + newBookC[j]);
										System.out.println("Author    : " + newAuthor[j]);
										System.out.println("Title    : " + newTittle[j]);
										System.out.println("Price     : " + newPrice[j]);
										System.out.println("Quantity  : " + newBookQ[j]);
										System.out.println("---------------------------------------");
									}

					    	}
					    	else if(choi == 3 )
					    	{
			    				double [] newPrice = new double [counterB];
								String [] newAuthor = new String [counterB];
								String [] newTittle = new String [counterB];
								int [] newBookC = new int [counterB];
								int [] newBookQ = new int [counterB];

									for(int i=0; i<counterB; i++)
									{
										newPrice[i]  = Price[i];
										newTittle[i] = Tittle[i];
										newAuthor[i] = Author[i];
										newBookC[i]  = BookC[i];
										newBookQ[i]  = BookQ[i];
									}
									String author, tittle; int bookc , bookq; double price;

									for(int l=0; l<newBookC.length; l++)
									{
										for (int j = l+1; j<newBookC.length; j++)
										{
											if(newTittle[l].compareTo(newTittle[j])>0)
											{
												author = newAuthor[l];
												tittle = newTittle[l];
												price  = newPrice[l];
												bookc  = newBookC[l];
												bookq  = newBookQ[l];

												newAuthor[l] = newAuthor[j];
												newTittle[l] = newTittle[j];
												newPrice[l]  =  newPrice[j];
												newBookC[l]  =  newBookC[j];
												newBookQ[l]  =  newBookQ[j];

												newAuthor[j] = author;
												newTittle[j] = tittle;
												 newPrice[j] = price;
												 newBookC[j] = bookc;
												 newBookQ[j] = bookq;

											}
										}
									}

									for(int j = 0; j<counterB; j++)
									{
										System.out.println("Book Code : " + newBookC[j]);
										System.out.println("Author    : " + newAuthor[j]);
										System.out.println("Title     : " + newTittle[j]);
										System.out.println("Price     : " + newPrice[j]);
										System.out.println("Quantity  : " + newBookQ[j]);
										System.out.println("---------------------------------------");
									}
					    	}
					    	else if(choi == 4 )
					    	{
					    		double [] newPrice = new double [counterB];
								String [] newAuthor = new String [counterB];
								String [] newTittle = new String [counterB];
								int [] newBookC = new int [counterB];
								int [] newBookQ = new int [counterB];

									for(int i=0; i<counterB; i++)
									{
										newPrice[i]  = Price[i];
										newTittle[i] = Tittle[i];
										newAuthor[i] = Author[i];
										newBookC[i]  = BookC[i];
										newBookQ[i]  = BookQ[i];
									}
									String author, tittle; int bookc , bookq; double price;

									for(int l=0; l<newBookC.length; l++)
									{
										for (int j = l+1; j<newBookC.length; j++)
										{
											if(newAuthor[l].compareTo(newAuthor[j])>0)
											{
												author = newAuthor[l];
												tittle = newTittle[l];
												price  = newPrice[l];
												bookc  = newBookC[l];
												bookq  = newBookQ[l];

												newAuthor[l] = newAuthor[j];
												newTittle[l] = newTittle[j];
												newPrice[l]  =  newPrice[j];
												newBookC[l]  =  newBookC[j];
												newBookQ[l]  =  newBookQ[j];

												newAuthor[j] = author;
												newTittle[j] = tittle;
												 newPrice[j] = price;
												 newBookC[j] = bookc;
												 newBookQ[j] = bookq;

											}
										}
									}

									for(int j = 0; j<counterB; j++)
									{
										System.out.println("Book Code : " + newBookC[j]);
										System.out.println("Author    : " + newAuthor[j]);
										System.out.println("Title     : " + newTittle[j]);
										System.out.println("Price     : " + newPrice[j]);
										System.out.println("Quantity  : " + newBookQ[j]);
										System.out.println("---------------------------------------");
									}

					    	}
					    	else
					    	{
					    		System.out.println("Invalid Choice!");
					    	}

					    	System.out.print("\nDo you want to Sort again? [y]Yes [n]No :");
							ch= in.next().charAt(0);
								if(ch == 'y' || ch == 'Y'){
									continue;
								}
								else if(ch == 'n' || ch == 'N'){
								condi1 = false;
								}
								else{
									System.out.print("\n");
									System.out.println("Invalid Choice!");
									condi1 = false;
								}
				    	}while(condi1);

				    }
			    else if (trans==6)
			    {
					boolean condi1 = true;
					int choi;
					do{
					System.out.println("----------------  INVENTORY  ----------------");
					System.out.println("[1] Available Books\n[2] Not Available Books\n[3] Damage Books\n[4] SALE Books \n[5] Best Selling Books");
					System.out.print("Enter Your Choice  : ");
					choi = in.nextInt();

					if(choi == 1)
					{

						for(int x = 0; x<counterB; x++)
						{
							if(BookQ[x] >0)
							{
								System.out.println("Book Code : " + BookC[x]);
								System.out.println("Author    : " + Author[x]);
								System.out.println("Title     : " + Tittle[x]);
								System.out.println("Price     : " + Price[x]);
								System.out.println("Quantity  : " + BookQ[x]);
								System.out.println("---------------------------------------");
							}
						}
					}
					else if(choi == 2)
					{
						int counter = 0;
						for(int x = 0; x<counterB; x++)
						{
							if(BookQ[x] == 0)
							{
								System.out.println("Book Code : " + BookC[x]);
								System.out.println("Author    : " + Author[x]);
								System.out.println("Title     : " + Tittle[x]);
								System.out.println("Price     : " + Price[x]);
								System.out.println("Quantity  : " + BookQ[x]);
								System.out.println("---------------------------------------");
								counter += 1;
							}
						}
							if(counter >= 1)
							{
							}
							else
							{
							System.out.print("ALL BOOKS ARE AVAILABLE!");
							}
					}
					else if(choi == 3)
					{
					boolean condition = true;
					 do{

					 	System.out.println("\t\t\t DAMAGE BOOKS");
						System.out.println("[1] Add Damage Books\n[2] Edit Damage Books\n[3] Display Damage Books\n[4] Delete Damage Books");
						System.out.print("Enter your choice : ");
						int choi2 = in.nextInt();
							if(choi2 == 1)
							{
								Scanner in2 = new Scanner (System.in);

								System.out.println("Book Code \t\t\t\t Book Title");
								for (int x = 0; x<counterB; x++)
								{
									System.out.println(BookC[x] + "\t\t\t\t\t" + Tittle[x]);
								}
							boolean condi3 = true;
								do
								{
									System.out.print("Enter the Book Code you want to add in Damage Book: ");
									int bookc = in.nextInt();
								int bookholder = 0;
								String author = "" , tittle = "";
								double price =0.00;

								for (int y = 0; y<counterB; y++)
								{
									if(BookC[y] == bookc)
									{
										bookholder = 1;
										tittle = Tittle[y];
										author = Author[y];
										price = Price[y];

									}
								}

									if ( bookholder >0)
									{

										System.out.print("Enter Quantity :");
										quantity = in.nextInt();
										if(counterDB > 0)
										{
										double [] newPrice = new double [counterDB +1];
										String [] newAuthor = new String [counterDB +1];
										String [] newTittle = new String [counterDB +1];
										int [] newBookC = new int [counterDB +1];
										int [] newQuantity = new int [counterDB +1];

											for(int i=0; i<counterDB; i++)
											{
												newPrice[i] = DPrice[i];
												newTittle[i] = DTittle[i];
												newAuthor[i] = DAuthor[i];
												newBookC[i] = DBookC[i];
												newQuantity[i] = DQuantity[i];
											}
											newPrice[newPrice.length - 1] = price;
											newAuthor[newAuthor.length - 1] = author;
											newTittle[newTittle.length - 1] = tittle;
											newBookC[newBookC.length - 1] = bookc;
											newQuantity[newQuantity.length -1] = quantity;

											DPrice = newPrice;
								    		DTittle = newTittle;
								    		DAuthor = newAuthor;
								    		DBookC  = newBookC;
								    		DQuantity = newQuantity;
								    		counterDB++;

										}
										else
										{
										double [] newPrice = new double [1];
										String [] newAuthor = new String [1];
										String [] newTittle = new String [1];
										int [] newBookC = new int [1];
										int [] newQuantity = new int [1];

										for(int i=0; i<1; i++)
											{
												newPrice[i] = price;
												newTittle[i] = tittle;
												newAuthor[i] = author;
												newBookC[i] = bookc;
												newQuantity[i] = quantity;
											}

											DPrice = newPrice;
								    		DTittle = newTittle;
								    		DAuthor = newAuthor;
								    		DBookC  = newBookC;
								    		DQuantity = newQuantity;
								    		counterDB++;
										}

										condi3 = false;
						    		}
						    		else
						    		{
						    			System.out.println("Invalid Book Code!!");
						    		}


								}while(condi3);
							}
							else if(choi2 == 2)
							{
								boolean condi3 = true;
								do{
								System.out.print("Enter the Book Code you want to edit :");
						    	int holdbcode = n.nextInt();

							    	int index = 0 , newbcode = 0;
							    	for(int x = 0; x<counterDB; x++)
							    	{
							    		if(holdbcode == DBookC[x])
							    		{
							    			index = x;
							    			newbcode = DBookC[x];
							    		}
							    	}

									if (holdbcode == newbcode)
									{
										char ch2;
										do{
											System.out.println("Available Damaged Book/s : "+ DQuantity[index]);
											System.out.print("Enter the Updated Quantity :");
											int up = in.nextInt();
											int y = index + 1;
											for(int x = index; x<y; x++)
											{
												DQuantity[x] = up;
											}

										System.out.print("\nDo you want to edit the book again? [y]Yes [n]No :");
										ch2 = in.next().charAt(0);
											if(ch2 == 'y' || ch2 == 'Y'){
												continue;
											}
											else if(ch2 == 'n' || ch2 == 'N'){
											condi3 = false;
											}
											else{
												System.out.print("\n");
												System.out.println("Invalid Choice!");
											}

										}while(ch2 == 'y' || ch2 =='Y');
									}
									else
									{
										System.out.println("Invalid Book Code!");
									}

								}while(condi3);

							}
							else if(choi2 == 3)
							{

								for(int x = 0; x<counterDB; x++)
								{
									System.out.println("Book Code : " + DBookC[x]);
									System.out.println("Author    : " + DAuthor[x]);
									System.out.println("Title     : " + DTittle[x]);
									System.out.println("Price     : " + DPrice[x]);
									System.out.println("Quantity  : " + DQuantity[x]);
									System.out.println("---------------------------------------");
								}

							}
							else if(choi2 == 4)
							{
								boolean condi3 = true;
								do{
						    	System.out.print("Enter the Book Code you want to delete :");
						    	int holdbcode = n.nextInt();

						    	int index = 0 , newbcode = 0;
						    	for(int x = 0; x<counterDB; x++)
						    	{
						    		if(holdbcode == DBookC[x])
						    		{
						    			index = x;
						    			newbcode = DBookC[x];
						    		}
						    	}

								if (holdbcode == newbcode)
								{
						            for(int i = index; i < counterDB; i++)
						            	{
								            if(DBookC[i] == holdbcode)
								            	{
							            		if(i == counterDB -1 )
							            		{
							            			double [] newPrice = new double [counterDB +1];
													String [] newAuthor = new String [counterDB +1];
													String [] newTittle = new String [counterDB +1];
													int [] newBookC = new int [counterDB +1];
													int [] newQuantity = new int [counterDB +1];


													for(int a=0; a<counterDB-1; a++)
													{
														newPrice[a] = DPrice[a];
														newTittle[a] = DTittle[a];
														newAuthor[a] = DAuthor[a];
														newBookC[a] = DBookC[a];
														newQuantity[a] = DQuantity[a];
													}

													DPrice = newPrice;
										    		DTittle = newTittle;
										    		DAuthor = newAuthor;
										    		DBookC  = newBookC;
										    		DQuantity = newQuantity;
										    		counterDB--;
							            		}
								            	else
								            	{
									                for(int j = i ; j < counterDB-1; j++)
									                {
								                       DBookC[j] = DBookC[j+1];
								                       DAuthor[j] = DAuthor[j+1];
								                       DTittle[j] = DTittle[j+1];
								                       DPrice[j] = DPrice[j+1];
								                       DQuantity[j] = DQuantity[j+1];
								                       counterDB--;
									                }
								           		 }
								                break;
								            	}
							       		}
								}
								else
								{
									System.out.println("Invalid Book Code!");
								}
								System.out.print("\nDelete the another book again? [y]Yes [n]No :");
								ch= in.next().charAt(0);
									if(ch == 'y' || ch1 == 'Y'){
										continue;
									}
									else if(ch == 'n' || ch1 == 'N'){
									condi3 = false;
									}
									else{
										System.out.print("\n");
										System.out.println("Invalid Choice!");
										condi3 = false;
									}
							}while(condi3);

							}
							else
							{
								System.out.print("Invalid Choice!!");
							}

							char ch3;
					    	System.out.print("\nDo you want to go in Damage Books again? [y]-Yes [n]-No :");
							ch3 = in.next().charAt(0);
								if(ch3 == 'y' || ch3 == 'Y'){
									continue;
								}
								else if(ch3 == 'n' || ch3 == 'N'){
								condition = false;
								}
								else{
									System.out.println("Invalid Choice!");
								condition = false;
								}

						}while (condition);

					}
					else if(choi == 4)
					{
						boolean condition = true;
					 do{
					 	System.out.println("\t\t\t SALE BOOKS");
						System.out.println("[1] Add Sale Books\n[2] Edit Sale Books\n[3] Display Sale Books\n[4] Delete Sale Books");
						System.out.print("Enter your choice : ");
						int choi2 = in.nextInt();
							if(choi2 == 1)
							{
								Scanner in2 = new Scanner (System.in);

								System.out.println("Book Code \t\t\t\t Book Title");
								for (int x = 0; x<counterB; x++)
								{
									System.out.println(BookC[x] + "\t\t\t\t\t" + Tittle[x]);
								}
							boolean condi3 = true;
								do
								{
								System.out.print("Enter the Book Code you want to add in Sale Books: ");
								int bookc = in.nextInt();

								int bookholder = 0;
								String author = "" , tittle = "";
								double price =0.00;

								for (int y = 0; y<counterB; y++)
								{
									if(BookC[y] == bookc)
									{
										bookholder = 1;
										tittle = Tittle[y];
										author = Author[y];
									}
								}

									if ( bookholder >0)
									{
										System.out.print("Enter the Sale Price :");
										price = in.nextDouble();
										if(counterSB > 0)
										{
										double [] newPrice = new double [counterSB +1];
										int [] newBookC = new int [counterSB +1];
										String [] newAuthor = new String [counterSB +1];
										String [] newTittle = new String [counterSB +1];


											for(int i=0; i<counterSB; i++)
											{
												newPrice[i] = SPrice[i];
												newBookC[i] = SBookC[i];
												newTittle[i] = STittle[i];
												newAuthor[i] = SAuthor[i];
											}
											newPrice[newPrice.length - 1] = price;
											newBookC[newBookC.length - 1] = bookc;
											newTittle[newTittle.length - 1] = tittle;
											newAuthor[newAuthor.length - 1] = author;

											SPrice = newPrice;
								    		SBookC  = newBookC;
								    		SAuthor = newAuthor;
								    		STittle = newTittle;
								    		counterSB++;

										}
										else
										{
											double [] newPrice = new double [1];
											int [] newBookC = new int [1];
											String [] newAuthor = new String [1];
											String [] newTittle = new String [1];

											for(int i=0; i<1; i++)
												{
													newPrice[i] = price;
													newBookC[i] = bookc;
													newTittle[i] = tittle;
													newAuthor[i] = author;
												}

												SPrice = newPrice;
									    		SBookC  = newBookC;
									    		SAuthor = newAuthor;
									    		STittle = newTittle;
									    		counterSB++;
										}

										condi3 = false;
						    		}
						    		else
						    		{
						    			System.out.println("Invalid Book Code!!");
						    		}


								}while(condi3);
							}
							else if(choi2 == 2)
							{
								boolean condi3 = true;
								do{
								System.out.print("Enter the Book Code you want to edit :");
						    	int holdbcode = n.nextInt();

							    	int index = 0 , newbcode = 0;
							    	for(int x = 0; x<counterSB; x++)
							    	{
							    		if(holdbcode == SBookC[x])
							    		{
							    			index = x;
							    			newbcode = SBookC[x];
							    		}
							    	}

									if (holdbcode == newbcode)
									{
										System.out.print("Enter the new Sale Price :");
										double up = in.nextDouble();
										int y = index + 1;
										for(int x = index; x<y; x++)
										{
											SPrice[x] = up;
										}


									}
									else
									{
										System.out.println("Invalid Book Code!");
									}
									char ch2;
									System.out.print("\nDo you want to edit again? [y]Yes [n]No :");
									ch2 = in.next().charAt(0);
										if(ch2 == 'y' || ch2 == 'Y'){
											continue;
										}
										else if(ch2 == 'n' || ch2 == 'N'){
										condi3 = false;
										}
										else{
											System.out.print("\n");
											System.out.println("Invalid Choice!");
										}

								}while(condi3);

							}
							else if(choi2 == 3)
							{

								for(int x = 0; x<counterSB; x++)
								{
									System.out.println("Book Code : " + SBookC[x]);
									System.out.println("Author    : " + SAuthor[x]);
									System.out.println("Title     : " + STittle[x]);
									System.out.println("Price     : " + SPrice[x]);
									System.out.println("---------------------------------------");
								}

							}
							else if(choi2 == 4)
							{
								boolean condi3 = true;
								do{
						    	System.out.print("Enter the Book Code you want to delete :");
						    	int holdbcode = n.nextInt();

						    	int index = 0 , newbcode = 0;
						    	for(int x = 0; x<counterSB; x++)
						    	{
						    		if(holdbcode == SBookC[x])
						    		{
						    			index = x;
						    			newbcode = SBookC[x];
						    		}
						    	}

								if (holdbcode == newbcode)
								{
						            for(int i = index; i < counterSB; i++)
						            	{
								            if(SBookC[i] == holdbcode)
								            	{
							            		if(i == counterSB -1 )
							            		{
							            			double [] newPrice = new double [counterSB +1];
													String [] newAuthor = new String [counterSB +1];
													String [] newTittle = new String [counterSB +1];
													int [] newBookC = new int [counterSB +1];


													for(int a=0; a<counterSB-1; a++)
													{
														newPrice[a] = SPrice[a];
														newTittle[a] = STittle[a];
														newAuthor[a] = SAuthor[a];
														newBookC[a] = SBookC[a];

													}

													SPrice = newPrice;
										    		STittle = newTittle;
										    		SAuthor = newAuthor;
										    		SBookC  = newBookC;
										    		counterSB--;
							            		}
								            	else
								            	{
									                for(int j = i ; j < counterSB-1; j++)
									                {
								                       SBookC[j] = SBookC[j+1];
								                       SAuthor[j] = SAuthor[j+1];
								                       STittle[j] = STittle[j+1];
								                       SPrice[j] = SPrice[j+1];
								                       counterSB--;
									                }
								           		 }
								                break;
								            	}
							       		}
								}
								else
								{
									System.out.println("Invalid Book Code!");
								}
								System.out.print("\nDelete the another book again? [y]Yes [n]No :");
								ch= in.next().charAt(0);
									if(ch == 'y' || ch == 'Y'){
										continue;
									}
									else if(ch == 'n' || ch == 'N'){
									condi3 = false;
									}
									else{
										System.out.print("\n");
										System.out.println("Invalid Choice!");
										condi3 = false;
									}
							}while(condi3);

							}
							else
							{
								System.out.print("Invalid Choice!!");
							}

							char ch3;
					    	System.out.print("\nDo you want to go in Sale Books again? [y]-Yes [n]-No :");
							ch3 = in.next().charAt(0);
								if(ch3 == 'y' || ch3 == 'Y'){
									continue;
								}

								if(ch3 == 'n' || ch3 == 'N'){
								condition = false;
								}
								else{
									System.out.println("Invalid Choice!");
								condition = false;
								}

						}while (condition);

					}
					else if(choi == 5)
					{
						System.out.println("\t\tBest Selling Books\n");
						 for(int x = 0; x<counterB; x++)
						 {
						 	int count = 0;
						 	for(int y = 0; y<SalesBC.length; y++)
						 	{
						 		if(BookC[x] == SalesBC[y])
						 		{
						 			count += 1;
						 		}
						 	}

						 	if(count >1)
						 	{
						 		System.out.println("Book Code : " + BookC[x]);
								System.out.println("Author    : " + Author[x]);
								System.out.println("Title     : " + Tittle[x]);
								System.out.println("Price     : " + Price[x]);
								System.out.println("---------------------------------------");
						 	}

						 }
					}
					else
					{
						System.out.println("Invalid Choice!");
					}
							char ch2;
					    	System.out.print("\nDo you want to go in Inventory again? [y]-Yes [n]-No :");
							ch2= in.next().charAt(0);
								if(ch2 == 'y' || ch2 == 'Y'){
									continue;
								}

								else if(ch2 == 'n' || ch2 == 'N'){
								condi1 = false;
								}
								else{
									System.out.println("Invalid Choice!");
								condi1 = false;
								}

					}while(condi1);

			    }
			    else if (trans==7)
			    {
			   		boolean condi1 = true;
				    do
				    {
					    System.out.println("[1] Daily\n[2] Weekly\n[3] Monthly\n[4] Annual\n[5] Cashier");
						System.out.print("Enter your choice :");
						int choi = in.nextInt();

						if (choi == 1)
						{
							System.out.print("Enter the Month [MM] :");
							int ser3 = n.nextInt();
							System.out.print("Enter the Day [DD] :");
							int ser1  = n.nextInt();

							double sum = 0;
							System.out.println("----- Cashier Name ----- Sales per Transaction ----- Date -----");
							for(int c = 0; c<Day.length; c++)
							{
								if(ser3 == Month[c])
								{
									for (int v = 0; v<Day.length; v++)
									{
										if(ser1 == Day[v])
										{
											System.out.println("\t"+SalesC[v]+"\t\t\t"+SalesP[v]+"\t\t   "+Month[v]+"-"+Day[v]+"-"+Year[v]);
											sum += SalesP[v];
										}
									}
									break;
								}

							}
							System.out.println("The Total of Daily Sales is " +sum);
						}
						else if (choi == 2)
						{
							System.out.print("Enter the Month [MM] :");
							int ser3 = n.nextInt();
							System.out.print("Enter the Day [DD] From :");
							int ser1  = n.nextInt();
							System.out.print("Enter the Day [DD] To :");
							int ser2  = n.nextInt();

							double sum = 0 , counter;
							System.out.println("----- Cashier Name ----- Sales per Transaction ----- Date -----");
							for(int c = 0; c<Day.length; c++)
							{
								if(ser3 == Month[c])
								{
									for (int v = ser1; v<=ser2; v++)
									{
										if(v == Day[c] )
										{
											System.out.println("\t"+SalesC[c]+"\t\t\t"+SalesP[c]+"\t\t   "+Month[c]+"-"+Day[c]+"-"+Year[c]);
											sum += SalesP[c];
										}
									}
								}
							}
								System.out.println("The Total of Weekly Sales is " +sum);
						}
						else if (choi == 3)
						{
							System.out.print("Enter the Month [MM] :");
							int ser1  = n.nextInt();

							double sum = 0;
							System.out.println("----- Cashier Name ----- Sales per Transaction ----- Date -----");
							for(int c = 0; c<Month.length; c++)
							{
								if(ser1 == Month[c] )
								{
									System.out.println("\t"+SalesC[c]+"\t\t\t"+SalesP[c]+"\t\t   "+Month[c]+"-"+Day[c]+"-"+Year[c]);
									sum += SalesP[c];
								}
							}
								System.out.println("The Total of Monthly Sales is " +sum);
						}
						else if (choi == 4)
						{
							System.out.print("Enter the Year [YYYY] :");
							int ser1  = n.nextInt();

							double sum = 0;
							System.out.println("----- Cashier Name ----- Sales per Transaction ----- Date -----");
							for(int c = 0; c<Year.length; c++)
							{
								if(ser1 == Year[c] )
								{
									System.out.println("\t"+SalesC[c]+"\t\t\t"+SalesP[c]+"\t\t   "+Month[c]+"-"+Day[c]+"-"+Year[c]);
									sum += SalesP[c];
								}
							}
								System.out.println("The Total of Annual Sales is " +sum);
						}
						else if (choi == 5)
						{
							System.out.print("Enter the Cashier Name :");
							String ser1  = n.nextLine();

							double sum = 0;
							System.out.println("----- Cashier Name ----- Sales per Transaction ----- Date -----");
							for(int c = 0; c<SalesC.length; c++)
							{
								if(ser1.equals(SalesC[c]) )
								{
									System.out.println("\t"+SalesC[c]+"\t\t\t"+SalesP[c]+"\t\t   "+Month[c]+"-"+Day[c]+"-"+Year[c]);
									sum += SalesP[c];
								}
							}
								System.out.println("The Total Sales is " +sum);
						}
						else
						{
							System.out.println("Invalid Choice!");
						}

					    char ch2;
				    	System.out.print("\nDo you want to go to Sales Report again? [y]-Yes [n]-No :");
						ch2= in.next().charAt(0);
							if(ch2 == 'y' || ch2 == 'Y'){
								continue;
							}
							else if(ch2 == 'n' || ch2 == 'N'){
							condi1 = false;
							}
							else{
								System.out.println("Invalid Choice!");
							condi1 = false;
							}
			    	}while(condi1);
			    }
			    else if (trans==8)
				{
				System.out.println("Log out Successfully");

				condi = false;
				UpCondition = false;
				}

			    else
			    {
		    		System.out.println("Invalid Choice!");
		    	}
			}while (condi);

			}
			else
			{
				System.out.println("Incorrect Username or Password!");
			}

		}while(UpCondition);
	}



		else if (login == 2)
		{
			Scanner n2 = new Scanner(System.in);
			boolean condition = true;
			do{
				System.out.print("Cashier Name  :");
				String cashname = n2.nextLine();
				System.out.print("Password      :");
				String cashpass = n2.nextLine();

				int trial = 0;
				for(int x = 0; x<Cashier.length; x++)
				{
					if(cashname.equals(Cashier[x]) && cashpass.equals(CPass[x]))
					{
					trial = 1;
					do{ System.out.print("Enter Month (MM)	: ");
						month = in.nextInt();
						}while(month < 1 || month > 12);

					do{ System.out.print("Enter Day (DD)    : ");
						day = in.nextInt();
						}while(day < 1 || day > 31);

					do{ System.out.print("Enter Year (YYYY) : ");
						year = in.nextInt();
						}while(year < 2017 || year >2021);

						boolean condi1 = true;
					do{
						int choi;
						System.out.println("[1] Transaction\n[2] Exit");
						System.out.print("Enter your choice : ");
						choi = in.nextInt();

						if(choi == 1 )
						{
							boolean condi2 = true;
						do{

							System.out.print("Number of different kind/s of books to buy? :");
							int nbooks = in.nextInt();

								int [] newBookC = new int [nbooks];
								int [] newQuantity = new int [nbooks];
							   	double [] newPrice = new double [nbooks];
							   	int bcode;
							for(int tria = 0; tria<nbooks; tria++)
							{
								int index = 0 , index2 = 0;
								boolean conditon = true;
								do{
								int trial1 = 0, bcode1 = 0;
								System.out.print("Book Code : ");
						        bcode = in.nextInt();
						        for (int a = 0; a<BookC.length; a++)
						        {
						        	if (bcode == BookC[a])
						        	{
									index = a;
									trial1 = 1;
									bcode1 = BookC[a];
						        	}
						        }
						        if(trial1 == 1)
						        {
						        	conditon = false;
						        }
						        else
						        {
						        	System.out.println("Invalid Book Code");
						        }

						        }while(conditon);

						        boolean condi3 = true;
						        do{
								System.out.print("Quantity  : ");
								quantity = in.nextInt();

								
									if(quantity > BookQ[index])
									{
										System.out.println("Invalid Transaction!\nAvailable Quantity :" +BookQ[index]);										
									}
									else
									condi3 = false;
								}while(condi3);

								int counterCash = 0;
								double price = 0;
								for (int triad = 0; triad<SBookC.length; triad++)
									{
										if(bcode == SBookC[triad])
										{
											counterCash = 1;
											price = SPrice[triad];
											index2 = triad;
										}
									}
								if(counterCash < 1)
								{
									price = Price[index];
								}

								newBookC[tria] = bcode;
								newQuantity[tria] = quantity;
								newPrice[tria] = price;
							}

							for (int man = 0; man<newPrice.length; man++)
							{
								total += newPrice[man] * newQuantity[man];
							}

					    	System.out.printf("Sub Total      :%7.2f\n",total);
					    	System.out.print("Enter the Cash:");
							cash = in.nextInt();

					    	change = cash - total;

						   	//Reciept Part
							System.out.println("\n");
						   	System.out.println("\tBook Store\n");
						   	for (int man1 = 0; man1<newPrice.length; man1++)
						   	{
						   		for(int man2 = 0; man2<BookC.length; man2++)
						   		{
						   			if(newBookC[man1] == BookC[man2])
						   			{
							   			System.out.println("Name of Book       : "+Tittle[man2]);
								   		System.out.println("Author of Book     : "+Author[man2]);
						   			}
						   		}

								System.out.println("Book Price         : "+newPrice[man1]);
								System.out.println("Quantity           : "+newQuantity[man1]);
						   	}

						   		System.out.printf("Total Price        : %7.2f\n" ,total);
						   		System.out.printf("Cash               : %7.2f\n" ,cash);
						   		System.out.printf("Change             : %7.2f\n\n" , change);


					   		for (int i = 0; i<newBookC.length; i++)
					   		{
								for(int ii = 0; ii<BookC.length; ii++)
								{
									if(newBookC[i] == BookC[ii])
									{
										BookQ[ii] -= newQuantity [i];
									}
								}
					   		}

							if (Day.length > 0)
							{
								int [] newDay = new int [Day.length +1];
								int [] newMonth = new int [Month.length +1];
								int [] newYear = new int [Year.length +1];
							   	double [] newSalesP = new double [SalesP.length +1];
								String [] newSalesC = new String [SalesC.length +1];


								for (int y = 0; y<SalesC.length; y++)
								{
									newSalesC[y] = SalesC[y];
									newSalesP[y] = SalesP[y];
									newMonth[y] = Month[y];
									newDay[y] = Day[y];
									newYear[y] = Year[y];
								}

								newSalesP[newSalesP.length - 1] = total;
								newSalesC[newSalesC.length - 1] = cashname;
								newDay[newDay.length - 1] = day;
								newMonth[newMonth.length - 1] = month;
								newYear[newYear.length - 1] = year;

								SalesP = newSalesP;
								SalesC = newSalesC;
								Day = newDay;
								Month = newMonth;
								Year = newYear;
							}
							else
							{
								int [] newDay = new int [1];
								int [] newMonth = new int [1];
								int [] newYear = new int [1];
							   	double [] newSalesP = new double [1];
								String [] newSalesC = new String [1];


								for (int y = 0; y<1; y++)
								{
									newSalesC[y] = cashname;
									newSalesP[y] = total;
									newMonth[y] = month;
									newDay[y] = day;
									newYear[y] = year;
								}

								SalesP = newSalesP;
								SalesC = newSalesC;
								Day = newDay;
								Month = newMonth;
								Year = newYear;
							}


							char ch2;
							System.out.print("\nDo you want to transact again? [y]-Yes [n]-No :");
							ch2= in.next().charAt(0);
							if(ch2 == 'y' || ch2 == 'Y'){
								continue;
							}
							else if(ch2 == 'n' || ch2 == 'N'){
								condi2 = false;
							}
							else{
								condi2 = false;
							}
						}while (condi2);
					}
					else if (choi == 2 )
					{
					System.out.println("Log out Successfully");
					condi1 = false;
					}


					}while(condi1);

					}

				}
				if (trial == 1)
				{
					condition = false;
				}
				else
				{
					System.out.println("Invalid Cashier Name and Password");

					char ch2;
					System.out.print("\nDo you want to try again? [y]-Yes [n]-No :");
					ch2= in.next().charAt(0);
					if(ch2 == 'y' || ch2 == 'Y'){

					}
					else if(ch2 == 'n' || ch2 == 'N'){
						condition = false;
					}
					else{
						condition = false;
					}
				}

			}while(condition);
		}

	}while (true);

}

}
