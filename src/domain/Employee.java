package domain;

/**
 * Клас Employee представляє співробітника компанії з унікальним ID, іменем, посадою, рівнем та відділом.
*/
public class Employee {
    /**
     * Представляє рядкове представлення об'єкта Employee.
     * 
     * @return інформація про працівника у вигляді рядка
    */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
    /**
     * Повний конструктор класу Employee.
     * 
     * @param name ім'я співробітника
     * @param jobTitle посада
     * @param level рівень працівника (1-3), інше значення замінюються на 1
     * @param dept відділ
    */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    /**
     * Конструктор без параметрів. Автоматично генерує випадковий ID (0-999).
    */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
    /**
     * Встановює посаду
     * 
     * @param job назва посади
    */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    /**
     * Повертає посаду.
     * @return назва посади
    */
    public String getJobTitle() {
        return jobTitle;
    }
    /**
     * Повертає ім'я працівника.
     * 
     * @return ім'я
    */
    public String getName() {
        return name;
    }
    /**
     * Встановлює рівень працівника.
     * @param level рівень
    */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    /**
     *Повертає рівень працівника.
     *  @return рівень
    */
    public int getLevel() {
        return level;
    }
    /**
     * Повертає відділ працівника
     * @return назва відділу
    */
    public String getDept() {
        return dept;
    }
    /**
     * Встановлює назву відділу
     * @param dept назва відділу
    */
    public void setDept(String dept) {
        this.dept = dept;
    }
    /**
     * Встановлює ім'я працівника, якщо воно відповідає шаблону.
     * @param name ім'я працівника
    */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
