package com.company;
public class Boxer {

    /* double[] J,C,MHF,RHF,MHB,RHB,MU,RU,LA;
    {
        J = new double[5];
        C = new double[5];
        MHF = new double[5];
        RHF = new double[5];
        MHB = new double[5];
        RHB = new double[5];
        MU = new double[5];
        RU = new double[5];
        LA = new double[5];
    }

     */

    String name;
    double H,S,R,W,A,HH;

    public Boxer(String n, double h, double s, double r, double w, double a, double hh,
                 double j0, double j1, double j2, double j3, double j4,
                 double C0, double C1, double C2, double C3, double C4,
                 double MU0, double MU1, double MU2, double MU3, double MU4,
                 double RU0, double RU1, double RU2, double RU3, double RU4,
                 double LA0, double LA1, double LA2, double LA3, double LA4,
                 double MHF0, double MHF1, double MHF2, double MHF3, double MHF4,
                 double RHF0, double RHF1, double RHF2, double RHF3, double RHF4,
                 double MHB0, double MHB1, double MHB2, double MHB3, double MHB4,
                 double RHB0, double RHB1, double RHB2, double RHB3, double  RHB4  )
    {

        name = n;  //Name of boxer
        H = h;     //Health of boxer
        S = s;     //Stamina of boxer
        R = r;     //Reach
        W = w;     //
        A = a;     //
        HH = hh;

        //Make indivdual variable for each of the current ones

        /*

        double J[] = {j0, j1, j2, j3, j4};


        J[0] = j0; //Stamina usage per punch
        J[1] = j1; //Damage delt per punch
        J[2] = j2; //Probability of landing this punch
        J[3] = j3; //Stamina usafe per defense
        J[4] = j4; //Probability of defending this punch



        C[0] = C0;
        C[1] = C1;
        C[2] = C2;
        C[3] = C3;
        C[4] = C4;

        MHF[0] = MHF0;
        MHF[1] = MHF1;
        MHF[2] = MHF2;
        MHF[3] = MHF3;
        MHF[4] = MHF4;

        RHF[0] = RHF0;
        RHF[1] = RHF1;
        RHF[2] = RHF2;
        RHF[3] = RHF3;
        RHF[4] = RHF4;

        MHB[0] = MHB0;
        MHB[1] = MHB1;
        MHB[2] = MHB2;
        MHB[3] = MHB3;
        MHB[4] = MHB4;

        RHB[0] = RHB0;
        RHB[1] = RHB1;
        RHB[2] = RHB2;
        RHB[3] = RHB3;
        RHB[4] = RHB4;

        MU[0] = MU0;
        MU[1] = MU1;
        MU[2] = MU2;
        MU[3] = MU3;
        MU[4] = MU4;

        RU[0] = RU0;
        RU[1] = RU1;
        RU[2] = RU2;
        RU[3] = RU3;
        RU[4] = RU4;

        LA[0] = LA0;
        LA[1] = LA1;
        LA[2] = LA2;
        LA[3] = LA3;
        LA[4] = LA4;

         */
    }

   

    @Override
    public String toString() {
        return "Boxer{" +
                "name ='" + name + '\'' +
                ", Health =" + H +
                ", stamina" + S +
                ", age =" + A +
                '}';
    }
}


