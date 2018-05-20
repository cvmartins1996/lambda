package com.treinamento.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {
	public static void main(String[] args) {
		
		List<String> nomes = Arrays.asList("CV", "V", "M");
		
		long tempoInicio = System.currentTimeMillis();
		for (String nome : nomes) {
			System.out.println("nome do cara : " + nome);
		}
		
		nomes.forEach(nome -> System.out.println("nome do cara: " + nome));
		
		System.out.println("Quadrado de n números");
		
		List<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		
		for (int i = 0; i < 2000; i++) {
			numeros.add(random.nextInt(9999));
		}
		
		long tempoFim = System.currentTimeMillis();
		numeros.forEach(n -> System.out.println("quadrado dos numeros: " + n * n));
		System.out.println("Execução do metódo " + ( tempoFim - tempoInicio ));
		
		List<Pessoa> pessoas = Arrays.asList(new Pessoa("boladao", 20), new Pessoa("boladao2", 35) );
		
		pessoas.forEach(p -> System.out.println("nome: "  +  p.getNome() + " idade: " + p.getIdade()));
		
	}
	
}
	class Pessoa {
		private String nome;
		private int idade;
		
		public Pessoa(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}
		
		public int getIdade() {
			return idade;
		}
		
		public String getNome() {
			return nome;
		}
		
	}
