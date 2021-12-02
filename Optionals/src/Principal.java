import java.util.Optional;

public class Principal {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor presente");
        System.out.println("Valor que está presente:");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor opcional que não está presente:");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = Não está presente"));

        Optional<String> optionalEmpty = Optional.empty();
        System.out.println("Valor opcional que não está presente:");
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("empty = Não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);
        System.out.println("Valor opcional que lança erro - nullPointer");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = Não está presente"));
    }
}
