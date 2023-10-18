function segitiga(kolom) {
    for (let i = 1; i <= kolom; i++) {
      let spasi = "   ".repeat(kolom - i);
      let bintang = " * ".repeat(2 * i - 1);
      console.log(spasi + bintang);
    }
    console.log("\n\n Program Selesai, Have a nice day :)")
  }
  
  var kolom = 15; 
  segitiga(kolom);
