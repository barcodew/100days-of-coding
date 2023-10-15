const ngetikApa = ["Halo, Selamat Datang", "Perkenalkan!", "Nama Saya","Achmad Ali Akbar"];
const element = document.getElementById("ngetik-sendiri");
let currentIndex = 0;

function gasNgetik() {
  if (currentIndex < ngetikApa.length) {
    const currentText = ngetikApa[currentIndex];
    const currentTextLength = currentText.length;

    element.textContent = currentText.substring(0, element.textContent.length + 1);

    if (element.textContent.length === currentTextLength) {
      setTimeout(hapusText, 200); // Tunggu 1 detik sebelum menghapus teks
    } else {
      setTimeout(gasNgetik, 100); // Tunggu 100 milidetik sebelum menambahkan karakter berikutnya
    }
  } else {
    currentIndex = 0; // Kembali ke awal jika semua teks sudah ditampilkan
    setTimeout(gasNgetik, 1000); // Tunggu 1 detik sebelum mengulang dari awal
  }
}

function hapusText() {
  const currentText = element.textContent;
  if (currentText.length > 0) {
    element.textContent = currentText.substring(0, currentText.length - 1);
    setTimeout(hapusText, 100); // Tunggu 100 milidetik sebelum menghapus karakter sebelumnya
  } else {
    currentIndex++;
    setTimeout(gasNgetik, 100); // Tunggu 0.5 detik sebelum mengetik teks berikutnya
  }
}

gasNgetik(); 