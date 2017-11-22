/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberman.entity;

/**
 *
 * @author kdost
 */
public interface KillableEntity extends Entity {

    public void die();
    public void reduceHealth(int damage);
    public int getHealth();

}