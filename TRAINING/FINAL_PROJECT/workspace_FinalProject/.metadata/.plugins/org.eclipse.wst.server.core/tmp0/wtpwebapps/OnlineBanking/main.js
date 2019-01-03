(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/Models/BeneficiaryDetails.ts":
/*!**********************************************!*\
  !*** ./src/app/Models/BeneficiaryDetails.ts ***!
  \**********************************************/
/*! exports provided: BeneficiaryDetails */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BeneficiaryDetails", function() { return BeneficiaryDetails; });
var BeneficiaryDetails = /** @class */ (function () {
    function BeneficiaryDetails(beneficiaryIfscCode, beneficiartName, customerDetail, beneficiaryAccountNo) {
        this.beneficiartName = beneficiartName;
        this.beneficiaryAccountNo = beneficiaryAccountNo;
        this.beneficiaryIfscCode = beneficiaryIfscCode;
        this.customerDetail = customerDetail;
        console.log(this.customerDetail + "in constructro");
    }
    return BeneficiaryDetails;
}());



/***/ }),

/***/ "./src/app/app-routing.module.ts":
/*!***************************************!*\
  !*** ./src/app/app-routing.module.ts ***!
  \***************************************/
/*! exports provided: AppRoutingModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppRoutingModule", function() { return AppRoutingModule; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _components_home_home_component__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./components/home/home.component */ "./src/app/components/home/home.component.ts");
/* harmony import */ var _components_accountsummary_accountsummary_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./components/accountsummary/accountsummary.component */ "./src/app/components/accountsummary/accountsummary.component.ts");
/* harmony import */ var _components_accountprofile_accountprofile_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./components/accountprofile/accountprofile.component */ "./src/app/components/accountprofile/accountprofile.component.ts");
/* harmony import */ var _components_accountstatement_accountstatement_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./components/accountstatement/accountstatement.component */ "./src/app/components/accountstatement/accountstatement.component.ts");
/* harmony import */ var _components_beneficiarydetails_beneficiarydetails_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./components/beneficiarydetails/beneficiarydetails.component */ "./src/app/components/beneficiarydetails/beneficiarydetails.component.ts");
/* harmony import */ var _components_addbeneficiary_addbeneficiary_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./components/addbeneficiary/addbeneficiary.component */ "./src/app/components/addbeneficiary/addbeneficiary.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};








var routes = [
    { path: 'home', component: _components_home_home_component__WEBPACK_IMPORTED_MODULE_2__["HomeComponent"] },
    { path: 'accountsummary', component: _components_accountsummary_accountsummary_component__WEBPACK_IMPORTED_MODULE_3__["AccountsummaryComponent"] },
    { path: 'viewprofile', component: _components_accountprofile_accountprofile_component__WEBPACK_IMPORTED_MODULE_4__["AccountprofileComponent"] },
    { path: 'accountstatement', component: _components_accountstatement_accountstatement_component__WEBPACK_IMPORTED_MODULE_5__["AccountstatementComponent"] },
    { path: 'beneficiarydetails', component: _components_beneficiarydetails_beneficiarydetails_component__WEBPACK_IMPORTED_MODULE_6__["BeneficiarydetailsComponent"] },
    { path: 'addbeneficiary', component: _components_addbeneficiary_addbeneficiary_component__WEBPACK_IMPORTED_MODULE_7__["AddbeneficiaryComponent"] },
    { path: '**', component: _components_home_home_component__WEBPACK_IMPORTED_MODULE_2__["HomeComponent"] }
];
var AppRoutingModule = /** @class */ (function () {
    function AppRoutingModule() {
    }
    AppRoutingModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["NgModule"])({
            imports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"].forRoot(routes)],
            exports: [_angular_router__WEBPACK_IMPORTED_MODULE_1__["RouterModule"]]
        })
    ], AppRoutingModule);
    return AppRoutingModule;
}());



