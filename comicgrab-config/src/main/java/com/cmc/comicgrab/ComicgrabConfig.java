package com.cmc.comicgrab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ComicgrabConfig {
public static void main(String[] args) {
	SpringApplication.run(ComicgrabConfig.class, args);
}
}
