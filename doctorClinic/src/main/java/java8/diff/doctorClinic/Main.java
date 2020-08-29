package java8.diff.doctorClinic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
		
	public static List<Patient> filterPatient (String doctorName)
     {
		List<Patient> newList=new ArrayList<Patient>();
		List<Patient> patientList=PatientRecord.getAllPatients();
		for(Patient patient:patientList)
		{
			if(doctorName.equalsIgnoreCase(patient.getDoctorName()))
				newList.add(patient);
		}
		return newList;
     }

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 String output=String.format("%-5s %-20s %-20s %-20s","Serial No","Patient Name","Address","Doctor");
		while(true)
		{
			System.out.println("1.Patient Entry.");
			System.out.println("2.Display All Patient for the day.");
			System.out.println("3.Display Patient Doctor-wise.");
			System.out.println("4.Exit");
			System.out.println("Enter Choice(1-4).");
			String option=scanner.nextLine();
            switch(option)
            {
            case "1": System.out.println("Enter patient details in comma separate format:");
                       String details=scanner.nextLine();
                       String arr[]=details.split(",");
                       int serialNo=PatientRecord.generateSerialNumber();
                       Patient patient=new Patient(serialNo,arr[0],arr[1],arr[2]);
                       System.out.println(output);
                       System.out.println(patient);
                       PatientRecord.patientEntry(patient);
                       break;
            case "2" : List<Patient> patientList=PatientRecord.getAllPatients();
                      System.out.println(output);
                       for(Patient patient2:patientList)
                    	   System.out.println(patient2);
                       break;
            case "3" : System.out.println("Enter Doctor's Name:");
                       String doctorName=scanner.nextLine();
                       List<Patient> doctorPatientList=filterPatient(doctorName);
                       if(doctorPatientList.size()==0)
                    	   System.out.println("Wrong Doctor Name ");
                       else
                       {
                    	   System.out.println(output);
                           for(Patient patient3:doctorPatientList)
                        	   System.out.println(patient3);
                       }
                       break;
            case "4" : System.exit(0);
           }// end of switch
		}// end of loop
	}// end of main
}// end of class
