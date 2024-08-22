package com.khanqah_Shahe_Razzaq.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.khanqah_Shahe_Razzaq.service.ImageServiceImpl;

@Controller
public class ImageController {
	
	@RequestMapping("/images")
	public String review() {
		
		return"images";
	}

	/*
	 * @Autowired FilesStorageService storageService;
	 * 
	 * @GetMapping("/") public String homepage() { return "redirect:/images"; return
	 * "images"; }
	 * 
	 * @GetMapping("/images/new") public String newImage(Model model) { return
	 * "upload_form"; }
	 * 
	 * @PostMapping("/images/upload") public String uploadImage(Model
	 * model, @RequestParam("file") MultipartFile file) { String message = "";
	 * 
	 * try { storageService.save(file);
	 * 
	 * message = "Uploaded the image successfully: " + file.getOriginalFilename();
	 * model.addAttribute("message", message); } catch (Exception e) { message =
	 * "Could not upload the image: " + file.getOriginalFilename() + ". Error: " +
	 * e.getMessage(); model.addAttribute("message", message); }
	 * 
	 * return "upload_form"; }
	 * 
	 * @GetMapping("/images") public String getListImages(Model model) {
	 * List<ImageInfo> imageInfos = storageService.loadAll().map(path -> { String
	 * filename = path.getFileName().toString(); String url =
	 * MvcUriComponentsBuilder .fromMethodName(ImageController.class, "getImage",
	 * path.getFileName().toString()).build().toString();
	 * 
	 * return new ImageInfo(filename, url); }).collect(Collectors.toList());
	 * 
	 * model.addAttribute("images", imageInfos);
	 * 
	 * return "images"; }
	 * 
	 * @GetMapping("/images/{filename:.+}") public ResponseEntity<Resource>
	 * getImage(@PathVariable String filename) { Resource file =
	 * storageService.load(filename);
	 * 
	 * return ResponseEntity.ok() .header(HttpHeaders.CONTENT_DISPOSITION,
	 * "attachment; filename=\"" + file.getFilename() + "\"").body(file); }
	 */
	
	/*
	 * @RequestMapping(value = "/sid", method = RequestMethod.GET, produces =
	 * MediaType.IMAGE_JPEG_VALUE)
	 * 
	 * public void getImage(HttpServletResponse response) throws IOException {
	 * 
	 * var imgFile = new ClassPathResource("image/sid.jpg");
	 * 
	 * response.setContentType(MediaType.IMAGE_JPEG_VALUE);
	 * StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream()); }
	 */

	/*
	 * @Autowired ImageServiceImpl imageServiceImpl;
	 * 
	 * @RequestMapping("/images") public String getImage(ModelMap model) throws
	 * SQLException, IOException {
	 * 
	 * String base64Image = imageServiceImpl.getBase64Image(); Images images =
	 * imageServiceImpl.get(0);
	 * 
	 * 
	 * model.addAttribute("image", images);
	 * 
	 * return "images"; }
	 */
}
