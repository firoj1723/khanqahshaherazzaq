package com.khanqah_Shahe_Razzaq.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import com.khanqah_Shahe_Razzaq.entities.Doc;
import com.khanqah_Shahe_Razzaq.service.DocService;

@Controller
public class DocController {

	@Autowired
	private DocService docService;
	
	@GetMapping("/file")
	public String get(Model model) {
		List<Doc> docs = docService.getAllFiles();
		model.addAttribute("docs", docs);
		return "docs";
	}
	
	/*
	 * @PostMapping("/customers/file/uploadFiles") public String
	 * uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) { for
	 * (MultipartFile file: files) { docService.saveFile(file);
	 * 
	 * } return "docs"; }
	 */
	@GetMapping("/file/downloadFile/{fileId}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Integer fileId){
		Doc doc = docService.getFile(fileId).get();
		return ResponseEntity.ok()
				.contentType(MediaType.parseMediaType(doc.getDocType()))
				.header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+doc.getDocName()+"\"")
				.body(new ByteArrayResource(doc.getData()));
	}
	
	
}

