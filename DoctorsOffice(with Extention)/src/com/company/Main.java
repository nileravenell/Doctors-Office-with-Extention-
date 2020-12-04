package com.company;

public class Main {

    public static void main(String[] args) {
        String patientName = "Stacey Manson";
        boolean hasInsurance = false;
        double temp = 102.2;
        int numVisits = 5;
        float coPay = 400;
        String nextAppointment = "02-07-2021";
        String contactNumber = "404-444-1141";


        System.out.println("Patient Details:");
        System.out.println("Name: " + patientName);
        System.out.println("Patient has insurance: " + hasInsurance);
        System.out.println("Body temperature: " + temp);
        System.out.println("Number of visits: " + numVisits);
        System.out.println("Copay Amount: " + coPay);
        System.out.println("Next Appointment Date: " + nextAppointment);
        System.out.println("Contact Number: " + contactNumber);
    }
}
