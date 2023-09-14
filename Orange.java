/**
 *
 * @author roudet
 */
public class Orange {
    private double prix;
    private String origine;
	
    public Orange() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Orange(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals("") || origine == null)
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
    	if(prix >= 0)
		this.prix=prix;
	else 
		System.out.println("Il n'est pas possible de donner un prix négatif");
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
    	if(origine.equals("") || origine == null)
            System.out.println("Origine invalide, rentrez une origine avec au minimum un caractère");
	else
		this.origine=origine;
    }

    @Override
    public String toString(){
        return "Orange de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
        Orange o1 = new Orange();
        Orange o2 = new Orange(1,"Colombie");
        Orange o3 = new Orange(-10,"");
        System.out.println("L'orange 1 : "+o1);
        System.out.println("L'orange 2 : "+o2);
        System.out.println("L'orange 3 : "+o3);
        System.out.println("");
        o1.setPrix(1.5);
        o2.setOrigine("Portugal");
        System.out.println("Prix Orange 1 : "+o1.getPrix());
        System.out.println("Origine Orange 1 : "+o1.getOrigine());
        System.out.println("");
        System.out.println("Prix Orange 2 : "+o2.getPrix());
        System.out.println("Origine Orange 2 : "+o2.getOrigine());
	//System.out.println("premier test Orange");
   }
}
