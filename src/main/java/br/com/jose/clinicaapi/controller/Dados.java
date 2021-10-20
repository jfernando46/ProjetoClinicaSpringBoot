package br.com.jose.clinicaapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jose.clinicaapi.model.Cliente;


/*
 * Em nosso projeto iremos utilzar algumas anotações(Annotations) que 
 * são elementos de tipificação de código, ou seja , são aplicações que
 * fazemos no código para informar o que aquela linha ou grupo de comando
 * deve fazer e como deve ser entendido.
 * No caso abaixo, estamos dizendo que nossa classe Dados é um controlador 
 * de fluxo que receberá comandos em Rest e Responderá dados no formato 
 * Rest.
 */




@RestController
@RequestMapping("/") 
public class Dados {

  @GetMapping	
  public String inicial() {
	return "Olá! Você está na página inicial do projeto";
  }
  
  @GetMapping("/cliente")
  public String cliente() {
	  return "Heloisa Nascimento";
  }
  @GetMapping("/clientes")
  public List<Cliente> clientes() {
	List<Cliente> lst = new ArrayList<CLiente>();
	Cliente c1 = new Cliente();
	Cliente c2 = new Cliente();
	
	c1.setNome("Wagner");
	c2.setEndereco("Vanessa");
	
	lst.add(c1);
	lst.add(c2);
	
	return lst;
  }
  
  @PostMapping("/cadastro")
  public String cadastro() {
	  return "Cadastro realizado";
  }

  @PutMapping("/atualizar")
  public String atualizar() {
	  return "Dados aualizados";
  }
  
  @PutMapping("/apagar")
  public String apagar() {
	  return "Dados apagados";
  }
}
  