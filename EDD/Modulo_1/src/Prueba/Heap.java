package Modulo_1.src.Prueba;

class Heap {
    int arr[];
    int size;
    //La funcion "this.buildHeap(){}" transformara nuestro array en un Heap
    public Heap(int arr[]) {
        this.arr = arr;
        this.size = arr.length;


        buildHeap();
    }

    //Sera void ya que no realizara nada, ademas que los arrays en java se pasan mediante referencias
    void buildHeap() {
        for(int i=this.size/2-1; i>=0; i--) {
            heapify(i);
        }
    }

    //La diferencia entre encontrar el niño izquierdo y derecho esta en la formula
    //root_index*2+1 es del valor que se encuentra a la izquierda, y si le sumamos 1 al valor de child, este nos dara como respuesta el valor del valor que esta posicionado a la derecha
    void heapify(int root_index) {
        int max_index = root_index;
        int child = root_index * 2 + 1;
        if(child<size) {
            if(arr[child] > arr[max_index]) {
                max_index = child;
            }
        }

        if(child+1<size) {
            if(arr[child+1]>arr[max_index]) {
                max_index = child+1;
            }
        }


        swap(arr, root_index, max_index);
        if(root_index!=max_index) {
            heapify(max_index);
        }
    }


    void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    int extractRoot() {
        int max = arr[0];
        arr[0] = arr[--size];
        heapify(0);


        return max;
    }

    int getSize() {
        return size;
    }
}


class HeapSort {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 7, 6, 5, 88, 11, 22, 76 };
        Heap heap = new Heap(arr);

        while(heap.getSize()>0) {
            System.out.print(heap.extractRoot()+", ");
        }
    }
}