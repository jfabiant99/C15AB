package prueba06;

import java.util.List;

public class MateServicios {
	private String curso;
	private IMatematica mate;
	private List<String> lista;

	public void setMate(IMatematica mate) {		
		this.mate = mate;
	}
	
	public int Calcular_suma(int numero01, int numero02) {
		System.out.println("Curso: " + curso);
		return mate.sumar(numero01, numero02);
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}
	
	public void mostrarLista() {
		for (String dato:lista) {
			System.out.println(dato);
		}
	}
}
