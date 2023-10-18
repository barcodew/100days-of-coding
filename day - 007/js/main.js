const ngetikApa = [
  "Halo, Selamat Datang",
  "Perkenalkan!",
  "Nama Saya",
  "Achmad Ali Akbar",
];
const element = document.getElementById("ngetik-sendiri");
let currentIndex = 0;

function gasNgetik() {
  if (currentIndex < ngetikApa.length) {
    const currentText = ngetikApa[currentIndex];
    const currentTextLength = currentText.length;

    element.textContent = currentText.substring(
      0,
      element.textContent.length + 1
    );

    if (element.textContent.length === currentTextLength) {
      setTimeout(hapusText, 200);
    } else {
      setTimeout(gasNgetik, 100);
    }
  } else {
    currentIndex = 0;
    setTimeout(gasNgetik, 1000);
  }
}

function hapusText() {
  const currentText = element.textContent;
  if (currentText.length > 0) {
    element.textContent = currentText.substring(0, currentText.length - 1);
    setTimeout(hapusText, 100);
  } else {
    currentIndex++;
    setTimeout(gasNgetik, 100);
  }
}

gasNgetik();
