import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Utilisateur } from '../utilisateur';

@Component({
  selector: 'app-inscription',
  templateUrl: './inscription.component.html',
  styleUrls: ['./inscription.component.css']
})
export class InscriptionComponent implements OnInit {

  title="Formulaire d'inscription"

  user : Utilisateur = new Utilisateur();
  mdpBis:String=''
  showPass:Boolean=false;
  showPassBis:Boolean=false;
  authorizeRedirect:Boolean = false;
  message:String;


  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    
  }

  showMdp(){
    return this.showPass = true;
  }

  hideMdp(){
    return this.showPass = false;
  }

  showMdpBis(){
    return this.showPassBis = true;
  }

  hideMdpBis(){
    return this.showPassBis = false;
  }

  sameMdp(){
    return (this.user.mdp===this.mdpBis)? true : false;
  }

  mdpLengthOk(){
    return (this.user.mdp.length >=8)? true : false;
  }

  // mdpRegexOk(){
  //   return ()? true : false;
  // }

  create(){

    const body=JSON.stringify(this.user);

    console.log(body);
   
    this.http.post("http://localhost:8081/au-bonheur-des-gourmands/utilisateur/new",body,{
      headers: new HttpHeaders({
        "Content-Type": "application/json",
        'Access-Control-Allow-Origin': '*',
      })
    }).subscribe(response => {
      this.message="Utilisateur créé"
    },

      err => {
        this.message="Erreur de création utilisateur"
    });
  }

}
