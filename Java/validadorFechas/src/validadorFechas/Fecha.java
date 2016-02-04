package validadorFechas;

public class Fecha {
		private int dia = 0;
		private int mes = 0;
		private int a�o = 0;
		
		public Fecha(int dia, int mes, int a�o){
			this.setDia(dia);
			this.setMes(mes);
			this.setA�o(a�o);
		}

		public int getDia() {
			return dia;
		}

		public void setDia(int dia) {
			this.dia = dia;
		}

		public int getMes() {
			return mes;
		}

		public void setMes(int mes) {
			this.mes = mes;
		}

		public int getA�o() {
			return a�o;
		}

		public void setA�o(int a�o) {
			this.a�o = a�o;
		}
		
		public int getDiasMes(int mes){
			switch(mes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				if ( ((this.getA�o() % 4 == 0 && ! (this.getA�o() % 100 == 0) )|| (this.getA�o() % 400 == 0))){
					return 29;
				}else{
					return 28;
				}
			default: 
				return 0;
				}
		
		
			}
		
		public boolean checkFecha(){
			if (this.getDia() <= this.getDiasMes(this.getMes())){
				return true;
			}else{
				return false;
			}
			}
		}
		
		


