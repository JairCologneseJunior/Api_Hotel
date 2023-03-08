package com.example.Hotel.ApiHotel;

public class Hoteis {
    private String nome;
    private int idEndereco;
    private int idHotel;
    private String localizacao;
    private int quatidadeQuarto;
    private double pagamento;
    private String infoPagamento;
    private String infoOperacinal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getQuatidadeQuarto() {
        return quatidadeQuarto;
    }

    public void setQuatidadeQuarto(int quatidadeQuarto) {
        this.quatidadeQuarto = quatidadeQuarto;
    }

    public double getPagamento() {
        return pagamento;
    }

    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }

    public String getInfoPagamento() {
        return infoPagamento;
    }

    public void setInfoPagamento(String infoPagamento) {
        this.infoPagamento = infoPagamento;
    }

    public String getInfoOperacinal() {
        return infoOperacinal;
    }

    public void setInfoOperacinal(String infoOperacinal) {
        this.infoOperacinal = infoOperacinal;
    }
}
