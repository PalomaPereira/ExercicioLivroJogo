import java.util.Scanner;

/* Exemplo de adventure text, proposto aos alunos do m�dulo de
 * l�gica de programa��o da imers�o Java Xpert
 * */
public class SnarfAdventures {

	public static void main(String[] args) {

		String nome;
		String escolha;
		Scanner leitor = new Scanner(System.in);
		System.out.println("SNARF ADVENTURES");
		System.out.println("Um jogo de Andr� David");

		System.out.println(
				"Seu objetivo � enfrentar os perigos para que voce consiga alimentar o FEROZ e TERR�VEL Snarf. Qual � seu nome, aventureiro?");
		nome = leitor.next();

		System.out.println("Voce est� pronto para come�ar? SIM ou N�O");
		escolha = leitor.next();

		if (escolha.equalsIgnoreCase("sim")) {
			// Aqui eu dou sequencia na hist�ria na parte do sim
			System.out.println(
					"Voce est� em uma sala escura. N�o ve nada. Mas tem uma LANTERNA, uma GARRAFA e um BAIXO. Qual objeto deseja usar?");
			escolha = leitor.next();
			if (escolha.equalsIgnoreCase("lanterna")) {
				Funcoes.EscolhaLanterna();
				System.out.println(
						"Al�m do s�mbolo antigo, voc� encontrou tamb�m uma porta. Deseja investigar o SIMBOLO ou a PORTA?");
				escolha = leitor.next();

				if (escolha.equalsIgnoreCase("SIMBOLO")) {
					Funcoes.EscolhaSimbolo();
				} else if (escolha.equalsIgnoreCase("PORTA")) {
					Funcoes.EscolhaPorta();
					System.out.println("Voc� deseja tocar as mesmas cordas para encontrar a frequ�ncia certa?");
					System.out.println("SIM ou N�O");
					escolha = leitor.next();

					if (escolha.equalsIgnoreCase("SIM")) {
						System.out.println(
								"EXCELENTE ideia! Ao tocar as notas L�, L�, L�, L�, R�, MI, a tranca se abre! Hey, Ho, Let's go!");
						System.out.println(
								"Enquanto voc� decide se entra ou n�o pela porta, ouve um miado. Deseja VER o que est� acontecendo? SIM ou N�O");
						escolha = leitor.next();
						Funcoes.EscolhaVerificarMiado(escolha, nome);
					} else {
						// Caso escolha n�o tocar o baixo
						System.out.println(
								"Sua indecis�o foi seu fim... Enquanto voc� pensava, ouve um miado que foi se distanciando at� se tornar inaud�vel. GAME OVER");
					}

				} else {
					// O que acontece se ele escrever qualquer outra coisa
					System.out.println(
							"O faminto Snarf n�o pode esperar a sua coragem surgir. Voce est� fora da jogada... GAME OVER");
				}

			} else {
				if (escolha.equalsIgnoreCase("garrafa")) {
					// Aqui o que acontece se ele escolher garrafa
					System.out.println(
							"A sua garrafa parece vazia. O Snarf pode ter sede. Deseja encher a garrafa? SIM ou N�O");
					escolha = leitor.next();
					Funcoes.EscolhaGarrafa(escolha, nome);
				} else {
					if (escolha.equalsIgnoreCase("baixo")) {
						// Aqui o que acontece se ele escolher baixo
						System.out.println(
								"Voc� come�a a tocar e lembra da can��o favorita do seu gatinho. Infelizmente, a lembran�a n�o te motiva a seguir a aventura, e voc� acaba adormecendo. GAME OVER.");
					} else {
						System.out.println(
								"Que pena. Voce se atrapalhou na hora de escolher e um aventureiro mais bem preparado j� conquistou o premio. GAME OVER");
					}
				}
			}
		} else {
			System.out.println(
					"O faminto Snarf n�o pode esperar a sua coragem surgir. Voce est� fora da jogada... GAME OVER");
		}
		leitor.close();
	}
}
