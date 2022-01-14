package juegoCalamarConInterfaz;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Puente de cristal del Juego del Calamar con una interfaz gráfica
 * @author rpsPRO
 * @version 1.0.0
 */
public class JuegoDelCalamar {

    public static final String ANSI_RED = "\u001B[31m"; //color rojo
    public static final String ANSI_GREEN = "\u001B[32m"; //color verde
    public static final JuegoBaldosasCristal vista =  new JuegoBaldosasCristal();
    public static Desktop ficheroAEjecutar=Desktop.getDesktop();

    public static void main(String[] args) {

        ficheroAEjecutar.disableSuddenTermination();
        try {
            ficheroAEjecutar.open(new File("src/juegoCalamarConInterfaz/sonidos/sonidoInicial.mp3"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        try {
            Thread.sleep(30000);
            JuegoDelCalamar.vista.getEtiquetaInformacion().setText("¡Que comience el juego!");
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Puente puente = new Puente(18);
        String[] nombres = {"Rubén","Pablo","Cristian","Juanma","Miguel","Alex","David","Alejandro","Daniel","Marina"};
        Jugador[] jugadores = new Jugador[10];

        try {
            for (int i = 0; i < jugadores.length; i++) {
                int pesoJugador = 60 + (int) (Math.random() * (150 - 60) + 1);
                jugadores[i] = new Jugador(nombres[i], pesoJugador, puente);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].start();
        }

        try {
            for (int i = 0; i < jugadores.length; i++) {
                jugadores[i].join();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }


        StringBuilder resultados = new StringBuilder();
        resultados.append("Jugadores que pasaron el puente: ");
        for (int i = 0; i < jugadores.length; i++) {
            if(!jugadores[i].isHaCaido())
                resultados.append(jugadores[i].getNombreJugador()+" ");
        }


        if (resultados.toString().equalsIgnoreCase("Jugadores que pasaron el puente: "))
            resultados.append("Ninguno...");
        JuegoDelCalamar.vista.getEtiquetaInformacion().setText(resultados.toString());

        destruirTodosLosPeldaños();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void destruirTodosLosPeldaños() {
        try {
            ficheroAEjecutar.open(new File("src/juegoCalamarConInterfaz/sonidos/sonidoRoturaCristales.mp3"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        JuegoDelCalamar.vista.getBaldosa1A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa2A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa3A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa4A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa5A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa6A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa7A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa8A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa9A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa10A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa11A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa12A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa13A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa14A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa15A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa16A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa17A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa18A().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG"));

        JuegoDelCalamar.vista.getBaldosa1B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa2B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa3B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa4B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa5B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa6B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa7B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa8B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa9B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa10B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa11B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa12B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa13B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa14B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa15B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa16B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa17B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
        JuegoDelCalamar.vista.getBaldosa18B().setIcon(new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG"));
    }
}

class Jugador extends Thread {
    private String nombreJugador;
    private int pesoJugador;
    private Puente puente;
    private static int totalJugadores = 0;

    private Icon jugadorPeldanio1;
    private Icon jugadorPeldanio2;

    private Icon imagenPeldanio1 = new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1.PNG");
    private Icon imagenPeldanio2 = new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2.PNG");
    private Icon imagenPeldanio1Roto = new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal1Roto.PNG");
    private Icon imagenPeldanio2Roto = new ImageIcon("src/juegoCalamarConInterfaz/imagenes/cristal2Roto.PNG");

    private static List<Integer> listaPeldanios1o2 = new ArrayList<>();
    private int posicionJugador = 0;
    private boolean haCaido = false;

    public Jugador(String nombreJugador, int pesoJugador, Puente puente) throws IOException {
        this.nombreJugador = nombreJugador;
        this.pesoJugador = pesoJugador;
        this.puente = puente;
        this.totalJugadores++;

        jugadorPeldanio1 = new ImageIcon(elegirImagenJugador(nombreJugador)[0]);
        jugadorPeldanio2 = new ImageIcon(elegirImagenJugador(nombreJugador)[1]);
    }

    private String[] elegirImagenJugador(String nombreJugador) {
        if(nombreJugador.equalsIgnoreCase("Marina"))
            return new String[]{"src/juegoCalamarConInterfaz/imagenes/cristal1Mujer.png","src/juegoCalamarConInterfaz/imagenes/cristal2Mujer.png"};
        else
            return new String[]{"src/juegoCalamarConInterfaz/imagenes/cristal1Hombre.png","src/juegoCalamarConInterfaz/imagenes/cristal2Hombre.png"};
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public int getPosicionJugador() {
        return posicionJugador;
    }

    public boolean isHaCaido() {
        return haCaido;
    }

    @Override
    public void run() {
        try {
            synchronized (puente) {
                //Si no hay sitio en el puente el jugador debe esperar
                while (puente.getListaPosicionesOcupadas().get(0)) {
                    puente.wait();
                }

                while (!puente.seHaPasadoElPuente(posicionJugador)) {
                    if (posicionJugador == 0)
                        puente.setNumJugadoresHanPasadoPorElPuente(puente.getNumJugadoresHanPasadoPorElPuente() + 1);
                    
                    while(puente.getListaPosicionesOcupadas().get(posicionJugador)){
                        if(puente.alguienPasoElPuente() && puente.noHayNadieDetras(posicionJugador))
                            puente.notifyAll();
                        puente.wait();
                    }

                    if (puente.deboSeguirCaminoDelSiguiente(posicionJugador)) {
                        while (!puente.estanPeldaniosOcupados()) {
                            boolean seSaleDelBucle = true;
                            
                            //Si se trata del último jugador no tiene que esperar a que los peldaños que hay detrás se llenen
                            if (totalJugadores == puente.getNumJugadoresHanPasadoPorElPuente())
                                break;
                
                            if (posicionJugador > 1){
                                for(int i = 0; i < posicionJugador - 1; i++){
                                    if(!puente.getListaPosicionesOcupadas().get(i)){
                                        seSaleDelBucle = false;
                                        puente.notifyAll();
                                        puente.wait();
                                    }
                                }
                              
                            }

                            if(seSaleDelBucle)
                                break;

                        }

                        posicionJugador++;

                        if (posicionJugador == 1)
                            puente.setNumPeldaniosOcupados(puente.getNumPeldaniosOcupados() + 1);

                        JuegoDelCalamar.vista.getEtiquetaInformacion().setText(String.format("El jugador %s siguió el camino del jugador que va por delante y ahora está " +
                                "en la posición %d%n", nombreJugador, posicionJugador));
                        JuegoDelCalamar.ficheroAEjecutar.open(new File("src/juegoCalamarConInterfaz/sonidos/sonidoSeguir.mp3"));
                        Thread.sleep(4000);
                        pintarBaldosa(posicionJugador, false);

                        puente.setValorLista(posicionJugador - 1, true);

                        if (posicionJugador != 1)
                            puente.setValorLista(posicionJugador - 2,false);

                        if (posicionJugador == puente.getTOTAL_PELDANIOS()){
                            JuegoDelCalamar.vista.getEtiquetaInformacion().setText(String.format("¡¡El jugador %s ha pasado el puente!!%n", nombreJugador));
                            quitarPinturaBaldosa(posicionJugador,listaPeldanios1o2.get(listaPeldanios1o2.size() - 1));
                            Thread.sleep(5000);
                            puente.setValorLista(posicionJugador - 1, false);
                        }
                            

                        puente.notifyAll();
                        
                    } else {
                        
                        while (!puente.estanPeldaniosOcupados()) {
                            boolean seSaleDelBucle = true;
                            if (posicionJugador > 2) {
                                for (int i = 0; i < posicionJugador - 2; i++){
                                    if(puente.getListaPosicionesOcupadas().get(i) && !puente.getListaPosicionesOcupadas().get(i + 1)){
                                        seSaleDelBucle = false;
                                        break;
                                    }
                                }

                                if (puente.getNumJugadoresHanPasadoPorElPuente() < totalJugadores && 
                                    !puente.getListaPosicionesOcupadas().get(0))
                                    seSaleDelBucle = false;

                                if(seSaleDelBucle)
                                    break;
                            }
                            
                            puente.notifyAll(); //Despertamos a los jugadores que están en peldaños anteriores esperando
                            //a que se mueva el primero 
                            puente.wait();  
                                                     
                        }

                        int tiempoPensar = 4000 + (int) (Math.random() * (10000 - 4000) + 1);
                        JuegoDelCalamar.vista.getEtiquetaInformacion().setText(String.format("El jugador %s va a elegir a qué peldaño %d saltar y tomará %d segundos%n",
                                nombreJugador, posicionJugador + 1, tiempoPensar / 1000));

                        int numPeldanioCorrecto = 1 + (int) (Math.random() * 2);
                        listaPeldanios1o2.add(numPeldanioCorrecto);

                        if(posicionJugador < 10 || !puente.noHayNadieDetras(posicionJugador))
                            JuegoDelCalamar.ficheroAEjecutar.open(new File("src/juegoCalamarConInterfaz/sonidos/sonidoPedirQueAvance.mp3"));

                        Thread.sleep(tiempoPensar);

                        //La posición el jugador aumentará siempre ya sea habiendo acertado o no, porque si falla
                        //queremos conocer al final en qué posición cayó el jugador
                        posicionJugador++;

                        if (puente.elegirPeldanioCorrecto(posicionJugador, pesoJugador)) {
                            if (posicionJugador == 1)
                                puente.setNumPeldaniosOcupados(puente.getNumPeldaniosOcupados() + 1);

                            JuegoDelCalamar.ficheroAEjecutar.open(new File("src/juegoCalamarConInterfaz/sonidos/sonidoAcertar.mp3"));

                            JuegoDelCalamar.vista.getEtiquetaInformacion().setText(String.format("¡Bien! El jugador %s pisó el peldaño %d correcto%n",
                                    nombreJugador, posicionJugador));

                            pintarBaldosa(posicionJugador, false);

                            Thread.sleep(5000);
                            puente.setValorLista(posicionJugador - 1,true);

                            if (posicionJugador != 1)
                                puente.setValorLista(posicionJugador - 2,false);

                            if (posicionJugador == puente.getTOTAL_PELDANIOS()){
                                JuegoDelCalamar.vista.getEtiquetaInformacion().setText(String.format("¡¡El jugador %s ha pasado el puente!!%n", nombreJugador));
                                quitarPinturaBaldosa(posicionJugador,listaPeldanios1o2.get(listaPeldanios1o2.size() - 1));
                                Thread.sleep(5000);
                                puente.setValorLista(posicionJugador - 1, false);
                                puente.notifyAll();
                                return;
                            }
                            
                        } else {
                            JuegoDelCalamar.vista.getEtiquetaInformacion().setText(String.format("¡Oh no! El jugador %s ha pisado el peldaño %d incorrecto y ha caido%n",
                                    nombreJugador, posicionJugador));
                            JuegoDelCalamar.ficheroAEjecutar.open(new File("src/juegoCalamarConInterfaz/sonidos/sonidoFallar.mp3"));
                            Thread.sleep(1000);
                            pintarBaldosa(posicionJugador, true);


                            Thread.sleep(5000);
                            if (puente.getNumPeldaniosOcupados() > 0)
                                puente.setNumPeldaniosOcupados(puente.getNumPeldaniosOcupados() - 1);

                            if (posicionJugador != 1)
                                puente.setValorLista(posicionJugador - 2,false);
                            
                            haCaido = true;
                            puente.notifyAll();
                            return;
                        }
                    }
                }
            }

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    private void pintarBaldosa(int posicionJugador, boolean haCaido) {

        if(posicionJugador > 1){
            if (listaPeldanios1o2.get(posicionJugador - 2) == 1)
                quitarPinturaBaldosa(posicionJugador, 1);
            else
                quitarPinturaBaldosa(posicionJugador, 2);
        }

        if (!haCaido) {
            switch (posicionJugador) {
                case 1:
                    if (listaPeldanios1o2.get(0) == 1)
                        JuegoDelCalamar.vista.getBaldosa1A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa1B().setIcon(jugadorPeldanio2);
                    break;
                case 2:
                    if (listaPeldanios1o2.get(1) == 1) {
                        JuegoDelCalamar.vista.getBaldosa2A().setIcon(jugadorPeldanio1);
                    }
                    else
                        JuegoDelCalamar.vista.getBaldosa2B().setIcon(jugadorPeldanio2);
                    break;
                case 3:
                    if (listaPeldanios1o2.get(2) == 1)
                        JuegoDelCalamar.vista.getBaldosa3A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa3B().setIcon(jugadorPeldanio2);
                    break;
                case 4:
                    if (listaPeldanios1o2.get(3) == 1)
                        JuegoDelCalamar.vista.getBaldosa4A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa4B().setIcon(jugadorPeldanio2);
                    break;
                case 5:
                    if (listaPeldanios1o2.get(4) == 1)
                        JuegoDelCalamar.vista.getBaldosa5A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa5B().setIcon(jugadorPeldanio2);
                    break;
                case 6:
                    if (listaPeldanios1o2.get(5) == 1)
                        JuegoDelCalamar.vista.getBaldosa6A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa6B().setIcon(jugadorPeldanio2);
                    break;
                case 7:
                    if (listaPeldanios1o2.get(6) == 1)
                        JuegoDelCalamar.vista.getBaldosa7A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa7B().setIcon(jugadorPeldanio2);
                    break;
                case 8:
                    if (listaPeldanios1o2.get(7) == 1)
                        JuegoDelCalamar.vista.getBaldosa8A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa8B().setIcon(jugadorPeldanio2);
                    break;
                case 9:
                    if (listaPeldanios1o2.get(8) == 1)
                        JuegoDelCalamar.vista.getBaldosa9A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa9B().setIcon(jugadorPeldanio2);
                    break;
                case 10:
                    if (listaPeldanios1o2.get(9) == 1)
                        JuegoDelCalamar.vista.getBaldosa10A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa10B().setIcon(jugadorPeldanio2);
                    break;
                case 11:
                    if (listaPeldanios1o2.get(10) == 1)
                        JuegoDelCalamar.vista.getBaldosa11A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa11B().setIcon(jugadorPeldanio2);
                    break;
                case 12:
                    if (listaPeldanios1o2.get(11) == 1)
                        JuegoDelCalamar.vista.getBaldosa12A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa12B().setIcon(jugadorPeldanio2);
                    break;
                case 13:
                    if (listaPeldanios1o2.get(12) == 1)
                        JuegoDelCalamar.vista.getBaldosa13A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa13B().setIcon(jugadorPeldanio2);
                    break;
                case 14:
                    if (listaPeldanios1o2.get(13) == 1)
                        JuegoDelCalamar.vista.getBaldosa14A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa14B().setIcon(jugadorPeldanio2);
                    break;
                case 15:
                    if (listaPeldanios1o2.get(14) == 1)
                        JuegoDelCalamar.vista.getBaldosa15A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa15B().setIcon(jugadorPeldanio2);
                    break;
                case 16:
                    if (listaPeldanios1o2.get(15) == 1)
                        JuegoDelCalamar.vista.getBaldosa16A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa16B().setIcon(jugadorPeldanio2);
                    break;
                case 17:
                    if (listaPeldanios1o2.get(16) == 1)
                        JuegoDelCalamar.vista.getBaldosa17A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa17B().setIcon(jugadorPeldanio2);
                    break;
                case 18:
                    if (listaPeldanios1o2.get(17) == 1)
                        JuegoDelCalamar.vista.getBaldosa18A().setIcon(jugadorPeldanio1);
                    else
                        JuegoDelCalamar.vista.getBaldosa18B().setIcon(jugadorPeldanio2);
                    break;
            }
        }
        else {
            switch (posicionJugador) {
                case 1:
                    if (listaPeldanios1o2.get(0) == 1)
                        JuegoDelCalamar.vista.getBaldosa1B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa1A().setIcon(imagenPeldanio1Roto);
                    break;
                case 2:
                    if (listaPeldanios1o2.get(1) == 1)
                        JuegoDelCalamar.vista.getBaldosa2B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa2A().setIcon(imagenPeldanio1Roto);
                    break;
                case 3:
                    if (listaPeldanios1o2.get(2) == 1)
                        JuegoDelCalamar.vista.getBaldosa3B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa3A().setIcon(imagenPeldanio1Roto);
                    break;
                case 4:
                    if (listaPeldanios1o2.get(3) == 1)
                        JuegoDelCalamar.vista.getBaldosa4B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa4A().setIcon(imagenPeldanio1Roto);
                    break;
                case 5:
                    if (listaPeldanios1o2.get(4) == 1)
                        JuegoDelCalamar.vista.getBaldosa5B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa5A().setIcon(imagenPeldanio1Roto);
                    break;
                case 6:
                    if (listaPeldanios1o2.get(5) == 1)
                        JuegoDelCalamar.vista.getBaldosa6B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa6A().setIcon(imagenPeldanio1Roto);
                    break;
                case 7:
                    if (listaPeldanios1o2.get(6) == 1)
                        JuegoDelCalamar.vista.getBaldosa7B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa7A().setIcon(imagenPeldanio1Roto);
                    break;
                case 8:
                    if (listaPeldanios1o2.get(7) == 1)
                        JuegoDelCalamar.vista.getBaldosa8B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa8A().setIcon(imagenPeldanio1Roto);
                    break;
                case 9:
                    if (listaPeldanios1o2.get(8) == 1)
                        JuegoDelCalamar.vista.getBaldosa9B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa9A().setIcon(imagenPeldanio1Roto);
                    break;
                case 10:
                    if (listaPeldanios1o2.get(9) == 1)
                        JuegoDelCalamar.vista.getBaldosa10B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa10A().setIcon(imagenPeldanio1Roto);
                    break;
                case 11:
                    if (listaPeldanios1o2.get(10) == 1)
                        JuegoDelCalamar.vista.getBaldosa11B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa11A().setIcon(imagenPeldanio1Roto);
                    break;
                case 12:
                    if (listaPeldanios1o2.get(11) == 1)
                        JuegoDelCalamar.vista.getBaldosa12B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa12A().setIcon(imagenPeldanio1Roto);
                    break;
                case 13:
                    if (listaPeldanios1o2.get(12) == 1)
                        JuegoDelCalamar.vista.getBaldosa13B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa13A().setIcon(imagenPeldanio1Roto);
                    break;
                case 14:
                    if (listaPeldanios1o2.get(13) == 1)
                        JuegoDelCalamar.vista.getBaldosa14B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa14A().setIcon(imagenPeldanio1Roto);
                    break;
                case 15:
                    if (listaPeldanios1o2.get(14) == 1)
                        JuegoDelCalamar.vista.getBaldosa15B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa15A().setIcon(imagenPeldanio1Roto);
                    break;
                case 16:
                    if (listaPeldanios1o2.get(15) == 1)
                        JuegoDelCalamar.vista.getBaldosa16B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa16A().setIcon(imagenPeldanio1Roto);
                    break;
                case 17:
                    if (listaPeldanios1o2.get(16) == 1)
                        JuegoDelCalamar.vista.getBaldosa17B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa17A().setIcon(imagenPeldanio1Roto);
                    break;
                case 18:
                    if (listaPeldanios1o2.get(17) == 1)
                        JuegoDelCalamar.vista.getBaldosa18B().setIcon(imagenPeldanio2Roto);
                    else
                        JuegoDelCalamar.vista.getBaldosa18A().setIcon(imagenPeldanio1Roto);
                    break;
            }
        }
    }

    private void quitarPinturaBaldosa(int posicionJugador, int peldanioABorrar) {
        switch(posicionJugador){
            case 2:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa1A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa1B().setIcon(imagenPeldanio2);
                break;
            case 3:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa2A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa2B().setIcon(imagenPeldanio2);
                break;
            case 4:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa3A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa3B().setIcon(imagenPeldanio2);
                break;
            case 5:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa4A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa4B().setIcon(imagenPeldanio2);
                break;
            case 6:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa5A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa5B().setIcon(imagenPeldanio2);
                break;
            case 7:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa6A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa6B().setIcon(imagenPeldanio2);
                break;
            case 8:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa7A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa7B().setIcon(imagenPeldanio2);
                break;
            case 9:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa8A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa8B().setIcon(imagenPeldanio2);
                break;
            case 10:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa9A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa9B().setIcon(imagenPeldanio2);
                break;
            case 11:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa10A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa10B().setIcon(imagenPeldanio2);
                break;
            case 12:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa11A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa11B().setIcon(imagenPeldanio2);
                break;
            case 13:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa12A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa12B().setIcon(imagenPeldanio2);
                break;
            case 14:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa13A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa13B().setIcon(imagenPeldanio2);
                break;
            case 15:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa14A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa14B().setIcon(imagenPeldanio2);
                break;
            case 16:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa15A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa15B().setIcon(imagenPeldanio2);
                break;
            case 17:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa16A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa16B().setIcon(imagenPeldanio2);
                break;
            case 18:
                if(peldanioABorrar == 1)
                    JuegoDelCalamar.vista.getBaldosa17A().setIcon(imagenPeldanio1);
                else
                    JuegoDelCalamar.vista.getBaldosa17B().setIcon(imagenPeldanio2);
                break;

        }
    }


}

class Puente {
    private final int TOTAL_PELDANIOS;

    private final int[] PESO_PAR_PELDANIOS = {150, 10};
    private int numPeldaniosCaminoCorrecto = 0;
    private int numPeldaniosOcupados = 0;
    private int numJugadoresHanPasadoPorElPuente = 0;
    private List<Boolean> listaPosicionesOcupadas = new ArrayList<>();
    private boolean alguienPasoElPuente = false;

    public Puente(int TOTAL_PELDANIOS) {
        this.TOTAL_PELDANIOS = TOTAL_PELDANIOS;
        for (int i = 0; i < this.TOTAL_PELDANIOS; i++) {
            listaPosicionesOcupadas.add(false);
        }
    }

    public int getTOTAL_PELDANIOS() {
        return TOTAL_PELDANIOS;
    }

    public int getNumPeldaniosCaminoCorrecto() {
        return numPeldaniosCaminoCorrecto;
    }

    public int getNumPeldaniosOcupados() {
        return numPeldaniosOcupados;
    }

    public void setNumPeldaniosOcupados(int numPeldaniosOcupados) {
        this.numPeldaniosOcupados = numPeldaniosOcupados;
    }

    public int getNumJugadoresHanPasadoPorElPuente() {
        return numJugadoresHanPasadoPorElPuente;
    }

    public void setNumJugadoresHanPasadoPorElPuente(int numJugadoresHanPasadoPorElPuente) {
        this.numJugadoresHanPasadoPorElPuente = numJugadoresHanPasadoPorElPuente;
    }

    public List<Boolean> getListaPosicionesOcupadas() {
        return listaPosicionesOcupadas;
    }

    public void setValorLista(int posicion, boolean nuevoValor){
        listaPosicionesOcupadas.set(posicion,nuevoValor);
    }

    public boolean alguienPasoElPuente(){
        return alguienPasoElPuente;
    }

    public boolean elegirPeldanioCorrecto(int posicionJugador, int pesoJugador){
        int eleccion = (int) (Math.random() * 2);

        if(numPeldaniosCaminoCorrecto < TOTAL_PELDANIOS)
            numPeldaniosCaminoCorrecto++;

        if (PESO_PAR_PELDANIOS[eleccion] >= pesoJugador){
            if (posicionJugador == 18)
                alguienPasoElPuente = true;
            return true;
        }
        return false;
    }

    synchronized public boolean seHaPasadoElPuente(int posicionJugador){
        return TOTAL_PELDANIOS == posicionJugador;
    }

    public boolean estanPeldaniosOcupados(){
        return numPeldaniosCaminoCorrecto == numPeldaniosOcupados;
    }

    public boolean deboSeguirCaminoDelSiguiente(int posicionJugador){
        return numPeldaniosCaminoCorrecto > posicionJugador;
    }

    public boolean noHayNadieDetras(int posicionJugador){
        for(int i = 0; i < posicionJugador - 1; i++){
            if(listaPosicionesOcupadas.get(i))
                return false;
        }
        return true;
    }
}
