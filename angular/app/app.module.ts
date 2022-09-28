import { NgModule, NO_ERRORS_SCHEMA } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyComponent } from './Mycomponent';
import { ForEachComponent } from './for-each/for-each.component';
import { FormsModule} from '@angular/forms';
import { IfExampleComponent } from './if-example/if-example.component'
import { CustomDirective } from './CustomDirective';
import { Product } from './Product';
@NgModule({
  declarations: [
    AppComponent,MyComponent,Product,CustomDirective, ForEachComponent, IfExampleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  
})
export class AppModule { }
