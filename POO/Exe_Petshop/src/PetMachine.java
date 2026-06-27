public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;

    private Pet pet;


    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na maquina para iniciar o banho!");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("Capacidade de agua está no maximo!");
            return;
        }
        water += 2;
    }

    public void addShampoo() {
        if (water == 30) {
            System.out.println("Capacidade de shampoo está no maximo!");
            return;
        }
        shampoo += 2;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A maquina está suja, precisa limpar antes de colocar o pet!");
            return;
        } else if (!pet.getName().isEmpty()){
            System.out.println("Tem pet na maquina!");
            return;            
        }
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " está na maquina neste momento.");
            return;
        }
        this.pet = pet;
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " foi retirado da maquina!");
        this.pet = null;
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A maquina foi limpa!");
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

}
