package com.Amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Amazon.model.Amazon;
import com.Amazon.service.AmazonService;

@RestController
public class AmazonController {

	@Autowired
	private AmazonService amazonService;

	@GetMapping("/getAll") // (http://localhost:9090/all)
	public List<Amazon> getAllProductDetails() {
		return amazonService.getAllProducts();// method call: amazonService.getAllProducts();
	}

	/*
	 * This method is used for to create new amazon product into the database
	 * 
	 * Model class values we are setting in service layer by creating
	 * 
	 * Object into amazon
	 * 
	 * Here /addProducts is the end. point (http://localhost:9090/addProducts)
	 * 
	 * createAmazonProducts() is method definition
	 * 
	 * amazonService.createAmazonProducts(); is method call
	 * 
	 * after executing this method i wont to display recored is inserted is
	 * successfully
	 * 
	 * that's why i am returning string
	 * 
	 */

	@PostMapping("/addProducts ") // (http://localhost:9090/addProducts)
	public String createAmazonProducts() { // method definition
		return amazonService.createAmazonProducts();// method call amazonService.createAmazonProducts();

	}

	// =====================================================================

	/*
	 * yse this method createAmazonProducts into the database
	 * 
	 * model class values we are setting in servicelayer creating
	 * 
	 * Onject into amazon
	 * 
	 * here endpoint is the /update1 (http://localhost:9090/update1)
	 * 
	 * creatingAmazonProducts is the methoddefinition
	 * 
	 * here createAmazonProducts1 is the method call
	 * 
	 */

	@PostMapping("/update1") // (http://localhost:9090/update1)
	public String createAmazonProducts(@RequestBody Amazon amazon) { // here from controller this is the method
																		// definition createAmazonProducts()
		return amazonService.createAmazonProducts1(amazon); // here methodCall , we are calling createAmazonProducts1
															// from the method amazonService class
															// amazonService.createAmazonProducts1(amazon);

	}

	/*
	 * This method is used for to update amazonproducId into the database
	 * 
	 * Model class values we are setting in service layer by creating
	 * 
	 * Object into amazon
	 * 
	 * Here /update2/{id} is the end point (http://localhost:9090/update2/{id})
	 * 
	 * updateAmazonProduct() is method name (method definition)
	 * 
	 * amazonService.updateAmazonProduct2(); is method call
	 * 
	 * after executing this method i wont to display recored is Updated is
	 * successfully
	 * 
	 * that's why i am returning string
	 * 
	 */

	// /update1/2
	@PutMapping("/update2/{id}") // (http://localhost:9090/update2/3)
	public String updateAmazonProduct(@PathVariable("id") Integer tempid, @RequestBody Amazon amazon) {
		return amazonService.updateAmazonProduct2(tempid, amazon);// methodcall
																	// amazonService.updateAmazonProduct2(tempid,
																	// amazon);
	}

	/*
	 * This method is used for delete amazonProductd into the database
	 * 
	 * here /delete/{id} is the end point (http://localhost:9090/delete/3)
	 * 
	 * deleteAmazonProduct is method name
	 * 
	 * method definition i am using @PathVarable annotation passing the Datatype is
	 * Integer referencevarable is the tempid1
	 * 
	 * amazonService.deleteAmazonProduct(); is method call
	 * 
	 * after executing this method i wont t display record is Deleted SuccessFully
	 * 
	 * that's why i am returning string
	 */

	// /delete/3
	@DeleteMapping("/delete/{id}") // ("http://localhost:9090/delete/2")
	public String deleteAmzonProduct(@PathVariable("id") Integer tempid1) {
		return amazonService.deleteAmazonProduct(tempid1);// methodcall: amazonService.deleteAmazonProduct(tempid1);
	}

	// http://localhost:9090/update1/2?uname="praveen"&pwd=1234

	@PutMapping("/update3/{id}") // method definition(parameters into the DataTypes and referincevariable)
	public void updateAmazonProduct2(@PathVariable("id") Integer tempid, @RequestParam("uname") String userName,
			@RequestParam("pwd") Integer password) {

		// amazonService.updateAmazonProduct3(tempid, userName, password);
	}
}
