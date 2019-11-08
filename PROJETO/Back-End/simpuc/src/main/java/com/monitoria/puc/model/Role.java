package com.monitoria.puc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import org.springframework.security.core.GrantedAuthority;

@Entity(name = "role")
public class Role implements GrantedAuthority {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String nomeRole; /*ROLE_ALUNO OU ROLE_PROFESSOR*/

	@Override
	public String getAuthority() { /*RETORNO O NOME ROLE*/
		return this.nomeRole;
	}
	
	@OneToOne(mappedBy = "role")
    private ModelUsuario usuario;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeRole() {
		return nomeRole;
	}

	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}
}
