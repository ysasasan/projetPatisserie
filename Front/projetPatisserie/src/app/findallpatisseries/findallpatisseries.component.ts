import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-findallpatisseries',
  templateUrl: './findallpatisseries.component.html',
  styleUrls: ['./findallpatisseries.component.css']
})
export class FindallpatisseriesComponent implements OnInit {

  MyList: any

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.http.get("http://localhost:8081/au-bonheur-des-gourmands/patisseries").subscribe(
      (response) => {
      
        this.MyList=response;
      },
      (err) => {
         console.log("*************KO")
         
       },

       () => {
        console.log("*********complete****")
        
      }
      );
  }

}
