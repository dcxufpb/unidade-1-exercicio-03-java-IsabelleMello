package com.example.project;

public class CupomFiscal {

	public static String NOME_LOJA = "Arcos Dourados Com. de Alimentos LTDA";
	public static String LOGRADOURO = "Av. Projetada Leste";
	public static int NUMERO = 500;
	public static String COMPLEMENTO = "EUC F32/33/34";
	public static String BAIRRO = "Br. Sta Genebra";
	public static String MUNICIPIO = "Campinas";
	public static String ESTADO = "SP";
	public static String CEP = "13080-395";
	public static String TELEFONE = "(19) 3756-7408";
	public static String OBSERVACAO = "Loja 1317 (PDP)";
	public static String CNPJ = "42.591.651/0797-34";
	public static String INSCRICAO_ESTADUAL = "244.898.500.113";

	private static String QUEBRA_LINHA = System.lineSeparator();

	public static void imprime_dados_loja(){
		
		if(NOME_LOJA == ""){
			System.out.printf("O campo nome da loja é obrigatório");
			return ;
		}

		if(LOGRADOURO == ""){
			System.out.printf("O campo logradouro do endereço é obrigatório");
			return ;
		}

		String _LOGRADOURO = LOGRADOURO + ", ";
		String _NUMERO = NUMERO <=0 ? "s/n" : String.format("%d", NUMERO);
		String _COMPLEMENTO = " " + COMPLEMENTO;
		String _BAIRRO = BAIRRO.isEmpty() ? "" : BAIRRO + " - ";

		if (MUNICIPIO == ""){
			System.out.printf("O campo município do endereço é obrigatório");
			return ;
		}

    	String _MUNICIPIO = MUNICIPIO + " - ";

		if(ESTADO == ""){
			System.out.printf("O campo estado do endereço é obrigatório");
			return ;			
		}
    
    	String _CEP = CEP.isEmpty() ? "" : "CEP:" + CEP;
		String _TELEFONE = TELEFONE.isEmpty() ? "" : "Tel " + TELEFONE;
		_TELEFONE = !_CEP.isEmpty() && !_TELEFONE.isEmpty() ? " " + _TELEFONE : _TELEFONE;

		
		if(CNPJ == ""){
			System.out.printf("O campo CNPJ da loja é obrigatório");
			return ;
		}

		String _CNPJ = "CNPJ: " + CNPJ;

    	if (INSCRICAO_ESTADUAL == ""){
			System.out.printf("O campo inscrição estadual da loja é obrigatório");
			return ;
		}
    
    	String _INSCRICAO_ESTADUAL = "IE: " + INSCRICAO_ESTADUAL;

		System.out.println(NOME_LOJA + QUEBRA_LINHA + 
			_LOGRADOURO + _NUMERO + _COMPLEMENTO + QUEBRA_LINHA + 
			_BAIRRO + _MUNICIPIO + ESTADO + QUEBRA_LINHA + 
			_CEP + _TELEFONE + QUEBRA_LINHA + 
			OBSERVACAO + QUEBRA_LINHA + 
			_CNPJ + QUEBRA_LINHA + 
			_INSCRICAO_ESTADUAL);
	}

	public static void main(final String[] args) {
		//Implemente aqui
		imprime_dados_loja();

		}
}
		