/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2FwcC5jb21wb25lbnQuY3NzIn0= */"

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n\n<div>\n  <ul class=\"nav nav-tabs\">\n    <li routerLinkActive=\"active\">\n      <a routerLink=\"home\">Home</a>\n    </li>  \n\n     \n    <li routerLinkActive=\"active\">\n      <a routerLink=\"accountsummary\">Account Summary</a>\n    </li>\n\n    <li routerLinkActive=\"active\">\n      <a routerLink=\"viewprofile\">View Profile</a>\n    </li>\n    <li routerLinkActive=\"active\">\n      <a routerLink=\"accountstatement\">Accont Statement</a>\n    </li>\n\n    <li routerLinkActive=\"active\">\n      <a routerLink=\"beneficiarydetails\">View Beneficiary</a>\n    </li>\n\n    <li routerLinkActive=\"active\">\n      <a routerLink=\"addbeneficiary\">Add Beneficiary</a>\n    </li>\n  </ul>\n  <br/>\n   \n</div>\n\n<router-outlet></router-outlet>\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'OnlineBankingUI';
    }
    AppComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _app_routing_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app-routing.module */ "./src/app/app-routing.module.ts");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _components_components_component__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./components/components.component */ "./src/app/components/components.component.ts");
/* harmony import */ var _components_home_home_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./components/home/home.component */ "./src/app/components/home/home.component.ts");
/* harmony import */ var _components_accountsummary_accountsummary_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./components/accountsummary/accountsummary.component */ "./src/app/components/accountsummary/accountsummary.component.ts");
/* harmony import */ var _services_viewbalance_service__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./services/viewbalance.service */ "./src/app/services/viewbalance.service.ts");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _components_accountprofile_accountprofile_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./components/accountprofile/accountprofile.component */ "./src/app/components/accountprofile/accountprofile.component.ts");
/* harmony import */ var _components_accountstatement_accountstatement_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./components/accountstatement/accountstatement.component */ "./src/app/components/accountstatement/accountstatement.component.ts");
/* harmony import */ var _components_beneficiarydetails_beneficiarydetails_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./components/beneficiarydetails/beneficiarydetails.component */ "./src/app/components/beneficiarydetails/beneficiarydetails.component.ts");
/* harmony import */ var _components_addbeneficiary_addbeneficiary_component__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./components/addbeneficiary/addbeneficiary.component */ "./src/app/components/addbeneficiary/addbeneficiary.component.ts");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};














var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_3__["AppComponent"],
                _components_components_component__WEBPACK_IMPORTED_MODULE_4__["ComponentsComponent"],
                _components_home_home_component__WEBPACK_IMPORTED_MODULE_5__["HomeComponent"],
                _components_accountsummary_accountsummary_component__WEBPACK_IMPORTED_MODULE_6__["AccountsummaryComponent"],
                _components_accountprofile_accountprofile_component__WEBPACK_IMPORTED_MODULE_9__["AccountprofileComponent"],
                _components_accountstatement_accountstatement_component__WEBPACK_IMPORTED_MODULE_10__["AccountstatementComponent"],
                _components_beneficiarydetails_beneficiarydetails_component__WEBPACK_IMPORTED_MODULE_11__["BeneficiarydetailsComponent"],
                _components_addbeneficiary_addbeneficiary_component__WEBPACK_IMPORTED_MODULE_12__["AddbeneficiaryComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"],
                _app_routing_module__WEBPACK_IMPORTED_MODULE_2__["AppRoutingModule"],
                _angular_common_http__WEBPACK_IMPORTED_MODULE_8__["HttpClientModule"],
                _angular_forms__WEBPACK_IMPORTED_MODULE_13__["FormsModule"]
            ],
            providers: [_services_viewbalance_service__WEBPACK_IMPORTED_MODULE_7__["ViewbalanceService"]],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_3__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/components/accountprofile/accountprofile.component.css":
/*!************************************************************************!*\
  !*** ./src/app/components/accountprofile/accountprofile.component.css ***!
  \************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2NvbXBvbmVudHMvYWNjb3VudHByb2ZpbGUvYWNjb3VudHByb2ZpbGUuY29tcG9uZW50LmNzcyJ9 */"

/***/ }),

