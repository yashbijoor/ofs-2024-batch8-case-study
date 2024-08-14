import readline from "readline-sync";
let text = readline.question("Enter a text: ");
let number = readline.questionInt("Enter a number: ");
let password = readline.questionNewPassword("Enter a password: ");
let email = readline.questionEMail("Enter an email: ");
let display = readline.question("Display input? y/n: ");

if (display.toLowerCase() == "y") {
  console.log("Text is " + text);
  console.log("Number is", number);
  console.log("Password is", password);
  console.log("Email is", email);
} else {
  console.log("Okay, inputs will not be displayed");
}
