public class testperson {
    public static void main(String[] args) {
        person p=new person();
        p.setFirstName("ZAKI");
        System.out.println("votre prenom est: "+p.firstName);
        p.setName("YOUSFI");
        System.out.println("votre nom est: "+p.name);
        p.setDateNaiss(27,2,2004);
        System.out.println(p.firstName+" "+p.name+" votre age est "+p.ageEn2023());
    }
}