package com.es.eoi.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.es.eoi.MainApp;
import com.es.eoi.entity.Client;

public class ClientService {

	public static void findClients() {

		// TODO logica de encontrar clientes
		
	}

	public static void addClient(Client client) {
		MainApp.client.add(client);
	}
	
	public static void newClient() throws ParseException {
		
		System.out.println("***********************************************");
		System.out.println("Datos del cliente: ");
		
		Client client = new Client();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		client.setName(sc.nextLine());
		
		System.out.println("Surname: ");
		client.setSurname(sc.nextLine());
		
		try {
			System.out.println("Birth date: ");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String fechaComoTexto = sc.nextLine();
			Date fecha = sdf.parse(fechaComoTexto);
			client.setBirthDate(fecha);
			
		}catch(Exception e){
			System.out.println("Pon la fecha correctamente!");
		}
		
		System.out.println("***********************************************");
	}

}
