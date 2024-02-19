const readline = require('readline');


const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});


function esNumeroValido(valor) {
    return !isNaN(parseFloat(valor)) && isFinite(valor);
}


function serieFibonacci(terminos) {
    var serie = [0, 1];

    if (terminos === 1) {
        return [0];
    } else if (terminos === 2) {
        return serie;
    }

    for (var i = 2; i < terminos; i++) {
        serie.push(serie[i - 1] + serie[i - 2]);
    }

    return serie;
}


function solicitarNumero() {
    rl.question('Ingrese un número para obtener la serie de Fibonacci: ', (numero) => {
        if (esNumeroValido(numero)) {
            var numeroEntero = parseInt(numero);
            
            var fibonacci = serieFibonacci(numeroEntero);

            
            console.log("Serie de Fibonacci de " + numeroEntero + " términos: " + fibonacci.join(", "));

            rl.close();
        } else {
            console.log('Por favor, ingrese un número válido.');
            solicitarNumero();
        }
    });
}


solicitarNumero();
