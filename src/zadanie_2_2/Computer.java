package zadanie_2_2;

import java.util.Objects;

public class Computer implements Comparable<Computer> {
    private String nameComp;
    private double cpuSpeed;
    private int ramMemory;

    public Computer(String nameComp, double cpuSpeed, int ramMemory) {
        this.nameComp = nameComp;
        this.cpuSpeed = cpuSpeed;
        this.ramMemory = ramMemory;
    }

    public String getNameComp() {
        return nameComp;
    }

    public void setNameComp(String nameComp) {
        this.nameComp = nameComp;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computer)) return false;
        Computer computer = (Computer) o;
        return getCpuSpeed() == computer.getCpuSpeed() &&
                getRamMemory() == computer.getRamMemory() &&
                Objects.equals(getNameComp(), computer.getNameComp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameComp(), getCpuSpeed(), getRamMemory());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "nameComp='" + nameComp + '\'' +
                ", cpuSpeed=" + cpuSpeed +
                ", ramMemory=" + ramMemory +
                "}";
    }
    
    @Override
    public int compareTo(Computer o) {
        if (this.cpuSpeed > o.cpuSpeed) {
            return 1;
        } else if (this.cpuSpeed == o.cpuSpeed) {
            if (this.ramMemory > o.ramMemory) {
                return 1;
            } else if (this.ramMemory == o.ramMemory) {
                return this.nameComp.compareTo(o.nameComp);
            }
        }
        return -1;
    }
}
