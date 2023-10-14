// Fungsi untuk menghitung countdown
function startCountdown(targetDate) {
    const countdownElement = document.getElementById('countdown');

    function updateCountdown() {
        const currentDate = new Date();
        const timeDifference = targetDate - currentDate;

        if (timeDifference <= 0) {
            countdownElement.innerHTML = 'Waktu habis!';
        } else {
            const days = Math.floor(timeDifference / (1000 * 60 * 60 * 24));
            const hours = Math.floor((timeDifference % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
            const minutes = Math.floor((timeDifference % (1000 * 60 * 60)) / (1000 * 60));
            const seconds = Math.floor((timeDifference % (1000 * 60)) / 1000);

            countdownElement.innerHTML = `${days} Hari ${hours} Jam ${minutes} Menit ${seconds} Detik`;
        }
    }

    // Memanggil fungsi pertama kali untuk menginisialisasi countdown
    updateCountdown();

    // Memperbarui countdown setiap 1 detik
    const countdownInterval = setInterval(updateCountdown, 1000);
}

// Tentukan tanggal target akhir countdown (misalnya, 24 jam dari sekarang)
const targetDate = new Date();
targetDate.setDate(targetDate.getDate() + 1); // Menambahkan 1 hari

// Memulai countdown
startCountdown(targetDate);
