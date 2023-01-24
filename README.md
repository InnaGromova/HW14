# Проект по автоматизации тестирования сайта "Top selection"

## Содержание

>
> ➠ [Реализованные проверки](#реализованные-проверки)
>
> ➠ [Запуск тестов из терминала](#запуск-тестов-из-терминала)
>
> ➠ [Запуск тестов в Jenkins](#запуск-тестов-из-jenkins)
>
> ➠ [Уведомления в Telegram](#уведомления-в-telegram)
>
> ➠ [Пример запуска теста](#пример-запуска-теста)

В данном проекте автотесты написаны на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.
>
> <code>Selenoid</code> выполняет запуск браузеров в контейнерах <code>Docker</code>.
>
> <code>Allure Report</code> формирует отчет о запуске тестов.
>
> Для автоматизированной сборки проекта используется <code>Gradle</code>.
>
> В качестве библиотеки для модульного тестирования используется <code>JUnit 5</code>.
>
> <code>Jenkins</code> выполняет запуск тестов.
> После завершения прогона отправляются уведомления с помощью бота в <code>Telegram</code>.

## Реализованные проверки

> Разработаны автотесты на <code>UI</code>.
### UI

- [x] Проверка заголовка главной страницы
- [x] Проверка главного меню
- [x] Проверка перехода по страница главного мею
- [x] Проверка переключения языка
- [x] Проверка отсутствия ошибок в консоли

## Запуск тестов из терминала

### Локальный запуск тестов

```
gradle clean test
```

### Удаленный запуск тестов

```
gradle clean test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://user1:1234@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}
```

### Параметры сборки

> <code>REMOTE_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.
>
> <code>BROWSER</code> – браузер, в котором будут выполняться тесты (_по умолчанию - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты (_по умолчанию - <code>91.0</code>_).
>
> <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты (_по умолчанию - <code>1920x1080</code>_).

## Запуск тестов из Jenkins

*Для запуска сборки необходимо указать значения параметров и нажать кнопку <code><strong>*Собрать*</strong></code>.*

<p align="center">
  <img src="image/Собрать с параметрами.jpg" width="800">
</p>

*Для перехода к просмотру отчета в разделе "История сборок" нажать значок "Allure Report", откроется страница с отчетом по прохождению.*

<p align="center">
  <img src="image/Переход к отчету.jpg" width="800">
</p>


### Allure-отчет

<p align="center">
<img title="Allure Overview" src="image/Отчет.jpg" width="800">
</p>

### Тест-кейсы

<p align="center">
<img title="Allure Behaviors" src="image/Тест-кейсы.jpg" width="800">
</p>

## Уведомления в Telegram

> После завершения сборки, Вам будет отправлено уведомление в Telegram с отчетом о прохождении.

<p align="center">
<img title="Telegram Notifications" src="image/Уведомление.jpg" width="800">
</p>

## Пример запуска теста.

> Для каждого тест-кейса будет записано видео прохождения. Пример:
<p align="center">
  <img title="Selenoid Video" src="image/Пример.gif" width="800">
</p>


