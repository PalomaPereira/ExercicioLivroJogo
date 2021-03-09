import java.util.Scanner;

/* Exemplo de adventure text, proposto aos alunos do módulo de
 * lógica de programação da imersão Java Xpert
 * */
public class SnarfAdventures {

	public static void main(String[] args) {

		String nome;
		String escolha;
		Scanner leitor = new Scanner(System.in);
		System.out.println("SNARF ADVENTURES");
		System.out.println("Um jogo de André David");

		System.out.println(
				"Seu objetivo é enfrentar os perigos para que voce consiga alimentar o FEROZ e TERRÍVEL Snarf. Qual é seu nome, aventureiro?");
		nome = leitor.next();

		System.out.println("Voce está pronto para começar? SIM ou NÃO");
		escolha = leitor.next();

		if (escolha.equalsIgnoreCase("sim")) {
			// Aqui eu dou sequencia na história na parte do sim
			System.out.println(
					"Voce está em uma sala escura. Não ve nada. Mas tem uma LANTERNA, uma GARRAFA e um BAIXO. Qual objeto deseja usar?");
			escolha = leitor.next();
			if (escolha.equalsIgnoreCase("lanterna")) {
				Funcoes.EscolhaLanterna();
				System.out.println(
						"Além do símbolo antigo, você encontrou também uma porta. Deseja investigar o SIMBOLO ou a PORTA?");
				escolha = leitor.next();

				if (escolha.equalsIgnoreCase("SIMBOLO")) {
					Funcoes.EscolhaSimbolo();
				} else if (escolha.equalsIgnoreCase("PORTA")) {
					Funcoes.EscolhaPorta();
					System.out.println("Você deseja tocar as mesmas cordas para encontrar a frequência certa?");
					System.out.println("SIM ou NÃO");
					escolha = leitor.next();

					if (escolha.equalsIgnoreCase("SIM")) {
						System.out.println(
								"EXCELENTE ideia! Ao tocar as notas LÁ, LÁ, LÁ, LÁ, RÉ, MI, a tranca se abre! Hey, Ho, Let's go!");
						System.out.println(
								"Enquanto você decide se entra ou não pela porta, ouve um miado. Deseja VER o que está acontecendo? SIM ou NÃO");
						escolha = leitor.next();
						Funcoes.EscolhaVerificarMiado(escolha, nome);
					} else {
						// Caso escolha não tocar o baixo
						System.out.println(
								"Sua indecisão foi seu fim... Enquanto você pensava, ouve um miado que foi se distanciando até se tornar inaudível. GAME OVER");
					}

				} else {
					// O que acontece se ele escrever qualquer outra coisa
					System.out.println(
							"O faminto Snarf não pode esperar a sua coragem surgir. Voce está fora da jogada... GAME OVER");
				}

			} else {
				if (escolha.equalsIgnoreCase("garrafa")) {
					// Aqui o que acontece se ele escolher garrafa
					System.out.println(
							"A sua garrafa parece vazia. O Snarf pode ter sede. Deseja encher a garrafa? SIM ou NÃO");
					escolha = leitor.next();
					Funcoes.EscolhaGarrafa(escolha, nome);
				} else {
					if (escolha.equalsIgnoreCase("baixo")) {
						// Aqui o que acontece se ele escolher baixo
						System.out.println(
								"Você começa a tocar e lembra da canção favorita do seu gatinho. Infelizmente, a lembrança não te motiva a seguir a aventura, e você acaba adormecendo. GAME OVER.");
					} else {
						System.out.println(
								"Que pena. Voce se atrapalhou na hora de escolher e um aventureiro mais bem preparado já conquistou o premio. GAME OVER");
					}
				}
			}
		} else {
			System.out.println(
					"O faminto Snarf não pode esperar a sua coragem surgir. Voce está fora da jogada... GAME OVER");
		}
		leitor.close();
	}
}
