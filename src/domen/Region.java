/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

/**
 *
 * @author filip_000
 */
public class Region {

    private int idRegiona;
    private String nazivRegiona;

    public Region() {
    }

    public Region(int idRegiona, String nazivRegiona) {
        this.idRegiona = idRegiona;
        this.nazivRegiona = nazivRegiona;
    }

    public String getNazivRegiona() {
        return nazivRegiona;
    }

    public void setNazivRegiona(String nazivRegiona) {
        this.nazivRegiona = nazivRegiona;
    }

    public int getIdRegiona() {
        return idRegiona;
    }

    public void setIdRegiona(int idRegiona) {
        this.idRegiona = idRegiona;
    }

    @Override
    public String toString() {
        return nazivRegiona;
    }

}
