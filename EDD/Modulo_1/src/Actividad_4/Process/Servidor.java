package Modulo_1.src.Actividad_4.Process;

import java.util.LinkedList;
import java.util.Queue;


class Servidor {

    private double velocidad;  
    private double actualCarga;  
    Queue<Process> queue;  

    public Servidor(double velocidad) {
        this.velocidad = velocidad;
        this.actualCarga = 0;
        this.queue = new LinkedList<>();
    }

    public void enqueueProcess(Process process) {
        queue.add(process);
        actualCarga += process.getTamaño();
    }

    public Process dequeueProcess() {
        Process process = queue.poll();
        if (process != null) {
            actualCarga -= process.getTamaño();
        }
        return process;
    }

    public double getActualCarga() {
        return actualCarga;
    }

    public double getVelocidad() {
        return velocidad;
    }

}