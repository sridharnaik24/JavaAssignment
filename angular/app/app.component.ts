import { Component,OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  ImagePath:string;

  constructor() {

    //Image location

    this.ImagePath = 'https://images.unsplash.com/photo-1517960413843-0aee8e2b3285?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8YmFsYW5jZXxlbnwwfHwwfHw%3D&w=1000&q=80'

  }

 



ngOnInit() {



}

 

}