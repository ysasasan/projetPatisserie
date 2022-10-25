import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Utilisateur } from '../utilisateur';

@Component({
  selector: 'app-gestionnaire-utilisateurs',
  templateUrl: './gestionnaire-utilisateurs.component.html',
  styleUrls: ['./gestionnaire-utilisateurs.component.css']
})
export class GestionnaireUtilisateursComponent implements OnInit {

  constructor(private http: HttpClient) { }

  myList: Array<Utilisateur>
  url="http://localhost:8081/au-bonheur-des-gourmands/utilisateurs"

  ngOnInit(): void {
    this.http.get<Array<Utilisateur>>(this.url).subscribe(
      (response)=>{
        this.myList=response;
        console.log(this.myList);
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
