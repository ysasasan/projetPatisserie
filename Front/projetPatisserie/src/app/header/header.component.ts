import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  client: Boolean = true;
  manager:Boolean = false;
  administrateur:Boolean = false;

  constructor() { }

  ngOnInit(): void {
  }



}
