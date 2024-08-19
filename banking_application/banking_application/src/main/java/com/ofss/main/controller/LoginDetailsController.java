package com.ofss.main.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.main.domain.LoginDetails;
import com.ofss.main.service.LoginDetailsService;

@CrossOrigin
@RequestMapping("bankinglogin")
@RestController
public class LoginDetailsController {
	@Autowired
	LoginDetailsService loginDetailsService;
	
	@GetMapping("login/{customerId}")
	public ResponseEntity<LoginDetails> getLoginDetailsByFromDB(@PathVariable("customerId") int customerId) {
		System.out.println("CustomerID is " + customerId);
		LoginDetails userLogin = loginDetailsService.findByCustomerId(customerId);
		System.out.println("The user login details are: " + userLogin);
		return new ResponseEntity<>(userLogin, HttpStatus.OK);
	}
	
	@PostMapping("authenticate")
	public ResponseEntity<LoginDetails> authenticateLogin(@RequestBody String loginDetails) {
		JSONObject jsonObject = new JSONObject(loginDetails);
		System.out.println("Password :: " + jsonObject.getString("passwrd"));
		LoginDetails loginInfo = loginDetailsService.findByUsername(jsonObject.getString("username"));
		if (loginInfo != null) {
			System.out.println("The data in the DB is " + loginInfo);
			String enteredPassword = loginInfo.getPasswrd();
			if (enteredPassword.equals(jsonObject.getString("passwrd"))) {
				return new ResponseEntity<>(loginInfo, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	
	@PostMapping("addlogindetails")
	public ResponseEntity<Boolean> addLoginDetails(@RequestBody LoginDetails loginDetails){
		LoginDetails newLoginDetails = loginDetailsService.addLoginDetails(loginDetails);
		if (newLoginDetails != null) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		return new ResponseEntity<>(false, HttpStatus.OK);
	}
	
}
