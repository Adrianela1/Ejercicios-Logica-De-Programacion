const readline = require('readline');


function generarNumeroSecreto() {
    return Math.floor(Math.random() * 100) + 1;
}


function esNumeroValido(valor) {
    return !isNaN(parseFloat(valor)) && isFinite(valor);
}


function adivinarNumeroSecreto(numeroSecreto, intentosAnteriores) {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    rl.question('Intenta adivinar el número secreto (entre 1 y 100): ', (intento) => {
        if (esNumeroValido(intento)) {
            intento = parseInt(intento);
            intentosAnteriores.push(intento);

            if (intento === numeroSecreto) {
                console.log("Felicidades, adivinaste el número secreto.");
                console.log("El número secreto era: " + numeroSecreto);
                console.log("Lista de números introducidos antes de adivinar: " + intentosAnteriores.join(", "));
                rl.close();
            } else {
                if (intentosAnteriores.length < 10) {
                    console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
                    adivinarNumeroSecreto(numeroSecreto, intentosAnteriores);
                } else {
                    console.log("Lo siento, has agotado tus intentos. El número secreto era: " + numeroSecreto);
                    rl.close();
                }
            }
        } else {
            console.log('Por favor, ingrese un número válido.');
            adivinarNumeroSecreto(numeroSecreto, intentosAnteriores);
        }
    });
}


const numeroSecreto = generarNumeroSecreto();


console.log("¡Bienvenido al juego de adivinar el número secreto!");
adivinarNumeroSecreto(numeroSecreto, []);
