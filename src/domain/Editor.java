package domain;

/**
 * Клас Editor успадковує Artist і представляє редактора з можливістю вибору типу редагування: електроне або паперове.
*/
public class Editor extends Artist {
    /**
     * Конструктор створює Editor з усіма параметрами.
     * 
     * @param electronicEditing true, якщо електроне редагування; false - паперове
     * @param skiils масив навичок
     * @param name ім'я редактора
     * @param jobTitle посада
     * @param level рівень працівника
     * @param dept відділ
    */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
    /**
     * конструктор створює Editor з навичками та типом редагування, інші параметри - за замовчуванням.
     * 
     * @param electronicEditing true - електроне редагування
     * @param skiils масив навичок
    */

    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
    /**
     * Конструктор створює Editor лише з типом редагування.
     * 
     * @param electronicEditing true - електроне редагування
    */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    /**
     * Конструктор без параметрів. За замовчуванням використовуюється електроне редагування.
    */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
    /**
     * Повертає рядкове представлення об'єкта Editor, включаючи тип редагування.
     * 
     * @return рядок з описом редактора
    */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
    /**
     * Повертає тип редагування.
     * 
     * @return true, якщо електронне редагування; false - паперове
    */
    public boolean getPreferences() {
        return electronicEditing;
    }
    /**
     * Встановлює тип редагування
     * 
     * @param electronsc true - електроне редагування, false - паперове
    */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
