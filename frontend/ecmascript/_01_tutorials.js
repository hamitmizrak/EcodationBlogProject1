// İleri Düzey JavaScript
//ES5-ES6

//ES5
/*
"use strict" 
public,private,let,const,interface,abstact,class,package,static ==>YAZAMAYIZ
*/

// //Hoisting
// deneme="Merhabalar";
// var deneme;
// console.log(deneme);

// var sayi=55; //global scope
// function denemeFunction(){
//     console.log(this.sayi);
//     var sayi2=44; //function scope
// }

// denemeFunction()
// console.log(this.sayi2);

// //var aynı değişken isminde kullanabiliriz
// var sayi9=9;
// console.log(sayi9)
// var sayi9=11;
// console.log(sayi9)

// ///////////////////////////////////////////////////
// //Babel: babil ES5 çeviren compiler
// //ES6
// let sayi3=63;
// console.log(sayi3)

// const SABIT_DEGER=95;
// console.log(SABIT_DEGER);

// //Template Literal ==> backtick kullan ``

// //1-MultiLine
// let newString="MErhabalar\nNasılsın";
// console.log(newString);

// let newString2=`MErhabalar
// Nasılsın`;
// console.log(newString2);

// //2-interpolation
// let adi="Hamit";
// let soyadi="Mızrak";
// console.log("Adınız: "+adi+"soyadınız: "+soyadi);

// console.log(`Adınız ${adi}  Soyadınız ${soyadi}`)

//3 Html Template
// const html=  "<ul>"+
//                 "<li>" +adi  +"</li>"  +
//                  "<li>" +soyadi  +"</li>"
//             +"</ul>";
//document.body.innerHTML=html;

//  const html2= `
//  <ul>
//     <li>Adı: ${adi}</li>
//     <li>Soyadı:${soyadi}</li>
// </ul>
//  `;
//document.body.innerHTML=html2;

//normal
//  function deneme11(){
//      console.log("normal")
//  }
//  deneme11()

//ES5 : anonymous function
//  var deneme22=function (){
//     console.log("anonymous function")
// }
// deneme22()

//ES6 Arrow Function
//  let deneme33= ()=>{
//      console.log("Arrow function")
//  }
// deneme33()

//Immedia Function: fonkisyonu çağırmadan gelir.
// (function(){
//       console.log("Immedia Function")
//   }
// )();

////////////////////
// let dizi = [1, 2, 3, 4, 5, 6]
// let tempDizi = []

//Sayılardan çift olanları getir.

//Normal
// function normalFunction() {
//   for (var i = 0; i < dizi.length; i++) {
//     if (dizi[i] % 2 === 0) {
//       tempDizi.push(dizi[i])
//     }
//   }
//   console.log(tempDizi)
// }
// normalFunction()

// //ES5
// var es5Filter = dizi.filter(function (temp) {
//   return temp % 2 === 0
// })
// console.log(es5Filter)

// //ES6
// var es6Filter = dizi.filter((temp) => {
//   return temp % 2 === 0
// })
// console.log(es6Filter)


// //ES6: restParameter
// function restEs6(...dizi){
//     let toplam=0;
//     dizi.forEach((data)=>{
//         toplam+=data;
//     })
//     return toplam;
// }
// //let dizi=[1,2,3]
// console.log(restEs6(1,2,3,4,5))

//ES6 destructuring

//NORMAL
var x,y;
x=5;
y=10;
console.log(x+" "+y);

//destructuring assignment
// [x,y]=[51,61]
// console.log(x+" "+y);

//Diziler
// var malatya1="44";
// var istanbul1="34";
// var adana1="1";
// console.log(malatya1,istanbul1,adana1)

// const [malatya,istanbul,adana]=["44","34","1"];
// console.log(malatya,istanbul,adana);


//object
const serverConfigObject={
    serverPort:"3306",
    serverName:"localhost",
    ide:"vs"
};
console.log(serverConfigObject)


const {serverPort,serverName,ide}=serverConfigObject;
console.log(serverPort,serverName,ide)