public class Combo {

    private Burguer burguer = new Burguer();
    private Bebida bebida = new Bebida();
    private Sobremesa sobremesa = new Sobremesa();

    public int CriarCombo(int tipo){
        if (tipo == 1){
            burguer.setGramas(200);
            bebida.setMl(400);
            sobremesa.Sobremesa("Medio");
            burguer.setPreco(15.00);
            burguer.setDescricao("Lanche: X-Bacon-"+burguer.getGramas()+"gr "+"R$"+burguer.getPreco()+"/");
            bebida.setPreco(10.00);
            bebida.setDescricao("Bebida: Coca-cola-"+bebida.getMl()+"ml "+"R$"+bebida.getPreco()+"/");
            sobremesa.setPreco(12.00);
            sobremesa.setDescricao("Sobremesa: Mcflurry-"+sobremesa.getTamanho()+" R$"+sobremesa.getPreco()+"/");
        } else if (tipo == 2) {
            burguer.setGramas(400);
            bebida.setMl(500);
            sobremesa.Sobremesa("Grande");
            burguer.setPreco(20.00);
            burguer.setDescricao("Lanche: X-quadruplo-"+burguer.getGramas()+"gr "+"R$"+burguer.getPreco()+"/");
            bebida.setPreco(10.00);
            bebida.setDescricao("Bebida: Guaraná Jesus-"+bebida.getMl()+"gr "+"R$"+bebida.getPreco()+"/");
            sobremesa.setPreco(18.00);
            sobremesa.setDescricao("Sobremesa: Milkshake-"+sobremesa.getTamanho()+" R$"+sobremesa.getPreco()+"/");
        }
        return tipo;
    }
    @Override
    public String toString(){
        return burguer.getDescricao() + bebida.getDescricao() + sobremesa.getDescricao();
    }
}
