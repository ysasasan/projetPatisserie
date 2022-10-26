import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { AuthentificationComponent } from './authentification/authentification.component';
import { GestionnaireUtilisateursComponent } from './gestionnaire-utilisateurs/gestionnaire-utilisateurs.component';
import { InscriptionComponent } from './inscription/inscription.component';
import { FindbyidpatisserieComponent } from './findbyidpatisserie/findbyidpatisserie.component';
import { NewpatisserieComponent } from './newpatisserie/newpatisserie.component';
import { PanierComponent } from './panier/panier.component';
import { CommandeComponent } from './commande/commande.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    AuthentificationComponent,
    GestionnaireUtilisateursComponent,
    InscriptionComponent,
    CommandeComponent,
    FindbyidpatisserieComponent,
    NewpatisserieComponent,
    PanierComponent,
    CommandeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
  schemas: []
})
export class AppModule { }
