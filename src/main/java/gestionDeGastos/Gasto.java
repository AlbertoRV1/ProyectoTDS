package gestionDeGastos;

import java.time.LocalDate;

public class Gasto {	
	private double cantidad;
	private LocalDate fecha;
	private Categoria categoria;
	
	public Gasto(int cantidad, LocalDate fecha, Categoria categoria) {
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.categoria = categoria;
	}

	/*
	public Boolean pasaFiltro(Predicate<Gasto> filtro) {
		return filtro.test(this);
	}
	*/
	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