/***/ "./src/app/components/accountprofile/accountprofile.component.html":
/*!*************************************************************************!*\
  !*** ./src/app/components/accountprofile/accountprofile.component.html ***!
  \*************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<p>\n \n  Customer Id :  {{customerDetails.customerId}}<br>\n   Customer Name : {{customerDetails.customerName}}\t<br>\n   Customer Contact No : {{customerDetails.customerMobileNo}}<br>\n   Customer Gender : {{customerDetails.customerGender}}<br>\n   Customer Email ID: {{customerDetails.customerEmail}}<br>\n   Customer DOB : {{customerDetails.customerDOB}}<br>\n   Customer City : {{customerDetails.customerCity}}<br>\n   Customer Address : {{customerDetails.customerAddress}}<br>\n   Customer State : {{customerDetails.customerState}}<br>\n   Customer Country : {{customerDetails.customerCountry}}<br>\n   Customer Branch : {{customerDetails.customerBranch}}<br>\n   Customer AadharId : {{customerDetails.customerAadharId}}<br>\n   Customer Pan No : {{customerDetails.customerPanCard}}<br>\n  \n   \n   \n </p>\n <div class=\"col-xs-5\">\n   <img class=\"imageClass\" [src]=\"customerDetails.customerPhotoPath\" />\n </div>\n \n <div class=\"col-xs-5\">\n   <img class=\"imageClass\" [src]=\"customerDetails.customerSignaturePath\" />\n </div>\n "

/***/ }),

/***/ "./src/app/components/accountprofile/accountprofile.component.ts":
/*!***********************************************************************!*\
  !*** ./src/app/components/accountprofile/accountprofile.component.ts ***!
  \***********************************************************************/
/*! exports provided: AccountprofileComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AccountprofileComponent", function() { return AccountprofileComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var src_app_services_viewprofile_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! src/app/services/viewprofile.service */ "./src/app/services/viewprofile.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var AccountprofileComponent = /** @class */ (function () {
    function AccountprofileComponent(httpclientservice) {
        this.httpclientservice = httpclientservice;
        this.customerId = 3843000;
    }
    AccountprofileComponent.prototype.viewCustomerProfile = function (customerId) {
        var _this = this;
        this.customerId = customerId;
        return this.httpclientservice.getCustomerProfile(this.customerId).subscribe(function (custProfile) { _this.customerDetails = custProfile; });
    };
    AccountprofileComponent.prototype.ngOnInit = function () {
        this.viewCustomerProfile(this.customerId);
    };
    AccountprofileComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-accountprofile',
            template: __webpack_require__(/*! ./accountprofile.component.html */ "./src/app/components/accountprofile/accountprofile.component.html"),
            styles: [__webpack_require__(/*! ./accountprofile.component.css */ "./src/app/components/accountprofile/accountprofile.component.css")]
        }),
        __metadata("design:paramtypes", [src_app_services_viewprofile_service__WEBPACK_IMPORTED_MODULE_1__["ViewprofileService"]])
    ], AccountprofileComponent);
    return AccountprofileComponent;
}());



/***/ }),

/***/ "./src/app/components/accountstatement/accountstatement.component.css":
/*!****************************************************************************!*\
  !*** ./src/app/components/accountstatement/accountstatement.component.css ***!
  \****************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2NvbXBvbmVudHMvYWNjb3VudHN0YXRlbWVudC9hY2NvdW50c3RhdGVtZW50LmNvbXBvbmVudC5jc3MifQ== */"

/***/ }),

/***/ "./src/app/components/accountstatement/accountstatement.component.html":
/*!*****************************************************************************!*\
  !*** ./src/app/components/accountstatement/accountstatement.component.html ***!
  \*****************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<p>\n  accountstatement works!\n</p>\n\n<p>Account Statement: <br><br>\n  <table border=1>\n   \n      <thead>\n          <tr>\n              <td>Customer Account No</td>\n              <td>Transaction Type</td>\n              <td>Beneficiary Account No</td>\n              <td>Account Balance</td>\n              <td>Transaction Amount</td>\n              <td>Transaction Id</td>\n              <td>Transaction Date</td>\n              <td>Transaction Info</td>\n          </tr>\n      </thead>\n\n      <tr *ngFor='let s of transactions;'>\n          <td>{{s.accounts.accountNo}}</td>\n          <td>{{s.transactionType}}</td>\n          <td>{{s.beneAccountNo}}</td>\n          <td>{{s.balance}}</td>\n          <td>{{s.amount}}</td>  \n          <td>{{s.transactionId}}</td>\n          <td>{{s.transactionDateTime}}</td>\n          <td>{{s.transactionInfo}}</td>      \n      </tr>\n      <tr *ngIf=\"!transactions || transactions.length==0\">\n          <td colspan=\"5\"> No Transactions to display</td>\n      </tr>\n\n  </table>\n"

/***/ }),

