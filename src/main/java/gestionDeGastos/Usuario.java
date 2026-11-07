package gestionDeGastos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Usuario{
	private final String nombre;
	private final List<Gasto> registroGastos;
	private final List<Categoria> categorias;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		//Ventajas de LinkedList: Es más rapido añadir nuevas entradas a la lista
		//Ventajas de ArrayList: Se recorren más rapido
		//Suponiendo que se haran más consultas que modificaciones, usamos ArrayList
		registroGastos = new ArrayList<Gasto>();
		categorias = new ArrayList<Categoria>();
	}
	
	public List<Gasto> filtrar(Predicate<Gasto> filtro) {
		List<Gasto> listaFiltrada = new ArrayList<Gasto>();
		registroGastos.stream().filter(filtro).forEach(t -> listaFiltrada.add(t));
		return listaFiltrada;
	}
	
	public void addGasto(Gasto g) {
		registroGastos.add(g);
	}
	
	//Por implementar:
	public boolean removeGasto(long id) {
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Gasto> getRegistroGastos() {
		return Collections.unmodifiableList(registroGastos);
	}
	
}
