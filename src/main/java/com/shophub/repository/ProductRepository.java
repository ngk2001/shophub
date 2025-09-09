package com.shophub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shophub.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

	public List<Product> findAllByCategory(String category);

	public List<Product> findAllByLocationBranchAndLocationDrawerName(String branch, String drawerName);

	public List<Product> findAllByBrand(String brand);

}
