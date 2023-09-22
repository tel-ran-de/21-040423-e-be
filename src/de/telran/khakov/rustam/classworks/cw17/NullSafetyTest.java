package de.telran.khakov.rustam.classworks.cw17;

import java.util.Optional;
import java.util.Random;

public class NullSafetyTest {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Optional<Jumper> jumperOpt = JumperGenerator.generate(random.nextInt(100));
            //jumperOpt.ifPresent(Jumper::jump);// Jumper jumper; jumper.jump()
            jumperOpt.ifPresentOrElse(Jumper::jump, () -> System.out.println("не удалось получить прыгуна"));
            jumperOpt.orElseGet(() -> new Jumper(0)).jump();// если емпти, то вернуть дефолтное
            String res = jumperOpt // null
                    .map(jumper -> jumper.getLength())
                    .map(x -> x + 5)
                    .map(x -> x - 3)
                    .flatMap(x -> Optional.ofNullable(x + 5))// сложное вычисление и он может вернуть опшанл Optional<Integer>
                    .filter(x -> x > 50)
                    .map(x -> "test str")
                    .orElse("null come");
            System.out.println(res);

            Optional.ofNullable(null).or(() -> Optional.of(4)).ifPresent(System.out::println);
            //
            // if (jumper != null){
            // jumper.jump();
            // } else{
            // sout("ne udalos");
            // }
        }
    }

}
