
package main;

import models.Model_Mayor;
import views.View_Mayor;
import controllers.Controller_Mayor;
        
public class Main {
    
    public static void main(String jagb[]){
        Model_Mayor model_mayor = new Model_Mayor();
        View_Mayor view_mayor = new View_Mayor();
        Controller_Mayor controller_mayor = new Controller_Mayor(model_mayor, view_mayor);
        
    } 
    
}
