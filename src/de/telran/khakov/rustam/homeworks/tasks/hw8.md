## Теория
1. В чем концептуальная разница между `LinkedList` и `ArrayList`?
2. Для каких задач лучше выбрать `LinkedList`, а когда `ArrayList`?
3. Какую информацию хранит каждая `Node` в `LinkedList`?
4. Можем ли мы добавить `null` в `LinkedList`?
5. Какая сложность вставки и удаления в `LinkedList`? какая у `ArrayList`?
## Практика

### Уровень 1

3. Реализуйте методы у  `MyArrayList`
* size()
* isEmpty()
* iterator()
* clear()
* get(int)
* set(int, Integer)
* contains(Object)
* indexOf(Object)
* lastIndexOf(Object) - проход с конца массива
* add(Integer)
### Уровень 2
1. Реализуйте методы у `MyArrayList`
* remove(Object)
* remove(int)
* add(int, Integer)
2. Если есть желание на данном этапе писать реализацию, то реализуйте какие-нибудь другие методы у `MyArrayList`

3. Если на данный момент есть еще желание понять как работает LinkedList можете реализовать методы на строке 157 класса `MyLinkedList` описано условие:
* findNodeByIndex(int) - сделать поиск с конца, если индекс находится во второй половине списка
* descendingIterator() - итератор из конца в начало
* listIterator() - итератор с дополнительной ссылкой на предыдущий
* toArray() - перевести в массив
* containsAll(Collection) - проверить содержатся ли все
* removeAll(Collection) - удалить все которые содержатся в коллекции
* lastIndexOf(Object)  - последний индекс входного элемента (идеально подходит итератор с конца в начало)
4. Если предыдущие показались легкими и/или хочется копнуть чутка глубже, то можете в `MyLinkedList`

* subList(int, int) - вернуть новый `MyLinkedList` который будет обрезан
* addAll(int, Collection) - добавить все начиная с какого-то индекса
* retainAll(Collection) - удалить все что не содержится во входной коллекции