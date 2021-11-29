package padroes.observer;

public class Namorada implements ObservadorChegadaAniversariante{

	@Override
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Esta chegando....");
		System.out.println("Silencio....");
		System.out.println("Surpresa !!!!!");
	}

}
