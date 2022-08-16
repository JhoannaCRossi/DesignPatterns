package main;

//sirve como puente entre el cliente y lo q espera utilizar
public class AdapterDB implements IConnectionSQL{
    private IConnectionNoSQL noSQL;

    public AdapterDB(IConnectionNoSQL noSQL){
        this.noSQL = noSQL;
    }
    public void connection(){
        this.noSQL.connection();
    }

    public String runQuery(){
        return this.noSQL.executeSentence();
    }
}
