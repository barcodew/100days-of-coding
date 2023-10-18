function bubbleSort(list) {
  let n = list.length;
  let swapped;

  for (let i = 0; i < n - 1; i++) {
    swapped = false;

    for (let j = 0; j < n - i - 1; j++) {
      if (list[j] > list[j + 1]) {
        let temp = list[j];
        list[j] = list[j + 1];
        list[j + 1] = temp;
        swapped = true;
      }
    }
 
    if (!swapped) {
      break;
    }
  }

  return list;
}

const listNumber = [64, 34, 25, 12, 22, 11, 90];

console.log("Array Yang Belum diurutkan : ", listNumber);

const sortedList = bubbleSort(listNumber);
console.log("Array yang telah diurutkan : ", sortedList);
