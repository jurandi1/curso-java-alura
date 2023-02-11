
public class TesteConcexao {

	public static void main(String[] args) {
		
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu erro na conexão");
		} finally { // com ou sem erro sempre será executado
			con.fecha();
		}

	}

}
