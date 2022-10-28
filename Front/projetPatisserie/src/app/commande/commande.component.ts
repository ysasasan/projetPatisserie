import { HttpClient } from '@angular/common/http';
import { Component, OnInit, ViewChild } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { NavigationEnd, Router } from '@angular/router';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { Ligne } from '../ligne';
import { Patisserie } from '../patisserie';
import { Utilisateur } from '../utilisateur';

@Component({
  selector: 'app-commande',
  templateUrl: './commande.component.html',
  styleUrls: ['./commande.component.css']
})
export class CommandeComponent implements OnInit {

  @ViewChild('basket') basket;

  MyList: any
  tartes: any
  gateaux: Array<Patisserie>
  mignardises: Array<Patisserie>
  p: Patisserie = new Patisserie()
  panier: Array<Ligne> = new Array()
  quantite: number = 1
  prixLigne: number = 0
  total: number = 0
  message: string

  tarteChecked:Boolean=true;
  gateauChecked:Boolean=true;
  mignardiseChecked:Boolean=true;
  //tousFilter=false;

  user:Utilisateur


  showMyMessage = false
  modalClosed:boolean = true;

  
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.http.get("http://localhost:8081/au-bonheur-des-gourmands/patisseries").subscribe(
      (response) => {
      
        this.MyList=response;

        this.tartes = this.MyList.filter(patisserie => patisserie.categorie==='tarte');
        this.gateaux = this.MyList.filter(patisserie => patisserie.categorie==='gateau');
        this.mignardises = this.MyList.filter(patisserie => patisserie.categorie==='miniardise');

      },
      (err) => {
         console.log("*************KO")
         
       },

       () => {
        console.log("*********complete****")
        
      }
      );

      this.user=JSON.parse(sessionStorage.getItem("utilisateur"));

      
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

    ligne.patisserie=patisserie
    ligne.quantite=this.quantite
    ligne.prix=this.quantite*this.p.prix

    this.panier.push(ligne)
    this.total+=ligne.prix
    this.quantite=1
    
    this.message="Ajouté au panier"

  }

  validate(){
    sessionStorage.setItem("panier",JSON.stringify(this.panier))
    this.modalClosed = true;
  }

  edit(i:any){
    this.total-=this.panier[i].prix
    delete(this.panier[i])
  }

  openModal(){
    this.modalClosed=true;
  }

  // minus(q){
  //   console.log("minus.q"+q);
  //   return (q>1) ? q-- : 1;
  // }

  // plus(q, stock){
  //   console.log("plusq."+q+"stock."+stock);
  //   return (stock>q) ? q++ : q;
  // }
  

}
