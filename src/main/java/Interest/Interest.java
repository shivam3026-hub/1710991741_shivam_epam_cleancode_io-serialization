package Interest;

public class Interest {
    private double principle;
    private int time;
    private double rate;
    public Interest(double p, double rate,int time )
    {
        this.principle=p;
        this.time=time;
        this.rate=rate;
    }
    public double getsimpleinterest()
    {
        return (principle*rate*time)/100;
    }
    public double getcompoundinterest()
    {
        return principle*Math.pow(1+rate/100,time)-principle;
    }
}
