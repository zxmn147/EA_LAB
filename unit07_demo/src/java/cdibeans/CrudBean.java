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
    
    private long getID;


    private Object request;

    private String img;
   
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
    public long getGetID() {
        return getID;
    }

    /**
     * Set the value of getID
     *
     * @param getID new value of getID
     */
    public void setGetID(long getID) {
        this.getID = getID;
    }

    private Item newItem;
    private List object;
   
    
    private String getId;

    /**
     * Get the value of getId
     *
     * @return the value of getId
     */
    public String getGetId() {
        return getId;
    }

    /**
     * Set the value of getId
     *
     * @param getId new value of getId
     */
    public void setGetId(String getId) {
        this.getId = getId;
    }


    
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
        return itemFacade.find(getID);
    }
    
   
    
    public String update(Item item){
        item.setDescription(des);
        item.setImage(img);
      
        itemFacade.edit(item);
        this.img = null;
        this.des = null;
        return "itemList"; 


    }
    
   
}    