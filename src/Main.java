public class Main {
    public static void main(String[] args) {
    Hero[] Herous = {new Magic(),new Medic(),new Warrior()};
            for(int i = 0; i < Herous.length; i++){
                Herous[i].applySuperAbility();
            }
    }
}