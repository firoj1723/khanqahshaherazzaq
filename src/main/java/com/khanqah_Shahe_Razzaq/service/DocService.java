package com.khanqah_Shahe_Razzaq.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.khanqah_Shahe_Razzaq.entities.Doc;
import com.khanqah_Shahe_Razzaq.repository.DocRepositry;

@Service
public class DocService {

	@Autowired
	private DocRepositry docRepositry;
	
	
	public Doc saveFile(MultipartFile file) {
		String docName = file.getOriginalFilename();
		try {
			Doc doc = new Doc(docName,file.getContentType(),file.getBytes());
			return docRepositry.save(doc);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public Optional<Doc> getFile(Integer fileId) {
	     return docRepositry.findById(fileId);
	}
	
	public List<Doc> getAllFiles(){
		return docRepositry.findAll();
	}
	
	public void deleteLeadById(Integer fileId) {
		 docRepositry.deleteById(fileId);
		
	}
}
