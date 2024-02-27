package com.example.demo.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller_generateKey {

	
	

	@Autowired
	public controller_generateKey() {
	}

//	@GetMapping("/generate-key")
//	public ResponseEntity<Resource> download(String param) throws IOException {
//		
//		// tạo file chứa public key và private key
//		String path_publicKey = "public_key.txt";
//		String path_privateKey = "private_key.txt";
//		File file_publicKey = new File(path_publicKey);
//		File file_privateKey = new File(path_privateKey);
//		try (FileWriter writer_pub = new FileWriter(file_publicKey);
//				FileWriter writer_pri = new FileWriter(file_privateKey)) {
//
//			writer_pub.write(key.getPublicKeyBase64());
//			writer_pub.flush();
//
//			writer_pri.write(key.getPrivateKeyBase64());
//			writer_pri.flush();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("Đã xảy ra lỗi khi ghi nội dung vào file!");
//		}
//
//		// tạo file zip chứa 2 file trên
//
//		final List<String> srcFiles = Arrays.asList(path_publicKey, path_privateKey);
//
//		String zipFilePath = "key.zip";
//        final FileOutputStream fos = new FileOutputStream(zipFilePath);
//        ZipOutputStream zipOut = new ZipOutputStream(fos);
//        addToZipFile(srcFiles, zipOut);
//
//        zipOut.close();
//        fos.close();
//        
//        FileSystemResource zipFileResource = new FileSystemResource(zipFilePath);
//		
//        
//		// trả về client
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
//        headers.setContentDispositionFormData("attachment", "key.zip");
//
//        return ResponseEntity.ok()
//                .headers(headers)
//                .body(zipFileResource);
//		}
	
	@GetMapping("/generate-key") 
	public String taokey() {
		return "taokey";
	}
}
