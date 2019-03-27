package com.spring.demo;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DemoApplication.class, args);
    }

}
