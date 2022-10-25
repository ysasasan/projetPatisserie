import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FindallpatisseriesComponent } from './findallpatisseries.component';

describe('FindallpatisseriesComponent', () => {
  let component: FindallpatisseriesComponent;
  let fixture: ComponentFixture<FindallpatisseriesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FindallpatisseriesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FindallpatisseriesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
