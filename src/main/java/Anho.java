
public class Anho {
	private int anho;
	
	public Anho(){
		anho=-1;
	}
	
	public Anho(int anho){
		this.anho = anho;
	}
	
	public int getAnho() {
		return anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}
	
	public boolean esAnho(){
		if (anho<0)
			return false;
		else
			return true;
	}
	
	public boolean esBisiesto(){
		if (anho%4==0)
			if (anho%100 == 0)
				if(anho%400 == 0)
					return true;
				else
					return false;
			else
				return true;
		else
			return false;
	}
}
