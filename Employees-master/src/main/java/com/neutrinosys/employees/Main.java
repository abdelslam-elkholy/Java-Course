package com.neutrinosys.employees;

import java.text.NumberFormat;
import java.util.*;
import java.util.regex.Matcher;

public class Main {

    private static Set<IEmployee> employees;
    private static Map<String, Integer> salaryMap;

    public static void main(String[] args) {
//        String peopleText = """
//            Flinstone, Fred, 1/1/1900, Programmer, {locpd=2500,yoe=10,iq=140}
//            Flinstone, Fred, 1/1/1900, Programmer, {locpd=4000,yoe=10,iq=140}
//            Flinstone, Fred, 1/1/1900, Programmer, {locpd=5000,yoe=10,iq=140}
//            Flinstone, Fred, 1/1/1900, Programmer, {locpd=6000,yoe=10,iq=140}
//            Flinstone, Fred, 1/1/1900, Programmer, {locpd=7000,yoe=10,iq=140}
//            Flinstone, Fred, 1/1/1900, Programmer, {locpd=9000,yoe=10,iq=140}
//            Flinstone, Fred, 1/1/1900, Programmerzzzzz, {locpd=10000,yoe=10,iq=140}
//            Flinstone2, Fred2, 1/1/1900, Programmer, {locpd=1300,yoe=14,iq=100}
//            Flinstone3, Fred3, 1/1/1900, Programmer, {locpd=2300,yoe=8,iq=105}
//            Flinstone4, Fred4, 1/1/1900, Programmer, {locpd=1630,yoe=3,iq=115}
//            Flinstone5, Fred5, 1/1/1900, Programmer, {locpd=5,yoe=10,iq=100}
//            Rubble, Barney, 2/2/1905, Manager, {orgSize=300,dr=10}
//            Rubble2, Barney2, 2/2/1905, Manager, {orgSize=100,dr=4}
//            Rubble3, Barney3, 2/2/1905, Manager, {orgSize=200,dr=2}
//            Rubble4, Barney4, 2/2/1905, Manager, {orgSize=500,dr=8}
//            Rubble5, Barney5, 2/2/1905, Manager, {orgSize=175,dr=20}
//            Flinstone, Wilma, 3/3/1910, Analyst, {projectCount=3}
//            Flinstone2, Wilma2, 3/3/1910, Analyst, {projectCount=4}
//            Flinstone3, Wilma3, 3/3/1910, Analyst, {projectCount=5}
//            Flinstone4, Wilma4, 3/3/1910, Analyst, {projectCount=6}
//            Flinstone5, Wilma5, 3/3/1910, Analyst, {projectCount=9}
//            Rubble, Betty, 4/4/1915, CEO, {avgStockPrice=300}
//            """;
        String peopleText = """
            Flinstone, Fred, 1/1/1900, Programmer, {locpd=2500,yoe=10,iq=140}
            Flinstone, Fred, 1/1/1900, Programmerzzzzz, {locpd=10000,yoe=10,iq=140}
            Flinstone2, Fred2, 1/1/1900, Programmer, {locpd=1300,yoe=14,iq=100}
            Flinstone3, Fred3, 1/1/1900, Programmer, {locpd=2300,yoe=8,iq=105}
            Flinstone4, Fred4, 1/1/1900, Programmer, {locpd=1630,yoe=3,iq=115}
            Flinstone5, Fred5, 1/1/1900, Programmer, {locpd=5,yoe=10,iq=100}
            Rubble, Barney, 2/2/1905, Manager, {orgSize=300,dr=10}
            Rubble2, Barney2, 2/2/1905, Manager, {orgSize=100,dr=4}
            Rubble3, Barney3, 2/2/1905, Manager, {orgSize=200,dr=2}
            Rubble4, Barney4, 2/2/1905, Manager, {orgSize=500,dr=8}
            Rubble5, Barney5, 2/2/1905, Manager, {orgSize=175,dr=20}
            Flinstone, Wilma, 3/3/1910, Analyst, {projectCount=3}
            Flinstone2, Wilma2, 3/3/1910, Analyst, {projectCount=4}
            Flinstone3, Wilma3, 3/3/1910, Analyst, {projectCount=5}
            Flinstone4, Wilma4, 3/3/1910, Analyst, {projectCount=6}
            Flinstone5, Wilma5, 3/3/1910, Analyst, {projectCount=9}
            Rubble, Betty, 4/4/1915, CEO, {avgStockPrice=300}
            """;



        Matcher peopleMat = Employee.PEOPLE_PAT.matcher(peopleText);
        ArrayList<IEmployee> emps = new ArrayList<>();

        int totalSalaries = 0;
        IEmployee employee = null;
        employees = new TreeSet<>((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary()));
        salaryMap = new LinkedHashMap<>();
        while (peopleMat.find()) {
            employee = Employee.createEmployee(peopleMat.group());
            Employee emp = (Employee) employee;
//            emp.greet((f,l) -> System.out.printf("Hello, my name is %s %s%n", f, l));
//            boolean add = employees.add(employee);
//            salaryMap.put(emp.firstName, emp.getSalary());
            emps.add(emp);
        }

//        Collections.sort(emps , Comparator.naturalOrder());
        Collections.sort(emps , Comparator.reverseOrder());
//        Collections.sort(emps ,(t1, t2) -> {
//            if (t1 instanceof Employee emp1 && t2 instanceof Employee emp2)
//            {
//                int result = emp1.lastName.compareTo(emp2.lastName);
//
//                return result !=0 ? result : Integer.compare(emp1.getSalary() , emp2.getSalary());
//            }
//            return 0;
//        } );

//        emps.sort((t1, t2) -> {
//            if (t1 instanceof Employee emp1 && t2 instanceof Employee emp2)
//            {
//                int result = emp1.lastName.compareTo(emp2.lastName);
//
//                return result !=0 ? result : Integer.compare(emp1.getSalary() , emp2.getSalary());
//            }
//            return 0;
//        });
//        Collections.shuffle(emps);
        for (IEmployee worker : emps) {
            System.out.println(worker.toString());
            totalSalaries+= worker.getSalary();
        }

//        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
//        System.out.printf("The total payout should be %s%n", currencyInstance.format(totalSalaries));
//        System.out.println(employees.size());
//        System.out.println(salaryMap.entrySet());

        IEmployee emp1 = Employee.createEmployee("Flinstone, Wilma, 3/3/1910, Analyst, {projectCount=3}");
        IEmployee myEmp = emps.get(1);
        System.out.println(emp1.equals(myEmp));
        System.out.println(emps.contains(emp1));

    }




    private static void removeUndesirables(List<IEmployee> employees, List<String> removalNames) {
        for (Iterator<IEmployee> it = employees.iterator(); it.hasNext();) {
            IEmployee worker = it.next();
            if (worker instanceof Employee tmpWorker) {
                if (removalNames.contains(tmpWorker.firstName)) {
                    it.remove();
                }
            }
        }
    }

    public int getSalary(String firstName) {
        return salaryMap.getOrDefault(firstName, -1);
    }

}
