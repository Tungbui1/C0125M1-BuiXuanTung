let acc = prompt("Nhập tài khoản")
if (acc === "Admin") {
    let pass =prompt("Nhập mật khẩu")
    if (pass==="TheMaster") {
        alert("Welcome")
        
    } else if(pass===null) {
        alert("Canceled")
        
    }
    else{
        alert("Wrong password")
    }
    
} else if(acc===null){
    alert("Canceled")
    
}
else{
    alert("I don’t know you")
}