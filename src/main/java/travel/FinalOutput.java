package travel;

public class FinalOutput {
    private Activity activity;
    private Passenger passenger;
    private TravelPackage selectedPackage;
    FinalOutput(Activity activity, Passenger passenger, TravelPackage selectedPackage){
        this.activity = activity;
        this.passenger = passenger;
        this.selectedPackage = selectedPackage;
    }

    public FinalOutput output(){
        FinalOutput output = new FinalOutput(activity, passenger, selectedPackage);
        return output;
    }

    public Activity getActivity() {
        return activity;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public TravelPackage getSelectedPackage() {
        return selectedPackage;
    }


}
