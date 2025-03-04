package controllers;

import models.Cidade;
import models.UF;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Starter extends Job {

	public void doJob() {
		if (Cidade.count() == 0) {

			Cidade c1 = new Cidade("Acari", UF.RN);
			Cidade c2 = new Cidade("Açu", UF.RN);
			Cidade c3 = new Cidade("Afonso Bezerra", UF.RN);
			Cidade c4 = new Cidade("Água Nova", UF.RN);
			Cidade c5 = new Cidade("Alexandria", UF.RN);
			Cidade c6 = new Cidade("Almino Afonso", UF.RN);
			Cidade c7 = new Cidade("Alto do Rodrigues", UF.RN);
			Cidade c8 = new Cidade("Angicos", UF.RN);
			Cidade c9 = new Cidade("Antônio Martins", UF.RN);
			Cidade c10 = new Cidade("Apodi", UF.RN);
			Cidade c11 = new Cidade("Areia Branca", UF.RN);
			Cidade c12 = new Cidade("Arês", UF.RN);
			Cidade c13 = new Cidade("Augusto Severo", UF.RN);
			Cidade c14 = new Cidade("Baía Formosa", UF.RN);
			Cidade c15 = new Cidade("Baraúna", UF.RN);
			Cidade c16 = new Cidade("Barcelona", UF.RN);
			Cidade c17 = new Cidade("Bento Fernandes", UF.RN);
			Cidade c18 = new Cidade("Bodó", UF.RN);
			Cidade c19 = new Cidade("Bom Jesus", UF.RN);
			Cidade c20 = new Cidade("Brejinho", UF.RN);
			Cidade c21 = new Cidade("Caiçara do Norte", UF.RN);
			Cidade c22 = new Cidade("Caiçara do Rio do Vento", UF.RN);
			Cidade c23 = new Cidade("Caicó", UF.RN);
			Cidade c24 = new Cidade("Campo Redondo", UF.RN);
			Cidade c25 = new Cidade("Canguaretama", UF.RN);
			Cidade c26 = new Cidade("Caraúbas", UF.RN);
			Cidade c27 = new Cidade("Carnaúba dos Dantas", UF.RN);
			Cidade c28 = new Cidade("Carnaubais", UF.RN);
			Cidade c29 = new Cidade("Ceará-Mirim", UF.RN);
			Cidade c30 = new Cidade("Cerro Corá", UF.RN);
			Cidade c31 = new Cidade("Coronel Ezequiel", UF.RN);
			Cidade c32 = new Cidade("Coronel João Pessoa", UF.RN);
			Cidade c33 = new Cidade("Cruzeta", UF.RN);
			Cidade c34 = new Cidade("Currais Novos", UF.RN);
			Cidade c35 = new Cidade("Doutor Severiano", UF.RN);
			Cidade c36 = new Cidade("Encanto", UF.RN);
			Cidade c37 = new Cidade("Equador", UF.RN);
			Cidade c38 = new Cidade("Espírito Santo", UF.RN);
			Cidade c39 = new Cidade("Extremoz", UF.RN);
			Cidade c40 = new Cidade("Felipe Guerra", UF.RN);
			Cidade c41 = new Cidade("Fernando Pedroza", UF.RN);
			Cidade c42 = new Cidade("Florânia", UF.RN);
			Cidade c43 = new Cidade("Francisco Dantas", UF.RN);
			Cidade c44 = new Cidade("Frutuoso Gomes", UF.RN);
			Cidade c45 = new Cidade("Galinhos", UF.RN);
			Cidade c46 = new Cidade("Goianinha", UF.RN);
			Cidade c47 = new Cidade("Governador Dix-Sept Rosado", UF.RN);
			Cidade c48 = new Cidade("Grossos", UF.RN);
			Cidade c49 = new Cidade("Guamaré", UF.RN);
			Cidade c50 = new Cidade("Ielmo Marinho", UF.RN);
			Cidade c51 = new Cidade("Ipanguaçu", UF.RN);
			Cidade c52 = new Cidade("Ipueira", UF.RN);
			Cidade c53 = new Cidade("Itajá", UF.RN);
			Cidade c54 = new Cidade("Itaú", UF.RN);
			Cidade c55 = new Cidade("Jaçanã", UF.RN);
			Cidade c56 = new Cidade("Jandaíra", UF.RN);
			Cidade c57 = new Cidade("Janduís", UF.RN);
			Cidade c58 = new Cidade("Januário Cicco", UF.RN);
			Cidade c59 = new Cidade("Japi", UF.RN);
			Cidade c60 = new Cidade("Jardim de Angicos", UF.RN);
			Cidade c61 = new Cidade("Jardim de Piranhas", UF.RN);
			Cidade c62 = new Cidade("Jardim do Seridó", UF.RN);
			Cidade c63 = new Cidade("João Câmara", UF.RN);
			Cidade c64 = new Cidade("João Dias", UF.RN);
			Cidade c65 = new Cidade("José da Penha", UF.RN);
			Cidade c66 = new Cidade("Jucurutu", UF.RN);
			Cidade c67 = new Cidade("Jundiá", UF.RN);
			Cidade c68 = new Cidade("Lagoa d'Anta", UF.RN);
			Cidade c69 = new Cidade("Lagoa de Pedras", UF.RN);
			Cidade c70 = new Cidade("Lagoa de Velhos", UF.RN);
			Cidade c71 = new Cidade("Lagoa Nova", UF.RN);
			Cidade c72 = new Cidade("Lagoa Salgada", UF.RN);
			Cidade c73 = new Cidade("Lajes", UF.RN);
			Cidade c74 = new Cidade("Lajes Pintadas", UF.RN);
			Cidade c75 = new Cidade("Lucrécia", UF.RN);
			Cidade c76 = new Cidade("Luís Gomes", UF.RN);
			Cidade c77 = new Cidade("Macaíba", UF.RN);
			Cidade c78 = new Cidade("Macau", UF.RN);
			Cidade c79 = new Cidade("Major Sales", UF.RN);
			Cidade c80 = new Cidade("Marcelino Vieira", UF.RN);
			Cidade c81 = new Cidade("Martins", UF.RN);
			Cidade c82 = new Cidade("Maxaranguape", UF.RN);
			Cidade c83 = new Cidade("Messias Targino", UF.RN);
			Cidade c84 = new Cidade("Montanhas", UF.RN);
			Cidade c85 = new Cidade("Monte Alegre", UF.RN);
			Cidade c86 = new Cidade("Monte das Gameleiras", UF.RN);
			Cidade c87 = new Cidade("Mossoró", UF.RN);
			Cidade c88 = new Cidade("Natal", UF.RN);
			Cidade c89 = new Cidade("Nísia Floresta", UF.RN);
			Cidade c90 = new Cidade("Nova Cruz", UF.RN);
			Cidade c91 = new Cidade("Olho-d'Água do Borges", UF.RN);
			Cidade c92 = new Cidade("Ouro Branco", UF.RN);
			Cidade c93 = new Cidade("Paraná", UF.RN);
			Cidade c94 = new Cidade("Paraú", UF.RN);
			Cidade c95 = new Cidade("Parazinho", UF.RN);
			Cidade c96 = new Cidade("Parelhas", UF.RN);
			Cidade c97 = new Cidade("Parnamirim", UF.RN);
			Cidade c98 = new Cidade("Passa e Fica", UF.RN);
			Cidade c99 = new Cidade("Passagem", UF.RN);
			Cidade c100 = new Cidade("Patu", UF.RN);
			Cidade c101 = new Cidade("Pau dos Ferros", UF.RN);
			Cidade c102 = new Cidade("Pedra Grande", UF.RN);
			Cidade c103 = new Cidade("Pedra Preta", UF.RN);
			Cidade c104 = new Cidade("Pedro Avelino", UF.RN);
			Cidade c105 = new Cidade("Pedro Velho", UF.RN);
			Cidade c106 = new Cidade("Pendências", UF.RN);
			Cidade c107 = new Cidade("Pilões", UF.RN);
			Cidade c108 = new Cidade("Poço Branco", UF.RN);
			Cidade c109 = new Cidade("Portalegre", UF.RN);
			Cidade c110 = new Cidade("Porto do Mangue", UF.RN);
			Cidade c111 = new Cidade("Presidente Juscelino", UF.RN);
			Cidade c112 = new Cidade("Pureza", UF.RN);
			Cidade c113 = new Cidade("Rafael Fernandes", UF.RN);
			Cidade c114 = new Cidade("Rafael Godeiro", UF.RN);
			Cidade c115 = new Cidade("Riacho da Cruz", UF.RN);
			Cidade c116 = new Cidade("Riacho de Santana", UF.RN);
			Cidade c117 = new Cidade("Riachuelo", UF.RN);
			Cidade c118 = new Cidade("Rodolfo Fernandes", UF.RN);
			Cidade c119 = new Cidade("Ruy Barbosa", UF.RN);
			Cidade c120 = new Cidade("Santa Cruz", UF.RN);
			Cidade c121 = new Cidade("Santa Maria", UF.RN);
			Cidade c122 = new Cidade("Santana do Matos", UF.RN);
			Cidade c123 = new Cidade("Santana do Seridó", UF.RN);
			Cidade c124 = new Cidade("Santo Antônio", UF.RN);
			Cidade c125 = new Cidade("São Bento do Norte", UF.RN);
			Cidade c126 = new Cidade("São Bento do Trairí", UF.RN);
			Cidade c127 = new Cidade("São Fernando", UF.RN);
			Cidade c128 = new Cidade("São Francisco do Oeste", UF.RN);
			Cidade c129 = new Cidade("São Gonçalo do Amarante", UF.RN);
			Cidade c130 = new Cidade("São João do Sabugi", UF.RN);
			Cidade c131 = new Cidade("São José de Mipibu", UF.RN);
			Cidade c132 = new Cidade("São José do Campestre", UF.RN);
			Cidade c133 = new Cidade("São José do Seridó", UF.RN);
			Cidade c134 = new Cidade("São Miguel", UF.RN);
			Cidade c135 = new Cidade("São Miguel do Gostoso", UF.RN);
			Cidade c136 = new Cidade("São Paulo do Potengi", UF.RN);
			Cidade c137 = new Cidade("São Pedro", UF.RN);
			Cidade c138 = new Cidade("São Rafael", UF.RN);
			Cidade c139 = new Cidade("São Tomé", UF.RN);
			Cidade c140 = new Cidade("São Vicente", UF.RN);
			Cidade c141 = new Cidade("Senador Elói de Souza", UF.RN);
			Cidade c142 = new Cidade("Senador Georgino Avelino", UF.RN);
			Cidade c143 = new Cidade("Serra de São Bento", UF.RN);
			Cidade c144 = new Cidade("Serra do Mel", UF.RN);
			Cidade c145 = new Cidade("Serra Negra do Norte", UF.RN);
			Cidade c146 = new Cidade("Serrinha", UF.RN);
			Cidade c147 = new Cidade("Serrinha dos Pintos", UF.RN);
			Cidade c148 = new Cidade("Severiano Melo", UF.RN);
			Cidade c149 = new Cidade("Sítio Novo", UF.RN);
			Cidade c150 = new Cidade("Taboleiro Grande", UF.RN);
			Cidade c151 = new Cidade("Taipu", UF.RN);
			Cidade c152 = new Cidade("Tangará", UF.RN);
			Cidade c153 = new Cidade("Tenente Ananias", UF.RN);
			Cidade c154 = new Cidade("Tenente Laurentino Cruz", UF.RN);
			Cidade c155 = new Cidade("Tibau", UF.RN);
			Cidade c156 = new Cidade("Tibau do Sul", UF.RN);
			Cidade c157 = new Cidade("Timbaúba dos Batistas", UF.RN);
			Cidade c158 = new Cidade("Touros", UF.RN);
			Cidade c159 = new Cidade("Triunfo Potiguar", UF.RN);
			Cidade c160 = new Cidade("Umarizal", UF.RN);
			Cidade c161 = new Cidade("Upanema", UF.RN);
			Cidade c162 = new Cidade("Várzea", UF.RN);
			Cidade c163 = new Cidade("Venha-Ver", UF.RN);
			Cidade c164 = new Cidade("Vera Cruz", UF.RN);
			Cidade c165 = new Cidade("Viçosa", UF.RN);
			Cidade c166 = new Cidade("Vila Flor", UF.RN);

		}
	}

}
