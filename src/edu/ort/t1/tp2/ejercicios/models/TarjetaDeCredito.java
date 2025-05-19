package edu.ort.t1.tp2.ejercicios.models;

public class TarjetaDeCredito {
    private String numero;
    private Titular titular;
    private double limiteDeCompra;
    private double acumuladoActual;

    public TarjetaDeCredito(String numero, Titular titular, double limiteDeCompra) {
        this.numero = numero;
        this.titular = titular;
        this.limiteDeCompra = limiteDeCompra;
        this.acumuladoActual = 0;
    }

    public String getNumero() {
        return numero;
    }

    public Titular getTitular() {
        return titular;
    }

    public double getLimiteDeCompra() {
        return limiteDeCompra;
    }

    public double getAcumuladoActual() {
        return acumuladoActual;
    }

    private void setNumero(String numero) {
        this.numero = numero;
    }

    private void setTitular(Titular titular) {
        this.titular = titular;
    }

    private void setLimiteDeCompra(double limiteDeCompra) {
        this.limiteDeCompra = limiteDeCompra;
    }

    private void setAcumuladoActual(double acumuladoActual) {
        this.acumuladoActual = acumuladoActual;
    }

    public double montoDisponible() {
        double disponible = limiteDeCompra - acumuladoActual;
        return Math.max(disponible, 0);
    }

    private boolean compraPosible(double monto) {
        return monto <= montoDisponible();
    }

    public void actualizarLimite(double nuevoLimite) {
        setLimiteDeCompra(nuevoLimite);
    }

    private void acumularGastoActual(double monto) {
        acumuladoActual += monto;
    }

    public boolean realizarCompra(double monto) {
        if (compraPosible(monto)) {
            acumularGastoActual(monto);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
                "numero='" + numero + '\'' +
                ", titular=" + titular +
                ", limiteDeCompra=" + limiteDeCompra +
                ", acumuladoActual=" + acumuladoActual +
                ", montoDisponible=" + montoDisponible() +
                '}';
    }
}
