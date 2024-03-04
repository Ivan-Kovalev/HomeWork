package homework_OOP;

public class CompareStudent {

    public void compare(Gryffindor[] gryffindor) {
        int max = 0;
        for (int i = 0; i < gryffindor.length; i++) {
            Gryffindor gryffindor1 = gryffindor[i];
            int sum = gryffindor1.getNobility() + gryffindor1.getHonor() + gryffindor1.getCourage();
            if (max < sum) {
                max = sum;
            }
        }
        for (int i = 0; i < gryffindor.length; i++) {
            Gryffindor gryffindor1 = gryffindor[i];
            int sum = gryffindor1.getNobility() + gryffindor1.getHonor() + gryffindor1.getCourage();
            if (sum == max) {
                System.out.println(gryffindor1.getName() + " лучший Гриффиндорец");
            }
        }
    }

    public void compare(Slytherin[] slytherin) {
        int max = 0;
        for (int i = 0; i < slytherin.length; i++) {
            Slytherin slytherin1 = slytherin[i];
            int sum = slytherin1.getCunning() + slytherin1.getDetermination() + slytherin1.getAmbition() + slytherin1.getResourcefulness() + slytherin1.getThirstForPower();
            if (max < sum) {
                max = sum;
            }
        }
        for (int i = 0; i < slytherin.length; i++) {
            Slytherin slytherin1 = slytherin[i];
            int sum = slytherin1.getCunning() + slytherin1.getDetermination() + slytherin1.getAmbition() + slytherin1.getResourcefulness() + slytherin1.getThirstForPower();
            if (sum == max) {
                System.out.println(slytherin1.getName() + " лучший из Слизерин");
            }
        }
    }

    public void compare(Hufflepuff[] hufflepuff) {
        int max = 0;
        for (int i = 0; i < hufflepuff.length; i++) {
            Hufflepuff hufflepuff1 = hufflepuff[i];
            int sum = hufflepuff1.getHardWork() + hufflepuff1.getLoyalty() + hufflepuff1.getHonesty();
            if (max < sum) {
                max = sum;
            }
        }
        for (int i = 0; i < hufflepuff.length; i++) {
            Hufflepuff hufflepuff1 = hufflepuff[i];
            int sum = hufflepuff1.getHardWork() + hufflepuff1.getLoyalty() + hufflepuff1.getHonesty();
            if (sum == max) {
                System.out.println(hufflepuff1.getName() + " лучший из Пуффендуй");
            }
        }
    }

    public void compare(Ravenclaw[] ravenclaw) {
        int max = 0;
        for (int i = 0; i < ravenclaw.length; i++) {
            Ravenclaw ravenclaw1 = ravenclaw[i];
            int sum = ravenclaw1.getIntelligence() + ravenclaw1.getWisdom() + ravenclaw1.getWit() + ravenclaw1.getCreativity();
            if (max < sum) {
                max = sum;
            }
        }
        for (int i = 0; i < ravenclaw.length; i++) {
            Ravenclaw ravenclaw1 = ravenclaw[i];
            int sum = ravenclaw1.getIntelligence() + ravenclaw1.getWisdom() + ravenclaw1.getWit() + ravenclaw1.getCreativity();
            if (sum == max) {
                System.out.println(ravenclaw1.getName() + " лучший из Когтевран");
            }
        }
    }
}
