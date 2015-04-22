package gestionealbergo;

import java.time.*;

public class Prenotazione
{
	private LocalDateTime arrivoIl;
	private LocalDateTime clienteArrivaIl;
	private LocalDateTime effettuataIl;
	private String richieste;
	private int numroNotti;
	
	
	
	public Prenotazione(LocalDateTime arrivoIl, LocalDateTime clienteArrivaIl,
			LocalDateTime effettuataIl, String richieste, int numroNotti)
	{
		super();
		this.arrivoIl = arrivoIl;
		this.clienteArrivaIl = clienteArrivaIl;
		this.effettuataIl = effettuataIl;
		this.richieste = richieste;
		this.numroNotti = numroNotti;
	}
	
	public LocalDateTime getArrivoIl() 
	{	
		return arrivoIl;
	}
	
	public void setArrivoIl(LocalDateTime arrivoIl)
	{
		this.arrivoIl = arrivoIl;
	}
	
	public LocalDateTime getClienteArrivaIl()
	{
		return clienteArrivaIl;
	}
	
	public void setClienteArrivaIl(LocalDateTime clienteArrivaIl)
	{
		this.clienteArrivaIl = clienteArrivaIl;
	}
	
	public LocalDateTime getEffettuataIl()
	{
		return effettuataIl;
	}
	
	public void setEffettuataIl(LocalDateTime effettuataIl) 
	{
		this.effettuataIl = effettuataIl;
	}
	
	public String getRichieste() 
	{
		return richieste;
	}
	
	public void setRichieste(String richieste) 
	{
		this.richieste = richieste;
	}
	
	public int getNumroNotti() 
	{
		return numroNotti;
	}
	
	public void setNumroNotti(int numroNotti) 
	{
		this.numroNotti = numroNotti;
	}
	
}
