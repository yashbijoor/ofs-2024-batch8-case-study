/**
 * @license
 * Copyright (c) 2014, 2024, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */
import * as AccUtils from "../accUtils";
import * as ko from "knockout";
import "oj-c/input-text";
import "oj-c/input-number";
import "oj-c/button";
import "oj-c/input-password";

class CustomersViewModel {
  fname: ko.Observable<string>;
  lname: ko.Observable<string>;
  addressLine1: ko.Observable<string>;
  addressLine2: ko.Observable<string>;
  addressLine3: ko.Observable<string>;
  city: ko.Observable<string>;
  state: ko.Observable<string>;
  zip: ko.Observable<number>;
  phone: ko.Observable<number>;
  email: ko.Observable<string>;
  username: ko.Observable<string>;
  password: ko.Observable<string>;
  registered: ko.Observable<boolean>;

  constructor() {
    this.fname = ko.observable("");
    this.lname = ko.observable("");
    this.addressLine1 = ko.observable("");
    this.addressLine2 = ko.observable("");
    this.addressLine3 = ko.observable("");
    this.city = ko.observable("");
    this.state = ko.observable("");
    this.zip = ko.observable(0);
    this.phone = ko.observable(999999999);
    this.email = ko.observable("");
    this.username = ko.observable("");
    this.password = ko.observable("");
    this.registered = ko.observable(false);
  }

  public buttonAction = async (event: Event) => {
    console.log("Button is clicked");

    const row1 = {
      fName: this.fname(),
      lName: this.lname(),
      addressLine1: this.addressLine1(),
      addressLine2: this.addressLine2(),
      addressLine3: this.addressLine3(),
      city: this.city(),
      state: this.state(),
      zip: this.zip(),
      phone: this.phone(),
      email: this.email(),
      status: "New Account",
    };

    const request = new Request("http://localhost:9090/banking/addemployee", {
      headers: new Headers({
        "Content-type": "application/json; charset=UTF-8",
      }),
      body: JSON.stringify(row1),
      method: "POST",
    });

    const response = await fetch(request);
    const customerId = await response.json();

    const row2 = {
      username: this.username(),
      passwrd: this.password(),
      loginAttempts: 0,
      status: "Logged out",
      customerId: customerId,
    };

    const request2 = new Request(
      "http://localhost:9090/bankinglogin/addlogindetails",
      {
        headers: new Headers({
          "Content-type": "application/json; charset=UTF-8",
        }),
        body: JSON.stringify(row2),
        method: "POST",
      }
    );

    const response2 = await fetch(request2);
    const result = await response2.json();

    console.log("The addedRow is", customerId);
    console.log("The result of registration is", result);

    if (customerId > 0 && result == true) {
      this.registered(true);
    }
  };
}

export = CustomersViewModel;
