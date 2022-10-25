import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Patisserie } from '../patisserie';

@Component({
  selector: 'app-findbyidpatisserie',
  templateUrl: './findbyidpatisserie.component.html',
  styleUrls: ['./findbyidpatisserie.component.css']
})
export class FindbyidpatisserieComponent implements OnInit {

  id: number = 0;
  p: Patisserie = new Patisserie()
  
  constructor(private route: ActivatedRoute, private http: HttpClient) { }

  ngOnInit(): void {

    this.route.params.subscribe(params => {

      this.id = params['id']

    })

    this.http.get<Patisserie>("http://localhost:8081/au-bonheur-des-gourmands/patisserie/"+this.id).subscribe(
      response =>{
        this.p=response
      }
      ,
      err =>{
      console.log("*************KO")
        
      })
    

  }

}
