package br.com.caelum.ingresso.model;

import java.time.YearMonth;

public class Cartao {
	
	private String numero;
	private Integer cvc;
	private YearMonth vencimento;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Integer getCvc() {
		return cvc;
	}
	public void setCvc(Integer cvc) {
		this.cvc = cvc;
	}
	public YearMonth getVencimento() {
		return vencimento;
	}
	public void setVencimento(YearMonth vencimento) {
		this.vencimento = vencimento;
	}
	
	public boolean isValido(){
		return vencimento.isAfter(YearMonth.now());
	}

}
