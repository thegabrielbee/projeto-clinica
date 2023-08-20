package datas;

public class Datas {

	int dia, mes, ano;
	int hora = 0, minuto = 0;

	public Datas(int dia, int mes, int ano) {
			
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
			
	}
	
	public Datas(int dia, int mes, int ano, int hora, int minuto) {
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.minuto = minuto;
		
	}
	
	
	@Override
    public String toString() {
        return dia + "/" + mes + "/" + ano + " " + hora + ":" + minuto;
    }
	
}
