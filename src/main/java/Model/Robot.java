package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Robot {
    @Id
    String id;
    String name;
    int health;
    int attackDamage;
    int attackRange;
    int movementRate;

    public Robot(){
    }

    public Robot(String id, String name, int health, int attackDamage, int attackRange, int movementRate) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.attackDamage = attackDamage;
        this.attackRange = attackRange;
        this.movementRate = movementRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public int getMovementRate() {
        return movementRate;
    }

    public void setMovementRate(int movementRate) {
        this.movementRate = movementRate;
    }
}

