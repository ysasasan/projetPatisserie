import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-recapitulatif',
  templateUrl: './recapitulatif.component.html',
  styleUrls: ['./recapitulatif.component.css']
})
export class RecapitulatifComponent implements OnInit {

  lst: any

  constructor() { }

  ngOnInit(): void {
    this.lst=JSON.parse(sessionStorage.getItem("panier"))
    // for (var i=0;i<this.lst.length;i++) {
    //   alert(this.lst[i].Id);
   }
  }


