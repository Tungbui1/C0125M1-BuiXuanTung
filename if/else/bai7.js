let messager = prompt("Nhập vào");
let Result = (messager === "Employee")? "hello":
              (messager==="Director") ? "Greetings" :
              (messager==="")? "No login" :
              "";
alert (Result) 