public interface MySubject {
    public void registerObserver (MyObserver o);
    
    public void removeObserver (MyObserver o);

    public void notifyObserver();
}