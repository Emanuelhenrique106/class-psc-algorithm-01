import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontosAlegria = 0;
        int pontosTristeza = 0;
        
        //Scanner para interpretar  as mensagens que serao digitadas

        System.out.println("--- A Vida de Riley na Nova Cidade ---");

        // 1. Amizade de riley na nova cidade
        
        
        System.out.print("Riley fez novas amizades? (sim/nao): ");
        if (scanner.next().equalsIgnoreCase("sim")) {
            System.out.print("Quantas? ");
            pontosAlegria += scanner.nextInt() * 10;
        } else {
            pontosTristeza += 30;
        }

        // 2. notas das tres atividades A1, A2, A3 
        
        
        System.out.print("Digite as notas das 3 provas (A1 A2 A3): ");
        double media = (scanner.nextDouble() + scanner.nextDouble() + scanner.nextDouble()) / 3;
        
        //media  das emoçoes
        
        if (media >= 7.0) {
            pontosAlegria += 50;
        } else {
            pontosTristeza += 50;
        }
        System.out.printf("Média final: %.2f\n", media);

        // 3. Exercícios dos 10 algoritimos
        System.out.print("Dos 10 algoritmos, quantos Riley resolveu? ");
        int exerciciosFeitos = scanner.nextInt();
        pontosAlegria += exerciciosFeitos * 10;
        pontosTristeza += (10 - exerciciosFeitos) * 10;

        // 4. Resultado Final
        System.out.println("\n--- Pontuação Final ---");
        System.out.println("Alegria: " + pontosAlegria);
        System.out.println("Tristeza: " + pontosTristeza);

        if (pontosAlegria > pontosTristeza) {
            System.out.println("Conclusão: A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("Conclusão: A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }

        scanner.close();
    }
}
	
		
		
		
		
		
	

	


