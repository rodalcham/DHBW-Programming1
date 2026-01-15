// Import readline module for terminal input
const readline = require('readline');

// Create interface for input/output
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Ask the user for their name
rl.question("What is your name? \n", (name) => {
  // Display the welcome message
  console.log(`Hello ${name}, welcome to Programming 1`);
  
  // Close the interface
  rl.close();
});