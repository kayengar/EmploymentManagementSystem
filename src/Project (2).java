
//1)Add your Home and Back buttons to Toolbar for the project to look more good..And add image to those buttons..
//  2) About us, contact as JMenuItems..Contact this particular employer for this job type...
//	3) Add one picture of you both with a thanksgiving..
// Home - jf, jf1 - Applicant's window, jf2 - Resume 1, jf3 - Employers Window, jf5 - resumes 2, jf6 - applicants inbox,jf7 -employers inbox, jf8 - Job Database

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
 class ProGUI{
 	String URL = "jdbc:mysql://localhost:3306/xid24";
	private JButton jbAddJob;

	JFrame jf,jf1,jf2,jf3,jf5,jf6,jf7,jf8;
	ImagePanel jp,jp1,jp2,jp3,jp4,jp5,jp6,jp7,jp8;
	JButton jb1,jb2,jb3,jb4,jb5,jb7,jb8,jb9;
	JButton jbNex,jbResumes,home1,home2,home3,home5,home6,home7,home8,back1,back2,back3,back5,back6,back7,back8,jbMismatch,jbRet;
	JTextField t1,t3,t5,tName,tDOB,tFath,tMoth,tContact;
	JTextArea jtaQual,jtRef;
	JPasswordField t2;
	JPasswordField t4;
    JComboBox jcb1,jcb2,jcbPost;
	JLabel jl1,jl2,jl3,jl4,jl5,jl7,jlRe,jlName,jlDOB,jlSex,jlDOBr,jlQual,jl212,jl213,jl8,jl9;
	JLabel jlFath,jlMoth,jlExp,jlRef1,lContact,jlIni,jlIni1,jlIni2,jlIni3,jlPost,jl88,jlEIn;
	JTable jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8;
	JRadioButton jrbM,jrbF,jrbN,jrbY;
	ButtonGroup bg1,bg2;
	Color white;
	JMenuBar jmb;
	JMenuItem abt,cont;
	JToolBar jtb1,jtb2,jtb3,jtb5,jtb6,jtb7,jtb8;
	//Employer:

	 private JLabel jlInf;
    private JLabel tjbtype;
    private JComboBox jcbJT;
    private JLabel jlCompany;
    private JTextField jcomp5;
    private JLabel jlpos;
    private JComboBox jcbpos;

	//Sign UP:
	 JTextField tDU;
     JPasswordField tDP;
     JLabel jlSU;
     JLabel jlDU;
     JLabel jlDP;
     JButton jbSU;

	// Inbox Applicant:

  DefaultTableModel dtm10,dm,dmJobs;
  JTable jt10,jtResumes,jtJobs;
  JScrollPane jsp10,jspRes,jspJobs;

	//Resume Page 2 components:

	 JLabel jlTotExp;
     JComboBox jcbExp;
     JLabel jlRes2;
     JLabel jlCAS;
     JLabel jlIR;
     JComboBox jcbCAS;
     JLabel jlFunAr;
     JComboBox jcbFunAr;
     JLabel jlKs;
     JTextArea jtaKs;
     JButton jbSend;
	 Connection con;
	 Statement S;
	 JTextField tSex,tExp;

	public ProGUI(){

	home1 = new JButton("HOME");
	home2 = new JButton("HOME");
	home3 = new JButton("HOME");
	home5 = new JButton("HOME");
	home6 = new JButton("HOME");
	home7 = new JButton("HOME");
	home8 = new JButton("HOME");
	back1 = new JButton("BACK");
	back2 = new JButton("BACK");
	back3 = new JButton("BACK");

	back5 = new JButton("BACK");
 	back6 = new JButton("BACK");
	back7 = new JButton("BACK");
	back8 = new JButton("BACK");
	jtb1 = new JToolBar();
	jtb2 = new JToolBar();
	jtb3 = new JToolBar();
	jtb5 = new JToolBar();
	jtb6 = new JToolBar();
	jtb7 = new JToolBar();
	jtb8 = new JToolBar();

	tSex = new JTextField(6);
	 tExp = new JTextField(6);
	// Sign Up:

	 	tDU = new JTextField (20);
        tDP = new JPasswordField (20);
        jlSU = new JLabel ("Sign Up:");
        jlDU = new JLabel ("Desired Username:");
        jlDP = new JLabel ("Desired Password:");
        jbSU = new JButton ("Sign Up");
		 

        //add components
       

        //set component bounds (only needed by Absolute Positioning)
       
	
	
		t2= new JPasswordField(20);
		t4= new JPasswordField(20);

		jf = new JFrame("Aadikari.com - Providing the best Jobs for your future.");
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setSize(800,800);
		jf.setLocation(100,100);
	
		WindowAdapter wl = new WindowAdapter(){
		public void windowClosing(WindowEvent we){
			int option = JOptionPane.showConfirmDialog(null,"Are you sure?","CONFIRMATION",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(option == JOptionPane.YES_OPTION){
					System.exit(0);
				}
		}
	};
		
			jf.addWindowListener(wl);
		
		
	
	ImagePanel jp = new ImagePanel(new ImageIcon("background-16.jpg").getImage());
	jf.add(jp);
	jf.pack();
    

		jp.add (tDU);
        jp.add (tDP);
        jp.add (jlSU);
        jp.add (jlDU);
        jp.add (jlDP);
        jp.add (jbSU);

		jp.add(jlIni1=new JLabel("We provide new jobs for different people."));
		jp.add(jlIni2=new JLabel("Our aim is to stop the procrastination for job opportunities,and develop the situation with available resources."));
		jp.add(jlIni3=new JLabel("Think different,be different and the world will applaude."));
		jf.setVisible(true);

	
	
	jp.add(jl1= new JLabel("Applicant Login:"));
	t1 = new JTextField(25);
	jp.add(t1);
	jp.add( jl2=new JLabel("Applicant Password:"));
	
	jp.add(t2);
	jb1 = new JButton("Login");
	jp.add(jb1);
	jp.add(jl3=new JLabel("Employer Login:"));
	t3 = new JTextField(25);
	jp.add(t3);
	jp.add(jl4=new JLabel("Employer Password:"));
	
	jp.add(t4);
	jb2 = new JButton("Login");
	jp.add(jb2);

	jt1 = new JTable(5,1);
	JScrollPane jsp1 = new JScrollPane(jt1);
	jp.add(jsp1);
	jt2 = new JTable(5,1);
	JScrollPane jsp2 = new JScrollPane(jt2);
	jp.add(jsp2);
	jt3 = new JTable(5,1);
	JScrollPane jsp3 = new JScrollPane(jt3);
	jp.add(jsp3);
	jt4 = new JTable(5,1);
	JScrollPane jsp4 = new JScrollPane(jt4);
	jp.add(jsp4);
	jt5 = new JTable(5,1);
	JScrollPane jsp5 = new JScrollPane(jt5);
	jp.add(jsp5);
	jt6 = new JTable(5,1);
	JScrollPane jsp6 = new JScrollPane(jt6);
	jp.add(jsp6);
	jt7 = new JTable(5,1);
	JScrollPane jsp7 = new JScrollPane(jt7);
	jp.add(jsp7);
	jt8 = new JTable(5,1);
	JScrollPane jsp8 = new JScrollPane(jt8);
	jp.add(jsp8);

	jt1.setEnabled(false);
	jt2.setEnabled(false);
	jt3.setEnabled(false);
	jt4.setEnabled(false);
	jt5.setEnabled(false);
	jt6.setEnabled(false);
	jt7.setEnabled(false);
	jt8.setEnabled(false);

	//Tables' Content:(HOME PAGE)
		jt1.setValueAt("SBI", 0, 0);
        jt1.setValueAt("Star Life Insurance", 1, 0);
        jt1.setValueAt("Speed Post", 2, 0);
        jt1.setValueAt("LIC", 3, 0);
        jt1.setValueAt("MetPlus", 4, 0);

		
		jt2.setValueAt("KIMS", 0, 0);
        jt2.setValueAt("Fevicol", 1, 0);
        jt2.setValueAt("Pepsi", 2, 0);
        jt2.setValueAt("Lotte", 3, 0);
        jt2.setValueAt("Hercules", 4, 0);

		
		jt3.setValueAt("Hyundai", 0, 0);
        jt3.setValueAt("Accord Towers", 1, 0);
        jt3.setValueAt("TVH Constructions", 2, 0);
        jt3.setValueAt("Belicia Real Estates", 3, 0);
        jt3.setValueAt("Canon", 4, 0);

		
		jt4.setValueAt("Arul Companies", 0, 0);
        jt4.setValueAt("Akshaya Homes", 1, 0);
        jt4.setValueAt("Indian Bank", 2, 0);
        jt4.setValueAt("IOB", 3, 0);
        jt4.setValueAt("Ismail Statistics", 4, 0);


		jt5.setValueAt("Raman Shippings", 0, 0);
        jt5.setValueAt("Port Trust", 1, 0);
        jt5.setValueAt("Airports Authority of India", 2, 0);
        jt5.setValueAt("Balaji Transporters", 3, 0);
        jt5.setValueAt("Diggit Exports", 4, 0);

		jt6.setValueAt("Orissa Copper Mining Corporation", 0, 0);
        jt6.setValueAt("Bihar Iron Ores", 1, 0);
        jt6.setValueAt("Port Blair Oil Exports", 2, 0);
        jt6.setValueAt("TCS", 3, 0);
        jt6.setValueAt("Electricity Board of Tamilnadu", 4, 0);


		jt8.setValueAt("HCL", 0, 0);
        jt8.setValueAt("Infosys", 1, 0);
        jt8.setValueAt("Wipro", 2, 0);
        jt8.setValueAt("CTS", 3, 0);
        jt8.setValueAt("Seimens", 4, 0);


		jt7.setValueAt("SBI", 0, 0);
        jt7.setValueAt("Star Life Insurance", 1, 0);
        jt7.setValueAt("MicroDowers", 2, 0);
        jt7.setValueAt("Reddy and Brothers", 3, 0);
        jt7.setValueAt("JedPlus", 4, 0);
		       
		
		
	//COLUMNS NAMES home page:

    TableColumn tableCol1;
    tableCol1 = jt1.getColumnModel().getColumn(0);  
    tableCol1.setHeaderValue("ACCOUNTINGS");   
	
	TableColumn tableCol2;
    tableCol2 = jt2.getColumnModel().getColumn(0);  
    tableCol2.setHeaderValue("ADVERTISEMENTS");   
	
	TableColumn tableCol3;
    tableCol3= jt3.getColumnModel().getColumn(0);  
    tableCol3.setHeaderValue("BUSINESS");   
	
	TableColumn tableCol4;
    tableCol4 = jt4.getColumnModel().getColumn(0);  
    tableCol4.setHeaderValue("COMMERCE");   
	
	TableColumn tableCol5;
    tableCol5 = jt5.getColumnModel().getColumn(0);  
    tableCol5.setHeaderValue("OVERSEAS");   
	
	TableColumn tableCol6;
    tableCol6 = jt6.getColumnModel().getColumn(0);  
    tableCol6.setHeaderValue("ENGINEERING");   
	
	TableColumn tableCol7;
    tableCol7 = jt7.getColumnModel().getColumn(0);  
    tableCol7.setHeaderValue("FINANCE");   
	
	TableColumn tableCol8;
    tableCol8 = jt8.getColumnModel().getColumn(0);  
    tableCol8.setHeaderValue("INFORMATION TECHNOLOGY");  
	
	//Applicant Window:
	
	jf1 = new JFrame("Applicant's window");
	jf1.setDefaultCloseOperation(jf1.EXIT_ON_CLOSE);
	jf1.setSize(300,300);
	
	
	jp1 = new JPanel();
	jp1 = new ImagePanel(new ImageIcon("aditi.jpg").getImage());
	jf1.add(jp1);
	jf1.pack();
    	ActionListener alHome = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == home1){
				jf.setVisible(true);
				jf1.setVisible(false);
			
				
			}
		}
	};
	home1.addActionListener(alHome);
	jtb1.add(home1);			

        String[] jcb1Items = {"Item 1", "Item 2", "Item 3"};

        //construct components
        jb3 = new JButton ("Resume");
        jb4 = new JButton ("Inbox");
        jb5 = new JButton ("Job Applied");
        jcb1 = new JComboBox (jcb1Items);
        jl7 = new JLabel ("WELCOME APPLICANT!!");
		jp1.add(jl88 = new JLabel("Reach great heights by getting your dream Job from our Database..!"));
		jl88.setBackground(white);
		
		jp1.add (jb3);
        jp1.add (jb4);
        jp1.add (jl7);

	//ToolBar and MenuBar:

	jmb = new JMenuBar();
	jf.setJMenuBar(jmb);
	abt = new JMenuItem("About us");
	jmb.add(abt);
	cont = new JMenuItem("Contact us");
	jmb.add(cont);
	
	
	
	//ActionListener FOR APPLICANTS INBOX TO OPEN: 
		ActionListener al6 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == jb4) {

				jf6 = new JFrame("Inbox");
				
				jf6.setSize(800,800);
				jp6 = new ImagePanel(new ImageIcon("background-3.jpg").getImage());
				jp6.add(jbRet = new JButton("Retrieve Vacancy Table"));
				jbRet.setBounds(20,75,150,30);
				 
				
			
				jf6.add(jp6);
				jf6.setVisible(true);
				jf1.setVisible(false);

				
	ActionListener alHome = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == home6){
				jf.setVisible(true);
				jf6.setVisible(false);
			
				
			}
		}
	};
	home6.addActionListener(alHome);
	jtb6.add(home6);			

    
    jt10 = new JTable(0,4);
	jt10.setEnabled(false);
    dtm10 = (DefaultTableModel)jt10.getModel();;
	jsp10 = new JScrollPane(jt10);
    jp6.add(jsp10);
	jsp10.setBounds(100,200,500,500);

		
	TableColumn tableCol33;
    tableCol33 = jt10.getColumnModel().getColumn(0);  
    tableCol33.setHeaderValue("Applicant");   
	
	TableColumn tableCol34;
    tableCol34 = jt10.getColumnModel().getColumn(1);  
    tableCol34.setHeaderValue("Company Name");   

	TableColumn tableCol35;
    tableCol35 = jt10.getColumnModel().getColumn(2);  
    tableCol35.setHeaderValue("JobType Avialable");   
	
	TableColumn tableCol36;
    tableCol36 = jt10.getColumnModel().getColumn(3);  
    tableCol36.setHeaderValue("Post Vacant");   

	
            ActionListener alMatch = new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(e.getSource() == jbRet){
						
						

					try{
			 			Class.forName("com.mysql.jdbc.Driver");
			 			con = DriverManager.getConnection(URL,"root","");
			   			 S = con.createStatement();
						String query = "SELECT R.NAME,J.COMPANY,J.JOBTYPE,R.POSTREQ FROM JOBS J,RESUMES R WHERE J.JOBTYPE=R.FUNAR AND J.POST = R.POSTREQ";
				ResultSet rs = S.executeQuery(query);
				int count = 0;
				while(rs.next()) {
					count++;
					dtm10.addRow(new Object[]{
						  rs.getString("NAME"),rs.getString("COMPANY"),rs.getString("JOBTYPE"),rs.getString("POSTREQ")
					});
				}
				rs.close();
				S.close();
				con.close();
			}
			catch(Exception eg){
				JOptionPane.showMessageDialog(null, eg.getMessage());

			}	
			
	      }
			
		}
	};
	
	
	jbRet.addActionListener(alMatch);
	
				}
			}
		};
	jb4.addActionListener(al6);

	//ACTION LISTENER FOR SIGN UP:

	ActionListener al1 = new ActionListener(){
		public void actionPerformed(ActionEvent e){

		if(e.getSource() == jbSU){
		try{
            Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection(URL,"root","");
			 S = con.createStatement();
			 S.executeUpdate("insert into applicants(username,passwords) values('"+tDU.getText()+"','"+(String)tDP.getText().toString()+"')");
			 }
			 catch(Exception ee){
			 JOptionPane.showMessageDialog(null,ee.getMessage());
			 }
			
			}
				
			
		}
	};
	jbSU.addActionListener(al1);
	tDU.addActionListener(al1);
	tDP.addActionListener(al1);

	//Action Listener for Login:

	ActionListener al11 = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			try{
			 	Class.forName("com.mysql.jdbc.Driver");
			 	con = DriverManager.getConnection(URL,"root","");
			    S = con.createStatement();
					if(e.getSource()==jb1){
				ResultSet rs = S.executeQuery("SELECT * FROM APPLICANTS WHERE USERNAME='"+t1.getText()+"'AND PASSWORDS='"+t2.getText()+"'");
			
			if (rs.next()) {
			
			JOptionPane.showMessageDialog(null, "WELCOME " +t1.getText());
			 
			jf1.setVisible(true);
			jf.setVisible(false);
			

			}
			else{
			JOptionPane.showMessageDialog(null, "USERNAME NOT FOUND");
			jf1.setVisible(false);
			}
        	 
         rs.close();
      }
	  }
      catch(Exception eg){
	  
         JOptionPane.showMessageDialog(null,eg.getMessage());
      }

		}
	};
	  jb1.addActionListener(al11);

	//Alignment:
		
		jp.setLayout(null); 
		jp1.setLayout(null);
	
		
		jl1.setBounds(10, 70, 120, 20);
		t1.setBounds(140, 70, 100, 20); 
		jl2.setBounds(10, 90, 120, 20); 
		t2.setBounds(140, 90, 100, 20); 
		jb1.setBounds(140, 120, 100, 20); 
		jl3.setBounds(10, 150, 100, 20); 
		t3.setBounds(140, 150, 100, 20); 
		jl4.setBounds(10, 170, 120, 20); 
		t4.setBounds(140, 170, 100, 20); 
		jb2.setBounds(140, 200, 100, 20); 
		jsp1.setBounds(140,240,100,100); 
		jsp2.setBounds(250,241,100,100);
		jsp3.setBounds(360,240,100,100);
		jsp4.setBounds(470,240,100,100);
		jsp5.setBounds(140,400,100,100); 
		jsp6.setBounds(250,401,100,100);
		jsp7.setBounds(360,400,100,100);
		jsp8.setBounds(470,400,100,100);
		

		jb3.setBounds (0, 130, 100, 20);

        jb4.setBounds (0, 90, 100, 20);
        jb5.setBounds (0, 110, 100, 25);
        jcb1.setBounds (160, 90, 100, 25);
        jl7.setBounds (10, 50, 200, 50);


