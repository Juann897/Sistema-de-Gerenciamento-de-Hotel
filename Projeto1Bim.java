import java.util.Scanner;

public class Projeto1Bim {

    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        String[] nomesHospedes = new String[100];
        int[] numerosReserva = new int[100];
        boolean[] statusQuartos = new boolean[100];
        int[][] consumoFrigobar = new int[100][4];
        String nomeHospede = "";
        int numQuarto = 0;
        int indice = -1;
        int contadorReserva = 1;
        boolean continuar = true;
        int quarto = 0;
        int opcao2 = -1;
        int qtdDiarias = 0;
        int valDiaria = 500;
        int valTotalDiarias = 0;
        int valAgua = 5;
        int valRefri = 8;
        int valSuco = 6;
        int valChocolate = 4;
        int valTotalAgua, valTotalRefri, valTotalSuco, valTotalChocolate, valTotalFrigobar, valTotalHospedagem = 0;
        boolean encontrou = false;



        for (int i = 0; i < 100; i++){
            statusQuartos[i] = false;
        }
        
        while (continuar == true) {

            int opcao = -1;

            System.out.println("============================================");
            System.out.println("             Menu Interativo");
            System.out.println("============================================");
            System.out.println("1 - Reservar quarto");
            System.out.println("==----------------------------------------==");
            System.out.println("2 - Cancelar reserva");
            System.out.println("==----------------------------------------==");
            System.out.println("3 - Listar reservas");
            System.out.println("==----------------------------------------==");
            System.out.println("4 - Consultar hóspede");
            System.out.println("==----------------------------------------==");
            System.out.println("5 - Editar hóspede");
            System.out.println("==----------------------------------------==");
            System.out.println("6 - Registrar consumo do frigobar");
            System.out.println("==----------------------------------------==");
            System.out.println("7 - Check-out");
            System.out.println("==----------------------------------------==");
            System.out.println("0 - Sair");
            System.out.println("============================================");

            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("Digite a opção que deseja: ");
            opcao = entradaDados.nextInt();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

            switch (opcao) {
                case 1: {

                    entradaDados.nextLine();
                    System.out.print("Digite seu nome: ");
                    nomeHospede = entradaDados.nextLine();
                    System.out.println("--------------------------------------------");
                    System.out.print("Digite o número do quarto que deseja: ");
                    numQuarto = entradaDados.nextInt();
                    if (numQuarto < 1 || numQuarto > 100){
                        System.out.println("--------------------------------------------");
                        System.out.println("Quarto inválido");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    }else{
                        indice = numQuarto - 1;
                        if (statusQuartos[indice] == true){
                            System.out.println("--------------------------------------------");
                            System.out.println("Quarto indisponivel para reserva!");
                            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        }else {
                            System.out.println("--------------------------------------------");
                            System.out.println("Pronto " + nomeHospede + ", quarto reservado com sucesso!");
                            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                            statusQuartos[indice] = true;
                            nomesHospedes[indice] = nomeHospede;
                            numerosReserva[indice] = contadorReserva;
                            contadorReserva ++;
                        }
                    }
                    break;

                }
                    
                case 2: {

                    System.out.print("Qual quarto deseja cancelar: ");
                    int qConsultado = entradaDados.nextInt();
                    if (qConsultado < 1 || qConsultado > 100){
                        System.out.println("--------------------------------------------");
                        System.out.println("Quarto inválido");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    }else{
                        indice = qConsultado - 1;
                        if (statusQuartos[indice] == false){
                            System.out.println("--------------------------------------------");
                            System.out.println("Este quarto não está ocupado!");
                            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        }else{
                            System.out.println("==---------------------------------------==");
                            System.out.println("Pronto, a reserva do quarto " + qConsultado + ", do hóspede " + nomesHospedes[indice] + ", foi cancelada com sucesso!");
                            System.out.println("==---------------------------------------==");

                            nomesHospedes[indice] = "";
                            numerosReserva[indice] = -1;
                            statusQuartos[indice] = false;
                            for (int i = 0; i < 4; i++){
                                consumoFrigobar[indice][i] = 0;
                            }
                        }
                    }
                    break;

                }

                case 3: {
                    
                    encontrou = false;
                    for (int i = 0; i < 100; i++){
                        if (statusQuartos[i] == true){
                            quarto = i + 1;
                            System.out.println("==---------------------------------------==");
                            System.out.println("Nome do hóspede: " + nomesHospedes[i]);
                            System.out.println("Número da reserva: " + numerosReserva[i]);
                            System.out.println("Número do quarto: " + quarto);
                            System.out.println("==---------------------------------------==");
                            encontrou = true;
                        }
                    }
                    if (encontrou == false){
                            System.out.println("--------------------------------------------");
                            System.out.println("Nenhuma reserva encontrada!");
                            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    }

                    break;
                }

                case 4: {
                    
                    System.out.print("Qual quarto deseja consultar: ");
                    int qConsultado = entradaDados.nextInt();
                    if (qConsultado < 1 || qConsultado > 100){
                        System.out.println("--------------------------------------------");
                        System.out.println("Quarto inválido");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    }else{
                        indice = qConsultado - 1;
                        if (statusQuartos[indice] == false){
                            System.out.println("--------------------------------------------");
                            System.out.println("Este quarto não está ocupado!");
                            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        }else{
                            System.out.println("==---------------------------------------==");
                            System.out.println("Nome do hóspede: " + nomesHospedes[indice]);
                            System.out.println("Número da reserva: " + numerosReserva[indice]);
                            System.out.println("Número do quarto: " + qConsultado);
                            System.out.println("==---------------------------------------==");
                        }
                    }
                    break;
                }

                case 5: {
                    
                    System.out.print("Qual quarto deseja alterar: ");
                    int qConsultado = entradaDados.nextInt();
                    if (qConsultado < 1 || qConsultado > 100){
                        System.out.println("--------------------------------------------");
                        System.out.println("Quarto inválido");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    }else{
                        indice = qConsultado - 1;
                        if (statusQuartos[indice] == false){
                            System.out.println("--------------------------------------------");
                            System.out.println("Este quarto não está ocupado!");
                            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        }else{
                            System.out.println("============================================");
                            System.out.println("                 Opções");
                            System.out.println("============================================");
                            System.out.println("1 - Alterar nome do hóspede");
                            System.out.println("==----------------------------------------==");
                            System.out.println("2 - Alterar número da reserva");
                            System.out.println("==----------------------------------------==");
                            System.out.println("0 - Sair");
                            System.out.println("============================================");
                            System.out.print("Digite a opção desejada: ");
                            opcao2 = entradaDados.nextInt();
                            System.out.println("==----------------------------------------==");

                            switch (opcao2) {
                                case 1:
                                    
                                    entradaDados.nextLine();
                                    System.out.print("Qual o novo nome do hóspede: ");
                                    String novoNome = entradaDados.nextLine();
                                    nomesHospedes[indice] = novoNome;
                                    System.out.println("Nome alterado com sucesso!");
                                    break;
                                
                                case 2:

                                    System.out.print("Qual o novo número da reserva: ");
                                    int novaReserva = entradaDados.nextInt();
                                    numerosReserva[indice] = novaReserva;
                                    System.out.println("Número de reserva alterado com sucesso!");
                                    break;

                                case 0:
                                    break;

                                default:

                                    System.out.println("Opção inválida");
                                    break;
                            }
                        }
                    }
                    break;
                }

                case 6: {
                    
                    System.out.print("Qual quarto deseja registrar o consumo do frigobar: ");
                    int qConsultado = entradaDados.nextInt();
                    if (qConsultado < 1 || qConsultado > 100){
                        System.out.println("--------------------------------------------");
                        System.out.println("Quarto inválido");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    }else{
                        indice = qConsultado - 1;
                        if (statusQuartos[indice] == false){
                            System.out.println("--------------------------------------------");
                            System.out.println("Este quarto não está ocupado!");
                            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        }else{
                            System.out.println("============================================");
                            System.out.println("             Itens do Frigobar");
                            System.out.println("============================================");
                            System.out.println("1 - Água");
                            System.out.println("==----------------------------------------==");
                            System.out.println("2 - Refrigerante");
                            System.out.println("==----------------------------------------==");
                            System.out.println("3 - Suco");
                            System.out.println("==----------------------------------------==");
                            System.out.println("4 - Chocolate");
                            System.out.println("==----------------------------------------==");
                            System.out.println("0 - Sair");
                            System.out.println("============================================");
                            System.out.print("Digite a opção desejada: ");
                            opcao2 = entradaDados.nextInt();
                            System.out.println("==----------------------------------------==");
                            int indiceItem = opcao2 - 1;

                            switch(opcao2){
                                
                                case 1: {
                                    
                                    System.out.println("==----------------------------------------==");
                                    System.out.println("Digite quantas águas foram consumidas: ");
                                    System.out.println("==----------------------------------------==");
                                    int aguas = entradaDados.nextInt();
                                    if (aguas <= 0){
                                        System.out.println("Quantidade inválida!");
                                    }else{
                                        consumoFrigobar[indice][indiceItem] += aguas;
                                        System.out.println("Consumo registrado com sucesso!");
                                        System.out.println("==----------------------------------------==");
                                    }
                                    break;
                                }

                                case 2: {
                                    
                                    System.out.println("==----------------------------------------==");
                                    System.out.println("Digite quantos refrigerantes foram consumidos: ");
                                    System.out.println("==----------------------------------------==");
                                    int refrigerantes = entradaDados.nextInt();
                                    if (refrigerantes <= 0){
                                        System.out.println("Quantidade inválida!");
                                        System.out.println("==----------------------------------------==");
                                    }else{
                                        consumoFrigobar[indice][indiceItem] += refrigerantes;
                                        System.out.println("Consumo registrado com sucesso!");
                                        System.out.println("==----------------------------------------==");
                                    }
                                    break;
                                }

                                case 3: {
                                    
                                    System.out.println("==----------------------------------------==");
                                    System.out.println("Digite quantos sucos foram consumidos: ");
                                    System.out.println("==----------------------------------------==");
                                    int sucos = entradaDados.nextInt();
                                    if (sucos <= 0){
                                        System.out.println("Quantidade inválida!");
                                        System.out.println("==----------------------------------------==");
                                    }else{
                                        consumoFrigobar[indice][indiceItem] += sucos;
                                        System.out.println("Consumo registrado com sucesso!");
                                        System.out.println("==----------------------------------------==");
                                    }
                                    break;
                                }

                                case 4: {
                                    
                                    System.out.println("==----------------------------------------==");
                                    System.out.println("Digite quantos chocolates foram consumidos: ");
                                    System.out.println("==----------------------------------------==");
                                    int chocolates = entradaDados.nextInt();
                                    if (chocolates <= 0){
                                        System.out.println("Quantidade inválida!");
                                        System.out.println("==----------------------------------------==");
                                    }else{
                                        consumoFrigobar[indice][indiceItem] += chocolates;
                                        System.out.println("Consumo registrado com sucesso!");
                                        System.out.println("==----------------------------------------==");
                                    }
                                    break;
                                }

                                case 0: {
                                    break;
                                }
                                
                                default:
                                    System.out.println("Opção inválida");
                                    break;
                                    
                            }
                        }
                    }
                    break;
                }

                case 7: {
                    
                    System.out.print("Qual quarto deseja encerrar a hospedagem: ");
                    int qConsultado = entradaDados.nextInt();
                    if (qConsultado < 1 || qConsultado > 100){
                        System.out.println("--------------------------------------------");
                        System.out.println("Quarto inválido");
                        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    }else{
                        indice = qConsultado - 1;
                        if (statusQuartos[indice] == false){
                            System.out.println("--------------------------------------------");
                            System.out.println("Este quarto não está ocupado!");
                            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                        }else{
                            System.out.println("==---------------------------------------==");
                            System.out.println("Digite a quantidade de diarias: ");
                            qtdDiarias = entradaDados.nextInt();
                            if (qtdDiarias <= 0){
                                System.out.println("--------------------------------------------");
                                System.out.println("Quantidade de diarias invalida!");
                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                            }else{
                                valTotalDiarias = qtdDiarias * valDiaria;
                                System.out.println("==---------------------------------------==");
                                valTotalAgua = consumoFrigobar[indice][0] * valAgua;
                                valTotalRefri = consumoFrigobar[indice][1] * valRefri;
                                valTotalSuco = consumoFrigobar[indice][2] * valSuco;
                                valTotalChocolate = consumoFrigobar[indice][3] * valChocolate;
                                valTotalFrigobar = valTotalAgua + valTotalRefri + valTotalSuco + valTotalChocolate;
                                valTotalHospedagem = valTotalDiarias + valTotalFrigobar;

                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                System.out.println("             Resumo da conta");
                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                System.out.println("Nome do hóspede: " + nomesHospedes[indice]);
                                System.out.println("==---------------------------------------==");
                                System.out.println("Número do quarto: " + qConsultado);
                                System.out.println("==---------------------------------------==");
                                System.out.println("Total de diarias: " + qtdDiarias);
                                System.out.println("Valor total das diarias: R$" + valTotalDiarias);
                                System.out.println("==---------------------------------------==");
                                System.out.println("Valor total dos consumos do frigobar: R$" + valTotalFrigobar);
                                System.out.println("==---------------------------------------==");
                                System.out.println("Valor total a pagar: R$" + valTotalHospedagem);
                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                                System.out.println("Check-out realizado com sucesso!");
                                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

                                statusQuartos[indice] = false;
                                for (int i = 0; i < 4; i++){
                                    consumoFrigobar[indice][i] = 0;
                                }
                                nomesHospedes[indice] = "";
                                numerosReserva[indice] = -1;
                            }
                        }
                    }
                    break;
                }
                
                case 0: {
                    continuar = false;
                    break;
                }
            
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        entradaDados.close();
        
    }
}