/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var espacios = [["NO", "NO", "NO"],
    ["NO", "NO", "NO"],
    ["NO", "NO", "NO"],
    ["NO", "NO", "NO"]];

function obtenerEspacio(coordenadaI, coordenadaJ, tipoEspacio) {

    espacios[coordenadaI][coordenadaJ] = tipoEspacio;
    mostrarMatriz();

}

function modificarMatriz(){
    
}

function mostrarMatriz() {

    for (var i = 0; i < 4; i++) {
        for (var j = 0; j < 3; j++) {
            console.log(espacios[i][j]+" ");
        }
        console.log();
    }
}

