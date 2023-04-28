public class ButlerHall extends EnemyRoom {
    Butler enemy;

    public ButlerHall(int x, int y, Butler enemy) {
        super(x, y, enemy);
        this.enemy = enemy;
    }

    public String intro_text() {
        if (enemy.is_alive()) {
            return "A very dapper butler is apporaching you! Fight him off before he slaughters you! \n";
        } else {
            return "A dead butler lies on the ground. He still looks very dapper though.";
        }
    }

    public void modify_player(Player the_player) {
        while (enemy.is_alive()) {
            the_player.hp = the_player.hp - enemy.damage;
            System.out.printf("Enemy does %d damage! You have %d HP remaining.", enemy.damage, the_player.hp);
            if (enemy.is_alive()) {
                the_player.attackEnemy(enemy);
            }
        }
    }
}
