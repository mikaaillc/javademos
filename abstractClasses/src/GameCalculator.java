public abstract class GameCalculator { //abstract sınıfta abstract opersayon olmayabilir
    public abstract void hesapla();//bu operasyonu hamgi class extend ettiyse bu metodu override etmek zorunda,
    // Abstract sınıflar asla newlenemez sadece overide edilerek newlenebilir.
    //Abstract metodlar operasyon içermelidir

    public void gameOver(){
        System.out.println("Oyun Bitti");
    }
}
