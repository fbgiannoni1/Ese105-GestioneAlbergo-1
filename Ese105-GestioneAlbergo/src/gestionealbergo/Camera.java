package gestionealbergo;

import java.time.*;
 
abstract public class Camera
{
	private String numero;	
	
	public Camera(String numero) 
	{
		super();
		this.numero = numero;
	}

	public String getNumero() 
	{
		return numero;
	}

	public void setNumero(String numero) 
	{
		this.numero = numero;
	}
	
	public void addPrenotazione(Prenotazione p)
	{
		
	}
	
	public boolean isDisponibile(LocalDataTime dal, LocalDataTime al)
	{
	
	}
	
}
