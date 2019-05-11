package entityControl;
import entities.Item;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hychen39@gm.cyut.edu.tw
 * @since Apr 29, 2019
 */
@Stateless
@LocalBean
public class ItemFacade extends AbstractFacade<Item>{

    @PersistenceContext(unitName = "unit07_demoPU")
    private EntityManager em;
    
    // default constructor
    public ItemFacade() {
        super(Item.class);
    }
    
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
