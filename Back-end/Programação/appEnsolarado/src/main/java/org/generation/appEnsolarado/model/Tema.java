package org.generation.appEnsolarado.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity //entidade, faz com que o programa trabalhe com tabelas
@Table(name = "tb_tema") //criação da tabela tema no mysql
public class Tema {

	@Id //define id como chave principal
	@GeneratedValue(strategy = GenerationType.IDENTITY) //gera os valores altomaticamente conforme a pessoa posta algo
	private long id;
	
	@NotNull //o campo tem que ser preenchido
	@Size(min = 3, max = 100) //tamanho do tema
	private String nometema;
	
	@Size(min = 3, max = 255) //tamanho da descrição
	private String descricao;
	
	private int quantidadePostes;

	//Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeTema() {
		return nometema;
	}

	public void setNomeTema(String nometema) {
		this.nometema = nometema;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadePostes() {
		return quantidadePostes;
	}

	public void setQuantidadePostes(int quantidadePostes) {
		this.quantidadePostes = quantidadePostes;
	}
}
