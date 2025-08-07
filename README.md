# University Stats Export

 Java-проект для анализа успеваемости студентов и университетов с возможностью экспорта статистики в Excel.

##  Описание

Проект позволяет:
- Сортировать студентов и университеты по различным критериям
- Группировать студентов по профилям обучения
- Вычислять средний балл, количество студентов и университетов на профиль
- Экспортировать результат в Excel-файл (`.xlsx`)

## Архитектура

- `model` — модели данных (`Student`, `University`, `StudyProfile`, `Statistics`)
- `comparator` — компараторы для сортировки
- `util` — утилиты: `ComparatorUtil`, `StatisticsUtil`, `XlsWriter`
- `Main.java` — точка входа с примером использования

## Зависимости

Используются библиотеки:
- [`Apache Commons Lang`](https://commons.apache.org/proper/commons-lang/)
- [`Apache POI`](https://poi.apache.org/) — для генерации Excel-файлов

Указаны в `pom.xml`:
```xml
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.5</version>
</dependency>