//		ACTION LISTENER FOR RESUME:

		ActionListener al2 = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			////////////////////////////
			if(e.getSource()==jb3){
				jf2 = new JFrame("Resume:");
				jf2.setSize(800,800);
				
				jp2 = new ImagePanel(new ImageIcon("resumes.jpg").getImage());
	jf2.add(jp2);
	jf2.pack();
    
				
	
	ActionListener alHome = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == home2){
				jf.setVisible(true);
				jf2.setVisible(false);
			
				
			}
		}
	};
	home2.addActionListener(alHome);
	jtb2.add(home2);

				
				jf2.setVisible(true);
				jf1.setVisible(false);
		
        //construct components:
        jlRe = new JLabel ("RESUME");
        jlName = new JLabel ("NAME:");
        jlDOB = new JLabel ("DOB:");
        jlSex = new JLabel ("SEX:");
        jrbM = new JRadioButton ("Male");
        jrbF = new JRadioButton ("Female");
        tName = new JTextField (5);
        tDOB = new JTextField (10);
        jlDOBr = new JLabel ("YYYY/MM/DD");
        jlQual = new JLabel ("QUALIFICATION:");
        jtaQual = new JTextArea (5, 5);
        jlFath = new JLabel ("FATHER'S NAME:");
        tFath = new JTextField (25);
        tMoth = new JTextField (25);
        jlMoth = new JLabel ("MOTHER'S NAME:");
        jlExp = new JLabel ("EXPERIENCE:");
        jrbN = new JRadioButton ("NO");
        jrbY = new JRadioButton ("YES");
        jlRef1 = new JLabel ("REFERENCES:");
        jtRef = new JTextArea (5,5);
        jbNex = new JButton ("Next Page");
		bg1 = new ButtonGroup();
		bg2 = new ButtonGroup();
		bg1.add(jrbM);
		bg1.add(jrbF);
		bg2.add(jrbY);
		bg2.add(jrbN);
		
		//ACTIONLISTENER TO CONVERT INTO STRING:
		
		ActionListener all = new ActionListener(){
		public void actionPerformed(ActionEvent e){
		if(e.getSource() == jrbM){
	    tSex.setText("Male");
	   }
	   else if(e.getSource() == jrbF){
	   
	   tSex.setText("Female");
	   }
		
	   if(e.getSource() == jrbY){
	   
	   tExp.setText("Yes");
	   }
	    else if(e.getSource() == jrbN){
	   
	   tExp.setText("No");
	   }
	}
	};
	jrbM.addActionListener(all);
	jrbF.addActionListener(all);
	jrbY.addActionListener(all);
	jrbN.addActionListener(all);
	
		

		ActionListener al5 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
						
				if(e.getSource()==jbNex){
					jf5 = new JFrame("Resume:");
					jf5.setSize(800,800);
					
				 jp4 = new ImagePanel(new ImageIcon("resumes.jpg").getImage());
	
	jf5.pack();
					jf5.add(jp4);
					jf2.setVisible(false);
					jf5.setVisible(true);
					
	ActionListener alHome = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == home5){
				jf.setVisible(true);
				jf5.setVisible(false);
				
			}
		}
	};
	home5.addActionListener(alHome);
	jtb5.add(home5);
					

		//construct preComponents:
    	 String[] jcbExpItems = {"Select", "Fresher", "Less than five yrs", "five to ten yrs", "Ten to Twenty yrs", "More than twenty five yrs"};
  	     String[] jcbCASItems = {"Select", "Less than three Lakhs ", "three to six lakhs", "seven to fifteen lakhs", "More than fifteen lakhs"};
      	 String[] jcbFunArItems = {"Select", "Accounts", "Architecture", "Hotels", "Graphic Design", "Journalism", "Banking", "Insurance", "Medical", "Engineering", "Self Employed"};
		 String[] jcbPostItems = {"Select", "Manager", "Salesman", "Clerk", "Receptionist", "President"};

        //construct components
		jlPost = new JLabel("Post Required");
		jcbPost = new JComboBox(jcbPostItems);
        jlTotExp = new JLabel ("Total Experience:");
        jcbExp = new JComboBox (jcbExpItems);
        jlRes2 = new JLabel ("Resume  -   Page 2");
        jlCAS = new JLabel ("Current Annual Salary:");
        jlIR = new JLabel ("(In Rupees)");
        jcbCAS = new JComboBox (jcbCASItems);
        jlFunAr = new JLabel ("Functional Area:");
        jcbFunAr = new JComboBox (jcbFunArItems);
        jlKs = new JLabel ("Key Skills:");
        jtaKs = new JTextArea (5, 5);
        jbSend = new JButton ("Send Resume");
		lContact = new JLabel("Contact  No:");
		tContact = new JTextField(15);
		 

        //add components
        jp4.add (jlPost);
        jp4.add (jcbPost);
		jp4.add (jlTotExp);
        jp4.add (jcbExp);
        jp4.add (jlRes2);
        jp4.add (jlCAS);
        jp4.add (jlIR);
        jp4.add (jcbCAS);
        jp4.add (jlFunAr);
        jp4.add (jcbFunAr);
        jp4.add (jlKs);
        jp4.add (jtaKs);
        jp4.add (jbSend);
		jp4.add(tContact);
		jp4.add(lContact);



	    jp4.setLayout(null);
		jlTotExp.setBounds (45, 50, 100, 25);
        jcbExp.setBounds (155, 50, 100, 25);
        jlRes2.setBounds (250, 10, 110, 25);
        jlCAS.setBounds (40, 90, 130, 25);
        jlIR.setBounds (40, 115, 70, 20);
        jcbCAS.setBounds (175, 90, 120, 25);
        jlFunAr.setBounds (40, 155, 100, 25);
        jcbFunAr.setBounds (155, 155, 220, 25);
        jlKs.setBounds (40, 195, 70, 25);
        jtaKs.setBounds (140, 195, 290, 65);
		lContact.setBounds(40,280,70,25);
        tContact.setBounds(140,280,130,25);
		jlPost.setBounds(40,325,100,25);
		jcbPost.setBounds(140,325,120,25);
		jbSend.setBounds (205, 360, 115, 25);
		

			//ACTIONLISTENER FOR SEND RESUME:

		ActionListener alb = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == jbSend){
					try {
         S = con.createStatement();
         String sql = "INSERT INTO RESUMES (NAME,SEX,DOB,FATHER,MOTHER,QUALIFICATION,EXPERIENCE,REFERENCE,TOTEXPERIENCE,CANNSAL,FUNAR,KEYSKILLS,CONTACT,POSTREQ) " +
                      "VALUES('" + tName.getText() +
                           "', '" + tSex.getText() + "', '" +
                                   tDOB.getText() + "', '" +
                                   tFath.getText() + "', '" +
                                   tMoth.getText() + "', '" +
                                   jtaQual.getText() + "', '" +
                                   tExp.getText() + "', '" +
                                   jtRef.getText() + "', '" +
                                   jcbExp.getSelectedItem().toString() + "', '" +
                                   jcbCAS.getSelectedItem().toString() + "', '" +
                                   jcbFunAr.getSelectedItem().toString() + "', '" +
                                   jtaKs.getText() + "', " +
                                   Integer.parseInt(tContact.getText()) + ",'"+
								   jcbPost.getSelectedItem().toString()+"')";
         int r = S.executeUpdate(sql); // Returns 1 on successful INSERT
         if (r == 1)
            JOptionPane.showMessageDialog(null,"RESUME SENT SUCCESFULLY");
         else
		    JOptionPane.showMessageDialog(null,"COULD NOT SEND DETAILS. CHECK IF ONE OR MORE INFORMATION IS FILLED WRONGLY");
      }
      catch(Exception eg){
         JOptionPane.showMessageDialog(null,eg.getMessage());
      }
		}
	  }
	};
	jbSend.addActionListener(alb);
        
}   				 
			}
		};
		jbNex.addActionListener(al5);
	
		//add components:
		jp2.setLayout(null);
        jp2.add (jlRe);
        jp2.add (jlName);
        jp2.add (jlDOB);
        jp2.add (jlSex);
        jp2.add (jrbM);
        jp2.add (jrbF);
        jp2.add (tName);
        jp2.add (tDOB);
        jp2.add (jlDOBr);
        jp2.add (jlQual);
        jp2.add (jtaQual);
        jp2.add (jlFath);
        jp2.add (tFath);
        jp2.add (tMoth);
        jp2.add (jlMoth);
        jp2.add (jlExp);
        jp2.add (jrbN);
        jp2.add (jrbY);
        jp2.add (jlRef1);
        jp2.add (jtRef);
        jp2.add (jbNex);

		//set component bounds (only needed by Absolute Positioning)
        jlRe.setBounds (210, 10, 100, 25);
        jlName.setBounds (30, 50, 45, 20);
        jlDOB.setBounds (35, 75, 35, 25);
        jlSex.setBounds (30, 115, 40, 20);
        jrbM.setBounds (70, 115, 100, 25);
        jrbF.setBounds (170, 115, 100, 25);
        tName.setBounds (80, 50, 160, 20);
        tDOB.setBounds (80, 75, 110, 20);
        jlDOBr.setBounds (80, 95, 100, 20);
        jlQual.setBounds (30, 210, 100, 25);
        jtaQual.setBounds (135, 210, 305, 115);
        jlFath.setBounds (35, 140, 100, 25);
        tFath.setBounds (135, 145, 175, 20);
        tMoth.setBounds (135, 170, 175, 20);
        jlMoth.setBounds (30, 165, 100, 25);
        jlExp.setBounds (40, 345, 75, 20);       
        jrbN.setBounds (180, 345, 55, 20);
        jrbY.setBounds (125, 345, 55, 20);
        jlRef1.setBounds (40, 375, 90, 30);
        jtRef.setBounds (135, 375, 245, 35);
        jbNex.setBounds (405, 375, 95, 30);
			}	
		  }		
		};
	jb3.addActionListener(al2);
					
	 //Employer's Window:

	
	jf3 = new JFrame("Employer's window");
	jf3.setDefaultCloseOperation(jf3.EXIT_ON_CLOSE);
	jf3.setSize(200,200);
	jp3 = new ImagePanel(new ImageIcon("background.jpg").getImage());
	jf3.add(jp3);

     //construct components
        jb7 = new JButton ("Inbox");
		jb8 = new JButton ("Job Database");
        jp3.add (jb7);
        jp3.add(jb8);
       
	
	ActionListener al3 = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
			try{
			 	Class.forName("com.mysql.jdbc.Driver");
			 	con = DriverManager.getConnection(URL,"root","");
			    S = con.createStatement();
					if(e.getSource()==jb2){
				ResultSet rs = S.executeQuery("SELECT * FROM EMPS WHERE USERNAME='"+t3.getText()+"'AND PASSWORD='"+t4.getText()+"'");
			
			if (rs.next()) {
			
			JOptionPane.showMessageDialog(null, "WELCOME " +t3.getText());
			jf3.setVisible(true);

			
	ActionListener alHome = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == home3){
				jf.setVisible(true);
				jf3.setVisible(false);
			
				
			}
		}
	};
	home3.addActionListener(alHome);
	jtb3.add(home3);
			}
			else{
			JOptionPane.showMessageDialog(null, "USERNAME OR PASSWORD IS INCORRECT OR DOESN'T EXIST");
			jf3.setVisible(false);
			}
        	 
         rs.close();
      }
	  }
      catch(Exception eg){
	  
         JOptionPane.showMessageDialog(null,eg.getMessage());
      }
			
		if(e.getSource()==jb7){
			jf7 = new JFrame("Inbox:");
			jf7.setSize(800,800);
			jlEIn = new JLabel("Details of the Emplyees those who have sent Resume:");
			jlEIn.setBounds(0,0,500,20);
			jlEIn.setForeground(Color.white);
			jf7.setDefaultCloseOperation(jf7.EXIT_ON_CLOSE);
			jf7.add(jp7 = new ImagePanel(new ImageIcon("fantasy_9.jpg").getImage()));
			jp7.setLayout(null);
			jp7.add(jlEIn);
			jf3.setVisible(false);
			jf7.setVisible(true);

	ActionListener alHome = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == home7){
				jf.setVisible(true);
				jf7.setVisible(false);
			
				
			}
		}
	};
	home7.addActionListener(alHome);
	jtb7.add(home7);

			jtResumes = new JTable(0,14);
		    dm = (DefaultTableModel)jtResumes.getModel();
			jspRes = new JScrollPane(jtResumes);
			jp7.add(jspRes);
			
			jspRes.setBounds(50,100,700,400);
			jtResumes.setEnabled(false);
	
	TableColumn tableCol11;
    tableCol11 = jtResumes.getColumnModel().getColumn(0);  
    tableCol11.setHeaderValue("NAME");   
	
	TableColumn tableCol12;
    tableCol12 = jtResumes.getColumnModel().getColumn(1);  
    tableCol12.setHeaderValue("SEX");   
	
	TableColumn tableCol13;
    tableCol13= jtResumes.getColumnModel().getColumn(2);  
    tableCol13.setHeaderValue("DOB");   
	
	TableColumn tableCol14;
    tableCol14 = jtResumes.getColumnModel().getColumn(3);  
    tableCol14.setHeaderValue("FATHER's NAME");   
	
	TableColumn tableCol15;
    tableCol15 = jtResumes.getColumnModel().getColumn(4);  
    tableCol15.setHeaderValue("MOTHER's NAME");   
	
	TableColumn tableCol16;
    tableCol16 = jtResumes.getColumnModel().getColumn(5);  
    tableCol16.setHeaderValue("QUALIFICATION");   
	
	TableColumn tableCol17;
    tableCol17 = jtResumes.getColumnModel().getColumn(6);  
    tableCol17.setHeaderValue("EXPERIENCE");   
	
	TableColumn tableCol18;
    tableCol18 = jtResumes.getColumnModel().getColumn(7);  
    tableCol18.setHeaderValue("REFERENCE");

	TableColumn tableCol19;
    tableCol19 = jtResumes.getColumnModel().getColumn(8);  
    tableCol19.setHeaderValue("TOTAL EXPERIENCE");   
	
	TableColumn tableCol20;
    tableCol20= jtResumes.getColumnModel().getColumn(9);  
    tableCol20.setHeaderValue("CURRENT ANNUAL SALARY");   
	
	TableColumn tableCol21;
    tableCol21 = jtResumes.getColumnModel().getColumn(10);  
    tableCol21.setHeaderValue("FUNCTIONAL AREA");   
	
	TableColumn tableCol22;
    tableCol22 = jtResumes.getColumnModel().getColumn(11);  
    tableCol22.setHeaderValue("KEY SKILLS");   
	
	TableColumn tableCol23;
    tableCol23 = jtResumes.getColumnModel().getColumn(12);  
    tableCol23.setHeaderValue("CONTACT"); 
	
	TableColumn tableCol24;
    tableCol24 = jtResumes.getColumnModel().getColumn(13);  
    tableCol24.setHeaderValue("POST");   
	

			try{
			 	Class.forName("com.mysql.jdbc.Driver");
			 	con = DriverManager.getConnection(URL,"root","");
			    S = con.createStatement();
				String query = "SELECT * FROM RESUMES;";
				ResultSet rs = S.executeQuery(query);
				int count = 0;
				while(rs.next()) {
					count++;
					dm.addRow(new Object[]{
						  rs.getString(1),rs.getString(2),rs.getDate(3),rs.getString(4),rs.getString(5),rs.getString(6),
						  rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),
						  rs.getInt(13),rs.getString(14)
					});
				}
				rs.close();
				S.close();
				con.close();
			}
			catch(Exception eg){
				JOptionPane.showMessageDialog(null, eg.getMessage());

			}
			
		  }
			
		}
	};
	jb2.addActionListener(al3);
	jb7.addActionListener(al3);

	
	ActionListener alJob = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==jb8){
			jf8 = new JFrame("JOB DATABASE");
			jf8.setSize(800,800);
				
			jf8.setDefaultCloseOperation(jf8.EXIT_ON_CLOSE);
			jf8.add(jp8 = new ImagePanel(new ImageIcon("Mail.jpg").getImage()));
			jf3.setVisible(false);
			jf8.setVisible(true);
	
	 String[] jcbJTItems = {"Accounts", "Architecture", "Engineering", "Hotels", "Graphic Design", "Journalism", "Banking", "Insurance", "Medical"};
     String[] jcbposItems = {"Manager", "Salesman", "Receptionist", "Clerk", "President"};
		 //construct components
        jbAddJob = new JButton ("Add Job");

        
	
        //construct components
        jlInf = new JLabel ("To add a new vacant Job to the database, please give the following details:");
		jlInf.setForeground(Color.white);
        tjbtype = new JLabel ("Job Type:");
		tjbtype.setForeground(Color.white);
        jcbJT = new JComboBox (jcbJTItems);
        jlCompany = new JLabel ("Company:");
		jlCompany.setForeground(Color.white);
        jcomp5 = new JTextField (5);
        jlpos = new JLabel ("Post:");
		jlpos.setForeground(Color.white);
        jcbpos = new JComboBox (jcbposItems);

        //adjust size and set layout
       
        jp8.setLayout (null);

        //add components
        jp8.add (jlInf);
        jp8.add (tjbtype);
        jp8.add (jcbJT);
        jp8.add (jlCompany);
        jp8.add (jcomp5);
        jp8.add (jlpos);
        jp8.add (jcbpos);

        //set component bounds (only needed by Absolute Positioning)
        jlInf.setBounds (55, 365, 435, 20);
        tjbtype.setBounds (55, 405, 65, 25);
        jcbJT.setBounds (125, 405, 100, 25);
        jlCompany.setBounds (55, 435, 65, 25);
        jcomp5.setBounds (125, 440, 160, 20);
        jlpos.setBounds (50, 470, 45, 20);
        jcbpos.setBounds (125, 470, 100, 25);

		//add components
        jp8.add (jbAddJob);

        //set component bounds (only needed by Absolute Positioning)
        jbAddJob.setBounds (175, 500, 80, 25);
    
			
	ActionListener alHome = new ActionListener(){
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == home8){
				jf.setVisible(true);
				jf8.setVisible(false);
				
			}
		}
	};
	home8.addActionListener(alHome);
	jtb8.add(home8);
			
			


			

				

			jtJobs = new JTable(0,3);
		    dmJobs = (DefaultTableModel)jtJobs.getModel();
			jspJobs = new JScrollPane(jtJobs);
			jp8.add(jspJobs);
			jspJobs.setBounds(50,100,700,250);
	
	TableColumn tableCol31;
    tableCol31 = jtJobs.getColumnModel().getColumn(0);  
    tableCol31.setHeaderValue("COMPANY");   
	
	TableColumn tableCol32;
    tableCol32 = jtJobs.getColumnModel().getColumn(1);  
    tableCol32.setHeaderValue("JOB TYPE");   
	
	TableColumn tableCol133;
    tableCol133= jtJobs.getColumnModel().getColumn(2);  
    tableCol133.setHeaderValue("POST");   
			ActionListener alla = new ActionListener(){
				public void actionPerformed(ActionEvent e){
			if(e.getSource() ==jbAddJob){
				try{
			 	Class.forName("com.mysql.jdbc.Driver");
			 	Connection con2 = DriverManager.getConnection(URL,"root","");
			    Statement S2 = con2.createStatement();
			

				String query2 = "INSERT INTO JOBS (COMPANY,JOBTYPE,POST) " +
                      "VALUES('" + jcomp5.getText() +
                           "', '" + jcbJT.getSelectedItem().toString()  + "', '" +
                                  	jcbpos.getSelectedItem().toString()+"')";
				
				 int rs2 = S2.executeUpdate(query2); // Returns 1 on successful INSERT
         if (rs2 == 1)
            JOptionPane.showMessageDialog(null,"JOB VACANCY ADDED SUCCESFULLY");
         else

		    JOptionPane.showMessageDialog(null,"COULD NOT ADD DETAILS. CHECK IF ONE OR MORE INFORMATION IS FILLED WRONGLY");
	
				
			}
			catch(Exception eg){
				JOptionPane.showMessageDialog(null, eg.getMessage());

			}
		}
		}
		
			};
			jbAddJob.addActionListener(alla);
			try{
			 	Class.forName("com.mysql.jdbc.Driver");
			 	con = DriverManager.getConnection(URL,"root","");
			    S = con.createStatement();
				String query = "SELECT * FROM JOBS;";
				ResultSet rs = S.executeQuery(query);
				int count = 0;
				while(rs.next()) {
					count++;
					dmJobs.addRow(new Object[]{
						  rs.getString(1),rs.getString(2),rs.getString(3)
					});
				}
				
				rs.close();
				S.close();
				con.close();
			}
			catch(Exception eg){
				JOptionPane.showMessageDialog(null, eg.getMessage());

			}	
			
	      }
			
		}
	};
	
	jb8.addActionListener(alJob);
	
			
	//Bounds:
	
	jp3.setLayout(null);
	
	jb7.setBounds(10,240,150,35);
	jb8.setBounds(10,280,150,35);
		tDU.setBounds (500, 100, 100, 25);
        tDP.setBounds (500, 145, 100, 25);
        jlSU.setBounds (500, 80, 100, 25);
        jlDU.setBounds (310, 100, 115, 25);
        jlDP.setBounds (310, 145, 115, 25);
        jbSU.setBounds (310, 185, 100, 25);
    	jlIni1.setBounds(50,20,500,15);
		jlIni2.setBounds(50,40,700,15);
		jlIni3.setBounds(50,60,500,15);
}





}

