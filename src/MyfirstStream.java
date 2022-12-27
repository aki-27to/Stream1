/******streamsample3_リストから特定の文字数を抽出する********/

import java.util.List;
import java.util.stream.Collectors;

public class MyfirstStream {

    public static void main(String[] args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        System.out.println("■アルファベット順に出力する");
        List<String> sortedResult = names.stream().sorted().toList();
        System.out.println(sortedResult);
        System.out.println("\n");

        //最初の文字がyから始まる文字列の数を取得
        System.out.println("■yから始まる文字列がいくつあるかを表示する");
        long count = names.stream().filter(name -> name.startsWith("y")).count();
        System.out.println(count);
        System.out.println("\n");
        //yamada→tanakaと同じ文字列を取得したらtrueを表示、ない場合はfalseを表示
        System.out.println("■[tanaka]がいたら[true]を表示し、いなければ[false]を表示する");
        boolean hasYamada = names.stream().anyMatch(name -> name.equals("tanaka"));
        System.out.println(hasYamada);
        System.out.println("\n");


        //map
        System.out.println("■リストの中身を小文字から大文字に変換する");
        List<String> names2 = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(names2);

    }
}