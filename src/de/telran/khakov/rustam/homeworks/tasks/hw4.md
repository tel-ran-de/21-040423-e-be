## Теория
1. Что является объектом в java?
2. Как определяется какой метод будет вызван в случае передачи туда примитива? объекта?
3. Что такое autoboxing и unboxing? 
4. Почему не стоить сравнивать через `==`
5. Сколько весит в памяти ссылка?
6. Почему объекты называются ссылочными типами данных?
## Практика
### Уровень 1
1. Создайте свой enum Alphabet
   заполните его буквами от A до Z
   напишите метод который вернет порядковый номер буквы, запустите метод на енамах Alphabet.K, Alphabet.O, Alphabet.Z 
2. Имеется 
   - `Tire`(шины) двух видов - зимняя и летняя, 
   - есть `Auto` с параметром года выпуска, марка и модель, 4 шины, так же имеется 4 вида машин - электрическая, бензиновая, дизельная 
   и гибрид(одновременно бензин и электричество), машины умеют ехать, ломаться, включаться 
   - имеется `AutoService` и реализация `ModernAutoService` который умеет чинить машину и менять шины
Для реализации можно использовать interfaces, abstact class, class, enum, подумайте что можно использовать для решения данной задачи 
3. Добавьте класс банкомат, который может принимать карту, проверять баланс, выдавать и получать деньги (учтите что в банкомате ограниченное количество денег)
Используйте `CreditCard` из предыдущей домашней работы, добавьте реализацию банкомата (`SimpleATM`), подумайте что стоит пометить словом final
### Уровень 2
1. Задача направлена подумать и на понимание кода написанного другим разработчиком, ваша задача подумать как можно данный код разнести по классам и методам. Для решения можно применять классы, энамы, интерфейсы и все что душе угодно
Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n игроков (по 5 карт каждому) из рассортированной колоды.
Разделяйте пять карт, выданных каждому игроку, пустой строкой.

```
public class Deal {
public static void main(String[] args) {

        final int cardsForPlayer = 5;
        int players;

        final Scanner sc = new Scanner(System.in);
        final Random random = new Random();

        final String[] suits = {"clubs", "diamonds", "hearts", "spades"};
        final String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        final int numberOfCards = suits.length * rank.length; // number of cards

        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= numberOfCards) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }

        // deck initialization
        String[] deck = new String[numberOfCards];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }

        // deck shuffling
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }

        // the shuffled deck is displayed
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }
}
```