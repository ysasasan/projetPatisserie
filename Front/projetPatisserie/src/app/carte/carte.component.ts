import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Ligne } from '../ligne';
import { Patisserie } from '../patisserie';

@Component({
  selector: 'app-carte',
  templateUrl: './carte.component.html',
  styleUrls: ['./carte.component.css']
})
export class CarteComponent implements OnInit {

  MyList: any
  tartes: any
  gateaux: Array<Patisserie>
  miniardises: Array<Patisserie>
  p: Patisserie = new Patisserie()
  panier: Array<Ligne> = new Array()
  quantite: number = 0
  prixLigne: number = 0
  total: number = 0
  ligne: Ligne = new Ligne();
  
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.http.get("http://localhost:8081/au-bonheur-des-gourmands/patisseries").subscribe(
      (response) => {
      
        this.MyList=response;
        this.tartes = this.MyList.filter(patisserie => patisserie.categorie==='tarte');
        this.gateaux = this.MyList.filter(patisserie => patisserie.categorie==='gateau');
        this.miniardises = this.MyList.filter(patisserie => patisserie.categorie==='miniardise');
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
  }
  
  addPanier(){
    this.prixLigne=this.quantite*this.p.prix
    this.ligne.setLigne(this.p,this.quantite,this.prixLigne)
    this.panier.push(this.ligne)
    this.total+=this.prixLigne
  }

}
