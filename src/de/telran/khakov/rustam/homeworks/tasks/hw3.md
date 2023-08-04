## Теория
1. Что такое интеррфейс?
2. Что такое сигнатура метода?
3. Может ли быть 2 метода с одинаковой сигнатурой внутри одного класса?
4. В чем разница между переопределением (Override) и перегрузкой(Overload)?
5. Можно ли имплементировать несколько интерфейсов?
6. В чем отличие интерфейса от абстрактного класса?
7. Что такое enum?
8. Какое правило наименование переменных в enum?
9. Можно ли унаследоваться от какого-то класса в enum? что по поводу interface? 

## Практика
### Уровень 1
1. Создайте `enum` для обозначения сторон света и протестируйте различные методы у `enum`

2. Несколько имплементаций одного интерфейса.
   Дан класс:
```java
class DayOfTheWeekDetectorIfVersion {

	// Try to use switch here!!
	public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
```

Создайте для этого класса интерфейс `DayOfTheWeekDetector`.
Сделайте так, чтобы класс `DayOfTheWeekDetectorIfVersion` реализовывал интерфейс DayOfTheWeekDetector.

Создайте вторую имплементацию данного интерфейса основанную на switch операторе.

Если сможете, то создайте третью имплементацию основанную на массиве строк.
Индекс массива = номеру дня недели, а значение в ячейке массива это название соответствующего
дня недели.

Протестируйте все имплементации.

3. Создайте `enum` для дней недели и добавьте `EnumDayOfTheWeekDetector`
   Данный класс будет возвращать название дня недели используя методы из `enum` (есть множество способов, подумайте как можно реализовать)

4. создайте интерфесы `Dancable`, `Singable` добавьте класс `Dancer` который имплементируют интерфейс `Dancable`
   добавьте `Singer` implements `Singable`, добавьте `PopSinger` implements `Singable`,`Dancable`

### Уровень 2

1. Создайте реализацию следующего интерфейса.
```java
interface ProductDatabase {
    void save(Product product);
    Product findByTitle(String productTitle);
}
```

Класс должен называться `InMemoryDatabase` и хранить продукты в памяти
используя для этого массив.

Метод `void save(Product product)` должен добавлять новый продукт в массив.
Это можно сделать так:
- создаём новый массив длиннее предыдущего на 1;
- копируем все содержимое старого массива в новый;
- в последнюю ячейку нового массива сохраняем новый продукт.

Метод Product `findByTitle(String productTitle)` должен проходить
по массиву и находить первый встретившийся продукт с указанным
названием и возвращать его. Если продукт с указанным названием
не найден, то возвращать null.

Обязательно протестируйте созданную вами реализацию интерфейса Database.
```java
class Product {
    private String title;
    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
```

2. Создайте класс `DanceFloor` в методе `main` создайте экземпляры
```
Dancable firstDancer = new Dancer();
Dancable secondDancer = new PopDancer();
```
Создайте массив `Dancable[]` и добавьте 6 танцоров,
пройдитесь по каждому из них и вызовите метод для танца