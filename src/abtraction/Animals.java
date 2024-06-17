package abtraction;

public abstract class Animals {
    // gồm cac thuoc tính phương thức như lớp thông thường
    private String species; // loai
    public  String getSpecies(){
        return species;
    }
    // ngoài ra còn có thêm phung thức trừu tượng
    public abstract void makeSound();
}
