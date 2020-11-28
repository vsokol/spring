### Создание веб-приложений на Spring Framework
Разработать микросервис c RestController'ом содержащим методы обрабатывающие HTTP GET, POST, PUT, DELETE запросы.

Микросервис предоставляет следующие методы:
- Получение списка компаний акции, которых можно приобрести.  
GET запрос - http://localhost:8080/stock
- Получение детальной информации о компании по ее тикеру.  
GET запрос - http://localhost:8080/stock/{ticker}, например, http://localhost:8080/stock/AAPL
- Добавить новую инфомацию о новой компании. POST запрос, который можно выполнить, например, в браузере Chrome, включив режим разработчика или через любой другой REST client.  
Добавить компанию Microsoft через Chrome можно следующей командой  
> fetch('/stock', {method: 'POST', headers: {'Content-Type': 'application/json'}, body: JSON.stringify({"ticker":"MSFT","name":"MICROSOFT CORP.","price":215.23,"ratioPE":34.50})}).then(console.log)
