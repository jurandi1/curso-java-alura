package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		
//		Assertions.assertThrows(IllegalArgumentException.class,
//				() -> service.calcularBonus(new Funcionario("Jurandi", LocalDate.now(), new BigDecimal("25000"))));
		
		try {
			service.calcularBonus(new Funcionario("Jurandi", LocalDate.now(), new BigDecimal("25000")));
			Assertions.fail("Não deu a Exception");
		} catch (Exception e) {
			Assertions.assertEquals("Funcionario com salário maior que R$10000 não pode receber bônus.", e.getMessage());
		}
		
	}
	
	@Test
	void bonusDeveriaSerDezPorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Junior", LocalDate.now(), new BigDecimal("2500")));
		
		Assertions.assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
	void bonusDeveriaSerDezPorCentoParaSalarioDeExatamenteDezMilReais() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Junior", LocalDate.now(), new BigDecimal("10000")));
		
		Assertions.assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
