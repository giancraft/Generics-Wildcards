package atv4;

public class Main {

	public static void main(String[] args) {
		Generic<Integer> generic1 = new Generic<>("1", 54);
		Generic<Integer> generic2 = new Generic<>("1", 32);
		generic1.addLista(generic1);
		generic1.addLista(generic2);
		System.out.println(generic1.buscaPorChave(generic1));
	}
}
