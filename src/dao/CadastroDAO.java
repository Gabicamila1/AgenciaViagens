package dao;
import modelos.Cadastro;
import java.util.List;



//create
public void create (Cadatrar usuario) {
Sistem.out.println(?**Create*?);
}

//read
public List <Usuarios> read(){
List<Cadastrar> usuario = new ArrayList <Usuarios>();
Sistem.out.println(?**Read*?);
return usuario;
}

//update
public void update(Cadastrar usuario){
Sistem.out.println(?**Update*?);
}
//delete
public void delete(int id) {
Sistem.out.println(?**Delete*?);
}
//readById
public Usuarios readById (int id){
Sistem.out.println(?**ReadById*?);
return new Usuarios();
}

//READ
	public List<Usuario> getUsuario() { 
		
		
		String sql = "SELECT * FROM cadastro";
		
		
		List<Cadastrar> usuario = new ArrayList<Usuario>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		
		ResultSet rset = null;
		
		try {
			
			conn = ConnectionMySQL.createConnectionMySQL();
			
			
			pstm = conn.prepareStatement(sql);
			
			
			rset = pstm.executeQuery();
			
			while (rset.next()) { 
				Cadastrar pessoa = new Cadastro();
				
				pessoa.setId_usuario(rset.getInt("id_usuario"));
				pessoa.setNome_usuario(rset.getString("nome_usuario"));
				
				pessoas.add(pessoa);
			}
		} catch (Exception e) { 
			e.printStackTrace();
		} finally { 
			try { 
				if (rset != null) { 
					rset.close();
				}
				if (pstm != null) { 
					pstm.close();
				}
				if (conn != null) { 
					conn.close();
				}
				
			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
		
		return cadastro;
	}

	//UPDATE
	public void update(Cadastrar pessoa) { 
		
		String sql = "UPDATE cadastro SET nome_usuario = ? WHERE id_usuario = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			
			pstm.setString(1, cadastro.getNome_usuario());
			pstm.setInt(2, cadastro.getId_usuario());
			
			pstm.execute();
			
		} catch (Exception e) { 
			e.printStackTrace();
		} finally { 
			try { 
				if (pstm != null) { 
					pstm.close();
				}
				if (conn != null) { 
					conn.close();
				}
				
			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
	}
	
	//DELETE
	public void deleteById(int id) { 
		
		String sql = "DELETE FROM cadastro WHERE id_usuario = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			pstm.execute();
			
		} catch (Exception e) { 
			e.printStackTrace();
		} finally { 
			try { 
				if (pstm != null) { 
					pstm.close();
				}
				if (conn != null) { 
					conn.close();
				}
				
			} catch (Exception e) { 
				e.printStackTrace();
			}
		}
	}
