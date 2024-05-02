package edu.rafael.anatomiadasclasses;

public class MinnhaClasse {
    
public static void main(String[] args) {
    String primeiroNome = "Rafael";
    String segundoNome = "Castilho";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);

}   
public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}
}
