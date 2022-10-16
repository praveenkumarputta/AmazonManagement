package com.Amazon.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Amazon.model.Amazon;

@Repository
public interface AmazonRepository extends JpaRepository<Amazon, Serializable> {

	public Amazon findByProductId(Integer refId);


}
