/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salab6;

/**
 *
 * @author wes140031
 */
public class ChocolateController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChocolateBoiler coco = ChocolateBoiler.getInstance();
        coco.drain();
        coco.fill();
        coco.boil();
        coco.fill();
        coco.drain();
    }
    
}
