public class Character{
    private String name;
    private String type;
    private String race;
    private String specialization;
    private int reputation;
    private String role;

    Character(String name, String type, String race, String specialization, int reputation, String role){
        this.name=name;
        this.type=type;
        this.race=race;
        this.specialization=specialization;
        this.reputation=reputation;
        this.role=role;

        
    }

    @Override

    public String toString(){
        return "Character name is"+name+ "and class is"+type+" race is "+race+ "specialization is"+specialization+"reputation is"+reputation+"and role is"+role;
    }
    
    
}
