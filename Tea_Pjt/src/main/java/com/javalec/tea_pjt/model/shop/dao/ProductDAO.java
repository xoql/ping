package com.javalec.tea_pjt.model.shop.dao;

import java.util.List;

import com.javalec.tea_pjt.model.shop.dto.ProductDTO;

public interface ProductDAO {
	List<ProductDTO> listProduct(String product_type);
	ProductDTO detailProduct(int product_id);
	void updateProduct(ProductDTO dto);
	void deleteProduct(int product_id);
	void insertProduct(ProductDTO dto);
	String fileInfo(int product_id); 

}
