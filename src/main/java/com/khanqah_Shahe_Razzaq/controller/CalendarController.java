package com.khanqah_Shahe_Razzaq.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalendarController {

	@RequestMapping("/calendar")
	public String calendar() {
		return "calendar";
	}
	
	
	@GetMapping("/displayImage")
    public void displayImage(@RequestParam("imageName") String imageName, HttpServletResponse response) throws IOException {
        // Load the image from the "src/main/resources/static/images" directory.
        String imagePath = "src/main/resources/static/img/" + imageName;

        // Determine the content type based on the image format.
        String contentType = getContentType(imageName);
        response.setContentType(contentType);

        // Open an InputStream to the image and copy it to the response's OutputStream.
        try (InputStream in = new FileInputStream(imagePath);
             OutputStream out = response.getOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            // Handle exceptions as needed.
        }
    }

    // Helper method to determine content type based on file extension.
    private String getContentType(String imageName) {
        if (imageName.endsWith(".jpg") || imageName.endsWith(".jpeg")) {
            return "image/jpeg";
        } else if (imageName.endsWith(".png")) {
            return "image/png";
        } else if (imageName.endsWith(".gif")) {
            return "image/gif";
        } else if (imageName.endsWith(".bmp")) {
            return "image/bmp";
        }else if (imageName.endsWith(".svg")) {
            return "image/bmp";
        }  else {
            // Add more image formats if needed
            return "application/octet-stream"; // Default to binary data if format is unknown
        }
    }
}
