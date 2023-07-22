import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//                                                             LOGIN page using frame
class login extends Frame implements ActionListener{
	Image lg1;
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b1;
	String sg;
	login(String s){
		super (s);	    
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		l1=new Label("Username / Email-id");
		l2=new Label("password");
		l3=new Label("Mobile Number");
		b1=new Button("Ok");
		add(t1);
		add(t2);
		add(t3);
		add(l1);
		add(l2);
		add(l3);
		add(b1);
		b1.addActionListener(this);
		setLayout(null);
		l3.setBounds(500,400,600,30);
		l1.setBounds(500,500,700,30);
		l2.setBounds(500,600,800,30);
		b1.setBounds(1000,700,60,30);
		t3.setBounds(900,400,600,30);
		t1.setBounds(900,500,700,30);
		t2.setBounds(900,600,800,30);
	lg1=Toolkit.getDefaultToolkit().getImage("Untitled design (1).png");
	}
	public void actionPerformed(ActionEvent ae){
		String str=ae.getActionCommand();
		if(str.equals("Ok")){
			String n=t1.getText();
			String p=t2.getText();
			if(n.equals("Aditee")){
				if(p.equals("aditeesingh_28")){
					sg="you logged in !";
				}
				else{
					sg=" wrong password";
				}
			}
				else{
					sg="wrong username";
				}
			}
			else{
				t1.setText(" ");
				t2.setText(" ");
			}repaint();
			
			
		}
	
	public void paint(Graphics g){
		g.drawImage(lg1,10,40,this);
		Font f1=new Font("Book Antique",Font.ITALIC,60);
		g.setFont(f1);
		g.drawString("Login",900,200);
		g.drawString("Get acess to your order,wishlist and recommendations",200,300);
		g.drawString(""+sg,10,10);
	}
}