/***/ "./src/app/components/accountstatement/accountstatement.component.ts":
/*!***************************************************************************!*\
  !*** ./src/app/components/accountstatement/accountstatement.component.ts ***!
  \***************************************************************************/
/*! exports provided: AccountstatementComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AccountstatementComponent", function() { return AccountstatementComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var src_app_services_viewaccountstatement_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! src/app/services/viewaccountstatement.service */ "./src/app/services/viewaccountstatement.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var AccountstatementComponent = /** @class */ (function () {
    function AccountstatementComponent(httpclientservice) {
        this.httpclientservice = httpclientservice;
        this.accountNo = 3549777;
        this.fromDate = "29-Dec-2018";
        this.toDate = "31-Dec-2019";
    }
    AccountstatementComponent.prototype.viewAccountStatement = function (accountNo, fromDate, toDate) {
        var _this = this;
        this.accountNo = accountNo;
        this.fromDate = fromDate;
        this.toDate = toDate;
        return this.httpclientservice.getAccountStatement(this.accountNo, this.fromDate, this.toDate).
            subscribe(function (acctStatement) { _this.transactions = acctStatement; });
    };
    AccountstatementComponent.prototype.ngOnInit = function () {
        this.viewAccountStatement(this.accountNo, this.fromDate, this.toDate);
    };
    AccountstatementComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-accountstatement',
            template: __webpack_require__(/*! ./accountstatement.component.html */ "./src/app/components/accountstatement/accountstatement.component.html"),
            styles: [__webpack_require__(/*! ./accountstatement.component.css */ "./src/app/components/accountstatement/accountstatement.component.css")]
        }),
        __metadata("design:paramtypes", [src_app_services_viewaccountstatement_service__WEBPACK_IMPORTED_MODULE_1__["ViewaccountstatementService"]])
    ], AccountstatementComponent);
    return AccountstatementComponent;
}());



/***/ }),

/***/ "./src/app/components/accountsummary/accountsummary.component.css":
/*!************************************************************************!*\
  !*** ./src/app/components/accountsummary/accountsummary.component.css ***!
  \************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2NvbXBvbmVudHMvYWNjb3VudHN1bW1hcnkvYWNjb3VudHN1bW1hcnkuY29tcG9uZW50LmNzcyJ9 */"

/***/ }),

/***/ "./src/app/components/accountsummary/accountsummary.component.html":
/*!*************************************************************************!*\
  !*** ./src/app/components/accountsummary/accountsummary.component.html ***!
  \*************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<p>\n  accountsummary works!\n</p>\n\nAccount Number {{account.accountNo}}<br>\n\n\n  Account Balance {{account.accountBalance}}<br>\n\n  Account Type {{account.decriminatorValue}}\n\n  \n\n"

/***/ }),

/***/ "./src/app/components/accountsummary/accountsummary.component.ts":
/*!***********************************************************************!*\
  !*** ./src/app/components/accountsummary/accountsummary.component.ts ***!
  \***********************************************************************/
/*! exports provided: AccountsummaryComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AccountsummaryComponent", function() { return AccountsummaryComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var src_app_services_viewbalance_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! src/app/services/viewbalance.service */ "./src/app/services/viewbalance.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var AccountsummaryComponent = /** @class */ (function () {
    function AccountsummaryComponent(httpclientservice) {
        this.httpclientservice = httpclientservice;
        this.accountNos = 3549777;
    }
    AccountsummaryComponent.prototype.ngOnInit = function () {
        this.getAccountSummary(this.accountNos);
    };
    AccountsummaryComponent.prototype.getAccountSummary = function (accountNos) {
        var _this = this;
        this.accountNos = accountNos;
        return this.httpclientservice.getAccountBalance(this.accountNos).subscribe(function (acct) { _this.account = acct; });
    };
    AccountsummaryComponent.prototype.getdata = function () {
        console.log(this.account);
    };
    AccountsummaryComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-accountsummary',
            template: __webpack_require__(/*! ./accountsummary.component.html */ "./src/app/components/accountsummary/accountsummary.component.html"),
            styles: [__webpack_require__(/*! ./accountsummary.component.css */ "./src/app/components/accountsummary/accountsummary.component.css")]
        }),
        __metadata("design:paramtypes", [src_app_services_viewbalance_service__WEBPACK_IMPORTED_MODULE_1__["ViewbalanceService"]])
    ], AccountsummaryComponent);
    return AccountsummaryComponent;
}());



