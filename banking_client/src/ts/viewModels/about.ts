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
  accountId: number;
  minBalance: number;
  currentBalance: number;
  customerId: number;
  approvalStatus: boolean;
  account_type: string;
};
type K = D["accountId"];

class AboutViewModel {
  dataprovider: RESTDataProvider<K, D>;
  constructor() {
    console.log("The session Value is " + sessionStorage.customerId);

    this.dataprovider = new RESTDataProvider({
      keyAttributes: "id",
      url: "http://localhost:9090/account/accounts/11",
      transforms: {
        fetchFirst: {
          request: async (options) => {
            return new Request("http://localhost:9090/account/accounts/1");
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

export = AboutViewModel;
