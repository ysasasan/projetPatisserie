import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewpatisserieComponent } from './newpatisserie.component';

describe('NewpatisserieComponent', () => {
  let component: NewpatisserieComponent;
  let fixture: ComponentFixture<NewpatisserieComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewpatisserieComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NewpatisserieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
