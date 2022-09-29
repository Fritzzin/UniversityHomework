public final class Veiculo {

    private final String    placa;
    private final String    fabricante;
    private final String    modelo;
    private final int       ano;
    private final Pessoa    proprietario;

    public Veiculo(String placa, String fabricante, String modelo, int ano, 
                    Pessoa proprietario){
        this.placa = placa;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.proprietario = proprietario;
    }

    public void getPlaca(){
        return this.placa;
    }

    public void getFabricante(){
        return this.fabricante;
    }
    // Outros getters...
}