/***/ }),

/***/ "./src/app/components/addbeneficiary/addbeneficiary.component.css":
/*!************************************************************************!*\
  !*** ./src/app/components/addbeneficiary/addbeneficiary.component.css ***!
  \************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2NvbXBvbmVudHMvYWRkYmVuZWZpY2lhcnkvYWRkYmVuZWZpY2lhcnkuY29tcG9uZW50LmNzcyJ9 */"

/***/ }),

/***/ "./src/app/components/addbeneficiary/addbeneficiary.component.html":
/*!*************************************************************************!*\
  !*** ./src/app/components/addbeneficiary/addbeneficiary.component.html ***!
  \*************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!DOCTYPE html> \n<html>\n  <head>\n\n  </head>\n  <body>\n\n    <div class=\"container\">\n\n      <div class=\"jumbotron\">\n\n          <form #frm=\"ngForm\" (ngSubmit)=\"addNewBeneficiary(frm)\" >\n            \n                <div class=\"form-group\">\n            \n               <label for=\"custid\">Customer Id</label>\n                  <input type=\"number\"   name=\"custid\" #NameControl=\"ngModel\" class=\"form-control\" id=\"custid\" [(ngModel)]=\"custid\" required>                  \n                </div>\n               \n\n                <div class=\"form-group\">                                \n                   <label for=\"beneifsccode\">Beneficiary IFSC Code:</label>\n                    <input type=\"text\"  #EmailControl=\"ngModel\" name=\"beneifsccode\" id=\"beneifsccode\" class=\"form-control\" [(ngModel)]=\"beneifsccode\" required>                               \n                </div>\n\n                <div class=\"form-group\">  \n                <label for=\"beneacctno\">Beneficiary Account No:</label>\n                  <input type=\"number\"   name=\"beneacctno\" #NameControl=\"ngModel\" class=\"form-control\" id=\"beneacctno\" [(ngModel)]=\"beneacctno\" required>                  \n                </div>\n\n                <div class=\"form-group\">                                \n                  <label for=\"benename\">Beneficiary Name:</label>\n                   <input type=\"text\"  #EmailControl=\"ngModel\" name=\"benename\" id=\"benename\" class=\"form-control\" [(ngModel)]=\"benename\" required>                               \n               </div>                                          \n                \n            \n                <div class=\"form-group\">\n                   \n                        <!--<input type=\"submit\" value=\"Add User\"  class=\"form-control\" class=\"btn btn-success\" [disabled]=\"frm.invalid\"> -->\n                        <!--<input type=\"submit\" value=\"Add User\"  class=\"form-control\" class=\"btn btn-success\">-->\n                  <button type=\"submit\" value=\"Add User\"  class=\"form-control\" class=\"btn btn-success\">Add</button> \n                      \n\n                </div>\n                  \n            </form>\n  \n\n      </div>\n\n       \n    </div>\n"

/***/ }),

/***/ "./src/app/components/addbeneficiary/addbeneficiary.component.ts":
/*!***********************************************************************!*\
  !*** ./src/app/components/addbeneficiary/addbeneficiary.component.ts ***!
  \***********************************************************************/
