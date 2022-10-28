import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-final',
  templateUrl: './final.component.html',
  styleUrls: ['./final.component.css']
})
export class FinalComponent implements OnInit {

  panier:any

  constructor() { }

  ngOnInit(): void {

    this.panier=sessionStorage.getItem("panier")

    // delete(this.panier[i])

  }

}
