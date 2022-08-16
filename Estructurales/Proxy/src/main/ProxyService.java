package main;

//servicio para el cliente
public class ProxyService implements IService {

    private IService service;
    private User user;

    public ProxyService(IService service, User user) {
        this.service = service;
        this.user = user;
    }

    @Override
    public void read() {
        this.service.read();
    }

    @Override
    public void write() {
        if(this.user.getPermise() >= 5){
            this.service.write();
        }else{
            throw new UnsupportedOperationException("Error de seguridad!");
        }
    }

    @Override
    public void update() {
        if(this.user.getPermise() >= 5){
            this.service.update();
        }else{
            throw new UnsupportedOperationException("Error de seguridad!");
        }
    }

    @Override
    public void delete() {
        if(this.user.getPermise() >= 5){
            this.service.delete();
        }else{
            throw new UnsupportedOperationException("Error de seguridad!");
        }
    }
}
