package com.es.eoi.service;

import java.util.Arrays;
import java.util.Scanner;

import java.text.ParseException;

public class BookingService {
	
	static String[] cities = { "Alicante", "Madrid", "Valencia" };
	static String[] transportation = { "Train", "Bus", "Airplane" };
	static Scanner sc = new Scanner(System.in);
	
	public static void createBooking() throws ParseException {

		// TODO logica de reservar un viaje
		BookingService.bookTrip();
		
		
		ClientService.newClient();
		
		
		
		
	}

	public static void findBookings() {

		// TODO logica de listar las reservas
	}
	public static void bookTrip() {
		System.out.println("Destination: ");
		for (String city : cities) {
			System.out.print(city.concat(" "));
		}
		String destinationTrip = sc.nextLine();

		if (Arrays.asList(cities).contains(destinationTrip)) {

			System.out.println("Origin: ");
			for (String city : cities) {
				System.out.print(city.concat(" "));
			}
			String originTrip = sc.nextLine();

			if (Arrays.asList(cities).contains(originTrip)) {
				System.out.print("Transportation Type: ");
				for (String transport : transportation) {
					System.out.print(transport.concat(" "));
				}
				String transportType = sc.nextLine();
				if (Arrays.asList(transportation).contains(transportType)) {

				} else {
					System.out.println("Error");
				}
			} else {
				System.out.println("Error.");
			}
		} else {
			System.out.println("Error.");
		}
	}
}
