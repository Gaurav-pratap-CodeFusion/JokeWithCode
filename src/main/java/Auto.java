public class Auto {
    private Engine eng;

    public void setEng(Engine eng) {
        this.eng = eng;
    }

    public Auto(Engine eng) {
        this.eng = eng;
    }

    public void drive(){
        int start=eng.start();
        if(start==1){
            System.out.println("Engine started with DieselEngine.");
            System.out.println("Let's Drive");

        } else if (start==2) {
            System.out.println("Engine started with PetrolEngine.");
            System.out.println("Let's Drive");

        } else if (start==3) {
            System.out.println("Engine started with CNGEngine.");
            System.out.println("Let's Drive");

        }else System.out.println("Engine not started yet.");
    }
}
