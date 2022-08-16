package main;

//servicio para el cliente
public class ProxyService implements IService {

    private IService service; //servicio costoso
    private User user;

    public ProxyService(User user) {
        this.user = user;
    }

    @Override
    public void read() {
        this.addService().read();
    }

    @Override
    public void write() {
        this.addService().write();
    }

    @Override
    public void update() {
        this.addService().update();
    }

    @Override
    public void delete() {
        this.addService().delete();
    }

    //el servicio se crea solo cuando es necesario por ser un procedimiento costoso
    private IService addService(){
        if(this.service == null){
            this.service = new Service();
        }
        return this.service;
    }
}
