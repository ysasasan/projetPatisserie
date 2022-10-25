import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FindbyidpatisserieComponent } from './findbyidpatisserie.component';

describe('FindbyidpatisserieComponent', () => {
  let component: FindbyidpatisserieComponent;
  let fixture: ComponentFixture<FindbyidpatisserieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FindbyidpatisserieComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FindbyidpatisserieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
