package com.es.eoi;

import java.text.ParseException;
import java.util.List;

import com.es.eoi.entity.Booking;
import com.es.eoi.entity.Client;
import com.es.eoi.entity.Trip;
import com.es.eoi.service.MenuService;

public class MainApp {
	
	public static List<Booking> booking;
	public static List<Client> client;
	public static List<Trip> trip;

	public static void main(String[] args) throws ParseException {

			MenuService.printMainMenu();

	}

}
