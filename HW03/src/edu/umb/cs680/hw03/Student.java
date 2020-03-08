package edu.umb.cs680.hw03;

enum StudentStatus {
    INSTATE, OUTSTATE, INTL
}

public class Student {
    private String name, usAddr, foreignAddr;
    private int yrsinState, i20num;
    private StudentStatus status;
    private float tuition;

    private Student(String name, String usAddr, int yrsinState, int i20num, String foreignAddr, StudentStatus status) {
        this.name = name;
        this.usAddr = usAddr;
        this.yrsinState = yrsinState;
        this.i20num = i20num;
        this.foreignAddr = foreignAddr;
        this.status = status;
    }

    public static Student createInStateStudent(String name, String usAddr) {
        return new Student(name, usAddr, -1, -1, null, StudentStatus.INSTATE);
    }

    public static Student createOutStateStudent(String name, String usAddr, int yrsinState) {
        return new Student(name, usAddr, yrsinState, -1, null, StudentStatus.OUTSTATE);
    }

    public static Student createIntlStudent(String name, String usAddr, int i20num, String foreignAddr) {
        return new Student(name, usAddr, -1, i20num, foreignAddr, StudentStatus.INTL);
    }

    public float getTuition() {
        if (this.status == StudentStatus.INSTATE)
            return 1000;
        if (this.status == StudentStatus.OUTSTATE)
            return 2500;
        else
            return 5000;
    }

    public StudentStatus getStatus() {
        return this.status;
    }

    public static void main(String args[]) {
        Student intl = createIntlStudent("John", "1A", 1, "2B");
        System.out.println("The status of intl is " + intl.getStatus());
    }
}


