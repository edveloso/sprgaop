
public class ContaCorrenteMB {

	private Logger logger = LoggerFactory.getLogger(ContaCorrenteMB.class);
	
	private ContaCorrenteDAO dao;
	
	private ControleAcesso ca;
	
	public String cadastra(ContaCorrente cc){

		if(!ca.usuarioTemPermissao(ca.getLoggedUser()))
			throw new BusinessException("Usuario nao tem permissao");
			
			
		logger.debug("iniciou m�todo cadastra(ContaCorrente cc)");

		dao.salvar(cc);
		
		logger.debug("finalizou m�todo cadastra(ContaCorrente cc)");
		
		
		return "contas";
	}
	
	
	
}
