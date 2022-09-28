import { Component, OnInit } from '@angular/core';
import { hero } from '../hero';

@Component({
  selector: 'app-for-each',
  templateUrl: './for-each.component.html',
  styleUrls: ['./for-each.component.css']
})
export class ForEachComponent implements OnInit {
 heroes=['vishnuvardhan','shankar nag','puneeth rajkumar','upendra'] ;
products=['shoe','mobile','laptop'];
 data = [ new hero(123,"sid"),new hero(124,"ss")];
  constructor() { }

  ngOnInit(): void {
  }

}