//                                                                               APPLIANCES page using frame
class appliances extends Frame implements ItemListener{
	Image a1,a2,a3,a4,a5,a6,a7,a8,a9;
	Checkbox ca1,ca2,ca3,ca4,ca5,ca6,ca7,ca8,ca9;
	appliances(String s){
		super(s);
		a1=Toolkit.getDefaultToolkit().getImage("Untitled design (1).png");
		a2=Toolkit.getDefaultToolkit().getImage("Untitled design (69).png");
		a3=Toolkit.getDefaultToolkit().getImage("Untitled design (71).png");
		a4=Toolkit.getDefaultToolkit().getImage("Untitled design (72).png");
		a5=Toolkit.getDefaultToolkit().getImage("Untitled design (73).png");
		a6=Toolkit.getDefaultToolkit().getImage("Untitled design (74).png");
		a7=Toolkit.getDefaultToolkit().getImage("Untitled design (75).png");
		a8=Toolkit.getDefaultToolkit().getImage("Untitled design (76).png");
		a9=Toolkit.getDefaultToolkit().getImage("Untitled design (77).png");
		ca1=new Checkbox("Buy Now");
		add(ca1);
		ca2=new Checkbox("Buy Now");
		add(ca2);
		ca3=new Checkbox("Buy Now");
		add(ca3);
		ca4=new Checkbox("Buy Now");
		add(ca4);
		ca5=new Checkbox("Buy Now");
		add(ca5);
		ca6=new Checkbox("Buy Now");
		add(ca6);
		ca7=new Checkbox("Buy Now");
		add(ca7);
		ca8=new Checkbox("Buy Now");
		add(ca8);
		ca9=new Checkbox("Bill");
		add(ca9);
		setLayout(null);
		ca1.setBounds(480,520,120,20);
		ca2.setBounds(960,520,120,20);
		ca3.setBounds(1100,500,120,20);
		ca4.setBounds(1740,510,120,20);
		ca5.setBounds(420,910,120,20);
		ca6.setBounds(840,900,120,20);
		ca7.setBounds(1380,920,120,20);
		ca8.setBounds(1500,900,120,20);
		ca9.setBounds(1600,50,110,40);
		ca1.addItemListener(this);
		ca2.addItemListener(this);
		ca3.addItemListener(this);
		ca4.addItemListener(this);
		ca5.addItemListener(this);
		ca6.addItemListener(this);
		ca7.addItemListener(this);
		ca8.addItemListener(this);
		ca9.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawImage(a1,10,40,this);
		g.drawImage(a2,200,180,this);
		g.drawImage(a3,620,180,this);
		g.drawImage(a4,1000,180,this);
		g.drawImage(a5,1400,180,this);
		g.drawImage(a6,160,580,this);
		g.drawImage(a7,620,580,this);
		g.drawImage(a8,1000,580,this);
		g.drawImage(a9,1400,580,this);
		Font f2=new Font("Book Antique",Font.BOLD,60);
		g.setFont(f2);
		g.drawString("Upto 75% off",800,100);
		g.drawString("Best of Technology",300,200);
		Font f1=new Font("Book Antique",Font.PLAIN,30);
		g.setFont(f1);
		
		g.drawString("On tv & Appliances",850,160);
		g.drawString("Next-gen of Tech for a Smarter Home",900,220);
		Font f4=new Font("Book Antique",Font.BOLD,16);
		g.setFont(f4);
g.drawString("Hisense 139 cm (55 inch) Ultra HD (4K) ",240,480);
g.drawString("CARRIER 0.8 Ton 3 Star Split Inverter ",680,480);	
g.drawString("SAMSUNG 7 kg 3 star Fully Automatic ",1080,480);
g.drawString("KENT Ace 8 L RO + UV + UF + ",1500,480);
g.drawString("LG 1.5 Ton 5 Star Window Dual Inverter AC",200,880);
g.drawString("Atomberg Efficio 5 star BEE Rated 5 Star ",680,880);
g.drawString("SAMSUNG 253 L Frost Free Double Door 3 Star ",1100,900);
g.drawString("Butterfly Rapid - 4J / Rapid 750 W ",1500,880);
Font f3=new Font("Book Antique",Font.PLAIN,16);
		g.setFont(f3);
		g.drawString("LED Smart Google TV with Built-in JBL Soundbar,",200,500);
		g.drawString("25W Subwoofer and HRR 120 Hz Mode (55A7K)  (55A7K)",200,520);
		g.drawString("Cold Catalyst Filter with Auto cleanser(2023 Model) ",680,500);
		g.drawString("AC - White  (CAI09ER3R33F0, Copper Condenser)",680,520);
		g.drawString("Top Load Washing Machine Silver  (WA70A4002GS/TL)",1080,500);
		g.drawString("TDS Water Purifier with Mineral ROTM Technology,",1500,500);
		g.drawString("In-tank UV Disinfection  (White)",1500,520);
		g.drawString("- White  (RW-Q18WUZA, Copper Condenser)",200,900);
		g.drawString("1200 mm BLDC Motor with Remote 3 Blade Ceiling Fan ",680,900);
		g.drawString("Brown, Pack of 1)",680,920);
		g.drawString("Refrigerator  (Elegant Inox, RT28A3453S8/HL)",1100,920);
		g.drawString("Juicer Mixer Grinder (4 Jars, Black)",1500,900);
		Font f5=new Font("Book Antique",Font.BOLD,16);
		g.setFont(f5);
		g.drawString("Rs.37,990/-  M.R.P-69,990  (45% off)",200,540);
		g.drawString("Rs.26,499/-  M.R.P-55,690  (52% off)",680,540);
		g.drawString("Rs.15,790/-  M.R.P-19,800  (20% off)",1080,540);
		g.drawString("Rs.13,999/-  M.R.P-19,500  (28% off)",1500,540);
		g.drawString("Rs.40,989/-  M.R.P-71,999  (43% off)",200,940);
		g.drawString("Rs.3,400/-   M.R.P-5,140   (34% off)",680,940);
		g.drawString("Rs.24,990/-  M.R.P-31,990  (21% off)",1100,940);
		g.drawString("Rs.2,999/-   M.R.P-5,499   (45% off)",1500,940);
		int t=0;
		if((ca1.getState())==true){
	t=t+37990;
	}
if((ca2.getState())==true){
	t=t+26499;
}
if((ca3.getState())==true){
	t=t+15790;
}
if((ca4.getState())==true){
	t=t+13999;
}
if((ca5.getState())==true){
	t=t+40989;
}
if((ca6.getState())==true){
	t=t+3400;
}
if((ca7.getState())==true){
	t=t+24990;
}
if((ca8.getState())==true){
	t=t+2999;
}

if((ca9.getState())==true){
g.drawString("Total Bill is :"+t,1700,150);
} 
	
		}
	
}
//                                                                             FASHION page using frame
class fashion extends Frame implements ItemListener{
	Image f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12;
	Checkbox cf1,cf2,cf3,cf4,cf5,cf6,cf7,cf8,cf9;
	fashion(String s){
		super(s);
		f1=Toolkit.getDefaultToolkit().getImage("Untitled design (1).png");
		f2=Toolkit.getDefaultToolkit().getImage("Untitled design (51).png");
		f3=Toolkit.getDefaultToolkit().getImage("Untitled design (52).png");
		f4=Toolkit.getDefaultToolkit().getImage("Untitled design (53).png");
		f5=Toolkit.getDefaultToolkit().getImage("Untitled design (59).png");
		f6=Toolkit.getDefaultToolkit().getImage("Untitled design (61).png");
		f7=Toolkit.getDefaultToolkit().getImage("Untitled design (62).png");
		f8=Toolkit.getDefaultToolkit().getImage("Untitled design (63).png");
		f9=Toolkit.getDefaultToolkit().getImage("Untitled design (64).png");
		f10=Toolkit.getDefaultToolkit().getImage("Untitled design (65).png");
		f11=Toolkit.getDefaultToolkit().getImage("Untitled design (66).png");
		f12=Toolkit.getDefaultToolkit().getImage("Untitled design (67).png");
		cf1=new Checkbox("Buy Now");
		add(cf1);
		cf2=new Checkbox("Buy Now");
		add(cf2);
		cf3=new Checkbox("Buy Now");
		add(cf3);
		cf4=new Checkbox("Buy Now");
		add(cf4);
		cf5=new Checkbox("Buy Now");
		add(cf5);
		cf6=new Checkbox("Buy Now");
		add(cf6);
		cf7=new Checkbox("Buy Now");
		add(cf7);
		cf8=new Checkbox("Buy Now");
		add(cf8);
		cf9=new Checkbox("Bill");
		add(cf9);
		setLayout(null);
		cf1.setBounds(340,620,120,20);
		cf2.setBounds(640,620,120,20);
		cf3.setBounds(1100,620,120,20);
		cf4.setBounds(1620,620,120,20);
		cf5.setBounds(420,940,120,20);
		cf6.setBounds(740,940,120,20);
		cf7.setBounds(1320,940,120,20);
		cf8.setBounds(1500,940,120,20);
		cf9.setBounds(1600,50,110,40);
		cf1.addItemListener(this);
		cf2.addItemListener(this);
		cf3.addItemListener(this);
		cf4.addItemListener(this);
		cf5.addItemListener(this);
		cf6.addItemListener(this);
		cf7.addItemListener(this);
		cf8.addItemListener(this);
		cf9.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		
		repaint();
	}
	public void paint(Graphics g){
		g.drawImage(f1,10,40,this);
		g.drawImage(f2,300,25,this);
		g.drawImage(f3,700,25,this);
		g.drawImage(f4,1100,25,this);
		g.drawImage(f5,100,280,this);
		g.drawImage(f6,600,260,this);
		g.drawImage(f7,1000,260,this);
		g.drawImage(f8,1400,260,this);
		g.drawImage(f9,100,620,this);
		g.drawImage(f10,600,620,this);
		g.drawImage(f11,1000,620,this);
		g.drawImage(f12,1400,620,this);
		Font f2=new Font("Book Antique",Font.BOLD,60);
		g.setFont(f2);
		g.drawString("Blockbuster deals On Shop.ad",500,100);
		Font f4=new Font("Book Antique",Font.BOLD,16);
		g.setFont(f4);
g.drawString("BIBA Women's Red Flared Cotton,",200,580);		
g.drawString(" Viscose Printed Kurta",210,600);
g.drawString("RAJMANDIRFABRICS",640,580);
g.drawString("Arrow Men Bandhgala Vest Coat",1100,580);
g.drawString("Amazon Brand - Anarva Men's,",1480,580);
g.drawString("Cotton Blend Striped Kurta Pyjama Set",1480,600);
g.drawString("Naughty Ninos",240,940);
g.drawString("T2F",620,940);
g.drawString("Kuchipoo",1200,940);
g.drawString("Gas Kids Boys White Micro Print Polo T-Shirt",1500,940);
Font f3=new Font("Book Antique",Font.PLAIN,16);
		g.setFont(f3);
		g.drawString("Material: cotton with three quarter sleeve",200,620);
		g.drawString("Fit Type: Regular",200,640);
		g.drawString("Women's Cotton Embroidered Kurta Pant & Dupatta Set",620,600);
		g.drawString("Care Instructions: Dry Clean Only",1100,600);
		g.drawString("Fit Type: Tailored Fit",1100,620);
		g.drawString("Care Instructions: Machine Wash",1480,620);
		g.drawString("Fit Type: Regular",1480,640);
		g.drawString("Girl Knee Length Dress",240,960);
		g.drawString("Girls T-Shirt",600,960);
		g.drawString("Boys Regular Fit Cotton T-Shirts",1080,960);
		g.drawString("Fit Type: Slim Fit",1500,960);
		Font f5=new Font("Book Antique",Font.BOLD,16);
		g.setFont(f5);
		g.drawString("Rs.792/-  M.R.P-3,299  (76% off)",200,660);
		g.drawString("Rs.1,699/- M.R.P-4,459  (62% off)",640,660);
		g.drawString("Rs.1,749/- M.R.P-3,499   (50% off)",1100,660);
		g.drawString("Rs.1,249/- M.R.P-3,000   (58% off)",1480,660);
		g.drawString("Rs.589/-   M.R.P-1,499   (61% off)",240,980);
		g.drawString("Rs.629/-   M.R.P-1,800    (65% off)",600,980);
		g.drawString("Rs.551/-   M.R.P-1,899    (71% off)",1080,980);
		g.drawString("Rs.749/-   M.R.P-1,499   (50% off)",1500,980);
		int t=0;
		if((cf1.getState())==true){
	t=t+729;
	}
if((cf2.getState())==true){
	t=t+1699;
}
if((cf3.getState())==true){
	t=t+1749;
}
if((cf4.getState())==true){
	t=t+1249;
}
if((cf5.getState())==true){
	t=t+589;
}
if((cf6.getState())==true){
	t=t+629;
}
if((cf7.getState())==true){
	t=t+551;
}
if((cf8.getState())==true){
	t=t+749;
}

if((cf9.getState())==true){
g.drawString("Total Bill is :"+t,1700,150);
} 
	}
}
//                                                                            MOBILE page using frame
class mobiles extends Frame implements ItemListener{
	Image m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14;
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11;
	
