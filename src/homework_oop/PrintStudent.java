package homework_oop;

public class PrintStudent {

    public void print(Gryffindor[] gryffindor) {
        for (int i = 0; i < gryffindor.length; i++) {
            Gryffindor gryffindor1 = gryffindor[i];
            System.out.println("Имя студента " + gryffindor1.getName()
                    + "; Магия " + gryffindor1.getMagic()
                    + "; Трансгрессия " + gryffindor1.getTransgression()
                    + "; Благородство " + gryffindor1.getNobility()
                    + "; Честь " + gryffindor1.getHonor()
                    + "; Храбрость " + gryffindor1.getCourage());
        }
        System.out.println();
    }

    public void print(Slytherin[] slytherin) {
        for (int i = 0; i < slytherin.length; i++) {
            Slytherin slytherin1 = slytherin[i];
            System.out.println("Имя студента " + slytherin1.getName()
                    + "; Магия " + slytherin1.getMagic()
                    + "; Трансгрессия " + slytherin1.getTransgression()
                    + "; Хитрость " + slytherin1.getCunning()
                    + "; Решительность " + slytherin1.getDetermination()
                    + "; Амбициозность " + slytherin1.getAmbition()
                    + "; Находчивость " + slytherin1.getResourcefulness()
                    + "; Жажда власти " + slytherin1.getThirstForPower());
        }
        System.out.println();
    }

    public void print(Hufflepuff[] hufflepuff) {
        for (int i = 0; i < hufflepuff.length; i++) {
            Hufflepuff hufflepuff1 = hufflepuff[i];
            System.out.println("Имя студента " + hufflepuff1.getName()
                    + "; Магия " + hufflepuff1.getMagic()
                    + "; Трансгрессия " + hufflepuff1.getTransgression()
                    + "; Трудолюбие " + hufflepuff1.getHardWork()
                    + "; Верность " + hufflepuff1.getLoyalty()
                    + "; Честность " + hufflepuff1.getHonesty());
        }
        System.out.println();
    }

    public void print(Ravenclaw[] ravenclaw) {
        for (int i = 0; i < ravenclaw.length; i++) {
            Ravenclaw ravenclaw1 = ravenclaw[i];
            System.out.println("Имя студента " + ravenclaw1.getName()
                    + "; Магия " + ravenclaw1.getMagic()
                    + "; Трансгрессия " + ravenclaw1.getTransgression()
                    + "; Ум " + ravenclaw1.getIntelligence()
                    + "; Мудрость " + ravenclaw1.getWisdom()
                    + "; Остроумие " + ravenclaw1.getWit()
                    + "; Творчество " + ravenclaw1.getCreativity());
        }
        System.out.println();
    }

}
