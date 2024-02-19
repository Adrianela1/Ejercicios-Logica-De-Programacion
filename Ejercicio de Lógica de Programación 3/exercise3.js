const readline = require('readline');


const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});


function esNumeroValido(valor) {
    return !isNaN(parseFloat(valor)) && isFinite(valor);
}


function calcularFactorial(numero) {
    if (numero === 0) {
        return 1;
    } else {
        return numero * calcularFactorial(numero - 1);
    }
}


function solicitarNumero() {
    rl.question('Ingrese un número: ', (numero) => {
        if (esNumeroValido(numero)) {
            var numeroEntero = parseInt(numero);
            
            var factorial = calcularFactorial(numeroEntero);

            
            console.log("El factorial de " + numeroEntero + " es: " + factorial);

            rl.close();
        } else {
            console.log('Por favor, ingrese un número válido.');
            solicitarNumero();
        }
    });
}


solicitarNumero();
