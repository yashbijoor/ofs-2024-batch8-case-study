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
import "ojs/ojknockout";
import "oj-c/input-number";
import "oj-c/input-password";
import "ojs/ojlabel";
import "ojs/ojformlayout";
import Message = require("ojs/ojmessaging");
import "oj-c/input-date-mask";
import { DateISOStr } from "@oracle/oraclejet-preact/UNSAFE_IntlDateTime";
import "oj-c/button";
import { MessageBannerItem, CMessageBannerElement } from "oj-c/message-banner";
import MutableArrayDataProvider = require("ojs/ojmutablearraydataprovider");
import "ojs/ojcheckboxset";
import "ojs/ojknockout";
import "oj-c/message-banner";
import "ojs/ojcheckboxset";
import "ojs/ojknockout";
import "oj-c/message-banner";
import "oj-c/progress-bar";
import "oj-c/button";
import "ojs/ojlabelvalue";
import "ojs/ojlabel";
import ArrayDataProvider = require("ojs/ojarraydataprovider");
import { ojTable } from "ojs/ojtable";
import "ojs/ojknockout";
import "ojs/ojtable";
import * as responsiveUtils from "ojs/ojresponsiveutils";
import * as responsiveKnockoutUtils from "ojs/ojresponsiveknockoututils";
import "ojs/ojbutton";
import "ojs/ojinputtext";
import "ojs/ojformlayout";

type DemoMessageBannerItem = MessageBannerItem & {
  id: string;
};

class DashboardViewModel {
  firstname: ko.Observable<string>;
  lastname: ko.Observable<string>;
  salary: ko.Observable<number>;
  error: Message[];
  isSmall: ko.Observable<boolean> | undefined;
  labelEdge: ko.Computed<"top" | "start">;
  // value: ko.Observable<string>;
  password: ko.Observable<string>;
  readonly min: DateISOStr | null;
  readonly max: DateISOStr | null;
  date: ko.Observable<DateISOStr>;
  readonly newMessagesOptions: ko.ObservableArray<string>;
  readonly selectedMessages: ko.ObservableArray<MessageBannerItem["severity"]>;
  readonly messages: MutableArrayDataProvider<string, DemoMessageBannerItem>;
  readonly progressValue = ko.observable(0);
  readonly buttonDisplay = ko.pureComputed(() => {
    return this.progressValue() === 100 ? "inline-flex" : "none";
  });
  readonly loadingText = ko.pureComputed(() => {
    return this.progressValue() === 100 ? "Done!" : "Loading...";
  });

  readonly closeMessage = (
    event: CMessageBannerElement.ojClose<string, DemoMessageBannerItem>
  ) => {
    // remove the message from the data to close it
    let data = this.messages.data.slice();
    const closeMessageKey = event.detail.key;

    data = data.filter((message) => (message as any).id !== closeMessageKey);
    this.messages.data = data;

    // update the checkboxset to reflect the opened messages
    this.selectedMessages.remove((item) => {
      return item === event.detail.data.severity;
    });
  };

  constructor() {
    this.firstname = ko.observable("Yash");
    this.lastname = ko.observable("Bijoor");
    this.salary = ko.observable(10000);
    this.error = [{ summary: "summary", detail: "detail", severity: "error" }];
    this.password = ko.observable("password");
    this.date = ko.observable("2023-04-27");
    this.min = "2000-04-01";
    this.max = "2024-08-30";

    let smQuery = responsiveUtils.getFrameworkQuery("sm-only");
    if (smQuery != null) {
      this.isSmall =
        responsiveKnockoutUtils.createMediaQueryObservable(smQuery);
    }

    // For small screens: labels on top
    // For medium or bigger: labels inline
    this.labelEdge = ko.computed(() => {
      return this.isSmall() ? "top" : "start";
    });

    const initialData = [
      {
        id: "errorMessage",
        severity: "error",
        summary: "Error message summary",
        detail: "Error message detail.",
        closeAffordance: "off",
      },
      {
        id: "warningMessage",
        severity: "warning",
        summary: "Warning message summary",
        detail: "Warning message detail.",
        timestamp: new Date().toISOString(),
      },
      {
        id: "confirmationMessage",
        severity: "confirmation",
        summary: "Confirmation message summary",
        detail: "Confirmation message detail.",
      },
    ];
    this.messages = new MutableArrayDataProvider(initialData, {
      keyAttributes: "id",
    });

    // Bindings for the controls
    this.newMessagesOptions = ko.observableArray(["closeAffordance"]);
    this.selectedMessages = ko.observableArray([
      "error",
      "warning",
      "confirmation",
      "none",
      "info",
      undefined,
    ]);

    this.progressValue.subscribe((newValue: number) => {
      if (newValue === 100) {
        let loadingRegion = document.getElementById("loadingRegion");
        if (loadingRegion != null) {
          loadingRegion.removeAttribute("aria-busy");
          loadingRegion.removeAttribute("aria-describedby");
        }
      }
    });
    window.setInterval(() => {
      {
        this.progressValue(Math.min(this.progressValue() + 1, 100));
      }
    }, 30);
  }

  restartButton = () => {
    this.progressValue(0);
    let loadingRegion = document.getElementById("loadingRegion");
    if (loadingRegion != null) {
      loadingRegion.setAttribute("aria-busy", "true");
      loadingRegion.setAttribute("aria-describedby", "progressBar");
    }
  };
}

export = DashboardViewModel;
