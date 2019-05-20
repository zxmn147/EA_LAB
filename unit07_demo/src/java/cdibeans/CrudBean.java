/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;


import entities.Item;
import entityControl.ItemFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;


/**
 *
 * @author hychen39@gm.cyut.edu.tw
 */
@Named(value = "crudBean")
@SessionScoped
public class CrudBean implements Serializable {
    
    @EJB
    private ItemFacade itemFacade;
    
    private long itemID;

    private Item currentItem;
  
    private String img;

    public Item getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(Item currentItem) {
        this.currentItem = currentItem;
    }
   
    /**
     * Action to edit an item
     * @return 
     */
    public String editItem(){
        this.currentItem = find();
        return null;
    }
    
    /**
     * Get the value of getID
     *
     * @return the value of getID
     */
    public long getItemID() {
        return itemID;
    }

    /**
     * Set the value of getID
     *
     * @param itemID new value of getID
     */
    public void setItemID(long itemID) {
        this.itemID = itemID;
    }

    private Item newItem;
    private List object;
   
    
    private String getId;

    
    /**
     * Creates a new instance of CrudBean
     */
    public CrudBean() {
    }

    public Item getNewItem() {
        return newItem;
    }

    public void setNewItem(Item newItem) {
        this.newItem = newItem;
    }
    
    
    public List<Item> findAll(){
        return itemFacade.findAll();
    }
    
    public String goNewItemPage(){
        this.newItem = new Item();
        return "createItem";
    }
    
    public String addItem(){
        itemFacade.create(newItem);
        return "itemList";
    }
    
   public String delete(Item item){
      itemFacade.remove(item);
      object =  itemFacade.findAll();
      return "itemList";
    }
   
    
     public Item find(){
        return itemFacade.find(itemID);
    }
    
    public String update(){
        Item object = getCurrentItem();
        itemFacade.edit(object);
       return "itemList";
    }
    
   
}    