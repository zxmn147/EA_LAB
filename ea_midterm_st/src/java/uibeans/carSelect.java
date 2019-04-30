/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uibeans;

import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.ejb.EJB;
import repository.Car;
import repository.CarRepositoryBean;
        
/**
 *
 * @author 伶娸
 */
@Named(value = "carSelect")
@SessionScoped
public class carSelect implements Serializable{
    @EJB CarRepositoryBean repository;
        /**
     * 
     * 
     * Creates a new instance of carSelect
     */
    
   

    public carSelect() {
    }
    
    public List<Car> getValue(){
        return repository.findAll();
   }
    
    

    private int carNum;
    
    
    /**
     * Get the value of carNum
     *
     * @return the value of carNum
     */
    public int getCarNum() {
        return carNum;
    }

    /**
     * Set the value of carNum
     *
     * @param carNum new value of carNum
     */
    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    /**
     * Get the value of carId
     *
     * @return the value of carId
     */
   
    
    public Car getCar(){
     
     return repository.query(carNum);
        
    }
    
     public String editCarInfo(){
        
        return "editCarInfo";
    }
     
    public boolean price(Integer id,Car car){
        return repository.update(carNum, car);
      
    }

    public String submit(){
        return "home";
    }
    
    public String cancel(){
        return "home";
    }
}
