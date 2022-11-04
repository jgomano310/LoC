package app.loc;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//segun creemos un obejto tipo mongo tipo usuario nos mostrara uno u otro.
		UsuarioFactory obj = new UsuarioFactory(new UsuarioImplMongo());
		obj.getInsertaUsuario();
		obj.getEliminaUsuarioId(0);
		
	}

}
