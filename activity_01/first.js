import os from "os";

async function hello() {
  console.log("first line");

  await new Promise((resolve) =>
    setTimeout(() => {
      console.log("middle line");
      resolve();
    }, 3000)
  )
    .then(() => {
      console.log(undefined_var);
      console.log("last line");
    })
    .catch((err) => {
      console.log("There is an error [ " + err + " ]");
    });
}

hello();
