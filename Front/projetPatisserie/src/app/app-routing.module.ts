import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthentificationComponent } from './authentification/authentification.component';
import { FooterComponent } from './footer/footer.component';
import { GestionnaireUtilisateursComponent } from './gestionnaire-utilisateurs/gestionnaire-utilisateurs.component';
import { HeaderComponent } from './header/header.component';
import { InscriptionComponent } from './inscription/inscription.component';

const routes: Routes = [
  {path: 'header', component: HeaderComponent},
  {path: 'footer', component: FooterComponent},
  {path: 'inscription', component: InscriptionComponent},
  {path: 'authentification', component: AuthentificationComponent},
  {path: 'gestionnaire-utilisateurs', component: GestionnaireUtilisateursComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
