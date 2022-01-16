package com.example.demo.fileupload;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {
/*        @GetMapping("/")
        public String index() {
            return "uploader";
        }

        @PostMapping("/upload")
        public ResponseEntity<?> handleFileUpload(@RequestParam("file") MultipartFile file) {
            String fileName = file.getOriginalFilename();
            try {
                file.transferTo(new File("C:\\Users\\lenovo\\Desktop\\uploadtest" + fileName));
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
            return ResponseEntity.ok("File uploaded successfully.");
        }
*/


}
