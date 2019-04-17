/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author 伶娸
 */
@Named(value = "newJSFManagedBean")
@SessionScoped


public class NewJSFManagedBean implements Serializable{
    
    /**
     * Creates a new instance of NewJSFManagedBean
     */
        private String pageID;

    /**
     * Get the value of pageID
     *
     * @return the value of pageID
     */
    public String getPageID() {
        return pageID;
    }

    /**
     * Set the value of pageID
     *
     * @param pageID new value of pageID
     */
    public void setPageID(String pageID) {
        this.pageID = pageID;
    }

    public NewJSFManagedBean() {
        
    }
    
    public String page(){
        if (pageID == null){
            return "index?faces-redirect=true";
        }
        if (pageID.equals("1")){
            return "1";
        }else if (pageID.equals("2")){
            return "2";
        }else if (pageID.equals("3")){
            return "3";
        }else {          
         return "home";       
      }     
    }
    
}