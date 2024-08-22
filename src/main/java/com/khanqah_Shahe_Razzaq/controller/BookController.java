package com.khanqah_Shahe_Razzaq.controller;

import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.khanqah_Shahe_Razzaq.entities.Book;
import com.khanqah_Shahe_Razzaq.entities.CurrentSession;
import com.khanqah_Shahe_Razzaq.entities.Customer;
import com.khanqah_Shahe_Razzaq.entities.ShoppingCart;
import com.khanqah_Shahe_Razzaq.service.BookService;
import com.khanqah_Shahe_Razzaq.service.ShoppingCartService;



@Controller
@RequestMapping("/books")
public class BookController {


	@org.springframework.beans.factory.annotation.Autowired
	BookService theBookService;
	
	@org.springframework.beans.factory.annotation.Autowired
	ShoppingCartService theCartService;
	
	@org.springframework.beans.factory.annotation.Autowired
	CurrentSession currentSession;
	
	@GetMapping({"","/"})
	public String viewBooks(Model theModel) {
		//load the books
		Set<Book> books = theBookService.getAllBooks(); 
		theModel.addAttribute("books", books);
		
		Customer customer = currentSession.getUser().getCustomer();
		
		//load shoppingitems
		Set<ShoppingCart> shoppingItems = theCartService.getByUsername(customer);
		
		theModel.addAttribute("shoppingItems", shoppingItems);
		return "customer-books-list";
	}
}
