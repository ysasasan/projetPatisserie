import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ActualitesComponent } from './actualites/actualites.component';
import { AproposComponent } from './apropos/apropos.component';
import { AuthentificationComponent } from './authentification/authentification.component';
import { CommandeComponent } from './commande/commande.component';
import { FindbyidpatisserieComponent } from './findbyidpatisserie/findbyidpatisserie.component';
import { FooterComponent } from './footer/footer.component';
import { GestionnaireUtilisateursComponent } from './gestionnaire-utilisateurs/gestionnaire-utilisateurs.component';
import { HeaderComponent } from './header/header.component';
import { InscriptionComponent } from './inscription/inscription.component';
import { NewpatisserieComponent } from './newpatisserie/newpatisserie.component';
import { PanierComponent } from './panier/panier.component';
import { PresentationComponent } from './presentation/presentation.component';
import { TestComponent } from './test/test.component';

const routes: Routes = [
  {path: 'header', component: HeaderComponent},
  {path: 'footer', component: FooterComponent},
  {path: 'inscription', component: InscriptionComponent},
  {path: 'authentification', component: AuthentificationComponent},
  {path: 'gestionnaire-utilisateurs', component: GestionnaireUtilisateursComponent},
  {path: 'commande', component: CommandeComponent},
  {path: 'findbyidpatisserie/:id', component: FindbyidpatisserieComponent},
  {path: 'newpatisserie', component: NewpatisserieComponent},
  {path: 'panier', component: PanierComponent},
  {path: 'test', component: TestComponent},
  {path: 'apropos', component: AproposComponent},
  {path: 'actualites', component: ActualitesComponent},
  {path: 'presentation', component: PresentationComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
