function sapaPengguna() {
  var nama = document.getElementById("namaInput").value;

  if (nama === "") {
    alert("Masukkan nama Anda terlebih dahulu.");
  } else {
    var hasilSapaan = "Halo, " + nama + "!";
    document.getElementById("hasilSapaan").innerHTML = hasilSapaan;
  }
}
