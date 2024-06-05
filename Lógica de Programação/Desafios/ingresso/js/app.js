<<<<<<< HEAD
function comprar () {
    let tipo = document.getElementById('tipo-ingresso');
    let qtd = document.getElementById('qtd');

    if(tipo.value == 'Pista') {
        comprarPista(qtde.value);
=======
function comprar() {
    let tipo = document.getElementById('tipo-ingresso');
    let qtd = parseInt(document.getElementById('qtd').value);

    if(tipo.value == 'pista'){
        comprarPista(qtd);
    } else if (tipo.value == 'superior'){
        comprarSuperior(qtd);
    }else {
        comprarInferior(qtd);
>>>>>>> 96bc5b6ca3eb0da93f7e45c65d0fe1d0e93feb17
    }
}

function comprarPista(qtd){
<<<<<<< HEAD
    let qtdPista = document.getElementById('qtd-pista');
    if (qtd > qtdPista) {
        alert('Quantidade indisponível para tipo pista')
=======
    let qtdPista = parseInt(document.getElementById('qtd-pista').textContent);
    if (qtd > qtdPista) {
        alert('Quantidade indisponível para tipo pista');
    } else {
        qtdPista = qtdPista - qtd;
        document.getElementById('qtd-pista').textContent = qtdPista;
        alert('Compra realizada com sucesso');
    }
}

function comprarSuperior(qtd){
    let qtdSuperior = parseInt(document.getElementById('qtd-superior').textContent);
    if (qtd > qtdSuperior) {
         alert('Quantidade indisponível para tipo superior');
    } else {
        qtdSuperior = qtdSuperior - qtd;
        document.getElementById('qtd-superior').textContent = qtdSuperior;
        alert('Compra realizada com sucesso');
    }
}

function comprarInferior(qtd){
    let qtdInferior = parseInt(document.getElementById('qtd-inferior').textContent);
    if (qtd > qtdInferior) {
         alert('Quantidade indisponível para tipo inferior');
    } else {
        qtdInferior = qtdInferior - qtd;
        document.getElementById('qtd-inferior').textContent = qtdInferior;
        alert('Compra realizada com sucesso');
>>>>>>> 96bc5b6ca3eb0da93f7e45c65d0fe1d0e93feb17
    }
}