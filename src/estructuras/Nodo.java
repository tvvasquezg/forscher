package estructuras;

    public class Nodo<T> {

        private T key;
        private Nodo<T> next;

        public Nodo(T key, Nodo<T> top) {
            this.key = key;
            this.next = top;
        }

        public Nodo(T key) {
            this.key = key;
        }
        
        void setKey(T key){
            this.key = key;
        }
        
        void setNext(Nodo<T> nodo){
            next = nodo;
        }
        
        T getKey(){return this.key;}
        Nodo<T> getNext() {return next;}

    };
