public class HerancaPolimorfismo {

    public static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee) {
        System.out.printf("------%s------ \n", employee.getClass().getCanonicalName());
        switch (employee) {
            case Manager manager -> {
                manager.setCode("111");
                manager.setName("AAA");
                manager.setSalary(500);
                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getSalary());
            }
            case Salesman salesman -> {
                salesman.setCode("222");
                salesman.setName("BBB");
                salesman.setSalary(1000);
                System.out.println(salesman.getCode());
                System.out.println(salesman.getName());
                System.out.println(salesman.getSalary());
            }
        }
        System.out.println("---------------------\n");
    }
}