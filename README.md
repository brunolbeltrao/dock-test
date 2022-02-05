# dock-test

Para acessar a aplicação via postman, por exemplo:
https://bruno-dock-test.herokuapp.com/terminais

-Para incluir o registro
Enviar via "post" no body o texto abaixo:
44332212;1111;PWWIN;1;F04A2E4088B;4;8.00b3;0;16777216;PWWIN

-Para fazer uma requisição GET
https://bruno-dock-test.herokuapp.com/terminais/44332212

-Para Alterar via put
Enviar o body por Json, exemplo:
{
    "logic": 44332212,
    "serial": "1",
    "model": "PN",
    "sam": 1,
    "ptid": "F04A2E4088B",
    "plat": 4,
    "version": "8.00b3",
    "mxr": 0,
    "mxf": 16777216,
    "pverfm": "PWWIN"
}
