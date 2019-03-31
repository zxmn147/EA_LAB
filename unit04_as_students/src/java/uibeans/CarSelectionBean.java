/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uibeans;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import repository.Car;
import repository.CarRepositoryBean;

/**
 *
 * @author hychen39@gm.cyut.edu.tw
 */
@Named(value = "carSelectionBean")
@SessionScoped
public class CarSelectionBean implements Serializable{

    
    // Inject the car repository
    // DO NOT REMOVE THE CODE
    @EJB CarRepositoryBean repository;
   
    /**
     * Action method to redirect to displayInfo facelets page.
     * @return target page name
     */
    private String name;
   

    public String dispalyInfo(){
        
        return "displayInfo?faces-redirect=true";
    }
     
    public List<Car> getValue(){

        return repository.findAll();
    
    }
    
     
    private int getId = 0;

    /**
     * Get the value of getId
     *
     * @return the value of getId
     */
    public int getGetId() {
        return getId;
    }

    /**
     * Set the value of getId
     *
     * @param getId new value of getId
     */
    public void setGetId(int getId) {
        this.getId = getId;
    }

    public Car getCar(){
     return repository.query(getId);
        
    }
   
}
