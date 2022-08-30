package ru.geekbrains.lesson1;

public class Escape {
    public static void main(String[] args) {
        String header = "\n\tНЬЮ_ЙОРК ПРОГНОЗ НА 3 ДНЯ:\n";
        header += "\n\tДЕНЬ\t\tМакс\tМин\t\tОсадки\n";
        header += "\t-----\t\t----\t----\t----------\n";

        String forecast = "\tВоскресенье\t68F\t\t48F\t\tЯсно\n";
        forecast += "\tПонедельник\t69F\t\t57F\t\tЯсно\n";
        forecast += "\tВторник\t\t71F\t\t50F\t\tОблачность\n";
        System.out.print(header + forecast);
    }
}
