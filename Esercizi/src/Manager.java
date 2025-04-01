public class Manager extends Dipendente{
    int bonus;
    public Manager(String nome, String cognome, int salarioBase, int bonus) {
        this.nome = nome;
        this.cognome = cognome;
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    int calcolaSalario() {
        return salarioBase + bonus;
    }
}