	mobiles(String s){
		super(s);
		
		m1=Toolkit.getDefaultToolkit().getImage("Untitled design (1).png");
		m2=Toolkit.getDefaultToolkit().getImage("Untitled design (38).png");
		m3=Toolkit.getDefaultToolkit().getImage("Untitled design (39).png");
		m4=Toolkit.getDefaultToolkit().getImage("Untitled design (40).png");
		m5=Toolkit.getDefaultToolkit().getImage("Untitled design (41).png");
		m6=Toolkit.getDefaultToolkit().getImage("Untitled design (42).png");
		m7=Toolkit.getDefaultToolkit().getImage("Untitled design (43).png");
		m8=Toolkit.getDefaultToolkit().getImage("Untitled design (44).png");
		m9=Toolkit.getDefaultToolkit().getImage("Untitled design (45).png");
		m10=Toolkit.getDefaultToolkit().getImage("Untitled design (46).png");
		m11=Toolkit.getDefaultToolkit().getImage("Untitled design (47).png");
		m12=Toolkit.getDefaultToolkit().getImage("Untitled design (48).png");
		m13=Toolkit.getDefaultToolkit().getImage("Untitled design (49).png");
		m14=Toolkit.getDefaultToolkit().getImage("Untitled design (50).png");
		c1=new Checkbox("Buy Now");
		add(c1);
		c2=new Checkbox("Buy Now");
		add(c2);
		c3=new Checkbox("Buy Now");
		add(c3);
		c4=new Checkbox("Buy Now");
		add(c4);
		c5=new Checkbox("Buy Now");
		add(c5);
		c6=new Checkbox("Buy Now");
		add(c6);
		c7=new Checkbox("Buy Now");
		add(c7);
		c8=new Checkbox("Buy Now");
		add(c8);
		c9=new Checkbox("Buy Now");
		add(c9);
		c10=new Checkbox("Buy Now");
		add(c10);
		 c11=new Checkbox("Bill");
		add(c11);
		setLayout(null);
		c1.setBounds(220,550,120,20);
		c2.setBounds(580,550,120,20);
		c3.setBounds(1000,560,120,20);
		c4.setBounds(1380,560,120,20);
		c5.setBounds(1750,560,120,20);
		c6.setBounds(220,920,120,20);
		c7.setBounds(580,920,120,20);
		c8.setBounds(1000,920,120,20);
		c9.setBounds(1380,920,120,20);
		c10.setBounds(1750,920,120,20);
		c11.setBounds(1600,50,110,40);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
		c6.addItemListener(this);
		c7.addItemListener(this);
		c8.addItemListener(this);
		c9.addItemListener(this);
	    c10.addItemListener(this);
		c11.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		
		repaint();
	}
	public void paint(Graphics g){
		g.drawImage(m1,10,40,this);
		g.drawImage(m2,300,15,this);
		g.drawImage(m3,700,15,this);
		g.drawImage(m4,1100,15,this);
		g.drawImage(m5,50,250,this);
		g.drawImage(m6,400,250,this);
		g.drawImage(m7,800,250,this);
		g.drawImage(m8,1200,250,this);
		g.drawImage(m9,1550,250,this);
		g.drawImage(m10,50,620,this);
		g.drawImage(m11,400,620,this);
		g.drawImage(m12,800,620,this);
		g.drawImage(m13,1200,620,this);
		g.drawImage(m14,1550,620,this);
		Font f2=new Font("Book Antique",Font.BOLD,60);
		g.setFont(f2);
g.drawString("Top Reasons To Buy From From Shop.ad",400,100);	
Font f1=new Font("Book Antique",Font.PLAIN,30);
		g.setFont(f1);
g.drawString("Bestselling midrange smartphones",100,260);
g.drawString("Bestselling affordable smartphones",100,600);
int t=0;
String msg="you selected...";
if((c1.getState())==true){
	t=t+19999;
	}
if((c2.getState())==true){
	t=t+12490;

if((c3.getState())==true){
	t=t+10999;
}
if((c4.getState())==true){
	t=t+17449;
}
if((c5.getState())==true){
	t=t+17499;
}
if((c6.getState())==true){
	t=t+8999;
}
if((c7.getState())==true){
	t=t+7799;
}
if((c8.getState())==true){
	t=t+5699;
}
if((c9.getState())==true){
	t=t+9699;
}
if((c10.getState())==true){
	t=t+7499;
}
if((c11.getState())==true){
g.drawString("Total Bill is :"+t,1600,150);
} 
	}
}}
//                                                                               GROCERY page using frame
class grocery extends Frame implements ItemListener{
	
