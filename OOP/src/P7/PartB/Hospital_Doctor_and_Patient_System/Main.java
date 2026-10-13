package P7.PartB.Hospital_Doctor_and_Patient_System;

public class Main {
	public static void main(String[] args) {
		Doctor d1 = new Doctor(101, "Dr. Sharma", "Cardiologist");
		Doctor d2 = new Doctor(102, "Dr. Patel", "Neurologist");

		Patient p1 = new Patient(201, "Vivek", 20, "Heart Problem");
		Patient p2 = new Patient(202, "Rahul", 21, "Migraine");

		d1.displayDoctorDetails();
		System.out.println();

		p1.displayPatientDetails();
		d1.treatPatient(p1);
		d1.prescribeMedicine(p1, "Medicine A");

		System.out.println();

		d2.displayDoctorDetails();
		System.out.println();

		p2.displayPatientDetails();
		d2.treatPatient(p2);
		d2.prescribeMedicine(p2, "Medicine B");
	}
}