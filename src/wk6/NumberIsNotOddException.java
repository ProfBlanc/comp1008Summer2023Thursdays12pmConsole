package wk6;

public class NumberIsNotOddException extends IllegalArgumentException{


    public NumberIsNotOddException(){}

    public NumberIsNotOddException(String message){
        super(message);
    }

}
