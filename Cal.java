package guitinz;

import javax.swing.JOptionPane;

public class Cal {
	private double Agrade3;
	private  double Agrade2;
	private double Agrade1;
	private double Bgrade3;
	private double Bgrade2;
	private double Bgrade1;
	private double Cgrade3;
	private double Cgrade2;
	private double Cgrade1;
	private double Dgrade3;
	private double Dgrade2;
	private double Dgrade1;
	private double Fgrade3;
	private double Fgrade2;
	private double Fgrade1;
	
	
	public Cal(double Agrad3,double Agrad2,double Agrad1,double Bgrad3,double Bgrad2,double Bgrad1,double Cgrad3,double Cgrad2,double Cgrad1,double Dgrad3,double Dgrad2,double Dgrad1,double Fgrad3,double Fgrad2,double Fgrad1){
		
		Agrade1 = Agrad1;
		Agrade2 = Agrad2;
		Agrade3 = Agrad3;
		Bgrade1 = Bgrad1;
		Bgrade2 = Bgrad2;
		Bgrade3 = Bgrad3;
		Cgrade1= Cgrad1;
		Cgrade2 = Cgrad2;
		Cgrade3 = Cgrad3;
		Dgrade1 = Dgrad1;
		Dgrade2 = Dgrad2;
		Dgrade3 = Dgrad3;
		Fgrade1 = Fgrad1;
		Fgrade2 = Fgrad2;
		Fgrade3 = Fgrad3;
	}
	
		
public double getCgpa(){
	
	double gpa1= 5*1 * Agrade1;
	double cla1= 1* Agrade1;

	double gpa2= 5*2*Agrade2;
	double cla2= 2*Agrade2;


	double gpa3= 5*3 * Agrade3;
	double cla3= 3* Agrade3;


	double gpb1= 4*1 * Bgrade1;
	double clb1= 1* Bgrade1;


	double	gpb2= 4*2 * Bgrade2;
	double	clb2= 2* Bgrade2;


	double	gpb3= 4*3 * Bgrade3;
	double	clb3= 3* Bgrade3;


	double	gpc1= 3*1 * Cgrade1;
	double	clc1= 1* Cgrade1;


	double	gpc2= 3*2 * Cgrade2;
	double	clc2= 2* Cgrade2;


	double	gpc3= 3*3 * Cgrade3;
	double	clc3= 3* Cgrade3;


	double gpd1= 2*1 * Dgrade1;
	double cld1= 1* Dgrade1;


	double gpd2= 2*2 * Dgrade2;
	double cld2= 2* Dgrade2;


	double gpd3= 2*3 * Dgrade3;
	double cld3= 3* Dgrade3;


	double gpf1= 0*1 * Fgrade1;
	double clf1= 1* Fgrade1;


	double gpf2= 0*2 * Fgrade2;
	double clf2= 2* Fgrade2;


	double gpf3= 0*3 * Fgrade3;
	double clf3= 1* Fgrade3;

	
	
	double totgp;
	totgp= (gpa1+gpa2+gpa3+gpb1+gpb2+gpb3+gpc1+gpc2+gpc3+gpd1+gpd2+gpd3+gpf1+gpf2+gpf3);
	double totcl; 
	totcl= (cla1+cla2+cla3+clb1+clb2+clb3+clc1+clc2+clc3+cld1+cld2+cld3+clf1+clf2+clf3);
	double finalcgpa;
	finalcgpa =  (double) (totgp/totcl)  ;
	
	return finalcgpa;
	
}


}
