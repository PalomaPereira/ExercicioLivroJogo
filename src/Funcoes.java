
public class Funcoes {

	public static void EscolhaLanterna() {
		// Aqui o que acontece se ele escolher lanterna
		System.out.println("Ao acender a lanterna, voce viu um simbolo antigo");
		System.out.println("$$$$$$$$$$$$$$$$$L   .$$$$$$$$$$$$$$$u");
		System.out.println("$$$$$$$$$$$$$$$$$$N.@$$$$$$$$$$$$$$$$ *");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ '>.n=L");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$RR$$$$ 'b\"  9");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$R#\"  .$$$$ @   .*");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$`   .e$$$$$$$P   e\"");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$R#    o$$$$$$$$P   @");
		System.out.println("$$$$$$$$$$$$$$$$$$$P\" .e> 4$\" '$$$$F  .F");
		System.out.println("$$$$$$$$$$$$$$$$$R  .$$$& '$   $$$$  .#>");
		System.out.println("$$$$$$$$$$$$$$$$$b.o$$$$$  $N  \"$$\" .\"'>");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$  $$N  \"` .$ '>");
		System.out.println("$$$$$$$$$$$$$$ \"$$$$$$$$R  $$$&    $$ '>");
		System.out.println("$$$$$$$$$$$$$$  E\"$$P`9$E  $$$$   8$$ '>");
		System.out.println("$$$$$$$$$$$$$$  E  \"  9$F  $$$$k .$$$ '>");
		System.out.println("$$$$$$$$$$$$$$  E     9$N  $$$$$$$$$$ '>");
		System.out.println("$$$$$$$$$$$$$$  E     9$$.u$$$$$$$$$$ '>");
		System.out.println("$$$$$$$$$$$$$$ o\"     9$$$$$$$$$$$$$$ d");
		System.out.println("**************#       ***************\"");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}

	public static void EscolhaSimbolo() {
		// O que acontece se ele escolher o s�mbolo
		System.out.println("Voc� decidiu investigar o s�mbolo... Music Television... O que � isso?");
		System.out.println(".");
		System.out.println("..");
		System.out.println("...");
		System.out.println(
				"BUM! Enquanto voc� confabula, a parede explode! Quando a poeira baixa, Supla est� do outro lado em sua moto.");
		System.out.println(
				"Infelizmente isso foi o suficiente para que Snarf fugisse com ele para viver grandes aventuras.");
		System.out.println("GAME OVER");
	}

	public static void EscolhaPorta() {
		// O que acontece se ele escolher porta
		System.out.println(
				"Ao caminhar at� a porta voc� nota que as cordas do seu baixo come�am a vibrar... Alguma frequ�ncia as agita.");
	}

	public static void EscolhaVerificarMiado(String escolha, String nome) {
		if (escolha.equalsIgnoreCase("SIM")) {
			// Caso ele escolha cruzar a porta
			System.out.println(
					"Ao cruzar a porta voc� encontra ele, o pequeno Snarf, bochechando o saco de ra��o e esperando ansiosamente por voc�");
			System.out.println(
					"Quando voc� coloca a ra��o, o pequeno felino rola de tanta alegria e te d� pequenas mordidas carinhosas na m�o");
			System.out
					.println("Esse � o maior pr�mio que algu�m pode receESPERE! TEM ALGO NO CH�O, AO LADO DO GATINHO!");
			System.out.println(
					"Voc� verifica o que te chamou a aten��o e um pequeno brilho revela... UMA FORTUNA! Voc� agora � um rico tutor de gatos! Parab�ns, "
							+ nome);
		} else {
			// Caso ele escolha n�o cruzar a porta
			System.out.println(
					"Sua indecis�o foi seu fim... Enquanto voc� pensava, o miado foi se distanciando at� se tornar inaud�vel. GAME OVER");
		}
	}

	public static void EscolhaGarrafa(String escolha, String nome) {
		if (escolha.equalsIgnoreCase("sim")) {
			// Aqui o que acontece se ele escolher encher a garrafa
			System.out.println("O Snarf ouviu o barulho da �gua e veio at� voc�");
			System.out.println(
					"Voc� usa a lanterna e v� a porta aberta, por onde o snarf saiu. L� est� um saco de ra��o!");
			System.out.println(
					"Quando voc� coloca a ra��o, o pequeno felino rola de tanta alegria e te d� pequenas mordidas carinhosas na m�o");
			System.out.println("Esse � o maior pr�mio que algu�m pode receber, " + nome);
		} else {
			// Aqui o que acontece se ele n�o encher a garrafa
			System.out.println("Um aventureiro desitradado � um aventureiro em perigo, " + nome
					+ "!\nInfelizmente suas pedras renais te lembraram disso e voc� est� fora da jogada! GAME OVER!");
		}
	}
}
