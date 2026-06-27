public class Pet {

    private final String name;
    private boolean clean;

    public Pet(String name){
        this.name = name;
        this.clean = false;
    }

    // construtores
    // recupera o nome, e se está limpo
    public String getName(){
        return name;
    }

    public boolean getClean(){
        return clean;
    }

    public boolean isClean(){
        return clean;
    }

    public void setClean(boolean  clean){
        this.clean = clean;
    }
}
