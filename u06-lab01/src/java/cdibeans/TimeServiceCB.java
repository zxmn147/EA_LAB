/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;

import ejb.TimeServiceEJB;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author 伶娸
 */
@Named(value = "timeServiceCB")
@RequestScoped
public class TimeServiceCB {
    @EJB
    TimeServiceEJB timeServiceEJB;
    /**
     * Creates a new instance of TimeServiceCB
     */
    public TimeServiceCB() {
    }
    
    public String getCurrentTime(){
        return timeServiceEJB.getTime();
    }
    
}
