public class RiderPayChecks{


    public static int giveMoney(int packagesDelivered){
        int money = 5000;

    if(packagesDelivered < 50) {
    money += packagesDelivered * 160;
    
    } else if (packagesDelivered <= 59){
        money += packagesDelivered *200;


    } else if(packagesDelivered <= 69){
        money += packagesDelivered * 300;



    } else {
        money += packagesDelivered * 500;
    
        return money;




    }







}







}
