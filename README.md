# DesignPatterns
in Java


  - [Patrones Creacionales](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Creacionales)
      - [Simple Factory](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Creacionales/SimpleFactory/src/main)
      
            Crear objetos complejos de forma sencilla.
            Controlar las propiedades del objeto.

      - [Factory Method](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Creacionales/FactoryMethod/src/main)
      
            Define una interfaz para la creación de un objeto pero deja que la subclase decida que clase instanciar.
            Es el factory el que dice que tipo de objeto y que se instancia.
            
      - [Abstract Factory](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Creacionales/AbstractFactory/src/main)
              
            Nos provee de una interfaz para crear famili de objetos relacionados o 
            dependientes sin especificar su clase en concreto.
            
      - [Singleton](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Creacionales/Singleton/src/main)
      
            Una clase solo puede ser instanciada una sola vez y nos proveerá 
            de un acceso global a dicha instancia.
      
      - [Builder](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Creacionales/Builder/src/main)

            Separa la construcción de objetos complejos de su representación, 
            para que el mismo proceso de construcción pueda representar diferentes creaciones.
  
      - [Prototype](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Creacionales/Prototype/src/main)

            Especifica el tipo de objeto a crear usando un prototipo, y a 
            partir de ese objetos se crean otros ligeramente diferentes.


  - [Patrones Estructurales](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Estructurales)
      - [Adapter](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Estructurales/Adapter/src/main)
      
            Convierte la interfaz de una clase en otra interfaz que el cliente espera.
            Hace que dos clases que no puedan trabajar en conjunto lo logre.
      
      - [Composite](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Estructurales/Composite/src/main)
      
            Permite a los clientes tratar a objetnos individuales y a composiciones
            de objetos de manera uniforme, todo  mediante la jerarquía de árboles.
      
      - [Decorator](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Estructurales/Decorator/src/main)
      
            Agrega responsabilidades adicionales a un objeto de forma dinámica.
            
      - [Facade](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Estructurales/Facade/src/main)
      
            Proporciona una interfaz unificada para un conjunto de interfaces de un subsistema.
            Define una interfaz de nivel superior que hace que el subsistema sea más facil de utilizar.
      
      - [Proxy](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Estructurales/Proxy/src/main)
      
            Limitar funcionalidades del sistema, restringir accesos.
      
      - [Virtual Proxy](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Estructurales/VirtualProxy/src/main)
      
            No restringe accesos, pero si retrasa su creación,
            cuando la creacion del objeto es muy costosa.
      
      - [Flyweight](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Estructurales/Flyweight/src/main)
            
            Reutiliza objetos de tal manera que pueda crear apps
            con la menor cantidad de recursos haciendola ligera por la
            reutilización de objetos.
