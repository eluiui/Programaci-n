package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulito
 * @author profesor
 */
public class Circulito {

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    private static final double LIMITERADIO = 0.0;
    public static final double MINIMO = LIMITERADIO;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    public Circulito() {
    }

    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        establecerRadio(valorRadio);
    }

    public void establecerX(int valorX) {
        setCoordenadaX(valorX);
    }

    public int obtenerX() {
        return getCoordenadaX();
    }

    public void establecerY(int valorY) {
        setCoordenadaY(valorY);
    }

    public int obtenerY() {
        return getCoordenadaY();
    }

    public void establecerRadio(double valorRadio) {

        setRadio(valorRadio < MINIMO ? MINIMO : valorRadio);
    }

    public double obtenerRadio() {
        return getRadio();
    }

    public double obtenerDiametro() {
        return getRadio() * 2;
    }

    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    public double obtenerArea() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    public void trasladarCentro(int trasladarx, int trasladary){
        setCoordenadaX(getCoordenadaX() + trasladarx);
        setCoordenadaY(getCoordenadaY() + trasladary);
    }
}
