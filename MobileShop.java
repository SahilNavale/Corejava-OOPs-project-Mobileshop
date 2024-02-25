import java.util.*;
interface  Home   // 100 % abstraction achived
{
	 void address();
}

class address implements Home             //Implementing class 
{
	
	Scanner a1= new Scanner(System.in);
	public void address()                //Interface Home address() gets override with class address() 
	{
		
		System.out.println("Type Ur Full Name:");
		
		String nm=a1.next();
		System.out.println("Type Ur adress:");
		
		String add=a1.next();
		System.out.println("Type Ur Mob No:");
		
		try                                             //Exception handelling By using Try-Catch-Finally mechanism
		{
		 int no=a1.nextInt();
		}
		catch(Exception ex)
		{
			System.out.println(" please Type correct mobile no.");
			Scanner a2= new Scanner(System.in);
			int xyz=a2.nextInt();
		}
		finally 
		{
			System.out.println("  correct mobile no.");
		}
		
		
		
		System.out.println("Enter Otp sent on Registed mobile no.");
		Scanner a3= new Scanner(System.in);
			int OTP=a3.nextInt();
		
		
		System.out.println("Mobile no varified Succesfully");		
		System.out.println("Thank you "+ nm +" for Visiting to MobileMall");
		System.out.println("ur order will be delivared at "+ add +" within 1 week");					
	}
}

class Buyme   
{
	private int cardno;                       //private Keyword used
	private int cvv;                          // Data hiding Achived
	private int otp;                          // Hence Encapsulation Achived
	Buyme(int cardno,int cvv,int otp)
	{
		this.cardno=cardno;
		this.cvv=cvv;
		this.otp=otp;
	}
	public int getCardno()
	{
		return cardno;
	}
	public int getCvv()
	{
		return cvv;
	}
	public int getOtp()
	{
		return otp;
	}
}
class acces
{
	Scanner sc20= new Scanner(System.in);
	
	public void card() 
	{
		System.out.println("Enter Card No: ");
		
	    int cardno=sc20.nextInt();
	    	    
	    System.out.println("Enter CVV: ");
	    
	                                                 	
	     int cvv=sc20.nextInt();
	    
	    System.out.println("CVV verified Succesfully"); 
	   
	    System.out.println("Enter otp: ");
	    int otp=sc20.nextInt();
	    Buyme b=new Buyme(cardno,cvv,otp);
	    System.out.println("please Confirm your OTP" + b.getOtp());
	    
	}    	    	    	
	public void pay()
	{
		System.out.println("We have Exiting offers !!!");
		System.out.println("-----Get Extra 10% Off on every Smart Phone with HDFC bank Credit/Debit Cards-----");	
	    System.out.println("Please Select your Payment Method//");
	    System.out.println(" Type 1 for Credit/Debit Card");
	    System.out.println(" Type 2 for UPI");
	    System.out.println(" Type 3 for Cash On Delivery");
	    Scanner S6 =new Scanner(System.in);
	    int press=S6.nextInt();
	
    if (press==1)
    {
  	    card();	  	  
    }
    else if(press==2)
    {
    	System.out.println("Enter your UPI ID:");    	
		Scanner a2= new Scanner(System.in);
			    	
	    	String add=a2.next();
	    
			System.out.println("Payment Done Successfully.....");
		}	    
		
    else if(press==3)
    {
    	System.out.println("Cash On Delivary is Selected");
    	System.out.println("Pay the exact amount while taking Delivery");
    }
	}
}



class specifications
{
	String P;
	String D;
	String C;
	String Str;
	String B;
	String Ch;
	String Body;
		
