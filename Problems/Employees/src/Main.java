class Employee {

    String name;
    String email;
    int experience;

    Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }

    static <T> T[] safeClone(T[] array) {
        return array == null ? null : array.clone();
    }
}

class Developer extends Employee {

    String mainLanguage;
    String[] skills;

    Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = safeClone(skills);
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return safeClone(skills);
    }
}

class DataAnalyst extends Employee {

    boolean phd;
    String[] methods;

    DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = safeClone(methods);
    }

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return safeClone(methods);
    }
}