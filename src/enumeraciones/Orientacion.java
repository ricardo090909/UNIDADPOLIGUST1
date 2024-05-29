package enumeraciones;

public enum Orientacion {
	NORTE{
		public String getOrientation() {
			return "Norte";
		}
	},
	SUR{
		public String getOrientation() {
			return "Sur";
		}
	},
	ORIENTE{
		public String getOrientation() {
			return "Oriente";
		}
	},
	PONIENTE{
		public String getOrientation() {
			return "Poniente";
		}
	};
	public abstract String getOrientation();
}