	specifications(String P, String D,String Str, String C, String B, String Ch, String Body)
	{
		this.P=P;
		this.D=D;
		this.C=C;
		this.Str=Str;
		this.B=B;
		this.Ch=Ch;
		this.Body=Body;
	} 
	public String toString()  //  Run Time Polymorphism & toString() from specifications class is overriding the address of object from Supermost object class 
	{
	    System.out.println(" Processor-"+ P);
		System.out.println(" Display-"+ D);
		System.out.println(" Cameras-"+ C);
		System.out.println(" RAM & Strorage-"+ C);
		System.out.println(" Battery-"+ B);
		System.out.println(" Charging tech-"+ Ch);
		System.out.println(" Networks-"+ Body);
	     return" ";
	}
}
class Mobilemall     
{
	
	public static void BuyNow()
	{
		acces ac=new acces();         // object crearted for acces class    	 
		address a=new address();     // object crearted for addres class
		System.out.println(" Type 1 for Payment..");
		System.out.println(" Type 2 for more optios From Android..");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	ac.pay();
    	a.address();
    }
    else if(press==2)
    {
    	System.out.println("Seen more optios From Android");
    	android();
    }
	}
	public static void android()
	{
		System.out.println(" Type 1 for Samsung..");
		System.out.println(" Type 2 for oneplus..");
		System.out.println(" Type 3 for xiaomi..");
		System.out.println(" Type 4 for vivo..");
		Scanner S =new Scanner(System.in);
	    int press=S.nextInt();
	
    if (press==1)
    {
  	  samsung();
    }
    else if(press==2)
    {
    	oneplus();
    }
    else if(press==3)
    {
    	xiaomi();
    }
    else if(press==4)
    {
    	Vivo();
    }		
}		 
	public static void Nokia()
	{
		System.out.println("/-------NOKIA-------/");
		specifications ref=new specifications("Mediatake 655","5' IPS LCD ","13MP Rear & 5MP selfi","2/16 GB","2500mah","10W","3G");
		System.out.println("1. Details Of Nokia Lumia 512");		
		System.out.println(ref);
		System.out.println(" Buy Now for Rs.7,999/- Only");
		System.out.println("---------------------cgonnectin---------------------");
		System.out.println("2. Details Of Nokia Lumia 850 ");
		specifications ref1=new specifications("SnapDragon 410","5.5' IPS LCD","41MP Rear & 8MP selfi","3/32 GB","3300mah","10W","3G");
		System.out.println(ref1);
		System.out.println(" Buy Now for Rs.12,999/- Only");
		System.out.println("-----------------------------------------------");
		System.out.println(" What will u Buy??");
		System.out.println(" Type 1 for Nokia Lumia 512");
		System.out.println(" Type 2 for Nokia Lumia 850");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println(" Buy Now for Rs.7,999/- Only");
    	BuyNow();
    }
    else if(press==2)
    {
    	System.out.println(" Buy Now for Rs.12,999/- Only");
    	BuyNow();
    }
	}
					
	public static void VIVO()
	{
		System.out.println("/-------Vivo Series-------/");
		specifications ref=new specifications("Dimensity 1200","Amoled 120Hz","108MP+50MP+12MP Rear & 32MP selfi","8/256 GB","5000mah","67W","5G,4G");
		System.out.println("1. Details Of X70Pro");		
		System.out.println(ref);
		System.out.println(" Buy Now for Rs.42,999/- Only");
		System.out.println("-----------------------------------------------");
		System.out.println("2. Details Of Vivo Y53 ");
		specifications ref1=new specifications("SnapDragon 720G","Amoled","48MP+8MP+5MP Rear & 20MP selfi","6/128 GB","4400mah","33W","4G");
		System.out.println(ref1);
		System.out.println(" Buy Now for Rs.14,999/- Only");
		System.out.println(" Buy Now for Rs.28,999/- Only");
		System.out.println(" Type 1 for  X70Pro");
		System.out.println(" Type 2 for Vivo Y53");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println(" Buy Now for Rs.42,999/- Only");
    	BuyNow();
    }
    else if(press==2)
    {
    	System.out.println(" Buy Now for Rs.28,999/- Only");
    	BuyNow();
    }
	}
	public static void IQOO()
	{
		System.out.println("/-------IQOO Series-------/");
		specifications ref=new specifications("DiSnapDragon 888","Amoled 120Hz","108MP+20MP+5MP Rear & 16MP selfi","8/256 GB","5000mah","67W","5G,4G");
		System.out.println("1. Details Of IQoo 9 Legend");		
		System.out.println(ref);
		System.out.println(" Buy Now for Rs.40,999/- Only");
		System.out.println("-----------------------------------------------");
		System.out.println("2. Details Of IQoo 7  ");
		specifications ref1=new specifications("SnapDragon 870","120Hz Amoled","50MP+8MP+5MP Rear & 20MP selfi","6/128 GB","4400mah","50W","5G,4G");
		System.out.println(ref1);
		System.out.println(" Buy Now for Rs.28,999/- Only");
		System.out.println(" Type 1 for IQoo 9 Legend");
		System.out.println(" Type 2 for IQoo 7");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println(" Buy Now for Rs.40,999/- Only");
    	BuyNow();
    }
    else if(press==2)
    {
    	System.out.println(" Buy Now for Rs.28,999/- Only");
    	BuyNow();
    }
	}
	public static void One_plus() 
	{
		System.out.println("/-------OnePlus Series-------/");
		specifications ref=new specifications("SnapDragon 8 Gen 1","Amoled 120Hz","108MP+50MP+12MP Rear & 20MP selfi","8/256 GB","4500mah","120W","5G,4G");
		System.out.println("1. Details Of OnePlus 10R");		
		System.out.println(ref);
		System.out.println(" Buy Now for Rs.39,999/- Only");
		
		System.out.println("-----------------------------------------------");
		System.out.println("2. Details Of OnePlus 9RT ");
		specifications ref1=new specifications("SnapDragon 888","Amoled 120Hz","108MP+8MP+5MP Rear & 20MP selfi","8/128 GB","4800mah","67W","5G,4G");
		System.out.println(ref1);
		System.out.println(" Buy Now for Rs.44,999/- Only");
		System.out.println(" What will u Buy??");
		System.out.println(" Type 1 for OnePlus 10R");
		System.out.println(" Type 2 for OnePlus 9RT");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println(" Buy Now for Rs.39,999/- Only");
    	BuyNow();
    }
    else if(press==2)
    {
    	System.out.println(" Buy Now for Rs.44,999/- Only");
    	BuyNow();
    }
	}
		
	public static void Nord() 
	{
		System.out.println("These all are smartphones from Nord series//");
		System.out.println("/-------NORD Series-------/");
		specifications ref=new specifications("Dimensity 1200","Amoled 90Hz","50MP+8MP+2MP Rear & 20MP selfi","8/128 GB","4500mah","30W","5G,4G");
		System.out.println("1. Details Of OnePlus Nord 2");		
		System.out.println(ref);
		System.out.println(" Buy Now for Rs.29,999/- Only");
		System.out.println("-----------------------------------------------");
		System.out.println("2. Details Of OnePlus Nord CE2 ");
		specifications ref1=new specifications("SnapDragon 768G","Amoled 120Hz","48MP+8MP+2MP Rear & 16MP selfi","6/128 GB","4400mah","30W","4G");
		System.out.println(ref1);
		System.out.println(" Buy Now for Rs.23,999/- Only");
		System.out.println(" Type 1 for OnePlus Nord 2");
		System.out.println(" Type 2 for OnePlus Nord CE2");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println(" Buy Now for Rs.29,999/- Only");
    	BuyNow();
    }
    else if(press==2)
    {
    	System.out.println(" Buy Now for Rs.23,999/- Only");
    	BuyNow();
    }
	}
	public static void iphone11()
	{
		System.out.println("--------Iphone 11 Series--------");	
		specifications ref=new specifications("A12 Bionic Chip","6.3' Retina","12MP+12MP+12MP Rear & 12MP selfi","6/256 GB","3500mah","15W","4G");
		System.out.println("1. Details Of Iphone 11 Pro");		
		System.out.println(ref);
		System.out.println(" Buy Now for Rs.54,999/- Only");
		System.out.println("-----------------------------------------------");
		System.out.println("2.Details Of Iphone 11 ");
		specifications ref1=new specifications("A12 Bionic Chip","5.9' Retina","12MP+12MP Rear & 12MP selfi","4/128 GB","3000mah","15W","4G");
		System.out.println(ref1);
		System.out.println(" Buy Now for Rs.48,999/- Only");
		System.out.println(" Type 1 for Iphone 11 Pro");
		System.out.println(" Type 2 for Iphone 11");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println(" Buy Now for Rs.54,999/- Only");
    	BuyNow();
    }
    else if(press==2)
    {
    	System.out.println(" Buy Now for Rs.48,999/- Only");
    	BuyNow();
    }
		
	}
	public static void iphone12()
	{
		System.out.println("--------Iphone 12 Series--------");	
		specifications ref=new specifications("A13 Bionic Chip","6.3' Amoled","12MP+12MP+12MP Rear & 12MP selfi","8/256 GB","3500mah","20W","5G,4G");
		System.out.println("1. Details Of Iphone 12 Pro");		
		System.out.println(ref);
		System.out.println(" Buy Now for Rs.65,999/- Only");
		System.out.println("-----------------------------------------------");
		System.out.println("2.Details Of Iphone 12 ");
		specifications ref1=new specifications("A13 Bionic Chip","5.9' Retina","12MP+12MP Rear & 12MP selfi","6/128 GB","3000mah","15W","5G,4G");
		System.out.println(ref1);
		System.out.println(" Buy Now for Rs.62,999/- Only");
		System.out.println(" Type 1 for Iphone 12 Pro");
		System.out.println(" Type 2 for Iphone 12");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println(" Buy Now for Rs.65,999/- Only");
    	BuyNow();
    }
    else if(press==2)
    {
    	System.out.println(" Buy Now for Rs.62,999/- Only");
    	BuyNow();
    }
	}
	public static void iphone13()
	{
		System.out.println("--------Iphone 13 Series--------");	
		specifications ref=new specifications("A14 Bionic Chip","6.4' 120Hz OlED","12MP+12MP+12MP Rear & 12MP selfi","8/256 GB","4000mah","25W","5G,4G");
		System.out.println("1. Details Of Iphone 13 Pro ");		
		System.out.println(ref);
		System.out.println(" Buy Now for Rs.98,999/- Only");
		System.out.println("-----------------------------------------------");
		System.out.println("2.Details Of Iphone 13  ");
		specifications ref1=new specifications("A14 Bionic Chip","6.1' Amoled","12MP+12MP Rear & 12MP selfi","6/128 GB","3000mah","25W","5G,4G");
		System.out.println(ref1);
		System.out.println(" Buy Now for Rs.88,999/- Only");
		System.out.println(" Type 1 for Iphone 13 Pro");
		System.out.println(" Type 2 for Iphone 13");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println(" Buy Now for Rs.98,999/- Only");
    	BuyNow();
    }
    else if(press==2)
    {
    	System.out.println(" Buy Now for Rs.88,999/- Only");
    	BuyNow();
    }
	}
	public static void MIseries()
	{
		System.out.println("----------MI by Xiaomi----------");
		System.out.println("-----------------------------------------------");
		specifications ref=new specifications("SnapDragon 870","E4 Amoled 120Hz","48MP+8MP+5MP Rear & 20MP selfi","6/128 GB","4500mah","33W","5G,4G");
		System.out.println("1. Details Of MI11 X");		
		System.out.println(ref);
		System.out.println(" Buy Now for Rs.29,999/- Only");
		System.out.println("-----------------------------------------------");
		System.out.println("2. Details Of MI11 Ultra");
		specifications ref1=new specifications("SnapDragon 8 Gen 1","E5 Amoled 120Hz","108MP+8MP+5MP Rear & 20MP selfi","8/128 GB","4800mah","120W","5G,4G");
		System.out.println(ref1);
		System.out.println(" Buy Now for Rs.34,999/- Only");
		System.out.println(" Type 1 for MI11 X");
		System.out.println(" Type 2 for MI11 Ultra");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println(" Buy Now for 29,999/- Only");
    	BuyNow();
    }
    else if(press==2)
    {
    	System.out.println(" Buy Now for Rs.34,999/- Only");
    	BuyNow();
    }
		
		
	}
	public static void Redmiseries()
	{
		System.out.println("-------REDMI by Xiaomi--------");
		specifications ref3=new specifications("SnapDragon 695","Amoled 120Hz","48MP+8MP+2MP Rear & 16 MP selfi","6/64 GB","4800mah","50W","5G,4G");
		System.out.println("1. Details Of Redmi Note 11 Pro");		
		System.out.println(ref3);
		System.out.println(" Buy Now for Rs.17,999/- Only");
		System.out.println("-----------------------------------------------");
		System.out.println("2. Details Of Redmi Note 10 pro");
		specifications ref4=new specifications("SnapDragon 732G","Amoled 120Hz","64MP+8MP+5MP Rear & 20 MP selfi","6/64 GB","4800mah","33W","4G");
		System.out.println(ref4);
		System.out.println(" Buy Now for Rs.15,999/- Only");
		System.out.println(" Type 1 for Redmi Note 11 Pro");
		System.out.println(" Type 2 for Redmi Note 10 pro");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println(" Buy Now for Rs.17,999/- Only");
    	BuyNow();
    }
    else if(press==2)
    {
    	System.out.println(" Buy Now for Rs.15,999/- Only");
    	BuyNow();
    }
	}
	public static void Pocoseries()
	{
		System.out.println("-------POCO by Xiaomi-------");	
		specifications ref5=new specifications("SnapDragon 860","IPS LCD 120Hz","48MP+8MP+2MP Rear & 16 MP selfi","6/128 GB","4500mah","33W","4G");
		System.out.println("1. Details Of POCO X3 Pro");		
		System.out.println(ref5);
		System.out.println(" Buy Now for Rs.19,999/- Only");
		System.out.println("-----------------------------------------------");
		System.out.println("2. Details Of POCO F3 GT");
		specifications ref6=new specifications("Dimensity 1200","Amoled 120Hz","64MP+8MP+5MP Rear & 20 MP selfi","8/128 GB","5000mah","67W","5G,4G");
		System.out.println(ref6);
		System.out.println("It's Got Inbuilt Gaming Trigers Gamers");
		System.out.println(" Buy Now for Rs.27,999/- Only");
		System.out.println(" Type 1 for POCO X3 Pro");
		System.out.println(" Type 2 for POCO F3 GT");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println(" Buy Now for Rs.19,999/- Only");
    	BuyNow();
    }
    else if(press==2)
    {
    	System.out.println(" Buy Now for Rs.27,999/- Only");
    	BuyNow();
    }
	}
	
	
	public static void S_series()
	{
		System.out.println("-----Samsung Galaxy S series-----");	
		specifications ref5=new specifications("SnapDragon 8 Gen 1","Amoled 120Hz","108MP+50MP+50MP Rear & 32 MP selfi","12/256 GB","5000mah","50W","5G,4G");
		System.out.println("1. Details Of Samsung Galaxy S22 ");		
		System.out.println(ref5);
		System.out.println(" Buy Now for Rs.49,999/- Only");
		System.out.println("-----------------------------------------------");
		System.out.println("2. Details Of Samsung Galaxy S20 ");
		specifications ref6=new specifications("SnapDragon 888","Amoled 120Hz","64MP+12MP+12MP Rear & 20 MP selfi","8/256 GB","4500mah","25W","5G,4G");
		System.out.println(ref6);
		System.out.println(" Buy Now for Rs.42,999/- Only");
		System.out.println(" Type 1 for Samsung Galaxy S22");
		System.out.println(" Type 2 for Samsung Galaxy S20");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println(" Buy Now for Rs.49,999/- Only");
    	BuyNow();
    }
    else if(press==2)
    {
    	System.out.println(" Buy Now for Rs.42,999/- Only");
    	BuyNow();
    }
		
	}
	public static void A_series()
	{
		System.out.println("-----Samsung Galaxy A series-----");
		specifications ref5=new specifications("SnapDragon 778G","Amoled 120Hz","64MP+12MP+12MP Rear & 32 MP selfi","8/256 GB","5000mah","30W","5G,4G");
		System.out.println("1. Details Of Samsung Galaxy A52 ");		
		System.out.println(ref5);
		System.out.println(" Buy Now for Rs33,999/- Only");
		System.out.println("-----------------------------------------------");
		System.out.println("2. Details Of Samsung Galaxy A32 ");
		specifications ref6=new specifications("SnapDragon 750G","Amoled 90Hz","64MP+12MP+5MP Rear & 20 MP selfi","8/128 GB","5500mah","25W","5G,4G");
		System.out.println(ref6);
		System.out.println(" Buy Now for Rs.28,999/- Only");
		System.out.println(" Type 1 for Samsung Galaxy A52");
		System.out.println(" Type 2 for Samsung Galaxy A32");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println(" Buy Now for Rs33,999/- Only");
    	BuyNow();
    }
    else if(press==2)
    {
    	System.out.println(" Buy Now for Rs. Rs.28,999/- Only");
    	BuyNow();
    }
	}
	public static void M_series()
	{
		System.out.println("-----Samsung Galaxy M series-----");
		specifications ref5=new specifications("SnapDragon 765G","Amoled 120Hz","64MP+12MP+5MP Rear & 32 MP selfi","8/128 GB","5000mah","30W","5G,4G");
		System.out.println("1. Details Of Samsung Galaxy M52 ");		
		System.out.println(ref5);
		System.out.println(" Buy Now for Rs21,999/- Only");
		System.out.println("-----------------------------------------------");
		System.out.println("2. Details Of Samsung Galaxy M32 ");
		specifications ref6=new specifications("Exynos 1800","Amoled 90Hz","64MP+8MP+2MP Rear & 20 MP selfi","6/128 GB","5500mah","25W","4G");
		System.out.println(ref6);
		System.out.println(" Buy Now for Rs.17,999/- Only");
		System.out.println(" Type 1 for Samsung Galaxy M52");
		System.out.println(" Type 2 for Samsung Galaxy M32");
		Scanner S7 =new Scanner(System.in);
	    int press=S7.nextInt();
	
    if (press==1)
    {
    	System.out.println(" Buy Now for Rs21,999/- Only");
    	BuyNow();
    }
    else if(press==2)
    {
    	System.out.println(" Buy Now for Rs. Rs.17,999/- Only");
    	BuyNow();
    }
		
	}
	public static void Vivo()
	{
		System.out.println("We have 2 series from Vivo");
		System.out.println("Type 1 for Camera Centric ");
		System.out.println("Type 2 for Performance Centric (IQoo)");	
		System.out.println("********************************************************");
		
		Scanner S6 =new Scanner(System.in);
 	    int press=S6.nextInt();
		
        if (press==1)
        {
      	  VIVO();
        }
        else if(press==2)
        {
      	  IQOO();
        }
	}
	public static void oneplus()
	{
		System.out.println("We have 2 series from Oneplus");
		System.out.println("Type 1 for OnePlus Series");
		System.out.println("Type 2 for Nord Series");	
		System.out.println("********************************************************");
		
		Scanner S6 =new Scanner(System.in);
 	    int press=S6.nextInt();
		
        if (press==1)
        {
      	  One_plus();
        }
        else if(press==2)
        {
      	  Nord();
        }
	}
	public static void samsung()
	  {
		
		System.out.println("We have 3 series from Samsung"); 
		System.out.println("if your budget is above Rs.40,000 then choose S series (Type 1)");
		System.out.println("if your budget is 25,000 to 38,000 then choose A series (Type 2)");
		System.out.println("if your budget is 10,000 to 24,000 then choose M series (Type 3)");
		System.out.println("********************************************************");
		
		Scanner S6 =new Scanner(System.in);
 	    int press=S6.nextInt();
		
		
        if (press==1)
        {
      	  S_series();
        }
        else if(press==2)
        {
      	  A_series();
        }
        else if(press==3)
        {
      	  M_series();
        }
		
	  }
    public static void xiaomi()
	  {
		System.out.println("We have 3 series from Xiaomi");
		System.out.println("Type 1 for flageship MI series");
		System.out.println("Type 2 for midrange Redmi series");
		System.out.println("Type 3 for Gaming POCO series");
		System.out.println("********************************************************");
		Scanner S5 =new Scanner(System.in);
 	    int press=S5.nextInt();
			
        if (press==1)
        {
      	  MIseries();
        }
        else if(press==2)
        {
      	  Redmiseries();
        }
        else if(press==3)
        {
      	  Pocoseries();
        }
		 
	}
	public static void vivo()
	{
		System.out.println("Type 1 to get details of all vivo smartphones");
	}
	public static void main(String[] args) 
	{
		
	   System.out.println("Welcome to Mobile mall...");
	   System.out.println("we have different Varieties of Smartphones");
	   System.out.println("please tell us which OS you want???");
	   System.out.println("********************************************************");
	   System.out.println("Type 1 for Android");
	   System.out.println("Type 2 for IOS");
	   System.out.println("Type 3 for Windows");
	   System.out.println("********************************************************");
	   Scanner S1=new Scanner(System.in);
	   int Type=S1.nextInt();
	   
	  switch (Type)
	  {
	  case 1: System.out.println("We have Android smartphones from 4 Leading Brands");
	          System.out.println("Let me help you about Brands..");
              System.out.println("Samsung is known for its Brand Value");
              System.out.println("OnePlus is known for Best Performance");
              System.out.println("Xiaomi is known for best value for money");
              System.out.println("Vivo is known for its Camera");
              System.out.println("********************************************************");
	          System.out.println("Type 1 for Samsung");
	          System.out.println("Type 2 for Oneplus");
	          System.out.println("Type 3 for Xiaomi");
	          System.out.println("Type 4 for Vivo");
	          System.out.println("********************************************************");
	          Scanner S2=new Scanner(System.in);
	   	      int press=S2.nextInt();
	          
	          if (press==1)
	          {
	        	  samsung();
	          }
	          else if(press==2)
	          {
	        	  oneplus();
	          }
	          else if(press==3)
	          {
	        	  xiaomi();
	          }
	          else if(press==4)
	          {
	        	  Vivo();
	          }
	          else
	          {  
	        	  System.out.println("Choose again...");
	          }
	          break;
	          
	  case 2:   System.out.println("ohh...nice !! You are Richhhh...");  
	            System.out.println("we have 3 series of Iphones");
	            System.out.println("Type 1 for Iphone 11 Series");
	            System.out.println("Type 2 for Iphone 12 series");
	            System.out.println("Type 3 for latest 13 series");
	            System.out.println("********************************************************");
	            Scanner S3=new Scanner(System.in);
		   	    int click=S3.nextInt();
	            
		        if (click==1)
		        {
		        	  iphone11();
		        } 
		        else if(click==2)
		          {
		        	  iphone12();
		          }
		        else if(click==3)
		          {
		        	  iphone13();
		          }
	            break;
	  
	  case 3:  System.out.println("I think u should not select windows as it losts Update support from Microsoft..");
               System.out.println("But if u want different experiance then confirm by Typing 1 ");
               System.out.println("Else Type 2 For Main Menu");
               Scanner S6=new Scanner(System.in);
 	           int Ty=S6.nextInt();
      
               if (Ty==1)
              {
             	 System.out.println("We have only Windows mobiles from Nokia");
             	 Nokia();
              } 
              else if(Ty==2)
              {
      	        main(args);  
              }
              break;
	            
	  }	  
	  
	}
}