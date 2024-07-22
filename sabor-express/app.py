import os

restaurantes = [{'nome': 'Sabor de Minas', 'categoria': 'Comida Brasileira', 'ativo': False},
                {'nome': 'Sushi do Japa', 'categoria': 'Comida Japonesa', 'ativo': True},
                {'nome': 'Hamburgueria do Beco', 'categoria': 'Fast Food', 'ativo': True},
                ]

def exibir_nome_do_programa ():
    print("""
▒█▀▀▀█ █▀▀█ █▀▀▄ █▀▀█ █▀▀█ 　 ▒█▀▀▀ █░█ █▀▀█ █▀▀█ █▀▀ █▀▀ █▀▀
░▀▀▀▄▄ █▄▄█ █▀▀▄ █░░█ █▄▄▀ 　 ▒█▀▀▀ ▄▀▄ █░░█ █▄▄▀ █▀▀ ▀▀█ ▀▀█
▒█▄▄▄█ ▀░░▀ ▀▀▀░ ▀▀▀▀ ▀░▀▀ 　 ▒█▄▄▄ ▀░▀ █▀▀▀ ▀░▀▀ ▀▀▀ ▀▀▀ ▀▀▀
""")

def exibir_opcoes ():    
    print('1 - Cadastrar restaurante' )
    print('2 - Listar restaurantes' )
    print('3 - Ativar restaurante' )
    print('4 - Sair\n' )

def finalizar_app():
    os.system('cls')
    print('Finalizando o app')

def voltar_ao_menu_principal():
    input('\nDigite uma tecla para voltar ao menu principal ')
    main()

def exibir_subtitulo (texto):
    os.system('cls')
    print(texto)
    print

def escolher_opcao():   
    try:
        opcao_escolhida = int(input('Escolha uma opção: '))

        if opcao_escolhida == 1:
            exibir_subtitulo ('Cadastro de novos restaurantes')

            nome_do_restaurante = input('Digite o nome do restaurante que deseja cadastrar: ')
            restaurantes.append(nome_do_restaurante)
            print(f'O restaurante {nome_do_restaurante} foi cadastrado com sucesso!\n')

            voltar_ao_menu_principal()

        elif opcao_escolhida == 2:
            exibir_subtitulo("Listando os restaurantes\n")

            for restaurante in restaurantes:
                nome_do_restaurante = restaurante['nome']
                categoria = restaurante['categoria']
                print(f'- {nome_do_restaurante} │ {categoria}')

            voltar_ao_menu_principal()

        elif opcao_escolhida == 3:
            exibir_subtitulo('Ativar restaurante')
        elif opcao_escolhida == 4:
            finalizar_app()
        else:
            opcao_invalida()
    except:
        opcao_invalida()

def opcao_invalida():
   print('Opção inválida!')
   voltar_ao_menu_principal()

def main():
    os.system('cls')
    exibir_nome_do_programa()
    exibir_opcoes()
    escolher_opcao()

if __name__ == '__main__': 
    main()