/*! exports provided: AddbeneficiaryComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AddbeneficiaryComponent", function() { return AddbeneficiaryComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var src_app_Models_BeneficiaryDetails__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! src/app/Models/BeneficiaryDetails */ "./src/app/Models/BeneficiaryDetails.ts");
/* harmony import */ var src_app_services_addbeneficiary_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! src/app/services/addbeneficiary.service */ "./src/app/services/addbeneficiary.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var AddbeneficiaryComponent = /** @class */ (function () {
    function AddbeneficiaryComponent(addbeneservice) {
        this.addbeneservice = addbeneservice;
        this.beneDetailsToAdd = [];
    }
    AddbeneficiaryComponent.prototype.ngOnInit = function () {
    };
    AddbeneficiaryComponent.prototype.addNewBeneficiary = function (frm) {
        this.customerDetail = (frm.value.custid);
        this.beneficiaryIfscCode = (frm.value.beneifsccode);
        this.beneficiartName = (frm.value.benename);
        this.beneficiaryAccountNo = (frm.value.beneacctno);
        console.log(this.customerDetail);
        console.log(this.beneficiaryIfscCode);
        console.log(this.beneficiartName);
        console.log(this.beneficiaryAccountNo);
        var newBeneDetails = new src_app_Models_BeneficiaryDetails__WEBPACK_IMPORTED_MODULE_1__["BeneficiaryDetails"](this.beneficiaryIfscCode, this.beneficiartName, this.customerDetail, this.beneficiaryAccountNo);
        this.addbeneservice.addNewBeneficiary(newBeneDetails).subscribe(function (beneDetailsItem) {
            console.log("POST Request is successful ", beneDetailsItem);
        }, function (error) {
            console.log("Error", error);
        });
    };
    AddbeneficiaryComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-addbeneficiary',
            template: __webpack_require__(/*! ./addbeneficiary.component.html */ "./src/app/components/addbeneficiary/addbeneficiary.component.html"),
            styles: [__webpack_require__(/*! ./addbeneficiary.component.css */ "./src/app/components/addbeneficiary/addbeneficiary.component.css")]
        }),
        __metadata("design:paramtypes", [src_app_services_addbeneficiary_service__WEBPACK_IMPORTED_MODULE_2__["AddbeneficiaryService"]])
    ], AddbeneficiaryComponent);
    return AddbeneficiaryComponent;
}());



/***/ }),

/***/ "./src/app/components/beneficiarydetails/beneficiarydetails.component.css":
/*!********************************************************************************!*\
  !*** ./src/app/components/beneficiarydetails/beneficiarydetails.component.css ***!
  \********************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2NvbXBvbmVudHMvYmVuZWZpY2lhcnlkZXRhaWxzL2JlbmVmaWNpYXJ5ZGV0YWlscy5jb21wb25lbnQuY3NzIn0= */"

/***/ }),

/***/ "./src/app/components/beneficiarydetails/beneficiarydetails.component.html":
/*!*********************************************************************************!*\
  !*** ./src/app/components/beneficiarydetails/beneficiarydetails.component.html ***!
  \*********************************************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n<p>Beneficiary List: <br><br>\n  <table border=1>\n   \n      <thead>\n          <tr>\n              <td>Customer Id</td>\n              <td>Beneficiary IFSC Code</td>\n              <td>Beneficiary Account No</td>\n              <td>Beneficiary Name</td>\n              <td>Beneficiary ID</td>              \n          </tr>\n      </thead>\n\n      <tr *ngFor='let b of benficiaryList;'>  \n        <td>{{b.customerDetail.customerId}}</td>\n          <td>{{b.beneficiaryIfscCode}}</td>\n          <td>{{b.beneficiaryAccountNo}}</td>\n          <td>{{b.beneficiartName}}</td>\n          <td>{{b.beneficiaryId}}</td>  \n           \n      </tr>\n      <tr *ngIf=\"!benficiaryList || benficiaryList.length==0\">\n          <td colspan=\"5\"> No Beneficiary to display</td>\n      </tr>\n\n  </table>\n\n"

/***/ }),

/***/ "./src/app/components/beneficiarydetails/beneficiarydetails.component.ts":
/*!*******************************************************************************!*\
  !*** ./src/app/components/beneficiarydetails/beneficiarydetails.component.ts ***!
  \*******************************************************************************/
