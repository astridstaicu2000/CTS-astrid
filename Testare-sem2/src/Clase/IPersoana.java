package Clase;

import Exceptii.ExceptieCNPGresit;

public interface IPersoana {
	public String getSex();
	
	public int getVarsta() throws ExceptieCNPGresit;
	
	public boolean checkCNP();
}
