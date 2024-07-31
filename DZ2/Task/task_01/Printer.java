/**Дана строка sql-запроса:

 select * from students where "

 Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. Если значение null, то параметр не должен попадать в запрос.

 Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

 String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами

 Пример: Строка sql-запроса:

 select * from students where

 Параметры для фильтрации:

 {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

 Результат:

 select * from students where name='Ivanov' and country='Russia' and city='Moscow  */


class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже

        StringBuilder sb = new StringBuilder(QUERY);
        String str = PARAMS.replace("{", "")
                .replace("}","")
                .replace(" ","").replace("\"","");

        String name = str.split(",")[0].split(":")[1];
        String country = str.split(",")[1].split(":")[1];
        String city = str.split(",")[2].split(":")[1];
        String age= str.split(",")[3].split(":")[1];

        if (!name.equals("null")){
            sb.append("name=").append("'").append(name).append("'").append(" and ");}
        sb.append("");


        if (!country.equals("null")){
            sb.append("country=").append("'").append(country).append("'").append(" and ");}
        sb.append("");


        if (!city.equals("null")){
            sb.append("city=").append("'").append(city).append("'").append(" and ");}
        sb.append("");


        if (!age.equals("null")){
            sb.append("age=").append("'").append(age).append("'").append(" and ");}
        sb.append("");


if(!(QUERY.length() == sb.length()))
        sb = new StringBuilder(sb.substring(0, sb.length() - 5));

        return sb;
    }

}



public class Printer{
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}
