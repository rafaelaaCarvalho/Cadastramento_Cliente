package monitoria_10;

import java.util.ArrayList;
import java.util.List;

public class Fila_de_Pessoas {

	ArrayList<Pessoa> pessoas;
	
	public Fila_de_Pessoas() {
		
		this.pessoas = new ArrayList<Pessoa>();		
	}
	
	public void Cadastrar(Pessoa pessoa) {
		
		pessoas.add(pessoa);

	}
	
	public List<Pessoa> filadeprioridade(){
		return pessoas.stream().filter(x->x.eprioridade).toList();
		
	}
	public List<Pessoa> filacomum(){
		return pessoas.stream().filter(x->!x.eprioridade).toList();
		
	}
	
	
	
	
	
	
}
	