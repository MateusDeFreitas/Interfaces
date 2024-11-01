package Pck_Model;

import Pck_Interface.IProduct;

public class ProdutoGMChevete implements IProduct {
    
    private String marca;
    private String modelo;

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }
    
    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }
}
