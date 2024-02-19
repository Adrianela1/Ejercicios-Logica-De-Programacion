const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Ingrese el primer número: ', (num1) => {
  rl.question('Ingrese el segundo número: ', (num2) => {
    rl.question('Ingrese el tercer número: ', (num3) => {
      // Convertir las entradas a números enteros
      num1 = parseInt(num1);
      num2 = parseInt(num2);
      num3 = parseInt(num3);

      // Función para ordenar los números de menor a mayor
      function ordenarMenorAMayor(a, b, c) {
        var arr = [a, b, c];
        arr.sort(function(x, y) {
            return x - y;
        });
        return arr;
      }

      // Función para ordenar los números de mayor a menor
      function ordenarMayorAMenor(a, b, c) {
        var arr = [a, b, c];
        arr.sort(function(x, y) {
            return y - x;
        });
        return arr;
      }

      // Verificar si los números son iguales
      if (num1 === num2 && num2 === num3) {
          console.log("Los números son iguales: " + num1 + ", " + num2 + ", " + num3);
      } else {
          // Identificar el mayor, el del medio y el menor
          var numerosOrdenadosMenorAMayor = ordenarMenorAMayor(num1, num2, num3);
          var numerosOrdenadosMayorAMenor = ordenarMayorAMenor(num1, num2, num3);
          var mayor = numerosOrdenadosMayorAMenor[0];
          var medio = numerosOrdenadosMayorAMenor[1];
          var menor = numerosOrdenadosMayorAMenor[2];

          // Imprimir los números ordenados
          console.log("Ordenados de mayor a menor: " + mayor + ", " + medio + ", " + menor);
          console.log("Ordenados de menor a mayor: " + numerosOrdenadosMenorAMayor.join(", "));
      }

      rl.close();
    });
  });
});
