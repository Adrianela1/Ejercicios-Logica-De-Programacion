const readline = require('readline');

// Función para verificar si el valor es un número válido
function esNumeroValido(valor) {
    return !isNaN(parseFloat(valor)) && isFinite(valor);
}

// Función para convertir grados Celsius a grados Fahrenheit
function celsiusAFahrenheit(celsius) {
    return (celsius * 9 / 5) + 32;
}

// Función para convertir grados Celsius a grados Kelvin
function celsiusAKelvin(celsius) {
    return celsius + 273.15;
}


const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Función para solicitar la temperatura en grados Celsius al usuario
function solicitarTemperatura() {
    rl.question('Ingrese la temperatura en grados Celsius: ', (temperatura) => {
        if (esNumeroValido(temperatura)) {
            var celsius = parseFloat(temperatura);
        
            var fahrenheit = celsiusAFahrenheit(celsius);
            var kelvin = celsiusAKelvin(celsius);

            
            console.log("Grados Fahrenheit: " + fahrenheit);
            console.log("Grados Kelvin: " + kelvin);

            rl.close();
        } else {
            console.log('Por favor, ingrese un número válido.');
            solicitarTemperatura();
        }
    });
}
solicitarTemperatura();
