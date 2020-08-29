package java8.diff.doctorClinic;

import static org.junit.Assert.*;

import org.junit.Test;
import static java8.diff.doctorClinic.TestUtils.*;
public class PatientRecordTest {

	
	@Test
	public void testGenerateSerialNumber() throws Exception {
		Patient patient1=new Patient(10,"John","Park Road","Dr.Eric");
		Patient patient2=new Patient(15,"Johny","Park Road","Dr.Eric");
		PatientRecord.patientEntry(patient2);
		PatientRecord.patientEntry(patient1);
		int x=PatientRecord.generateSerialNumber();
		yakshaAssert(currentTest(),x==16?"true":"false",businessTestFile);
		
	}

}
