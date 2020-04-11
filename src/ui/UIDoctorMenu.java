package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * descripcion: en esta clase se realiza toda la logica de las opciones del doctor.
 */
public class UIDoctorMenu {
    public static ArrayList<Doctor>doctorsAvailableAppointments=new ArrayList<>();

    public static void showDoctorMenu(){

        int response=0;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome"+UIMenu.doctorLogged.getName());
            System.out.println("1. add Avaliable appointments");
            System.out.println("2. my scheduled appointments");
            System.out.println("0.logout");

            Scanner sc=new Scanner(System.in);
            response=Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    showAddAvaliableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while (response!=0);
    }

    private static void showAddAvaliableAppointmentsMenu(){
        int response=0;
        do{
            System.out.println();
            System.out.println(":: Add available appointment");
            System.out.println(":: Select a months");
            for(int i=0;i<3;i++){
                int j=i+1;
                System.out.println(j+"."+UIMenu.MONTHS[i]);
            }
            System.out.println("0. return");
            Scanner sc=new Scanner(System.in);
            response=Integer.valueOf(sc.nextLine());

            if (response>0 && response<4){
                //1,2,3
                int mothselected=response;
                System.out.println(mothselected+" . "+UIMenu.MONTHS[mothselected-1]);
                System.out.println("insert the date available: [d/m/año]");
                String date=sc.nextLine();

                System.out.println("your date is: "+date+"\n1.Correct \n2. Change date");
                int responseDate=Integer.valueOf(sc.nextLine());
                if(responseDate==2) continue;

                int responseTime=0;
                String time="";
                do {
                    System.out.println("Insert the time avaliable for date: "+date+"[16:00]");
                    time=sc.nextLine();
                    System.out.println("your time is: "+time+"\n1. Correct \n2.Change time");
                    responseTime=Integer.valueOf(sc.nextLine());
                }while(responseTime==2);
                UIMenu.doctorLogged.addAvalibleAppointment(date,time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);

            }else {
                if (response==0){
                    showDoctorMenu();
                }
            }

        }while (response!=0);
    }

    private static void  checkDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableAppointments().size()>0 && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }

}
