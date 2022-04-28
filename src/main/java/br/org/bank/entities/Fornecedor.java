package br.org.bank.entities;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="Fornecedor", uniqueConstraints={@UniqueConstraint(columnNames={"codigo"})})
@SequenceGenerator(name="sequence", sequenceName="default_sequence", allocationSize=5)
@DynamicUpdate
public class Fornecedor implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final int GENERO_MASCULINO = 0;
	public static final int GENERO_FEMININO = 1;
	public static final int GENERO_NAO_DEFINIDO = 2;
	
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
	
	private Integer genero;
	
	public Fornecedor() {
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

	public Integer getGenero() {
		return genero;
	}

	public void setGenero(Integer genero) {
		this.genero = genero;
	}

	public static int getGeneroMasculino() {
		return GENERO_MASCULINO;
	}

	public static int getGeneroFeminino() {
		return GENERO_FEMININO;
	}

	public static int getGeneroNaoDefinido() {
		return GENERO_NAO_DEFINIDO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
