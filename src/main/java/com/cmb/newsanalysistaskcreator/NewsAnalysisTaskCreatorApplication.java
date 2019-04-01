package com.cmb.newsanalysistaskcreator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cmb.newsanalysistaskcreator")
@MapperScan("com.cmb.newsanalysistaskcreator.dao")
public class NewsAnalysisTaskCreatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsAnalysisTaskCreatorApplication.class, args);
	}

}
