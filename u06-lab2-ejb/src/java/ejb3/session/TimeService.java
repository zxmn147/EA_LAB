/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb3.session;

import javax.ejb.Remote;

/**
 *
 * @author 伶娸
 */
@Remote
public interface TimeService {
    String getTime();
}