	Image g1,g2,g3,g4,g5,g6,g7,g8,g9;
	Checkbox cg1,cg2,cg3,cg4,cg5,cg6,cg7,cg8,cg9;
	grocery(String s){
		super(s);
		g1=Toolkit.getDefaultToolkit().getImage("Untitled design (1).png");
		g2=Toolkit.getDefaultToolkit().getImage("Untitled design (30).png");
		g3=Toolkit.getDefaultToolkit().getImage("Untitled design (31).png");
		g4=Toolkit.getDefaultToolkit().getImage("Untitled design (32).png");
		g5=Toolkit.getDefaultToolkit().getImage("Untitled design (33).png");
		g6=Toolkit.getDefaultToolkit().getImage("Untitled design (34).png");
		g7=Toolkit.getDefaultToolkit().getImage("Untitled design (35).png");
		g8=Toolkit.getDefaultToolkit().getImage("Untitled design (36).png");
		g9=Toolkit.getDefaultToolkit().getImage("Untitled design (37).png");
		cg1=new Checkbox("Buy Now");
		add(cg1);
		cg2=new Checkbox("Buy Now");
		add(cg2);
		cg3=new Checkbox("Buy Now");
		add(cg3);
		cg4=new Checkbox("Buy Now");
		add(cg4);
		cg5=new Checkbox("Buy Now");
		add(cg5);
		cg6=new Checkbox("Buy Now");
		add(cg6);
		cg7=new Checkbox("Buy Now");
		add(cg7);
		cg8=new Checkbox("Buy Now");
		add(cg8);
		cg9=new Checkbox("Bill");
		add(cg9);
		setLayout(null);
		cg1.setBounds(260,530,120,20);
		cg2.setBounds(800,550,120,20);
		cg3.setBounds(1300,550,120,20);
		cg7.setBounds(1560,550,120,20);
		cg4.setBounds(260,920,120,20);
		cg5.setBounds(560,920,120,20);
		cg6.setBounds(1050,920,120,20);
		cg8.setBounds(1500,920,120,20);
		cg9.setBounds(1700,50,110,40);
		cg1.addItemListener(this);
		cg2.addItemListener(this);
		cg3.addItemListener(this);
		cg4.addItemListener(this);
		cg5.addItemListener(this);
		cg6.addItemListener(this);
		cg7.addItemListener(this);
		cg8.addItemListener(this);
		cg9.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		
		repaint();
	}
	public void paint(Graphics g){
		g.drawImage(g1,10,40,this);
		g.drawImage(g2,100,200,this);
		g.drawImage(g3,500,180,this);
		g.drawImage(g4,1000,200,this);
		g.drawImage(g5,1450,200,this);
		g.drawImage(g6,100,580,this);
		g.drawImage(g7,500,580,this);
		g.drawImage(g8,1000,580,this);
		g.drawImage(g9,1400,580,this);
		Font f2=new Font("Book Antique",Font.BOLD,60);
		g.setFont(f2);
g.drawString("Up To 30% Off | Household Supplies",600,100);	
Font f1=new Font("Book Antique",Font.ITALIC,50);
		g.setFont(f1);
g.drawString("Food Essential Offer Zone",800,200);	
Font f4=new Font("Book Antique",Font.BOLD,16);
		g.setFont(f4);
g.drawString("Ariel Matic Liquid Detergent ",220,500);		
	g.drawString("VIM Fresh Lemon Fragrance Dishwash Liquid Gel 1.8 L,",560,500);
	g.drawString("Odonil Bathroom Air Freshener  ",1100,500);
	g.drawString("Harpic Disinfectant Toilet Cleaner Liquid, ",1500,500);
	g.drawString("Maaza Mango Drink, Original Flavour,",210,890);
	g.drawString("Lay's American Style Cream and Onion Chips",560,890);
	g.drawString("Unique Aashirvaad Shudh Chakki Atta,",1050,890);
	g.drawString("HORLICKS Chocolate Delight Flavor  ",1480,890);
	Font f3=new Font("Book Antique",Font.PLAIN,16);
		g.setFont(f3);
		g.drawString("Top Load Refill Pouch, 2 Litre",220,520);
		g.drawString("Leaves No Residue,", 560,520);
		g.drawString("Grease Cleaner For All Utensils -Liquid Kitchen Soap,",560,540);
		g.drawString(" (VIMJ1R5)",560,560);
		g.drawString(" Blocks Mixed Fragrances - 192g (48g*4)",1100,520);
		g.drawString("| Mixed Fragrances: Jamine, Lavender, Orchid, Rose",1100,540);
		g.drawString("| Long Lasting Fragrance",1100,560);
		g.drawString("Original - 1 Litre (Pack of 2) ",1500,520);
		g.drawString("| Thick Toilet Cleaning Acid Suitable for Toilet Bowls",1500,540);
		g.drawString(" 1.2 L PET Bottle",210,910);
		g.drawString(" (10 g Extra in Pack)  (40 g)",560,910);
		g.drawString(" 5kg Unique",1050,910);
		g.drawString("(1 kg)",1480,910);
		Font f5=new Font("Book Antique",Font.BOLD,16);
		g.setFont(f5);
		g.drawString("Rs.352/-  M.R.P-390    (176.30/L)",220,580);
		g.drawString("Rs.470/-   M.R.P-500   (261.11/L)",560,580);
		g.drawString("Rs.172/-   M.R.P-192   (103.29/100gm)",1100,580);
		g.drawString("Rs.389/-   M.R.P-390   (194.50/L)",1500,580);
		g.drawString("Rs.58/-    M.R.P-75    (22% Off)",210,950);
		g.drawString("Rs.18/-    M.R.P-20    (10% Off)",560,950);
		g.drawString("Rs.240/-   M.R.P-258   (7% Off)",1050,950);
		g.drawString("Rs.314/-   M.R.P-499    (37% Off)",1480,950);
		int t=0;
		if((cg1.getState())==true){
	t=t+352;
	}
if((cg2.getState())==true){
	t=t+470;

if((cg3.getState())==true){
	t=t+172;
}
if((cg4.getState())==true){
	t=t+389;
}
if((cg5.getState())==true){
	t=t+58;
}
if((cg6.getState())==true){
	t=t+18;
}
if((cg7.getState())==true){
	t=t+240;
}
if((cg8.getState())==true){
	t=t+314;
}

if((cg9.getState())==true){
g.drawString("Total Bill is :"+t,1700,150);
} 
}
}
} 
//                                                                          BEAUTY page using frame
class beauty extends Frame implements ItemListener{
	Image b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9;
	beauty(String s){
		super(s);
		b1=Toolkit.getDefaultToolkit().getImage("Untitled design (1).png");
		b2=Toolkit.getDefaultToolkit().getImage("Untitled design (21).png");
		b3=Toolkit.getDefaultToolkit().getImage("Untitled design (22).png");
		b4=Toolkit.getDefaultToolkit().getImage("Untitled design (23).png");
		b5=Toolkit.getDefaultToolkit().getImage("Untitled design (24).png");
		b6=Toolkit.getDefaultToolkit().getImage("Untitled design (25).png");
		b7=Toolkit.getDefaultToolkit().getImage("Untitled design (26).png");
		b8=Toolkit.getDefaultToolkit().getImage("Untitled design (28).png");
		b9=Toolkit.getDefaultToolkit().getImage("Untitled design (29).png");
		cb1=new Checkbox("Buy Now");
		cb2=new Checkbox("Buy Now");
		cb3=new Checkbox("Buy Now");
		cb4=new Checkbox("Buy Now");
		cb5=new Checkbox("Buy Now");
		cb6=new Checkbox("Buy Now");
		cb7=new Checkbox("Buy Now");
		cb8=new Checkbox("Buy Now");
		cb9=new Checkbox("Bill");
		
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		add(cb6);
		add(cb7);
		add(cb8);
		add(cb9);
		setLayout(null);
		cb1.setBounds(360,610,120,20);
		cb2.setBounds(660,590,120,20);
		cb3.setBounds(1060,590,120,20);
		cb4.setBounds(1700,610,120,20);
		cb5.setBounds(360,950,120,20);
		cb6.setBounds(660,980,120,20);
		cb7.setBounds(1060,980,120,20);
		cb8.setBounds(1700,980,120,20);
		cb9.setBounds(1700,50,110,40);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		cb6.addItemListener(this);
		cb7.addItemListener(this);
		cb8.addItemListener(this);
		cb9.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie){
		
		repaint();
	}
	

