package domain;
/**
 * Клас Artist представляє працівника, який є художником,
 * та маж набір навичок skills.
*/
public class Artist extends Employee {
    /**
     * Створює об'єкт Artist з вказаними навичками, іменем, посадою, рінем і відділом.
     * 
     * @param skiils масив навичок
     * @param name ім'я художника
     * @param jobtitle посада
     * @param level рівень працівника
     * @param dept відділ
    */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    /**
     * Створює об'єкт Artist із заданим масивом навичок. Інші поля встановлюються за замовчуванням.
     * 
     * @param skiils масив навичок
    */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    /**
     * Конструктор за замовчуванням. Створює Artist з масивом навичок розміром 10.
    */
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    /**
     * Повертає текстове представлення об'єкта Artist.
     * 
     * @return рядок з інформацією про працівника та його навички
    */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    /**
     * Повертає навички зудожника у вигляді рядка, розділеного комами.
     * 
     * @return рядок з навичками
    */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * Встановлює масив навичок.
     * 
     * @param skills масив навичок
    */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * ПОвертає масив навичок.
     * 
     * @return масив навичок
    */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
