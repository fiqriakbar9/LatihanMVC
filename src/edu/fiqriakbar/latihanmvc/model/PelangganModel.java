/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fiqriakbar.latihanmvc.model;

import edu.fiqriakbar.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * NIM : 110118020
 * Nama : Fiqri Akbar Pratama
 * Kelas : IF-1
 *
 */
public class PelangganModel {
    
    
    private String nama;
    private String email;
    private String noTelp;

    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    
  
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if(pelangganListener!=null){
            pelangganListener.onChange(this);
        }
    }
            
    public void resetForm(){
        setNama("");
        setEmail("");
        setNoTelp("");
                
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
        resetForm();
    }
}
