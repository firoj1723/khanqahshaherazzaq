package com.khanqah_Shahe_Razzaq.service;

import java.beans.Transient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ImageServiceImpl implements ImageService {
	/*
	 * private byte[] image;
	 * 
	 * @Autowired private ImageRepository imageRepo;
	 * 
	 * @Override public void saveImage(Images images) { imageRepo.save(images); }
	 * 
	 * @Override public List<Images> all() { List<Images> images =
	 * imageRepo.findAll(); return images; }
	 * 
	 * @Override public void deleteImageById(long id) { imageRepo.deleteById(id); }
	 * 
	 * @Override public Images findImageById(long id) { Optional<Images> findById =
	 * imageRepo.findById(id); Images images = findById.get(); return images; }
	 * 
	 * 
	 * 
	 * @Transient public String getBase64Image() {
	 * 
	 * String base64Image = Base64.getEncoder().encodeToString(this.image); return
	 * base64Image; }
	 * 
	 * 
	 * String databaseURL = "jdbc:mysql://localhost:3306/khanqahshaherazzaq"; String
	 * user = "root"; String password = "shifa786";
	 * 
	 * public Images get(int id) throws SQLException, IOException { Images book =
	 * null;
	 * 
	 * String sql = "SELECT * FROM images WHERE id = ?";
	 * 
	 * try (Connection connection = DriverManager.getConnection(databaseURL, user,
	 * password)) { PreparedStatement statement = connection.prepareStatement(sql);
	 * statement.setInt(1, id); ResultSet result = statement.executeQuery();
	 * 
	 * if (result.next()) { Images images = new Images(); String title =
	 * result.getString("title"); String author = result.getString("author"); Blob
	 * blob = result.getBlob("image");
	 * 
	 * InputStream inputStream = blob.getBinaryStream(); ByteArrayOutputStream
	 * outputStream = new ByteArrayOutputStream(); byte[] buffer = new byte[4096];
	 * int bytesRead = -1;
	 * 
	 * while ((bytesRead = inputStream.read(buffer)) != -1) {
	 * outputStream.write(buffer, 0, bytesRead); }
	 * 
	 * byte[] imageBytes = outputStream.toByteArray(); String base64Image =
	 * Base64.getEncoder().encodeToString(imageBytes);
	 * 
	 * 
	 * inputStream.close(); outputStream.close();
	 * 
	 * book.setTitle(title); book.setAuthor(author);
	 * book.setBase64Image(base64Image); }
	 * 
	 * } catch (SQLException | IOException ex) { ex.printStackTrace(); throw ex; }
	 * 
	 * return book; }
	 */
}
