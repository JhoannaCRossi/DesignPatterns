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
            
  - [Patrones Comportamientos](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Comportamientos)
      - [Chain of Responsability](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Comportamiento/ChainOfResponsability/src/main)
      
            Permite establecer una cadena de objetos receptores a traves de los cuales se pasa
            una petición formulada por un objeto emisor.
            Un objeto nos envia una petición y otro bjeto debe ser capaz de responser esa petición

      - [Command](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Comportamiento/Command/src/main)
      
            Encapsula un mensaje como un objeto, específica la forma simple de separar
            un comando del entorno que genero dicho comando.
            
      - [Iterator](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Comportamiento/Iterator/src/main)
              
            Provee un mecanismo estandar para acceder a los elementos de una colección.
            Interfaz mediadora para acceder a las propiedades del objeto.
            
      - [Mediator](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Comportamiento/Mediator/src/main)
      
            Define un objeto que encapsula cuando se desea comunicar con otro entre sí.
      
      - [Memento](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Comportamiento/Memento/src/main)

            Captura y exporta el estado interno de un objeto que luego se puede
            restaurar sin romper la encapsulación. Obtiene una copia de seguridad
            de un objeto parcial o total.
  
      - [Observer](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Comportamiento/Observer/src/main)

            Utilizado porque optimiza mucho las tareas, define una dependencia de uno o
            muchis entre los objetos para que cuando un objeto cambie de estado sus 
            dependientes sean notificados y actualizados automáticamente.
            
      - [State](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Comportamiento/State/src/main)
      
            Permite que un objeto modifique su comportamiento cada vez que cambie 
            su estado interno.
            Reacción dependiendo del cambio. "Máquinas de estado"
            
      - [Visitor](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Comportamiento/Visitor/src/main)
      
             Permite definir una nueva operación sin cambiar 
             las clases ni los elementos que las opera,
             pretende separar los algoritmos de la estructura 
             de un objeto.
          
      - [Strategy](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Comportamiento/Strategy/src/mai)
      
            Permite capturar algoritmos en clases, de tal manera 
            que puedes usar algoritmos en tiempos de ejecución.
       
      - [Template Method](https://github.com/JhoannaCRossi/DesignPatterns/tree/master/Comportamiento/TemplateMethod/src/main)
      
            Define una estructura algoritmica cuya lógica 
            quedará a cargo de las subClases ("Clases Abstractas").

