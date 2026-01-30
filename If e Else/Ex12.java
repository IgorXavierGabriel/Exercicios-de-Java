import java.util.Scanner;

class Ex12{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da sua hora de trabalho:  ");
        double valor = scan.nextDouble();
        System.out.println("Digite a quantidade de horas totais trabalhadas no mes: ");
        double hora = scan.nextDouble();
        double salario = hora * valor; 
        double ir = salario *0.05;
        double ir2 = salario *0.1;
        double ir3 = salario *0.2;
        double fgts = salario * 0.11;
        double inss = salario * 0.1;
        double sindicato = salario * 0.03;
        double salarioLiquido = salario - (sindicato + inss);
        double salarioLiquido2 = salario - (sindicato + inss + ir);
        double salarioLiquido3 = salario - (sindicato + inss + ir2);
        double salarioLiquido4 = salario - (sindicato + inss + ir3);
        double descontos = sindicato + inss;
        double descontos2 =  sindicato + inss + ir;
        double descontos3 = sindicato + inss + ir2;
        double descontos4 = sindicato + inss + ir3;
        if (salario <= 900) {
            System.out.println("Voce esta isento do pagamento do IR");
            System.out.println("(-)INSS 10% (-)                             :" + "R$"+inss );
            System.out.println("(-)FGTS 11% (-)                             :" + "R$"+fgts );
            System.out.println("(-)SINDICATO 3% (-)                             :" + "R$"+sindicato);
            System.out.println("(-)TOTAL DE DESCONTOS  (-)                             :" + "R$"+descontos);
            System.out.println("(-)SALARIO LIQUIDO  (-)                             :" + "R$"+salarioLiquido);
            
        }else if (salario <=1500) {
            System.out.println("(-)IR 5% (-)                              :" + "R$"+ir);
            System.out.println("(-)INSS 10% (-)                             :" + "R$"+inss );
            System.out.println("(-)FGTS 11% (-)                             :" + "R$"+fgts );
            System.out.println("(-)SINDICATO 3% (-)                             :" + "R$"+sindicato);
            System.out.println("(-)TOTAL DE DESCONTOS  (-)                             :" + "R$"+descontos2);
            System.out.println("(-)SALARIO LIQUIDO  (-)                             :" + "R$"+salarioLiquido2);

            
        }else if (salario <=2500) {
            System.out.println("(-)IR 10% (-)                              :" + "R$"+ir2);
            System.out.println("(-)INSS 10% (-)                             :" + "R$"+inss );
            System.out.println("(-)FGTS 11% (-)                             :" + "R$"+fgts );
            System.out.println("(-)SINDICATO 3% (-)                             :" + "R$"+sindicato);
            System.out.println("(-)TOTAL DE DESCONTOS  (-)                             :" + "R$"+descontos3);
            System.out.println("(-)SALARIO LIQUIDO  (-)                             :" + "R$"+salarioLiquido3);
            
       
       
            
        
       
        
    
    } else if (salario > 2500) {
            System.out.println("(-)IR 20% (-)                              :" + "R$"+ir3);
            System.out.println("(-)INSS 10% (-)                             :" + "R$"+inss );
            System.out.println("(-)FGTS 11% (-)                             :" + "R$"+fgts );
            System.out.println("(-)SINDICATO 3% (-)                             :" + "R$"+sindicato);
            System.out.println("(-)TOTAL DE DESCONTOS  (-)                             :" + "R$"+descontos4);
            System.out.println("(-)SALARIO LIQUIDO  (-)                             :" + "R$"+salarioLiquido4);
}else System.out.println("Opção invalaida");
}}