	public void paint(Graphics g){
		g.drawImage(b1,10,40,this);
		g.drawImage(b2,100,200,this);
		g.drawImage(b3,500,200,this);
		g.drawImage(b4,900,200,this);
		g.drawImage(b5,1400,200,this);
		g.drawImage(b6,100,600,this);
		g.drawImage(b7,550,600,this);
		g.drawImage(b8,910,590,this);
		g.drawImage(b9,1400,600,this);
		Font f2=new Font("Book Antique",Font.BOLD,60);
		g.setFont(f2);
		g.drawString("Deals On Makeup And Nails",600,100); 
		Font f1=new Font("Book Antique",Font.ITALIC,50);
		g.setFont(f1);
		g.drawString("Upto 70% Off",860,200);
		Font f4=new Font("Book Antique",Font.BOLD,16);
		g.setFont(f4);
		
g.drawString("LAKME ,Eyeconic Insta Cool Kajal",80,520);
g.drawString("Maybelline New York Oli Control Powder",600,520);
g.drawString("Lakme 9 to 5 CC Cream, ",1000,520);
g.drawString("Just Herbs Ayurvedic Creamy Matte Lipstick for Women, ",1400,520);
g.drawString("Avimee Herbal Keshpallav Hair Oil For Men And Women |",80,900);
g.drawString("Fiama Gel Bar Celebration Pack ",600,890);
g.drawString("Nivea Body Lotion ",1080,900);
g.drawString("RENEE Premium Unisex Perfume ",1500,890);
Font f3=new Font("Book Antique",Font.PLAIN,16);
		g.setFont(f3);

g.drawString("Cooling Kohl Liner with Cucumber,",80,540);
g.drawString("Twist Up Pencil - Waterproof, Smudge Proof & Long Lasting Eye",80,560);
g.drawString("Black, Makeup, Glossy Finish 0.35 g",80,580);
g.drawString(", With SPF to Protect Skin from Sun,",600,540);
g.drawString("Absorbs Oil, Fit Me, 128 Warm Nude, 6g",600,560);
g.drawString("01 - Beige, Light Face Makeup with Natural Coverage,",1000,540);
g.drawString(" SPF 30 - Tinted Moisturizer to Brighten Skin,",1000,560);
g.drawString(" Conceal Dark Spots, 30 g",1000,580);
g.drawString("Lip Hydrating & Moisturizing, Suitable For All Indian Tones 38gm ",1400,540);
g.drawString("(Pack of 16)",1400,560);
g.drawString(" Reduces Hair Fall & Dandruff | Promotes Hair Growth | 100 Ml",80,920);
g.drawString(" Promotes Hair Growth | 100 Ml",80,940);
g.drawString("With 5 unique Gel Bars & ",600,910);
g.drawString("Skin Conditioners For Moisturized Skin, ",600,930);
g.drawString("125g Soap (Buy 4 Get 1 Free)",600,950);
g.drawString("For Very Dry Skin,",1000,920);
g.drawString("Nourishing Body Milk With 2X Almond Oil For 48H Moisturization,",1000,940);
g.drawString(" For Men & Women, 400ml",1000,960);
g.drawString("Gift Set Pack Of 4 Eau De Parfum |",1480,910);
g.drawString(" 15ml Travel-Size Bottles, On-the-Go Luxury Aroma",1480,930);
g.drawString("| Long Lasting Scent of Floral, Fruity & Spicy Notes|",1480,950);
g.drawString("Signature Perfume Combo Set for Couples, Gifting",1480,970);

Font f5=new Font("Book Antique",Font.BOLD,16);
		g.setFont(f5);
		g.drawString("GEL",80,600);
		g.drawString("Rs.137/-   M.R.P-147  (43% Off)",80,620);
		g.drawString("Rs.194/-  M.R.P-259    (25% Off)",600,620);
		g.drawString("Rs.190/- (100 gm) M.R.P-299  (36% Off)",1000,620);
		g.drawString("Rs.345/-  M.R.P-575   (40% Off)",1400,620);
		g.drawString("Rs.518/-   M.R.P-650   (20% Off)",80,960);
		g.drawString("Rs.273/- (100 gm)  M.R.P-364    (25% Off)",600,970);
		g.drawString("Rs.344/-  (100 ml) M.R.P-245    (19% Off)",1000,980);
		g.drawString("Rs.549/-   M.R.P-999   (45% Off)",1450,990);
		int t=0;
		if((cb1.getState())==true){
	t=t+137;
	}
if((cb2.getState())==true){
	t=t+194;
}
if((cb3.getState())==true){
	t=t+190;
}
if((cb4.getState())==true){
	t=t+345;
}
if((cb5.getState())==true){
	t=t+518;
}
if((cb6.getState())==true){
	t=t+273;
}
if((cb7.getState())==true){
	t=t+344;
}
if((cb8.getState())==true){
	t=t+549;
}

if((cb9.getState())==true){
g.drawString("Total Bill is :"+t,1700,150);
} 
	}
}

