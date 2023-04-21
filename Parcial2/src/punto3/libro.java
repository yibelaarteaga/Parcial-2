package punto3;
import java.util.Scanner;
public class libro {
 
	public libro(String paginas20, int copias6) {
		
		
	}
	public int paginas20;
	public int autor;
	public int titulo;
	public int ISBN;
	public int numerodepaginas;
	public int copias6;
	private String paginas;
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner (System.in) ){
			System.out.println("El libro con ISBN creado por el autor tiene paginas");
			sc.next();
			System.out.println("numero de paginas");
			sc.next();
		}
		
	}
	
 public String numero_de_paginas_del_libro() {
	 return "el libro contiene paginas20"+ "autor" + "titulo" + "copias6";
	  
 }
 
 public void numero_de_copias_del_libro( String paginas_copias) {
	  setPaginas(paginas_copias);
 }

public String getPaginas() {
	return paginas;
}

public void setPaginas(String paginas) {
	this.paginas = paginas;
}
}
