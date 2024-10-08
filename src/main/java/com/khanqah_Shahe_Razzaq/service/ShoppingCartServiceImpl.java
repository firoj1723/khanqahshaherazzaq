package com.khanqah_Shahe_Razzaq.service;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khanqah_Shahe_Razzaq.entities.Book;
import com.khanqah_Shahe_Razzaq.entities.Customer;
import com.khanqah_Shahe_Razzaq.entities.ShoppingCart;
import com.khanqah_Shahe_Razzaq.repository.CustomerRepository;
import com.khanqah_Shahe_Razzaq.repository.ShoppingCartRepository;



@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

	@Autowired
	private CustomerRepository theCustomerRepository;
	
	@Autowired
	private ShoppingCartRepository theCartRepository;

	@Override
	@Transactional
	public Set<ShoppingCart> getAllItems(Customer customer) {
		Set<ShoppingCart> items = new HashSet<ShoppingCart>();
		items.addAll(theCartRepository.getItemsByCustomer(customer));
		return items;
	
	}

	@Override
	@Transactional
	public String removeItem(Customer customer, Book book) {
		try {
			int res = theCartRepository.removeByIds(customer.getUsername(), book.getId());
			if(res > 0 ) {
				customer.getShoppingCart().remove(new ShoppingCart(customer,book,1));
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return "Book: \""+book.getName()+" \" removed from cart!";
	}

	
	@Override
	@Transactional
	public String decreaseItem(Customer customer, Book book, int count) {
		return "Item is already removed from cart!";
	}
	
	@Override
	@Transactional
	public String addItem(Customer customer, Book book) {
		try {
			int res = theCartRepository.addByIds(customer.getUsername(),book.getId(),1);
			if(res > 0) {
				customer.addShoppingCart(new ShoppingCart(customer,book,1));
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return "Book: \""+book.getName()+"\" added to cart successfully";
	}

	@Override
	public String increaseItem(Customer customer, Book book, int count) {
			
		return null;
	}

	@Override
	@Transactional
	public Set<ShoppingCart> getByUsername(Customer customer) {
		Set<ShoppingCart> items = new HashSet<ShoppingCart>();
		items.addAll(theCartRepository.getItemsByCustomer(customer));
		customer.setShoppingCart(items);
		return customer.getShoppingCart();
	}

}
