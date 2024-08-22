package com.khanqah_Shahe_Razzaq;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class KhanqahShaheRazzaqApplication {

	/*
	 * @Resource com.khanqah_Shahe_Razzaq.service.FilesStorageService
	 * storageService;
	 */
	 
	public static void main(String[] args) {
		SpringApplication.run(KhanqahShaheRazzaqApplication.class, args);
	}

	/*
	 * @Override public void run(String... arg) throws Exception { //
	 * storageService.deleteAll(); storageService.init(); }
	 */
}
