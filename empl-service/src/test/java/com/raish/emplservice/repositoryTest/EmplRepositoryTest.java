package com.raish.emplservice.repositoryTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.raish.emplservice.model.Empl;
import com.raish.emplservice.repository.EmplRepository;
import com.raish.emplservice.service.EmplService;


@SpringBootTest
class EmplRepositoryTest {

	
	
	@Mock
	private  EmplRepository emplRepository;
	
	@Autowired
	EmplService emplService;	
	
//	@BeforeEach
//	void setUp() {
//		this.emplService = new EmplService(emplRepository);
//	}
	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void getAllEmployee() {

		
		
		when(emplRepository.findAll()).thenReturn(Stream
				.of(new Empl(1,"farhan","f.mirza.raish99@gmail.com"),
						new Empl(2,"chirag chauhan","chirag@gmail.com")
						)
				.collect(Collectors.toList()));
		assertEquals(2, emplService.getAllEmployee().size());
		
//		emplService
//		.getAllEmployee();
//		verify(emplRepository.findAll());
		
	}

}

