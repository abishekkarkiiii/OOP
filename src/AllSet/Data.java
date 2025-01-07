package AllSet;

public class Data {
      
    private int [] universalData;
    private int [] yourData;

    Data(int [] universalData,int [] yourData){
        this.universalData=universalData;
        this.yourData=yourData;
        System.out.println("vayo");
    }

    public int [] universalDatagetter(){
        return this.universalData;
    }


    public int [] yourDatagetter(){
        return this.yourData;
    }

    
}
