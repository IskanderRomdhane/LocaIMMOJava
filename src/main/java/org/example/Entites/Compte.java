package org.example.Entites;

public class Compte {
    private String identifiant;
    private String motDePasse;
    private boolean connecte;

    public Compte(String identifiant, String motDePasse) {
        this.identifiant = identifiant;
        this.motDePasse = motDePasse;
        this.connecte = false;
    }

    public boolean seConnecter(String id, String mdp) {
        if (identifiant.equals(id) && motDePasse.equals(mdp)) {
            connecte = true;
            System.out.println("Connexion réussie.");
            return true;
        }
        System.out.println("Identifiants incorrects.");
        return false;
    }

    public void seDeconnecter() {
        connecte = false;
        System.out.println("Déconnexion réussie.");
    }

    public boolean isConnecte() {
        return connecte;
    }

    public String getIdentifiant() {
        return identifiant;
    }
}
