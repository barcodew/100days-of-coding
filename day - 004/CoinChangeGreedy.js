function greedyCoinChange(coins, amount) {
    // Menyortir koin dalam urutan menurun
    coins.sort((a, b) => b - a);
    
    const change = {};
    
    for (let i = 0; i < coins.length; i++) {
      const coin = coins[i];
      while (amount >= coin) {
        // Mengurangi nilai koin dari jumlah yang perlu diubah
        amount -= coin;
        
        // Menambahkan koin ke daftar perubahan
        if (change[coin]) { 
          change[coin]++;
        } else {
          change[coin] = 1;
        }
      }
    }
    
    return change;
  }
  
  const availableCoins = [25, 10, 5, 1];
  const targetAmount = 15;
  
  const result = greedyCoinChange(availableCoins, targetAmount);
  console.log("Perubahan koin yang diperlukan:");
  console.log(result);
  
