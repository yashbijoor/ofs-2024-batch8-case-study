/**
 * @license
 * Copyright (c) 2014, 2024, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */
import * as AccUtils from "../accUtils";
import * as ko from "knockout";
import { RESTDataProvider } from "ojs/ojrestdataprovider";
import * as deptArray from "text!../cookbook/dataprovider/arrayData.json";
import "ojs/ojknockout";
import "ojs/ojtable";

type D = {
  customerId: number;
  fName: string;
  lName: string;
  addressLine1: string;
  addressLine2: string;
  addressLine3: string;
  city: string;
  state: string;
  zip: number;
  phone: number;
  email: string;
  status: string;
};
type K = D["customerId"];
console.log(sessionStorage.getItem("key"));

class DashboardViewModel {
  dataprovider: RESTDataProvider<K, D>;
  constructor() {
    this.dataprovider = new RESTDataProvider({
      keyAttributes: "id",
      url: "http://localhost:9090/banking/customers",
      transforms: {
        fetchFirst: {
          request: async (options) => {
            return new Request("http://localhost:9090/banking/customers");
          },
          response: async ({ body }) => {
            let data = body;
            return { data };
          },
        },
      },
    });
  }
}

export = DashboardViewModel;
