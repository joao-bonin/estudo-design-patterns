package Proxy;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Podemos dizer que o proxy encapsula comportamentos
 * do objeto enquanto o decorator adiciona funcionalidade ao objeto.
 * 
 * @author manolo
 *
 */
class ProxyTest {

	@Test
	void UsuarioSemPermissaoDeCriacaoDeCliente() {
		
		UsuarioProxy usuario = new UsuarioProxy("João", "Teste123", Role.USER);	
		assertThrows(RuntimeException.class, () -> {
			usuario.cadastraCliente(new Cliente("Paula Furlan", "paula@gmail.com", "(43) 98811-7016"));
		});
			
	}
	
	@Test
	void UsuarioComPermissaoDeCriacaoDeCliente() {
		
		UsuarioProxy usuario = new UsuarioProxy("João", "Teste123", Role.ADMIN);
		usuario.cadastraCliente(new Cliente("Paula Furlan", "paula@gmail.com", "(43) 98811-7016"));
			
	}


}
