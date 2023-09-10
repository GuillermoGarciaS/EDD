package Modulo_1.src.Actividad_4.Process;

import Modulo_1.src.Actividad_4.Process.Process;
import Modulo_1.src.Actividad_4.Process.Servidor;

import java.util.Random;

public class Simulation {

    public static void runSimulation() {
        Servidor servidor1 = new Servidor(1.0);
        Servidor servidor2 = new Servidor(2.0);

        for (int i = 0; i < 60; i++) {
            double processTamaño = Math.random() * 100;
            Process process = new Process(processTamaño);

            // Asignación al proceso con menor carga
            if (servidor1.getActualCarga() <= servidor2.getActualCarga()) {
                servidor1.enqueueProcess(process);
            } else {
                servidor2.enqueueProcess(process);
            }
        }

        // Procesamiento de los procesos
        while (!servidor1.queue.isEmpty() || !servidor2.queue.isEmpty()) {
            if (servidor1.getActualCarga() <= servidor2.getActualCarga()) {
                Process process = servidor1.dequeueProcess();
                if (process != null) {
                    double tiempoDeProceso = process.getTamaño() / servidor1.getVelocidad();
                }
            } else {
                Process process = servidor2.dequeueProcess();
                if (process != null) {
                    double tiempoDeProceso = process.getTamaño() / servidor2.getVelocidad();
                }
            }
        }
        System.out.println("eryx esta bieeeeen guapo");
    }
}