function comprar () {
    let tipo = document.getElementById('tipo-ingresso');
    let qtd = document.getElementById('qtd');

    if(tipo.value == 'Pista') {
        comprarPista(qtde.value);
    }
}

function comprarPista(qtd){
    let qtdPista = document.getElementById('qtd-pista');
    if (qtd > qtdPista) {
        alert('Quantidade indisponível para tipo pista')
    }
}