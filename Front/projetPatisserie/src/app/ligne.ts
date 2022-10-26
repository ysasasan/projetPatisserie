import { Patisserie } from "./patisserie"

export class Ligne {

    patisserie: Patisserie
    quantite: number
    prix: number

    setLigne(patisserie,quantite,prix){
        this.patisserie=patisserie
        this.quantite=quantite
        this.prix=prix
    }
}


