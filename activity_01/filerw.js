import fs from "fs";
import readline from "readline-sync";

let text = readline.question("Enter some text: ");

fs.writeFileSync("demo.txt", text + "\n", { flag: "a+" });

console.log("File appended...");
let fileData = fs.readFileSync("demo.txt");
console.log("*************CONTENT OF THE FILE**************");
console.log(fileData.toString());
