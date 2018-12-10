package com.jp.mtm.client;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.jp.mtm.entity.Order;
import com.jp.mtm.entity.Product;
import com.jp.mtm.util.JPAUtil;

public class MTMClient {

	public static void main(String[] args) {
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		
		entityManager.getTransaction().begin();
		
		
		Product elecProduct = new Product();
		elecProduct.setProductId(101L);
		elecProduct.setProductName("LED TV");
		elecProduct.setProductPrice(450000.88);
		
		Product beautyProduct = new Product();
		beautyProduct.setProductId(102L);
		beautyProduct.setProductName("Face Wash");
		beautyProduct.setProductPrice(80.88);
		
		Product babyProduct = new Product();
		babyProduct.setProductId(103L);
		babyProduct.setProductName("Pampers");
		babyProduct.setProductPrice(15.75);
		
		Product eleProduct = new Product();
		eleProduct.setProductId(104L);
		eleProduct.setProductName("CFL Bulb");
		eleProduct.setProductPrice(250.88);
		
// Now Define fist order and add few products in it
		
		Order firstOrder = new Order();
		firstOrder.setOrderId(1L);
		firstOrder.setPurchaseDate(new Date());
		
// now to create a HashSet of Product and
		Set<Product> products = new HashSet<>();
		products.add(elecProduct);
		products.add(beautyProduct);
		products.add(babyProduct);
		products.add(eleProduct);
		
// now add product hashset to the Order
		firstOrder.setProducts(products);

// now define second order and add few products in it
		Order secondOrder = new Order();
		secondOrder.setOrderId(2L);
		secondOrder.setPurchaseDate(new Date());

// now add product hashSet to the Order
		secondOrder.setProducts(products);
		
// now create a HashSet of Order and add it into set
		Set<Order> orders = new HashSet<>();
		orders.add(firstOrder);
		orders.add(secondOrder);
		
// now set the product orders		
		elecProduct.setOrders(orders);		
		beautyProduct.setOrders(orders);
		babyProduct.setOrders(orders);
		eleProduct.setOrders(orders);
		

// save orders using entity manager
		
		entityManager.persist(firstOrder);
		entityManager.persist(secondOrder);
		
		// commit transactions
		entityManager.getTransaction().commit();
		
		// close em
		entityManager.close();		
		
	}

}