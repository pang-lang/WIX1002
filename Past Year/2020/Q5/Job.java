
package pyq201;

public class Job {
    protected String name;
    protected int noOfTask;
    protected int memory;

    public Job(String name, int noOfTask, int memory) {
        this.name = name;
        this.noOfTask = noOfTask;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public int getNoOfTask() {
        return noOfTask;
    }

    public int getMemory() {
        return memory;
    }
    
    public String toString(){
        return "Job Name: " + name + " Memory = " + memory + "GB" + " Number of Task = " + noOfTask;
    }
}
