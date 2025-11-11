package org.example.Entites;

public class AgentMenage extends Agent {

    public AgentMenage(String id, String nom, String prenom, String adresse, Compte compte) {
        super(id, nom, prenom, adresse, compte);
    }

    public Degradation signalerDegradation(String description, double cout, Logement logement) {
        if (compte == null || !compte.isConnecte()) {
            System.out.println("L'agent doit être connecté pour signaler une dégradation.");
            return null;
        }

        Degradation d = new Degradation(description, cout, this,logement);
        logement.ajouterDegradation(d);
        System.out.println("Dégradation signalée par " + nom + " sur le logement : " + logement.getAdresse());
        return d;
    }

}