/*! exports provided: BeneficiarydetailsComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "BeneficiarydetailsComponent", function() { return BeneficiarydetailsComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var src_app_services_viewbeneficiarylist_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! src/app/services/viewbeneficiarylist.service */ "./src/app/services/viewbeneficiarylist.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var BeneficiarydetailsComponent = /** @class */ (function () {
    function BeneficiarydetailsComponent(httpclientservice) {
        this.httpclientservice = httpclientservice;
        this.customerId = 3844350;
    }
    BeneficiarydetailsComponent.prototype.getBeneficiaryDetailedList = function (customerId) {
        var _this = this;
        this.customerId = customerId;
        //return this.httpclientservice.getBeneficicaryList(this.customerId).subscribe(beneList=>{this.benficiaryList=<BeneficiaryDetails>beneList;})
        return this.httpclientservice.getBeneficicaryList(this.customerId).subscribe(function (beneList) { _this.benficiaryList = beneList; });
        //return this.httpclientservice.getAccountBalance(this.accountNos).subscribe(acct=>{this.account=<Accounts>acct;})
    };
    BeneficiarydetailsComponent.prototype.ngOnInit = function () {
        this.getBeneficiaryDetailedList(this.customerId);
    };
    BeneficiarydetailsComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-beneficiarydetails',
            template: __webpack_require__(/*! ./beneficiarydetails.component.html */ "./src/app/components/beneficiarydetails/beneficiarydetails.component.html"),
            styles: [__webpack_require__(/*! ./beneficiarydetails.component.css */ "./src/app/components/beneficiarydetails/beneficiarydetails.component.css")]
        }),
        __metadata("design:paramtypes", [src_app_services_viewbeneficiarylist_service__WEBPACK_IMPORTED_MODULE_1__["ViewbeneficiarylistService"]])
    ], BeneficiarydetailsComponent);
    return BeneficiarydetailsComponent;
}());



/***/ }),

/***/ "./src/app/components/components.component.css":
/*!*****************************************************!*\
  !*** ./src/app/components/components.component.css ***!
  \*****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2NvbXBvbmVudHMvY29tcG9uZW50cy5jb21wb25lbnQuY3NzIn0= */"

/***/ }),

/***/ "./src/app/components/components.component.html":
/*!******************************************************!*\
  !*** ./src/app/components/components.component.html ***!
  \******************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<p>\n  components works!\n</p>\n"

/***/ }),

/***/ "./src/app/components/components.component.ts":
/*!****************************************************!*\
  !*** ./src/app/components/components.component.ts ***!
  \****************************************************/
/*! exports provided: ComponentsComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ComponentsComponent", function() { return ComponentsComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var ComponentsComponent = /** @class */ (function () {
    function ComponentsComponent() {
    }
    ComponentsComponent.prototype.ngOnInit = function () {
    };
    ComponentsComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-components',
            template: __webpack_require__(/*! ./components.component.html */ "./src/app/components/components.component.html"),
            styles: [__webpack_require__(/*! ./components.component.css */ "./src/app/components/components.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], ComponentsComponent);
    return ComponentsComponent;
}());



/***/ }),

/***/ "./src/app/components/home/home.component.css":
/*!****************************************************!*\
  !*** ./src/app/components/home/home.component.css ***!
  \****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "\n/*# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IiIsImZpbGUiOiJzcmMvYXBwL2NvbXBvbmVudHMvaG9tZS9ob21lLmNvbXBvbmVudC5jc3MifQ== */"

/***/ }),

/***/ "./src/app/components/home/home.component.html":
/*!*****************************************************!*\
  !*** ./src/app/components/home/home.component.html ***!
  \*****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<p>\n  home works!\n</p>\n"

/***/ }),

/***/ "./src/app/components/home/home.component.ts":
/*!***************************************************!*\
  !*** ./src/app/components/home/home.component.ts ***!
  \***************************************************/
/*! exports provided: HomeComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HomeComponent", function() { return HomeComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var HomeComponent = /** @class */ (function () {
    function HomeComponent() {
    }
    HomeComponent.prototype.ngOnInit = function () {
    };
    HomeComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-home',
            template: __webpack_require__(/*! ./home.component.html */ "./src/app/components/home/home.component.html"),
            styles: [__webpack_require__(/*! ./home.component.css */ "./src/app/components/home/home.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], HomeComponent);
    return HomeComponent;
}());



/***/ }),

