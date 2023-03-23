Solve=(val)=> {
    var sol = document.getElementById('res');
    sol.value += val;
 }
 Result=()=> {
    var r1 = document.getElementById('res').value;
    try{
        var r2 = eval(r1);
        document.getElementById('res').value = r2;
    }
    catch(error){
        document.getElementById('res').value = "Invalid syntax";
    }
    
 }
 Clearscreen=()=> {
    var clr = document.getElementById('res');
    clr.value = '';
 }
 Back=()=> {
    var ba = document.getElementById('res');
    ba.value = ba.value.slice(0,-1);
 }