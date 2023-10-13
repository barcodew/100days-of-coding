let display = document.getElementById('display');
let currentInput = '';

function appendToDisplay(value) {
    currentInput += value;
    display.value = currentInput;
}

function clearDisplay() {
    currentInput = '';
    display.value = '';
}

function backspace() {
    currentInput = currentInput.slice(0, -1); 
    display.value = currentInput;
}

function calculateResult() {
    try {
        let result = eval(currentInput);
        currentInput = result;
        display.value = result;
    } catch (error) {
        display.value = 'Error';
    }
}
