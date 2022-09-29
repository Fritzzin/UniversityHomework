package produtorconsumidor;

/**
 *
 * @author fritzzin
 */
public class ProdutorConsumidor {

    public static class Buffer {

        private int size;
        private int[] buffer;
        private int posicaoProdutor = 0;
        private int posicaoConsumidor = 0;

        public Buffer(int size) {
            this.size = size;
            this.buffer = new int[size];
        }

        public void produzir() throws InterruptedException {
            try {
                while (true) {

                    if (buffer[posicaoProdutor] == 0) {
                        synchronized (this) {
                            buffer[posicaoProdutor] = gerarAleatorio();
                            System.out.println("Produziu : |" + Thread.currentThread() + "| " + posicaoProdutor + " = " + buffer[posicaoProdutor]);
                            posicaoProdutor = posicaoProdutor % (size - 1) + 1;
                        }
                    } else {
                        System.out.println("OVERFLOW!!!");
                    }
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void consumir() throws InterruptedException {
            try {
                while (true) {

                    if (buffer[posicaoConsumidor] != 0) {
                        synchronized (this) {
                            buffer[posicaoConsumidor] = 0;
                            System.out.println("Consumiu : |" + Thread.currentThread() + "| " + posicaoConsumidor + " = " + buffer[posicaoConsumidor]);
                            posicaoConsumidor = posicaoConsumidor % (size - 1) + 1;
                        }
                    } else {
                        System.out.println("UNDERFLOW!!!");
                    }
                    Thread.sleep(1000);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static int gerarAleatorio() {
        return ((int) (Math.random() * 100) + 1);
    }

    public static void main(String[] args) throws InterruptedException {

        Buffer buffer = new Buffer(10);

        Thread produtor = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    buffer.produzir();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "PRODUTOR Nº " + 1);

        Thread produtor2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    buffer.produzir();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "PRODUTOR Nº " + 2);

        Thread consumidor = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    buffer.consumir();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "CONSUMIRDOR Nº " + 1);

        Thread consumidor2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    buffer.consumir();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "CONSUMIRDOR Nº " + 2);

        produtor.start();
        produtor2.start();
        consumidor.start();
        consumidor2.start();

        produtor.join();
        produtor2.join();
        consumidor.join();
        consumidor2.join();
    }
}
