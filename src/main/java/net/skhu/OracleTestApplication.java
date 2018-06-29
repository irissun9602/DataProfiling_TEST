package net.skhu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.skhu.mapper.SampleMapper;

@SpringBootApplication
//@MapperScan("net.skhu.mapper")
public class OracleTestApplication //implements CommandLineRunner 
{
	
/*	@Autowired
	SampleMapper testMapper;
*/	
	public static void main(String[] args) {
		SpringApplication.run(OracleTestApplication.class, args);
	}
/*
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Time:" + testMapper.getTime());
		
	}*/
	
}
