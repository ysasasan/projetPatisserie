import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Utilisateur } from '../utilisateur';

@Component({
  selector: 'app-authentification',
  templateUrl: './authentification.component.html',
  styleUrls: ['./authentification.component.css']
})
export class AuthentificationComponent implements OnInit {

  

  mdp:string =''
  mail:string = ''
  user:Utilisateur= new Utilisateur()
  message:string


  
  url="http://localhost:8081/api/personnes/"+this.mail+"/"+this.mdp


  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  // verify(){
  //   this.http.get<Utilisateur>("http://localhost:8081/au-bonheur-des-gourmands/utilisateur/"+this.mail+"/"+this.mdp).subscribe(
  //     (response)=>{
  //       this.user=response;
  //       this.message=JSON.stringify(this.user);
  //     },
  //     (error)=>{
  //       console.log("*************KO")
  //     },
  //     ()=>{
  //       console.log("*************complete")
  //     }
  //   ) 
  // }

}
