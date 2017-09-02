/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nit.team;

import forme.Team;

/**
 *
 * @author filip_000
 */
public class NitTeam extends Thread{

    private final Team team;

    public NitTeam(Team team) {
        this.team = team;
    }
    
    @Override
    public void run() {
        while (true) {            
            team.popuniTabelu();
            try {
                sleep(10000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    
}
