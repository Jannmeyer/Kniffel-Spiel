import java.util.Random;

public class W�rfel {
	
	public int getZahl() {
	Random w�rfel = new Random();
	int Zahl = 0;

	for (int i=0; i<10; i++){
		Zahl = 1 + w�rfel.nextInt(6);
		}
	return Zahl;
	}
}
