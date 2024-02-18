public class Validation {
    public static void valid(String[] str){
        if (str.length != 6) {
            throw new RuntimeException("Введено некорректное количество данных");
        }

        if (str[0] instanceof String && str[1] instanceof String && str[2] instanceof String){

        }else{
            throw new RuntimeException("ФИО введено не строковым значением");
        }

        String patternDate = "\\d{2}+\\.\\d{2}\\.\\d{4}";
        boolean date = str[3].matches(patternDate);

        if(date==false){
            throw new RuntimeException("неверный формат даты рождения");
        }

        String patternNum = "\\d{11}";
        boolean num = str[4].matches(patternNum);

        if(num==false){
            throw new RuntimeException("неверный формат номера телефона");
        }

        if (str[5].equals("f") || str[5].equals("m")){

        }else{
            throw new RuntimeException("Неверно введен параметр пола.");
        }
    }
}