/***/ "./src/app/services/addbeneficiary.service.ts":
/*!****************************************************!*\
  !*** ./src/app/services/addbeneficiary.service.ts ***!
  \****************************************************/
/*! exports provided: AddbeneficiaryService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AddbeneficiaryService", function() { return AddbeneficiaryService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var AddbeneficiaryService = /** @class */ (function () {
    function AddbeneficiaryService(http) {
        this.http = http;
    }
    AddbeneficiaryService.prototype.addNewBeneficiary = function (beneDetails) {
        console.log(beneDetails.beneficiartName + " in service");
        console.log(beneDetails.beneficiaryAccountNo + " in service");
        console.log(beneDetails.beneficiaryIfscCode + " in service");
        console.log(beneDetails.customerDetail + " in service");
        return this.http.post('/OnlineBanking/OB/addNewBeneficiary', beneDetails);
    };
    AddbeneficiaryService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]])
    ], AddbeneficiaryService);
    return AddbeneficiaryService;
}());



/***/ }),

/***/ "./src/app/services/viewaccountstatement.service.ts":
/*!**********************************************************!*\
  !*** ./src/app/services/viewaccountstatement.service.ts ***!
  \**********************************************************/
/*! exports provided: ViewaccountstatementService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ViewaccountstatementService", function() { return ViewaccountstatementService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ViewaccountstatementService = /** @class */ (function () {
    function ViewaccountstatementService(http) {
        this.http = http;
    }
    ViewaccountstatementService.prototype.getAccountStatement = function (accountNo, fromDate, toDate) {
        return this.http.get('/OnlineBanking/OB/viewAccountStatement/' + accountNo + '/' + fromDate + '/' + toDate);
    };
    ViewaccountstatementService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]])
    ], ViewaccountstatementService);
    return ViewaccountstatementService;
}());



/***/ }),

/***/ "./src/app/services/viewbalance.service.ts":
/*!*************************************************!*\
  !*** ./src/app/services/viewbalance.service.ts ***!
  \*************************************************/
/*! exports provided: ViewbalanceService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ViewbalanceService", function() { return ViewbalanceService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ViewbalanceService = /** @class */ (function () {
    function ViewbalanceService(http) {
        this.http = http;
    }
    ViewbalanceService.prototype.getAccountBalance = function (accountNo) {
        //return this.http.get('http://localhost:8081/OnlineBanking/OB/viewAccountSummary/3549294')
        return this.http.get('/OnlineBanking/OB/viewAccountSummary/' + accountNo);
    };
    ViewbalanceService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]])
    ], ViewbalanceService);
    return ViewbalanceService;
}());



/***/ }),

/***/ "./src/app/services/viewbeneficiarylist.service.ts":
/*!*********************************************************!*\
  !*** ./src/app/services/viewbeneficiarylist.service.ts ***!
  \*********************************************************/
/*! exports provided: ViewbeneficiarylistService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ViewbeneficiarylistService", function() { return ViewbeneficiarylistService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ViewbeneficiarylistService = /** @class */ (function () {
    function ViewbeneficiarylistService(http) {
        this.http = http;
    }
    ViewbeneficiarylistService.prototype.getBeneficicaryList = function (customerId) {
        return this.http.get('/OnlineBanking/OB/viewBeneficiary/' + customerId);
    };
    ViewbeneficiarylistService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]])
    ], ViewbeneficiarylistService);
    return ViewbeneficiarylistService;
}());



/***/ }),

/***/ "./src/app/services/viewprofile.service.ts":
/*!*************************************************!*\
  !*** ./src/app/services/viewprofile.service.ts ***!
  \*************************************************/
/*! exports provided: ViewprofileService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ViewprofileService", function() { return ViewprofileService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var ViewprofileService = /** @class */ (function () {
    function ViewprofileService(http) {
        this.http = http;
    }
    ViewprofileService.prototype.getCustomerProfile = function (customerId) {
        return this.http.get('/OnlineBanking/OB/viewCustomerProfile/' + customerId);
    };
    ViewprofileService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]])
    ], ViewprofileService);
    return ViewprofileService;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build --prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.error(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! D:\Amit\WorkspaceOnlineBanking_AngularProject\OnlineBankingUI\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map