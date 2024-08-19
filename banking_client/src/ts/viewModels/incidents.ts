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
import "oj-c/input-password";
import "oj-c/button";

class IncidentsViewModel {
  username: ko.Observable<string>;
  password: ko.Observable<string>;
  authenticated: ko.Observable<boolean>;

  constructor() {
    this.username = ko.observable("");
    this.password = ko.observable("");
    this.authenticated = ko.observable(false);
  }

  public buttonAction = async (event: Event) => {
    console.log("Button is clicked");

    const row = {
      username: this.username(),
      passwrd: this.password(),
    };

    const request = new Request(
      "http://localhost:9090/bankinglogin/authenticate",
      {
        headers: new Headers({
          "Content-type": "application/json; charset=UTF-8",
        }),
        body: JSON.stringify(row),
        method: "POST",
      }
    );

    const response = await fetch(request);
    const addedRow = await response.json();

    console.log("The added row is", addedRow);

    if (addedRow != null) {
      this.authenticated(addedRow.customerId > 0);
    }

    if (addedRow > 0) {
      sessionStorage.setItem("customerId", addedRow);
    }

    return addedRow;
  };
}

export = IncidentsViewModel;
