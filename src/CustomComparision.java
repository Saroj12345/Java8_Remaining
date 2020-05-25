import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomComparision {

    public static void main(String[] args) {
        List<Map<String, Salary>> list = new ArrayList<>();
        Map<String, Salary> dataMap = new HashMap<>();
        dataMap.put("1", new Salary(new BigDecimal(60000)));
        dataMap.put("2", new Salary(new BigDecimal(20000)));
        dataMap.put("3", new Salary(new BigDecimal(10000)));
        dataMap.put("4", new Salary(new BigDecimal(5000)));
        dataMap.put("5", new Salary(new BigDecimal(1000)));

        list.add(dataMap);

        /*list.stream().forEach(map -> map.values().stream().sorted(Comparator.comparing(Salary::getSalary)).map(Salary::getSalary)
                .forEach(System.out::println));*/

       //list.stream().forEach(stringSalaryMap -> stringSalaryMap.values().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println));
    }
}

class Salary {

    BigDecimal salary;

    public Salary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }


}

