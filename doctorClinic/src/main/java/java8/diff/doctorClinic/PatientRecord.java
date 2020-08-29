package java8.diff.doctorClinic;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PatientRecord {
	
	private static Map<Integer,Patient> patientMap=new HashMap();
	
		public static void patientEntry(Patient patient){
			patientMap.put(patient.getSerialNo(),patient);
		}
		
	 public static int generateSerialNumber(){
		int value=1;
		if(patientMap.size()!=0)
		{
			Set<Integer> set=patientMap.keySet();
			TreeSet<Integer> tSet=new TreeSet(set);
			value=tSet.last()+1;
	 	}
		return value;
	 }
	 
	public static List<Patient> getAllPatients(){
		List<Patient> patientList=new ArrayList<Patient>();
		Set<Integer> set=patientMap.keySet();
		for(Integer serialNo:set)
		patientList.add(patientMap.get(serialNo));
		return patientList;
	}
}
