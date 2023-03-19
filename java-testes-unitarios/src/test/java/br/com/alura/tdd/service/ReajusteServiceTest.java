package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {
	
	private ReajusteService service;
	private Funcionario funcionario;
	
	@BeforeEach
	public void inicializar() {
		System.out.println("Inicializar");
		this.service = new ReajusteService();
		this.funcionario = new Funcionario("Maria", LocalDate.now(), new BigDecimal("1000"));
	}
	
	@AfterEach
	public void finalizar() {
		System.out.println("Fim!");
	}
	
	@BeforeAll
	public static void antesDeTodos() {
		System.out.println("Antes de todos");
	}
	
	@AfterAll
	public static void depoisDeTodos() {
		System.out.println("Depois de todos");
	}

	@Test
	public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
		service.ConcederReajuste(funcionario, Desempenho.A_DESEJAR);
		Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom() {
		service.ConcederReajuste(funcionario, Desempenho.BOM);
		Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo() {
		service.ConcederReajuste(funcionario, Desempenho.OTIMO);
		Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}

}
