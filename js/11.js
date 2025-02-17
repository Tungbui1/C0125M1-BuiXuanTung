const nam = parseFloat(prompt("Nhập năm "));
const thang= parseFloat(prompt("Nhập tháng"));
if (0 < thang && thang <13) {
    if (1,3,5,7,8,10,12) {
        alert ("Tháng có 31 ngày")
        
    } else if(4,6,9,11) {
        alert ("tháng có 30 ngày")
        
    }
    else{
        if ((year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0)) {
            alert("tháng 2 có 28 ngày")
        } else {
            alert("tháng 2 có 28 ngày")
            
        }
    }
    
} else {
    alert (" lỗi không có tháng đó")
    
}