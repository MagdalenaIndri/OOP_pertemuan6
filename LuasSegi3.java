/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author LAB F
 */
public class LuasSegi3 {
    private float alas, tinggi ,luas;
    
    public LuasSegi3(float Al, float Tg){
    alas = Al;
    tinggi = Tg;
    }
    public void setALAS(float nVAL){
        alas = nVAL;
    }
    public float getALAS(){
        return alas;
    }
    public void setTiNGGI(float nVAL){
        tinggi = nVAL;
    }
    public float getTINGGI(){
        return tinggi;
    }
    public void HLuasSegi3(){
        luas = (alas*tinggi)/2;
    }
    public float getLUAS(){
        return luas;
    }
}
