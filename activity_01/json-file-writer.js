import readline from "readline-sync";
import { Employee } from "./employee.js";
import fs from "fs";

let employee1 = new Employee(1, "Jack", 60000);
let employee2 = new Employee(2, "Mark", 65000);
let employee3 = new Employee(3, "Mary", 70000);

const jsonString = JSON.stringify(employee1);

fs.writeFileSync("employee.json", jsonString);

console.log("JSON file created");

let fileData = fs.readFileSync("employee.json");

console.log("*************CONTENT OF THE JSON FILE**************");
console.log(JSON.parse(fileData));
