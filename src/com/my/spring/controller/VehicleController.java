package com.my.spring.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.my.spring.dao.VehicleDAO;
import com.my.spring.pojo.Vehicle;

@Controller
@RequestMapping("/vehicle/*")
public class VehicleController {

	
	@RequestMapping(value = "/vehicle/search", method = RequestMethod.GET)
	protected String goToSearchVehicle(HttpServletRequest request) throws Exception {
		// go to index page inside views
		return "searchVehicle";
	}
	
	@RequestMapping(value = "/vehicle/search", method = RequestMethod.POST)
	protected ModelAndView searchedVehicle(HttpServletRequest request) throws Exception {
		VehicleDAO vehicleDAO = new VehicleDAO();
		String number = request.getParameter("number");
		if(number != "" || number != null) {
			List<Vehicle> list = vehicleDAO.searchVehicle(number);
			if(list != null && list.size() >0 ) {
				String email = request.getParameter("email");
				String vehicleNumber= list.get(0).getNumber();
				String address = list.get(0).getAddress();
				String model = list.get(0).getModelName();
				String color = list.get(0).getColor();
	
				String message = "Notification!! Your vehicle details are: Vehicle Registration No. "+ vehicleNumber +" Color: " + color + " Model No: " + model
						+" Address: " + address+
						". Hope this information was useful.";
				sendEmail(email, message);
				return new ModelAndView("searchedVehicles", "vehicleList", list);
			}		
		}
		return new ModelAndView("error","errorMessage","Vehicle does not exist");
	}
	
	@RequestMapping(value = "/vehicle/getAll", method = RequestMethod.GET)
	protected ModelAndView getAllFlights(HttpServletRequest request) throws Exception {
		
		VehicleDAO flightDAO = new VehicleDAO();
		List<Vehicle> list= flightDAO.get();
		
		return new ModelAndView("viewAllVehicles", "vehicleList", list);
		
	}
	
	public void sendEmail(String useremail, String message) {
		try {
			SimpleEmail email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(465);
			//email.setAuthenticator(new DefaultAuthenticator("projectiites@gmail.com", "Mp@Deadshoot"));
			email.setAuthenticator(new DefaultAuthenticator("maulinaudi@gmail.com", "audi@R8etron"));
			email.setSSLOnConnect(true);
			email.setFrom("no-reply@vehicleTrackingSystem.com"); // This user email does not
													// // exist
			email.setSubject("Vehicle Tracking System");
			email.setMsg(message); // Retrieve email from the DAO and send this
			email.addTo(useremail);
			email.send();
		} catch (EmailException e) {
			System.out.println("Email cannot be sent");
		}
	}
	
}
