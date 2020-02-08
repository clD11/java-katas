package language_proficiency;

import java.util.stream.Stream;

public class J11Streams {

    public void numPrint() {
        Stream<Integer> numStream = Stream.of(10, 20, 30);
        numStream.map(n -> n + 10).peek(s -> System.out.print(s));
        numStream.forEach(s -> System.out.println(s));
    }
}
