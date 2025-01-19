package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceDemo {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Newton", "Faraday", "Khwarizmi");

        list.forEach(scientist -> System.out.println(scientist));
        //method reference
        // use method without invoking & in-place of lambda expression ::
        list.forEach(System.out::println);

        // constructor reference
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).collect(Collectors.toList());

    }
}

class MobilePhone {
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}
