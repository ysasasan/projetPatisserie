import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-newpatisserie',
  templateUrl: './newpatisserie.component.html',
  styleUrls: ['./newpatisserie.component.css']
})
export class NewpatisserieComponent implements OnInit {

  message: string
  patisserie={id:0,categorie:'',description:'',image:'',infos:'',nom:'', prix:0}

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  create(){
    const body=JSON.stringify(this.patisserie);
  

  this.http.post("http://localhost:8081/au-bonheur-des-gourmands/patisserie/new",body,{
    headers: new HttpHeaders({
      "Content-Type": "application/json"
    })
  }).subscribe(response => {

   
    this.message="patisserie créée"

  },

    err => {
     
      this.message="erreur de creation patisserie"
    });

}
}
