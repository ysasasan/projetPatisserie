import { HttpClient } from '@angular/common/http';
import { Component, Injectable, OnInit } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { Utilisateur } from '../utilisateur';

@Component({
  selector: 'app-authentification',
  templateUrl: './authentification.component.html',
  styleUrls: ['./authentification.component.css']
})

export class AuthentificationComponent implements OnInit {

  mdp:string ='';
  mail:string = '';
  user:Utilisateur= new Utilisateur();
  message:string='';

  private router: Router
  
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  login(){
    this.http.get<Utilisateur>("http://localhost:8081/au-bonheur-des-gourmands/utilisateur/"+this.mail+"/"+this.mdp).subscribe(
      (response)=>{
        this.user=response;
        this.message=JSON.stringify(this.user);
        console.log(JSON.stringify(this.user));
        sessionStorage.setItem("utilisateur",JSON.stringify(this.user));

      },
      (error)=>{
        console.log("*************KO")
      },
      ()=>{
        console.log("*************complete")
      }
    ) 
  }

}
