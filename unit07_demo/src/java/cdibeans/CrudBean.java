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
    
    private Object request;

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
     * Get the value of img
     *
     * @return the value of img
     */
    public String getImg() {
        return img;
    }

    /**
     * Set the value of img
     *
     * @param img new value of img
     */
    public void setImg(String img) {
        this.img = img;
    }

    private String des;

    /**
     * Get the value of des
     *
     * @return the value of des
     */
    public String getDes() {
        return des;
    }

    /**
     * Set the value of des
     *
     * @param des new value of des
     */
    public void setDes(String des) {
        this.des = des;
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
    
   
    
    public Item update(Item item){
       Item object = itemFacade.find(itemID);
       object.setDescription(item.getDescription());
       object.setImage(item.getImage());
       itemFacade.edit(object);
       return object; 
    }
    
   
}    