package com.julianorocha.cursomc.services;

import java.util.Calendar;

import org.springframework.stereotype.Service;

import com.julianorocha.cursomc.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, java.util.Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(cal.getTime());
	}
}
