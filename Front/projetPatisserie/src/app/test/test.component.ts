import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  modalClosed = true;

  constructor() { }

  ngOnInit(): void {
  }

  openModal() {
    this.modalClosed = false;
  }

  closeModal() {
    this.modalClosed = true;
  }

}
