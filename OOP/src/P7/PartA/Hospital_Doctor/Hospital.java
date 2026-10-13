package P7.PartA.Hospital_Doctor;
class Hospital {
	String hospitalName;
	Doctor doctor;

	Hospital(String hospitalName, Doctor doctor) {
		this.hospitalName = hospitalName;
		this.doctor = doctor;
	}

	void display() {
		System.out.println("Hospital: " + hospitalName);
		System.out.println("Doctor ID: " + doctor.doctorId);
		System.out.println("Doctor Name: " + doctor.name);
	}
}