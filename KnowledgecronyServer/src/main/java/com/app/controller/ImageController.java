package com.app.controller;
 
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Answer;
import com.app.repo.AnswerRepository;
import com.app.repo.ImageRepository;
 
@CrossOrigin(origins = "http://localhost:4200")
	@RestController
@RequestMapping("/api")
public class ImageController {
	
	@Autowired
	ImageRepository repository;
	
	@Autowired
	AnswerRepository answerRepository;
  
	/*
	 * @GetMapping(value = "/image") public ResponseEntity<InputStreamResource>
	 * getImage() throws IOException { Image image = repository.findByImageId(2L);
	 * InputStream is = null; try { is = image.getImage().getBinaryStream(); } catch
	 * (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * // ClassPathResource imgFile = new
	 * ClassPathResource("image/grokonez-logo.png");
	 * 
	 * return ResponseEntity .ok() .contentType(MediaType.IMAGE_PNG) .body(new
	 * InputStreamResource(is)); }
	 */
//    @GetMapping(value = "/image")
//    public String getImageStream() throws IOException {
//    	Image image = repository.findByImageId(1L);
//    	InputStream is = null;
//    	try {
//			is = image.getImage().getBinaryStream();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	
//    	File f =  new File("C:\\Users\\ravi123\\Desktop\\google drive\\learning\\My Own book\\Coding\\SpringRestMySQL\\src\\image\\mybookimage1.jpg");
//		 FileInputStream fileInputStreamReader = new FileInputStream(f);
//        byte[] bytes = new byte[(int)f.length()];
//        fileInputStreamReader.read(bytes);
//		String encodedfile = new String(Base64.getEncoder().encode(bytes), "UTF-8");
//		return encodedfile;
// 
//      //  ClassPathResource imgFile = new ClassPathResource("image/grokonez-logo.png");
// 
//		/*
//		 * return ResponseEntity .ok(). .body(new InputStreamResource(is));
//		 */
//    }
	
	
	
	
	
//	@GetMapping(value = "/image")
//    public String getImageStream() throws IOException {
//		CompleteAnswer answer = answerRepository.findByAnswerId(1L);
//    	InputStream is = null;
//    	return answer.getAnswer();
//    }
	
	@GetMapping(value = "/image")
    public Answer getImageStream() throws IOException {
		return answerRepository.findByAnswerId(1L);
    }
	
}