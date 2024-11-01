package Pck_Model;

public class Fabrica {
    
    public void fabricar(String marca) {
        
        if (marca.equals("Fiat")) {
            ProdutoFiatPalio obj = new ProdutoFiatPalio();
            obj.setMarca("Fiat");
            obj.setModelo("Palio");
        } else if (marca.equals("Ford")) {
            ProdutoFordFiesta obj = new ProdutoFordFiesta();
            obj.setMarca("Ford");
            obj.setModelo("Fiesta");
        } else if (marca.equals("Chevrolet")) {
            ProdutoGMChevete obj = new ProdutoGMChevete();
            obj.setMarca("Chevrolet");
            obj.setModelo("Chevete");
        } else if (marca.equals("Volkswagen")) {
            ProdutoVWPol obj = new ProdutoVWPol();
            obj.setMarca("Volkswagen");
            obj.setModelo("Polo");
        }
    }
    
    /*
    public void fabricar(String modelo) {
        
        if (modelo.equals("palio")) {
            ProdutoFiatPalio obj = new ProdutoFiatPalio();
            obj.setMarca("Fiat");
            obj.setModelo("Palio");
        } else if (modelo.equals("fiesta")) {
            ProdutoFordFiesta obj = new ProdutoFordFiesta();
            obj.setMarca("Ford");
            obj.setModelo("Fiesta");
        } else if (modelo.equals("chevete")) {
            ProdutoGMChevete obj = new ProdutoGMChevete();
            obj.setMarca("Chevrolet");
            obj.setModelo("Chevete");
        } else if (modelo.equals("pol")) {
            ProdutoVWPol obj = new ProdutoVWPol();
            obj.setMarca("Volkswagen");
            obj.setModelo("Polo");
        }
    }
    */
    
}
