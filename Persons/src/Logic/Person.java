package Logic;

import java.util.Scanner;
import java.util.*;


public class Person {

    private long identification;

    private String name;

    private String lastName;

    private long phone;

    private String direction;

    private String email;

    private char genre;

    private String birthday;
    
    
    
    
    static Scanner input= new Scanner(System.in);
    //Person persons[]= new Person[5]; Deprecated
    ArrayList <Person> personList = new ArrayList<>();
    int cont=0;
    
    
    public Person () {
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String val) {
        this.lastName = val;
    }

    public long getIdentification () {
        return identification;
    }

    public void setIdentification (long val) {
        this.identification = val;
    }

    /**
     *
     * @return
     */
    public String getDirection () {
        return direction;
    }

    public void setDirection (String val) {
        this.direction = val;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String val) {
        this.email = val;
    }

    public String getBirthday () {
        return birthday;
    }

    public void setBirthday (String val) {
        this.birthday = val;
    }

    public char getGenre () {
        return genre;
    }

    public void setGenre (char val) {
        this.genre = val;
    }

    public String getName () {
        return name;
    }

    public void setName (String val) {
        this.name = val;
    }

    public long getPhone () {
        return phone;
    }

    public void setPhone (long val) {
        this.phone = val;
    }

    public void savePerson () {
        Person p= new Person();
        
        System.out.println("Digite Numero de Cedula");
        long id = input.nextLong();
        for (int i=0;i<personList.size();i++) {
            Person validate = personList.get(i);
            
            do{
                System.out.println("El usuario ya existe, por favor digite una cédula nueva.");
                System.out.println("Digite Numero de Cedula");
                
            }while (input.nextLong()== validate.getIdentification());
            p.setIdentification(input.nextLong());  

             
        }  
        
        
        System.out.println("Digite Nombre");
        p.setName(input.next());
        
        System.out.println("Digite Apellido");
        p.setLastName(input.next());
        
               
        System.out.println("Digite Dirección ");
        p.setDirection(input.next());
        
        
        String regexStr = "^[0-9]{10}$";
        System.out.print("Digite Telefono de 7 a 10 dígitos: ");
        String num = input.next();
        if (!num.matches(regexStr)){
            do{
                System.out.print("Digite Telefono válido de 7 a 10 dígitos: ");
                p.setPhone(input.nextLong());
            }while(!num.matches(regexStr));
        }
        
        
        do{
            System.out.println("Digite Género(F o M)");
            p.setGenre(input.next().charAt(0));
        }while(input.next().charAt(0)!='m' || input.next().charAt(0)!= 'M' || input.next().charAt(0)!='f'||input.next().charAt(0)!='F');
        
        String emailRegex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"; 
        System.out.println("Digite Email");
        String mail = input.next();
        if (!num.matches(emailRegex)){
            do{
                System.out.print("Digite Telefono válido de 7 a 10 dígitos: ");
                p.setPhone(input.nextLong());
            }while(!mail.matches(regexStr));
        }
        
        
        p.setEmail(input.next());
        
        personList.add(cont, p);
        cont ++;
        
    }

    public void printPerson () {
        System.out.println("Elija el número de la persona: ");
        Scanner num = new Scanner(System.in);
        System.out.println("La persona almacenada es:\n");
        Person print = personList.get(num.nextInt());
        System.out.println("Cédula: "+print.getIdentification()+"\n Nombre: "+print.getName()+"\n Apellido: "+print.getLastName()+"\n Telefono: "+print.getPhone()+"\n Dirección: "+print.getDirection()+"\n Género: "+ print.getGenre()+"\n Email: "+print.getEmail());
    }

    public void modifyPerson () {
        //System.out.println("Lista de registros disponibles:");
        //searchPerson();
        //Select Person
        System.out.println("Seleccione una persona:");
        Scanner selector = new Scanner(System.in);
        int selections = selector.nextInt();

        //Edit Person attribute
        if (selections <= personList.toArray().length){
            Person edit = personList.get(selections);
            //Menu Modification field
            System.out.println("¿Qué valor desea modificar para el usuario: "+edit.getIdentification());
            System.out.println("Seleccione una opción del siguiente Menu:\n1. Modificar Nombre \n2. Modificar apellido \n3. Modificar Cédula\n4. Modificar Dirección \n5.Modificar Género\n 6. Modificar Teléfono \n7. Salir ");
            
            System.out.println("Seleccione una opcion");
            int option=input.nextInt();
            do{  
                switch(option){ 
                    case 1://Modificar Nombre
                        System.out.println("Digite el nuevo nombre: ");
                        Scanner editName = new Scanner(System.in);
                        edit.setName(editName.next());
                        break;
                    case 2://Modificar apellido
                        System.out.println("Digite el nuevo apellido: ");
                        Scanner editLastName = new Scanner(System.in);
                        edit.setLastName(editLastName.next());
                        break;
                    case 3://Modificar cédula
                        System.out.println("Digite la nueva cédula: ");
                        Scanner editIdentification = new Scanner(System.in);
                        edit.setIdentification(editIdentification.nextLong());
                        break;
                    case 4://Modificar dirección
                        System.out.println("Digite la nueva dirección: ");
                        Scanner editDirection = new Scanner(System.in);
                        edit.setDirection(editDirection.next());
                        break;
                    case 5://Modificar Género
                        System.out.println("Digite el nuevo género (M o F): ");
                        Scanner editGenre = new Scanner(System.in);
                        edit.setGenre(editGenre.next().charAt(0));
                        break;
                    case 6://Modificar teléfono
                        System.out.println("Digite el nuevo teléfono: ");
                        Scanner editPhone = new Scanner(System.in);
                        edit.setPhone(editPhone.nextLong());
                        break;
                    case 7://Salir
                        System.exit(0);
                }
            }while(option<=7);
            
        }
    }
        
    public void searchPerson () {
      System.out.println("¿Qué deseas buscar? ");
      Scanner search = new Scanner(System.in);
      
      int i;
      for (i=0; i<=personList.toArray().length;i++){
           //Person edit = personList.get(i);
           Person print = personList.get(i);
           if (print.getName().contains(search.next())){
                System.out.println(i+"Nombre: "+print.getName()+" Identificación: "+print.getIdentification());
           }
          
      }
    }
}

