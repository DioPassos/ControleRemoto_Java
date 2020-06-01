
package aulaencapsulamento;

public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //metodos especiais

    public ControleRemoto() {
        this.volume =60;
        this.tocando =false;
        this.ligado =false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    void Status() {
        System.out.println("-------------------------");
        System.out.println("esta ligado:" +ligado);
        System.out.println("esta tocando:" +tocando); 
        System.out.println("Qual volume atual?:" +volume);
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? " + this.getLigado() );
        System.out.println("Está tocando " + this.getTocando());
        System.out.print("Volume " +this.getVolume());
        for (int i = 0; i <=this.getVolume(); i=i+10){
            System.out.println("[]");
        }
        
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o Menu...");
    }

    @Override
    public void maisVolume() {
    }

    @Override
    public void menosVolume() {
    }

    @Override
    public void ligarMudo() {
    }

    @Override
    public void desligarMudo() {
    }

    @Override
    public void play() {
    }

    @Override
    public void pause() {
    }
        
    }
    
    
    

