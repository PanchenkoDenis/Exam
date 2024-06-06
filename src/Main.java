public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Alex", "Popov", "Popovich", 1, 9800);
        employees[1] = new Employee("Boris", "Animal", "Popovich", 2, 10233);
        employees[2] = new Employee("Alesha", "Popovich", "Popovich", 3, 11108);
        employees[3] = new Employee("Bear", "MCriry", "Popovich", 4, 8800);
        employees[4] = new Employee("Tom", "Jerov", "Popovich", 3, 15798);
        employees[5] = new Employee("Misha", "Mishov", "Popovich", 2, 9453);
        employees[6] = new Employee("Troy", "Malfoy", "Popovich", 1, 8904);
        employees[7] = new Employee("Emily", "Tir", "Popovich", 2, 17870);
        employees[8] = new Employee("Anna", "Petrova", "Popovich", 3, 13258);
        employees[9] = new Employee("Dori", "Fish", "Popovich", 4, 14867);
        info();
        getAllEmployees();
        info();
        getMinSalary();
        getMaxSalary();
        getAverageSalaryEmployres();
        getSumSalaryPerMonth();
        info();
        getFullNameEmployees();
        info();
        getNewSalaryByPersent();
        info();
        getMinSalaryDepartment_2();

    }

    public static void info() {
        System.out.println("-----------");
    }

    public static void getAllEmployees() {
        if (employees != null) {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    public static double getSumSalaryPerMonth() {
        double sum = 0;
        for (Employee employee : employees) {
            //if (employee == null) continue;
            sum += employee.getSalary();
        }

        System.out.println("Summa: " + sum);
        return sum;

    }

    public static Employee getMinSalary() {
        double min = 0;
        int index = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee minSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                minSalary = employees[i];
            }
        }
        System.out.println("Minimum: " + minSalary);
        return minSalary;
    }

    public static Employee getMaxSalary() {
        double max = 0;
        int index = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                max = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee maxSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                maxSalary = employees[i];
            }
        }
        System.out.println("Maksimum: " + maxSalary);
        return maxSalary;
    }

    public static double getAverageSalaryEmployres() {
        double average;
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        average = sum / employees.length;
        System.out.println("Middle: " + average);
        return average;
    }

    public static void getFullNameEmployees() {
        if (employees != null) {
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i].getFullName());
            }
        }
    }
    public static void getNewSalaryByPersent() {
        double indexByPercent;
        for (int i = 0; i < employees.length; i++) {
            indexByPercent = employees[i].getSalary() * 1.25;
            System.out.println("увеличение зарплаты на 25 процентов: " + indexByPercent);

        }
    }
    public static Employee getMinSalaryDepartment_2() {
        double min = 0;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                min = employees[i].getSalary();
                index = i;
                break;
            }
        }
        Employee minSalary = employees[index];
        for (int i = index; i < employees.length; i++) {
            if (employees[i].getDepartment() != 2) continue;
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                minSalary = employees[i];
            }
        }
        System.out.println("Minimum in 2: \n"  + minSalary);
        return minSalary;
    }

}
