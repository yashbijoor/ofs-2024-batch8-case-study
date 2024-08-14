import readline from "readline-sync";
import { Employee } from "./employee.js";
import fs from "fs";

let employee1 = new Employee(1, "Jack", 60000);
let employee2 = new Employee(2, "Mark", 65000);
let employee3 = new Employee(3, "Mary", 70000);

function appendEmployeeToFile(employee) {
  let employees = [];

  if (fs.existsSync("employee.json")) {
    let fileData = fs.readFileSync("employee.json", "utf8");
    if (fileData) {
      employees = JSON.parse(fileData);
    }
  }

  employees.push(employee);

  fs.writeFileSync("employee.json", JSON.stringify(employees, null, 2));
}

appendEmployeeToFile(employee1);
appendEmployeeToFile(employee2);
appendEmployeeToFile(employee3);

console.log("JSON file appended");

let fileData = fs.readFileSync("employee.json");

console.log("*************CONTENT OF THE JSON FILE**************");
console.log(JSON.parse(fileData));
