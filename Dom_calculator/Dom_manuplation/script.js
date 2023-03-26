let para = document.getElementById("para");
para.addEventListener('mouseover',()=>{
    para.style.color='red'
})
para.addEventListener('mouseout',()=>{
    para.style.color='black'
})
let btn = document.getElementById("btn");
btn.addEventListener('mouseover',()=>{
    btn.innerHTML='Submit'
})
btn.addEventListener('mouseout',()=>{
    btn.innerHTML='Click Here'
})
let clickinputbutton = document.getElementById("clickin");
clickinputbutton.addEventListener('click',()=>{
    para.innerHTML = document.getElementById("in").value;
})
let element = document.querySelectorAll('.listele');
element.forEach((ele)=>{
    ele.addEventListener('mouseover',()=>{
        ele.style.color='red';
        ele.style.fontWeight='bold';
    })
    ele.addEventListener('mouseout',()=>{
        ele.style.color='black';
        ele.style.fontWeight='lighter';
    })
})