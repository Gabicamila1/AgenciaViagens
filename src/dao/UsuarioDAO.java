package dao;
import modelos.Usuarios;
import java.util.List;



//create
public void create (Usuarios usuario) {
Sistem.out.println(?**Create*?);
}

//read
public List <Usuarios> read(){
List<Usuarios> usuario = new ArrayList <Usuarios>();
Sistem.out.println(?**Read*?);
return usuario;
}

//update
public void update(Usuarios usuario){
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
		
		
		String sql = "SELECT * FROM Usuario";
		
		
		List<Usuario> usuario = new ArrayList<Usuario>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		
		ResultSet rset = null;
		
		try {
			
			conn = ConnectionMySQL.createConnectionMySQL();
			
			
			pstm = conn.prepareStatement(sql);
			
			
			rset = pstm.executeQuery();
			
			while (rset.next()) { 
				Usuario pessoa = new Usuario();
				
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
		
		return pessoas;
	}

	//UPDATE
	public void update(Usuario pessoa) { 
		
		String sql = "UPDATE Usuario SET nome_usuario = ? WHERE id_usuario = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			
			pstm.setString(1, pessoa.getNome_usuario());
			pstm.setInt(2, pessoa.getId_usuario());
			
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
		
		String sql = "DELETE FROM Usuario WHERE id_usuario = ?";
		
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
