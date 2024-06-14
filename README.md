## Mail Service

Mail Service предназначен для обработки и отправки email уведомлений.

### Требования

- Java 21
- Maven 3.9.6
- RabbitMQ

### Настройка RabbitMQ

1. Установите RabbitMQ.
2. Запустите RabbitMQ:
```bash
rabbitmq-server
```
4. Создайте очередь mail_queue:
```bash
rabbitmqadmin declare queue name=mail_queue durable=true
```
### Запуск mail-service
1. Клонируйте репозиторий:
```bash
git clone https://github.com/your-repo/mail-service.git
```
2. Перейдите в директорию проекта:
```bash
cd mail-service
```
3. Соберите проект с помощью Maven:
```bash
mvn clean install
```
4. Запустите приложение:
```bash
java -jar target/mail-service-0.0.1-SNAPSHOT.jar
```

### Настройка application.yaml
```yaml
spring:
      rabbitmq:
        host: localhost
        port: 5672
        username: guest
        password: guest
      mail:
        host: org.springframework.mail.javamail.JavaMailSender;
        port: 465
        username: your-email
        password: your-password
        properties:
          mail:
            smtp:
              auth: true
              starttls:
                enable: true   
```
