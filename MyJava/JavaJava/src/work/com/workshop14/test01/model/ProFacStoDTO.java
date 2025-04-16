package work.com.workshop14.test01.model;

// Prodcut, Factory, Store 조인 결과(PDNAME, PDSUBNAME, FACNAME, STONAME, STAMOUNT)
public record ProFacStoDTO(
		String pdname, 
		String pdsubname, 
		String facname, 
		String stoname, 
		int stamount
		) {}
