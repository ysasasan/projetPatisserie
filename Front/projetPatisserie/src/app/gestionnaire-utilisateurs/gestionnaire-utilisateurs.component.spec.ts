import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GestionnaireUtilisateursComponent } from './gestionnaire-utilisateurs.component';

describe('GestionnaireUtilisateursComponent', () => {
  let component: GestionnaireUtilisateursComponent;
  let fixture: ComponentFixture<GestionnaireUtilisateursComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GestionnaireUtilisateursComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GestionnaireUtilisateursComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
