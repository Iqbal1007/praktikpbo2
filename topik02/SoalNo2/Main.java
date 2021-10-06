package SoalNo2;

class GameCharacter{
    String name;
    int lifePoint;
    int attackHitPoint;
    int attackKickPoint;

    GameCharacter(String name, int attackHitPoint, int attackKickPoint){
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    String getName() {
        return name;
    }

    void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }

    int getLifePoint() {
        return lifePoint;
    }

    void hit(GameCharacter player){
        player.setLifePoint(player.getLifePoint() - this.attackHitPoint);
    }

    void kick(GameCharacter player){
        player.setLifePoint(player.getLifePoint() - this.attackKickPoint);
    }

    void display(){
        System.out.println("Player : " + getName());
        System.out.println("Health : " + getLifePoint());
    }

    void compare (GameCharacter player){
        int compare = Integer.compare(this.lifePoint, player.getLifePoint());
        if(compare > 0) System.out.println(this.name + " THE WINNERRRR!!");
        else if(compare < 0) System.out.println(player.getName() + " THE WINNERRRR!!");
        else System.out.println("DRAW");
    }
}
public class Main {
    public static void main(String[] args) {
        GameCharacter player1 = new GameCharacter("Raiden", 10, 20);
        GameCharacter player2 = new GameCharacter("Sub Zero", 5, 25);
        player1.setLifePoint(100);
        player2.setLifePoint(100);

        player1.kick(player2);
        player2.kick(player1);

        for(int i = 0; i < 3; i++){
            player2.hit(player1);
        }

        for(int i = 0; i < 4; i++){
            player1.kick(player2);
        }

        System.out.println("Hasil Pertandingan");
        player1.display();
        player2.display();
        System.out.println();

        player1.compare(player2);

    }
}
