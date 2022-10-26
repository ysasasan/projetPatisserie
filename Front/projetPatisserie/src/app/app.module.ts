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
<<<<<<< Updated upstream
import { PanierComponent } from './panier/panier.component';
import { CommandeComponent } from './commande/commande.component';

=======
import { TestComponent } from './test/test.component';
>>>>>>> Stashed changes


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
<<<<<<< Updated upstream
    PanierComponent,
    CommandeComponent,
=======
    TestComponent,
>>>>>>> Stashed changes
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