//                                                            HOME  page using frame 
class fr extends Frame implements WindowListener,ActionListener{
	beauty b;
	grocery g;
	mobiles m;
	login lg;
	fashion f;
	appliances ap;
	
	String msg="";
	int x;
	Label l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	Button b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	TextField di;
	Image i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18;
	fr(String s){
		super(s);
		addWindowListener(this);
		b=new beauty("welcome to skin care portal");
	b.setSize(3000,1000);
		g=new grocery("welcome to grocery portal");
		g.setSize(3000,1000);
		m=new mobiles("welcome to mobiles portal");
		m.setSize(3000,1000);
		f=new fashion("welcome to fashion portal");
		f.setSize(3000,1000);
		ap=new appliances("welcome to appliances portal");
		ap.setSize(3000,1000);
		
		lg=new login("login");
		lg.setSize(3000,1000);
		l=new Label("Dilver to ");
		l1=new Label("Appel iPads");
		l2=new Label("Shop now !");
		l3=new Label("Intax Cameras");
		l4=new Label("Shop Now !");
		l5=new Label("Monitors");
		l6=new Label("Shop Now !");
		l7=new Label("Artificals Plants");
		l8=new Label("Shop Now !");
		l9=new Label("Men's Wear");
		l10=new Label("Shop Now!");
		l11=new Label("Women's Wear");
		l12=new Label("Shop Now!");
		l13=new Label("Kid's Wear");
		l14=new Label("Shop Now!");
		l15=new Label("Bags,Trolleys,Luggage");
		l16=new Label("Shop Now!");
		b2=new Button("Skin Care");
		b3=new Button("Grocery");
		b4=new Button("Mobiles");
		b5=new Button("Fashion");
		b6=new Button("Appliances");
		
		b10=new Button("Login");
		di=new TextField(10);
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(l12);
		add(l13);
		add(l14);
		add(l15);
		add(l16);
		add(b2);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b10.addActionListener(this);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
		add(di);
		add(b10);
		setLayout(null);
		l.setBounds(100,50,50,40);
		l1.setBounds(400,620,90,40);
		l2.setBounds(400,650,90,40);
		l3.setBounds(800,620,90,40);
		l4.setBounds(800,650,90,40);
		l5.setBounds(1200,620,90,40);
		l6.setBounds(1200,650,90,40);
		l7.setBounds(1600,620,90,40);
		l8.setBounds(1600,650,90,40);
		l9.setBounds(500,930,90,40);
		l10.setBounds(500,960,90,40);
		l11.setBounds(980,930,90,40);
		l12.setBounds(980,960,90,40);
		l13.setBounds(1400,930,90,40);
		l14.setBounds(1400,960,90,40);
		l15.setBounds(1700,930,150,40);
		l16.setBounds(1730,960,90,40);
		b2.setBounds(400,250,110,40);
		b3.setBounds(700,250,110,40);
		b4.setBounds(950,250,110,40);
		b5.setBounds(1200,250,110,40);
		b6.setBounds(1500,250,110,40);
		
		b10.setBounds(1000,50,110,40);
		di.setBounds(200,50,500,50);
		
		i1=Toolkit.getDefaultToolkit().getImage("Untitled design (1).png");
		i2=Toolkit.getDefaultToolkit().getImage("Untitled design (2).png");
		i3=Toolkit.getDefaultToolkit().getImage("Untitled design (4).png");
		i4=Toolkit.getDefaultToolkit().getImage("Untitled design (5).png");
		i5=Toolkit.getDefaultToolkit().getImage("Untitled design (6).png");
		i6=Toolkit.getDefaultToolkit().getImage("Untitled design (8).png");
		
		i10=Toolkit.getDefaultToolkit().getImage("Untitled design (12).png");
		i11=Toolkit.getDefaultToolkit().getImage("Untitled design (13).png");
		i12=Toolkit.getDefaultToolkit().getImage("Untitled design (14).png");
		i13=Toolkit.getDefaultToolkit().getImage("Untitled design (16).png");
		i14=Toolkit.getDefaultToolkit().getImage("Untitled design (17).png");
		i15=Toolkit.getDefaultToolkit().getImage("Untitled design (18).png");
		i16=Toolkit.getDefaultToolkit().getImage("Untitled design (19).png");
		i17=Toolkit.getDefaultToolkit().getImage("Untitled design (20).png");
		i18=Toolkit.getDefaultToolkit().getImage("Untitled design (55).png");
	}
	public void actionPerformed(ActionEvent ae){
	String  s1=ae.getActionCommand();
		
		 if(s1.equals("Skin Care")){
		b.setVisible(true);
		}
		 
		
		 else if(s1.equals("Grocery")){
			g.setVisible(true);
		}
		
		else if(s1.equals("Mobiles")){
			m.setVisible(true);
		}
		
		if(s1.equals("Fashion")){
			f.setVisible(true);
		}
		else if(s1.equals("Appliances")){
			ap.setVisible(true);
		}
		if(s1.equals("Login")){
			lg.setVisible(true);
		}
		repaint();
	}
	public void windowClosing(WindowEvent we){
		
	}
	public void windowActivated(WindowEvent we){

		setBackground(Color.WHITE);
	}
	public void windowDeactivated(WindowEvent we){
		setBackground(Color.GREEN);
	}
	public void windowOpened(WindowEvent we){
		
		repaint();
	}
	public void windowClosed(WindowEvent we){
		b.setVisible(false);
	}
	public void windowIconified(WindowEvent we){
		
	}
	public void windowDeiconified(WindowEvent we){}
	public void paint(Graphics g){
		g.drawImage(i1,10,40,this);
		g.drawImage(i2,400,150,this);
		g.drawImage(i3,700,150,this);
		g.drawImage(i4,950,150,this);
		g.drawImage(i5,1200,150,this);
		g.drawImage(i6,1500,150,this);
		g.drawImage(i10,200,300,this);
	    g.drawImage(i11,600,300,this);
		g.drawImage(i12,1000,300,this);
		g.drawImage(i13,1400,290,this);
		g.drawImage(i14,300,630,this);
		g.drawImage(i15,800,620,this);
		g.drawImage(i16,1200,620,this);
		g.drawImage(i17,1500,620,this);
		g.drawImage(i18,1430,0,this);
		Font f1=new Font("Arial",Font.BOLD,40);
		g.setFont(f1);
		g.drawString("Top Deals!!",30,500);
		g.drawString("Pick Up Your Style!",10,800);
		Font f2=new Font("Book Antique",Font.ITALIC,30);
		g.setFont(f2);
		g.drawString("Check Out ->",30,550);
		g.drawString("Check Out ->",30,850);
       
	}
}
//                                                APPLET main program of project
public class project extends Applet implements ActionListener{
 Image i;
   Button b1;
   fr mf;
   String msg="";
public void init(){
    setLayout(null);
	mf=new fr("welcome");
	mf.setSize(3000,1000);
	
	b1=new Button(" Shop Now");
	add(b1);
	b1.setBounds(1800,800,70,70);
	b1.addActionListener(this);
      i=getImage(getCodeBase(),"Navy Blue Minimalist Text Logo.png");

      setBackground(Color.BLACK);
}
public void actionPerformed(ActionEvent ae){
	String s=ae.getActionCommand();
	
		mf.setVisible(true);
	
	repaint();
}
 public void paint(Graphics g){
       
      g.drawImage(i,730,220,this);
    
    }
}
	