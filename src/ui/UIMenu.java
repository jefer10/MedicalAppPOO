package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * descripcion: clase interface que posee los metodos de showMenu() y showPatientMenu()
 */
public class UIMenu {

    public static final String[] MONTHS={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    response=0;
                    break;
                case 2:
                    System.out.println("Patient");
                    response = 0;
                    authUser(2);
                    //showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    response=0;
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        //userType=1 Doctor
        //userType=2 patient
        ArrayList<Doctor>doctors=new ArrayList<>();
        doctors.add(new Doctor("alejandro martinez","alejandro@gmail.com"));
        doctors.add(new Doctor("karen rodriguez","karen@gmail.com"));
        doctors.add(new Doctor("marta zuarez","marta@gmail.com"));

        ArrayList<Patient>patients=new ArrayList<>();
        patients.add(new Patient("camilo villegaz","camilo@gmail.com"));
        patients.add(new Patient("laura fandiño","laura@gmail.com"));
        patients.add(new Patient("sebastian rondon","sebastian@gmail.com"));

        boolean emailcorrect=false;
        while(!emailcorrect){
            System.out.println("inserte su email:[pepito@fff.com]");
            Scanner sc=new Scanner(System.in);
            String email=sc.nextLine();
            if (userType==1){
                for(Doctor d:doctors){
                    if (d.getEmail().equals(email)){
                        emailcorrect=true;
                        //obtener el usuario logable
                        doctorLogged=d;
                        //showDoctorMenu
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }
            if (userType==2){
                for (Patient p:patients){
                    if (p.getEmail().equals(email)){
                        emailcorrect=true;
                        //obtener el usuario logable
                        patientLogged=p;
                        //showPatientMenu
                        UIPatientMenu.ShowPatientMenu();
                    }
                }
            }
        }
    }


    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i=0;i<3;i++){
                        System.out.println(i+". "+MONTHS[i]);
                    }

                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }



}
