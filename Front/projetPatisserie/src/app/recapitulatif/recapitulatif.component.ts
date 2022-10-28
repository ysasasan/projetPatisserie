import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Utilisateur } from '../utilisateur';

@Component({
  selector: 'app-recapitulatif',
  templateUrl: './recapitulatif.component.html',
  styleUrls: ['./recapitulatif.component.css']
})
export class RecapitulatifComponent implements OnInit {

  lst: any
  user: Utilisateur

  message : string
  article = { id:0, marque:'', prix:0}

  constructor(private http:HttpClient) { }


  ngOnInit(): void {
    this.lst=JSON.parse(sessionStorage.getItem("panier"))
    this.lst=JSON.parse(sessionStorage.getItem("utilisateur"))
    // for (var i=0;i<this.lst.length;i++) {
    //   alert(this.lst[i].Id);
   }
 
   buy(){
 
     const body=JSON.stringify({"patisseries":this.lst, "utilisateur":this.user});
    
     this.http.post("http://localhost:8081/au-bonheur-des-gourmands/commande/new",body,{
       headers: new HttpHeaders({
         "Content-Type": "application/json"
       })
     }).subscribe(response => {
 
      
       this.message="Nouvelle commande enregistrée"
 
     },
 
       err => {
        
         this.message="Erreur de creation article"
       });
   }


  }


