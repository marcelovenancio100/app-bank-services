package br.org.cip.entities;

import java.util.Date;

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
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="Cliente", uniqueConstraints={@UniqueConstraint(columnNames={"codigo"})})
@SequenceGenerator(name="sequence", sequenceName="default_sequence", allocationSize=5)
@DynamicUpdate
public class Cliente {
	public static final int TI_CPF = 0;
	public static final int TI_CNPJ = 1;

	@Id
	@GeneratedValue(generator="sequence")
	private Long id;
	
	@NotNull
	@Size(max=10)
	private String codigo;
	
	private Date dataCadastro;
	
	@NotNull
	private Integer ti;
	
	@NotNull
	@Size(max=14)
	private String ni;
	
	@NotNull
	@Size(max=100)
	private String nome;
	
	@NotNull
	@Size(max=100)
	private String email;
	
	@NotNull
	@Size(max=25)
	private String telefone;
	
	@NotNull
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="conta", nullable=false)
	private ContaCorrente conta;

	@Size(max=100)
	private String endereco;

	private Integer numero;
	
	@Size(max=50)
	private String complem;
	
	@Size(max=50)
	private String bairro;
	
	@Size(max=100)
	private String municipio;
	
	@Size(max=2)
	private String uf;
	
	@NotNull
	@Size(max=50)
	private String dataUsuario;
	
	public Cliente() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Integer getTi() {
		return ti;
	}

	public void setTi(Integer ti) {
		this.ti = ti;
	}

	public String getNi() {
		return ni;
	}

	public void setNi(String ni) {
		this.ni = ni;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ContaCorrente getConta() {
		return conta;
	}

	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplem() {
		return complem;
	}

	public void setComplem(String complem) {
		this.complem = complem;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getDataUsuario() {
		return dataUsuario;
	}

	public void setDataUsuario(String dataUsuario) {
		this.dataUsuario = dataUsuario;
	}

	public static int getTiCpf() {
		return TI_CPF;
	}

	public static int getTiCnpj() {
		return TI_CNPJ;
	}
}
