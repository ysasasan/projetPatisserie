package ajc.fr.thales.projetPatisserie.model;

public enum Role {
	ROLE_CLIENT, ROLE_MANAGER, ROLE_ADMINISTRATEUR;
	
	@Override
    public String toString() {
        return name().toLowerCase();
    }
	
}


