package homework_oop;

public class CompareStudent {

    public void compareAnyStudents(Hogwarts first, Hogwarts second) {

        if (first.getMagic() > second.getMagic()) {
            System.out.println(first.getName() + " обладает большей мощностью магии, чем " + second.getName());
        } else if (first.getMagic() == second.getMagic()) {
            System.out.println(first.getName() + " равен по мощности магии " + second.getName());
        } else {
            System.out.println(second.getName() + " обладает большей мощностью магии, чем " + first.getName());
        }
        if (first.getTransgression() > second.getTransgression()) {
            System.out.println(first.getName() + " перемещается дальше чем " + second.getName());
        } else if (first.getTransgression() == second.getTransgression()) {
            System.out.println(first.getName() + " перемещаются на одинаковое расстояние " + second.getName());
        } else {
            System.out.println(second.getName() + " перемещается дальше чем " + first.getName());
        }
    }

    public void compare(Gryffindor first, Gryffindor second) {
        if ((first.getNobility() + first.getHonor() + first.getCourage()) > (second.getNobility() + second.getHonor() + second.getCourage())) {
            System.out.println(first.getName() + " лучший Гриффиндорец, чем " + second.getName());
        } else if ((first.getNobility() + first.getHonor() + first.getCourage()) == (second.getNobility() + second.getHonor() + second.getCourage())) {
            System.out.println(first.getName() + " такой же Гриффиндорец, как и " + second.getName());
        } else {
            System.out.println(second.getName() + " лучший Гриффиндорец, чем " + first.getName());
        }
    }

    public void compare(Slytherin first, Slytherin second) {
        if ((first.getCunning() + first.getDetermination() + first.getAmbition() + first.getResourcefulness() + first.getThirstForPower()) > (second.getCunning() + second.getDetermination() + second.getAmbition() + second.getResourcefulness() + second.getThirstForPower())) {
            System.out.println(first.getName() + " лучший Слизеринец, чем " + second.getName());
        } else if ((first.getCunning() + first.getDetermination() + first.getAmbition() + first.getResourcefulness() + first.getThirstForPower()) == (second.getCunning() + second.getDetermination() + second.getAmbition() + second.getResourcefulness() + second.getThirstForPower())) {
            System.out.println(first.getName() + " такой же Слизеринец, как и " + second.getName());
        } else {
            System.out.println(second.getName() + " лучший Слизеринец, чем " + first.getName());
        }
    }

    public void compare(Hufflepuff first, Hufflepuff second) {
        if ((first.getLoyalty() + first.getHonesty() + first.getHardWork()) > (second.getLoyalty() + second.getHonesty() + second.getHardWork())) {
            System.out.println(first.getName() + " лучший Пуффендуец, чем " + second.getName());
        } else if ((first.getLoyalty() + first.getHonesty() + first.getHardWork()) == (second.getLoyalty() + second.getHonesty() + second.getHardWork())) {
            System.out.println(first.getName() + " такой же Пуффендуец, как и " + second.getName());
        } else {
            System.out.println(second.getName() + " лучший Пуффендуец, чем " + first.getName());
        }
    }

    public void compare(Ravenclaw first, Ravenclaw second) {
        if ((first.getIntelligence() + first.getWisdom() + first.getWit() + first.getCreativity()) > (second.getIntelligence() + second.getWisdom() + second.getWit() + second.getCreativity())) {
            System.out.println(first.getName() + " лучший Когтевранец, чем " + second.getName());
        } else if ((first.getIntelligence() + first.getWisdom() + first.getWit() + first.getCreativity()) == (second.getIntelligence() + second.getWisdom() + second.getWit() + second.getCreativity())) {
            System.out.println(first.getName() + " такой же Когтевранец, как и " + second.getName());
        } else {
            System.out.println(second.getName() + " лучший Когтевранец, чем " + first.getName());
        }
    }

}
