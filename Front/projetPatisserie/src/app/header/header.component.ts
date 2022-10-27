import { Component, OnInit } from '@angular/core';
import { Utilisateur } from '../utilisateur';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  client: Boolean = true;
  manager:Boolean = false;
  administrateur:Boolean = false;
  utilisateur:Utilisateur;
  connexion:Boolean=false;

  constructor() { }

  ngOnInit(): void {

    this.utilisateur=JSON.parse(sessionStorage.getItem("utilisateur"));

    for(let r of this.utilisateur.roles){
      switch (r){
        case "ROLE_CLIENT":
          this.client = true;
          this.connexion=true;
          break;
        case "ROLE_MANAGER":
          this.manager = true;
          this.connexion=true;
          break;
        case "ROLE_ADMINISTRATEUR":
          this.administrateur = true;
          this.connexion=true;
          break;
      }
    }

  }


  quit(){

    console.log("hello")
    this.client= false;
    this.manager=false;
    this.administrateur=false;
    this.connexion=false;
    sessionStorage.clear();


    console.log(this.client, this.manager, this.administrateur, this.connexion, sessionStorage);
  }



}