class SplashScreen extends JWindow  {
  private int duration;
  

  public SplashScreen(int d) {
    duration = d;
  }

  public void showSplash() {
    JPanel content = (JPanel) getContentPane();
    content.setBackground(Color.white);
    int width = 450;
    int height = 115;
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (screen.width - width) / 2;
    int y = (screen.height - height) / 2;
    setBounds(x, y, width, height);

    JLabel label = new JLabel(new ImageIcon("1.gif"));
    JLabel copyrt = new JLabel("Copyright 2010, Karthik and Aaditya associates",
        JLabel.CENTER);
    copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
    content.add(label, BorderLayout.CENTER);
    content.add(copyrt, BorderLayout.SOUTH);
    Color oraRed = new Color(156, 20, 20, 255);
    content.setBorder(BorderFactory.createLineBorder(oraRed, 10));
    setVisible(true);

  
    try {
      Thread.sleep(duration);
    } catch (Exception e) {
    }

    setVisible(false);
  }

  public void showSplashAndExit() {
    showSplash();
    System.exit(0);
  }
}
public class Project{
public static void main(String []args){
	SplashScreen splash = new SplashScreen(10000);
	splash.showSplash();
	new ProGUI();
}
}

/*
CREATE TABLE JOBS(
	COMPANY VARCHAR(30),
	JOBTYPE VARCHAR(20),
	POST VARCHAR(20)
	);

INSERT INTO JOBS VALUES('ARUL & CO','ACCOUNTS','MANAGER'),
												('SBI','ACCOUNTS','SALESMAN'),
												 ('CREATIVE','ARCHITECTURE','MANAGER'),
												 ('AKSHAYA HOMES','ARCHITECTURE','SALESMAN'),
												 ('ANKIT DESIGNS','ARCHITECTURE','RECEPTIONIST'),
												 ('TAJ','HOTELS','MANAGER'),
												 ('SHERATON','HOTELS','RECEPTIONIST'),
												 ('WOODLANDS','HOTELS','CLERK'),
												 ('HIMYM & CO','GRAPHIC DESIGN','MANAGER'),
												 ('CASTLE','GRAPHIC DESIGN','RECEPTIONIST'),
												 ('MINUTE DESIGN','GRAPHIC DESIGN','CLERK'),
												 ('HINDU','JOURNALISM','MANAGER'),
												 ('NDTV','JOURNALISM','CLERK'),
												 ('ABC','JOURNALISM','PRESIDENT'),
												 ('INDIAN BANK','BANKING','MANAGER'),
												 ('HDFC','BANKING','CLERK'),                
												 ('ICICI','BANKING','MANAGER'),
												 ('AVIVA','INSURANCE','CLERK'),
												 ('LIC','INSURANCE','MANAGER'),
												 ('ING VYSYA','INSURANCE','PRESIDENT'),
												 ('APPOLO','MEDICAL','CLERK'),
												 ('RAMACHANDRA','MEDICAL','MANAGER'),                
												 ('MALAR','MEDICAL','PRESIDENT'),
												 ('WIPRO','ENGINEERING','CLERK'),
												 ('TCS','ENGINEERING','MANAGER'),
												 ('CTS','ENGINEERING','PRESIDENT'),
												 ('INFOSYS','ENGINEERING','SALESMAN');
	

			 
	*/