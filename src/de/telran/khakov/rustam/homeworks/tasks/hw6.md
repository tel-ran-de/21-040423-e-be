## Теория
1. Что такое Set/List/Queue и для чего они нужны? это интерфейсы или классы?
2. Что такое ArrayList? 
3. Что гарантирует Set? Что не гарантирует? 
4. Что не гарантирует List? Что гарантирует?
5. Что стоит во главе иерархии Java Collection Framework?
6. Какой вспомогательный класс есть для работы с массивами?
7. Можно ли написать следующую конструкцию? `Collection<int> col = new ArrayList<>();`
8. В чем разница между двумя подходами?
```java
    for (int i = 0; i < array.length; i++) {
    //тут логика
    }

    for (int i : array) {
        //тут логика
    }
```
## Практика
### Level 1
1. Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. 
2. Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз. 
Замерьте время, которое потрачено на это. 
Сравните результаты и предположите, почему они именно такие.
Как замерить время:

``` java
    long before = System.currentTimeMillis();
    //здесь написать код выполнения
	long after = System.currentTimeMillis();
	System.out.println(after - before);
```

3. Введите с клавиатуры в List пять значений Integer. Выведите их в одну строку через запятую. Получите для List среднее арифметическое. 
4. Напишите метод sort который будет сортировать List методом вставки (было в классной работе 5)
5. Дан List названий товаров, выпускаемых заводом. Определите, повторяется ли в этом List название первого товара,
   и, если повторяется, удалите все названия первого товара из List.
### Level 2
1. Задан список фамилий брокеров товарной биржи из N человек. Поменяйте местами фамилии брокеров: первого и последнего, второго и предпоследнего, третьего от начала и третьего от конца и т.д. 
2. Попробуйте реализовать алгоритм бинарного поиска описанного на последнем слайде 
3. Составьте программу, облегчающую работу секретаря. Создайте объект Person с двумя параметрами имя, фамилия и номер телефона.
Создайте List<Person> и заполните его объектами Person.
Напишите программу, которая будет искать номера телефонов по введенной фамилии.
Например в листе <Пупкин Вася 987654 >,<Пупкин Петя 987987>,<Пенков Вася 123456> при поиске по `Пупкин` результатом будет List<Integer> : <987654>,<987987>