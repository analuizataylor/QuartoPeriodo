package diagnostica;

// VETOR DE OBJETOS PACIENTE 
public class VetPaciente {
   // ATRIBUTOS
   private Paciente[] vet;
   private int quant;

   // CONSTRUTOR
   public VetPaciente(int tamanho) {
       this.vet = new Paciente[tamanho];
       this.quant = 0;
   }

   // RETORNA QUANTIDADE DE PACIENTES
   public int getQuant() {
       return quant;
   }

   // RETORNA PACIENTE COM POSICAO ESPECIFICA
   public Paciente getPaciente(int pos) {
       if (pos >= 0 && pos < this.quant) {
           return this.vet[pos];
       }
       return null;
   }


   // PESQUISA PACIENTE USANDO CPF
   public int pesquisa(String cpf) {
       for (int i = 0; i < this.quant; i++) {
           if (this.vet[i].getCpf().equals(cpf)) {
               return i; // RETORNA ONDE ENCONTROU 
           }
       }
       return -1; // RETORNA -1 SE NAO ENCONTROU
   }
   
   // INSERE PACIENTE
   public int insere(Paciente paciente) {
       
	   // VERIFICA SE O VETOR ESTA CHEIO
       if (this.quant == this.vet.length) {
           return -1; 
       }
       
       // VERIFICA SE JA EXISTE PELO CPF
       if (pesquisa(paciente.getCpf()) != -1) {
           return -2; 
       }
       
       // INSERE NA PRIMEIRA POSICAO
       this.vet[this.quant] = paciente;
       this.quant++;
       return 0; 
   }
}