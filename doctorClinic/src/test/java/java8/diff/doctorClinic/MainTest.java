package java8.diff.doctorClinic;

import static org.junit.Assert.*;

import org.junit.Test;
import static java8.diff.doctorClinic.TestUtils.*;
public class MainTest {
	
	@Test
	public void testFilterPatient() throws Exception {
		Patient patient1=new Patient(10,"John","Park Road","Dr.Steve");
		Patient patient2=new Patient(11,"Mike","Lake Row","Dr.Eric");
		Patient patient3=new Patient(14,"Liz","Lake Road","Dr.Eric");
		Patient patient4=new Patient(15,"Johny","Park Row","Dr.Steve");
		PatientRecord.patientEntry(patient1);
		PatientRecord.patientEntry(patient2);
		PatientRecord.patientEntry(patient3);
		PatientRecord.patientEntry(patient4);
		int x=(Integer)Main.filterPatient("Dr.Eric").get(0).getSerialNo();
		int y=(Integer)Main.filterPatient("Dr.Steve").get(0).getSerialNo();
		yakshaAssert(currentTest(),x==11?"true":"false",businessTestFile);
		yakshaAssert(currentTest(),y==10?"true":"false",businessTestFile);
	
	}


}
