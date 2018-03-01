public class LinkedList<T> {

    private LinkedListElement<T>    firstElement;
    private LinkedListElement<T>    lastElement;

    public class LinkedListElement<T> {

        private T           dataOfElement;

        private LinkedListElement<T>  nextElement;
        private LinkedListElement<T>  previousElement;

        public void LinkedListElement(){
            dataOfElement = null;
            nextElement = null;
            previousElement = null;
        }
    }

    public LinkedList(){
        firstElement = null;
        lastElement = null;
    }

    public void addElementToTheEnd(T Element) {

    }
}