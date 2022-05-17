package entities;

public class Department {
    //Atributo
    private String name;
    //Construtor vazio
    public Department(){

    }
    //construtor com os parâmetros
    public Department(String name){
       this.name = name;
    }
    //Get e sets
    //retorna o valor
    public String getName(){
        return name;
    }
    //altera
    public void setName(String name){
        this.name = name;
    }

}
