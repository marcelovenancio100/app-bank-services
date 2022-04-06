package br.org.cip.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="ContaCorrente", uniqueConstraints={@UniqueConstraint(columnNames={"conta"})})
@SequenceGenerator(name="sequence", sequenceName="default_sequence", allocationSize=5)
@DynamicUpdate
public class ContaCorrente {

	@Id
	@GeneratedValue(generator="sequence")
	private Long id;
	
	@NotNull
	@Size(max=5)
	private String agencia;
	
	@NotNull
	@Size(max=15)
	private String conta;
	
	@NotNull
	@Size(max=3)
	private Integer numBanco;
	
	@NotNull
	@Size(max=50)
	private String nomeBanco;
	
	@NotNull
	private BigDecimal saldo;
	
	@NotNull
	@Size(max=50)
	private String dataUsuario;
	
	public ContaCorrente() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public Integer getNumBanco() {
		return numBanco;
	}

	public void setNumBanco(Integer numBanco) {
		this.numBanco = numBanco;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getDataUsuario() {
		return dataUsuario;
	}

	public void setDataUsuario(String dataUsuario) {
		this.dataUsuario = dataUsuario;
	}
}
