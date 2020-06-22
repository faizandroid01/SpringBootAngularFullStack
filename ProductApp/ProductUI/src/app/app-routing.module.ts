import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductComponent } from './product/product.component';


const routes: Routes = [{ path: 'productList', component: ProductComponent },
  // { path: '', redirectTo: 'productList', pathMatch: 'full' },ng
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
