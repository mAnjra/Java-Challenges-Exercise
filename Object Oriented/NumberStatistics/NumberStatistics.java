public class NumberStatistics{
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics(){
        this.amountOfNumbers= 0;
        this.sum= 0;
    }

    public void addNumber(int number){
        this.sum += number;
        this.amountOfNumbers++;
    }

    public int amountOfNumbersAdded(){
        return this.amountOfNumbers;
    }

    public int sum(){
        return this.sum;
    }

    public double average(){
        if( this.amountOfNumbers == 0 ){
            return 0;
        }else{
            return (double) this.sum / this.amountOfNumbers;//have to cast a double. otherwise answer ignores numbers after decimal
        }                                                   //it is called an explicit type conversion
    }
}
