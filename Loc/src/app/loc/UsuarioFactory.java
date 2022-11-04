package app.loc;

public class UsuarioFactory {
	Iusuario user;
	
	public UsuarioFactory(Iusuario user){
		this.user=user;
		
	}

	public void getInsertaUsuario() {
		user.InsertaUsuario();
	}
	
	public void getEliminaUsuarioId(int id) {
		user.EliminaUsuario(id);
		
	}
}
