package java8.diff.doctorClinic;
public class Patient {
	private Integer serialNo;
	private String patientName;
	private String address;
	private String doctorName;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Integer serialNo, String patientName, String address, String doctorName) {
		super();
		this.serialNo = serialNo;
		this.patientName = patientName;
		this.address = address;
		this.doctorName = doctorName;
	}
	public Integer getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	@Override
	public String toString() {
		String output=String.format("%-5s %-20s %-20s %-20s",serialNo,patientName,address,doctorName);
		return output;
	}
}
