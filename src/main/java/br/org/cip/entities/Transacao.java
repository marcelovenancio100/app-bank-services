package br.org.cip.entities;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="Transacao")
@SequenceGenerator(name="sequence", sequenceName="default_sequence", allocationSize=5)
@DynamicUpdate
public class Transacao {

	@Id
	@GeneratedValue(generator="sequence")
	private Long id;
	
	private Date data;
	
	@NotNull
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="contaOrigem", nullable=false)
	private ContaCorrente contaOrigem;
	
	@NotNull
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="contaDestino", nullable=false)
	private ContaCorrente contaDestino;
	
	@NotNull
	private BigDecimal valor;
	
	public Transacao() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public ContaCorrente getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(ContaCorrente contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public ContaCorrente getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(ContaCorrente contaDestino) {
		this.contaDestino = contaDestino;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
