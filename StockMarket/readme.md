### Создание веб-приложений на Spring Framework
Разработать микросервис c RestController'ом содержащим методы обрабатывающие HTTP GET, POST, PUT, DELETE запросы.

Добавить акции компании Microsoft
fetch('/stock', {method: 'POST', headers: {'Content-Type': 'application/json'}, body: JSON.stringify({"ticker":"MSFT","name":"MICROSOFT CORP.","price":215.23,"ratioPE":34.50})}).then(console.log)
