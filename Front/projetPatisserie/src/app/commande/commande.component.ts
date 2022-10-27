import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Ligne } from '../ligne';
import { Patisserie } from '../patisserie';

@Component({
  selector: 'app-commande',
  templateUrl: './commande.component.html',
  styleUrls: ['./commande.component.css']
})
export class CommandeComponent implements OnInit {

  MyList: any
  p: Patisserie = new Patisserie()
  panier: Array<Ligne> = new Array()
  quantite: number = 0
  prixLigne: number = 0
  total: number = 0
  message: string
  // ligne: Ligne = new Ligne();

  showMyMessage = false
  
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.http.get("http://localhost:8081/au-bonheur-des-gourmands/patisseries").subscribe(
      (response) => {
      
        this.MyList=response;
      },
      (err) => {
         console.log("*************KO")
         
       },

       () => {
        console.log("*********complete****")
        
      }
      );
  }

  getPatisserie(nom,image,description,prix){
    this.p.nom=nom
    this.p.image=image
    this.p.description=description
    this.p.prix=prix
    this.message=""
  }

  
  addPanier(){

    let ligne: Ligne = new Ligne();
    let patisserie: Patisserie = new Patisserie()

    patisserie.nom=this.p.nom
    // ligne.patisserie.nom=this.p.nom

    ligne.patisserie=patisserie
    ligne.quantite=this.quantite
    ligne.prix=this.quantite*this.p.prix

    // this.prixLigne=this.quantite*this.p.prix
    // ligne.setLigne(this.p,this.quantite,this.prixLigne)
    this.panier.push(ligne)

    this.total+=ligne.prix

    this.quantite=0
    this.message="Ajouté au panier"

  }


  validate(){
    sessionStorage.setItem("panier",JSON.stringify(this.panier))

  }

  edit(i:any){
    this.total-=this.panier[i].prix
    delete(this.panier[i])
  }
  

}
