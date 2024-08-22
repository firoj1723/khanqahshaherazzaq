package com.khanqah_Shahe_Razzaq;

import static org.assertj.core.api.Assertions.assertThat;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.khanqah_Shahe_Razzaq.entities.Notifications;
import com.khanqah_Shahe_Razzaq.repository.NotificationRepository;



@DataJpaTest
@AutoConfigureTestDatabase(replace =Replace.NONE)
@Rollback(false)
public class ImageTest {

	/*
	 * @Autowired private ImageRepository repo;
	 * 
	 * @Test public void saveImage() throws IOException {
	 * 
	 * FileInputStream fin = new
	 * FileInputStream("C:\\Users\\hp\\Downloads\\hello.jpg"); Images images = new
	 * Images("hello",(Blob) fin ); repo.save(images);
	 * 
	 * 
	 * BufferedImage bImage = ImageIO.read(new
	 * File("C:\\Users\\hp\\Downloads\\hello.jpg")); ByteArrayOutputStream bos = new
	 * ByteArrayOutputStream(); ImageIO.write(bImage, "jpg", bos ); byte [] data =
	 * bos.toByteArray(); Images images = new Images("trail", data);
	 * repo.save(images);
	 * 
	 * }
	 */
	
	
	/*
	 * @Autowired private NotificationRepository notificationRepository;
	 * 
	 * @Test public void saveNotification() { Notifications notifications = new
	 * Notifications("hi testing purpose");
	 * notificationRepository.save(notifications);
	 * assertThat(notifications.getId()).isGreaterThan(0); }
	 */
}
