/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject.main;

import jakarta.faces.bean.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @author josue
 */
@Named 
@RequestScoped
public class Temas {
    
    public Temas (){  
        tituloU = "Eficacia";
        tituloD = "Eficiencia";
        definicionU = "La eficacia es la capacidad de alcanzar un objetivo o resultado deseado, independientemente de los recursos utilizados para lograrlo. Es decir, se mide por el logro de la meta.";
        definicionD = "La eficiencia es la capacidad de alcanzar un objetivo utilizando la menor cantidad de recursos posibles, como tiempo, dinero o esfuerzo. Se enfoca en el uso óptimo de los recursos.";
        referenciaU = "https://es.wikipedia.org/wiki/Eficacia";
        referenciaD = "https://es.wikipedia.org/wiki/Eficiencia";
}
    
    private String tituloU;
    private String tituloD;
    private String definicionU;
    private String definicionD;
    private String referenciaU;
    private String referenciaD;

    public String getTituloU() {
        return tituloU;
    }

    public void setTituloU(String tituloU) {
        this.tituloU = tituloU;
    }

    public String getTituloD() {
        return tituloD;
    }

    public void setTituloD(String tituloD) {
        this.tituloD = tituloD;
    }

    public String getDefinicionU() {
        return definicionU;
    }

    public void setDefinicionU(String definicionU) {
        this.definicionU = definicionU;
    }

    public String getDefinicionD() {
        return definicionD;
    }

    public void setDefinicionD(String definicionD) {
        this.definicionD = definicionD;
    }

    public String getReferenciaU() {
        return referenciaU;
    }

    public void setReferenciaU(String referenciaU) {
        this.referenciaU = referenciaU;
    }

    public String getReferenciaD() {
        return referenciaD;
    }

    public void setReferenciaD(String referenciaD) {
        this.referenciaD = referenciaD;
    }

    
    
}
