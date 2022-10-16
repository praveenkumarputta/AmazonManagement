package com.Amazon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Amazon.dao.AmazonRepository;
import com.Amazon.model.Amazon;

@Service
public class AmazonService {

	@Autowired
	private AmazonRepository amazonRepository;

	public List<Amazon> getAllProducts() { // here method definition is getAllProducts()
	
		
		 amazonRepository.findAll(); // here method call is findAll()
		 
		 return amazonRepository.findAll();
	}

	/*
	 * This is method creation is createAmazonProducts()
	 * 
	 * One Object created Amazon()
	 * 
	 * reference varablename is amazon
	 * 
	 * i am seating the fields using the amazon reference variable
	 * 
	 * i am passing save method call into the amazonRepository
	 * 
	 * i am using String method reference variable
	 * 
	 * 
	 */

	public String createAmazonProducts() { // method definition

		Amazon amazon = new Amazon();

		amazon.setProductId(6);
		amazon.setProductName("bags");
		amazon.setProductPrice(800.0);

		amazonRepository.save(amazon); // method call

		String s1 = " Amazon Poduct Created Successfully ";
		return s1;

	}

	public String createAmazonProducts1(Amazon amazon) { // method name createAmazonProducts1()

		amazonRepository.save(amazon); // method call is save

		String s1 = " Amazon Poduct Created Successfully From 1";
		return s1; // here call the s1 reference variable

	}

	public String updateAmazonProduct2(Integer refId, Amazon ax) { // method name updateAmazonProduct2

		// first get the record by id

		Amazon am = amazonRepository.findByProductId(refId);

		// then set actual value to the object

		am.setProductName(ax.getProductName());
		am.setProductPrice(ax.getProductPrice());

		// and save object into the database

		amazonRepository.save(am);

		// verify using postman

		String s2 = "Amazon Product Updated SuccessFully";
		return s2;

	}

	public String deleteAmazonProduct(Integer refId) {
		// amazonRepository.deleteProductId(refId);
		amazonRepository.deleteById(refId);

		String s2 = "Amazon Product Deleted SuccessFully";
		return s2;

	}

}
