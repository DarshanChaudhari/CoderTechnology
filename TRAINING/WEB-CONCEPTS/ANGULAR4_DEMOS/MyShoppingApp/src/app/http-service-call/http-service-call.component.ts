import { Component, OnInit } from '@angular/core';
import { HttpDataService } from '../services/http-data.service';
import { Item } from '../model/Item';
import { from } from 'rxjs';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-http-service-call',
  templateUrl: './http-service-call.component.html',
  styleUrls: ['./http-service-call.component.css']
})
export class HttpServiceCallComponent implements OnInit {
  private _httpService;
  items:Item[];
  selectedItem: any;
  toggleForm:boolean;
  
  constructor(private HttpDataService:HttpDataService) {

   }

  ngOnInit() {
    this.getItems();
  }

  getItems() {
    this.HttpDataService.getshoppingitems().subscribe(items=>this.items=<Item[]>items);
  }

  addItems(frm:NgForm) {
    console.log(frm.value);
    let items: Item = {
      id:frm.value.name,
      title:frm.value.title,
      author:frm.value.author     
    }
    this.HttpDataService.addShoppingItems(items)
      .subscribe(items => {
        console.log(items);
        this.getItems();  
})}

  editItems(editfrm){
     let newitem: Item = {
     id:this.selectedItem.id,
     title:editfrm.value.title,
     author:editfrm.value.author   
    }
    console.log(newitem);
    this.HttpDataService.updateShoppingItems(newitem)  
        .subscribe(result => {
          console.log('original item to be updated with old values' + result);
          this.getItems();
          this.toggleForm = !this.toggleForm;
        })

  }

  showEditform(Item) {
    this.selectedItem = Item;
    this.toggleForm = true;
  }

  showAddForm() {
    this.toggleForm=false;
  }


  deleteItem(id) {
    this.HttpDataService.deleteShoppingItems(id)
      .subscribe(result => {
        console.log(result);
        
          for (var i = 0; i < this.items.length; i++) {
            if (id == this.items[i].id) {
              this.items.splice(i, 1);
            }            
        }
      })
  }

}