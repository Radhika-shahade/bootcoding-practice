package collections.arraylist.employeedetails;
////Keep 10k employees into arraylist and print their name, experience, salary, age
import java.util.ArrayList;
import java.util.Random;

public class RecordService {
    public ArrayList<Record> getRecords(int size)
    {
        ArrayList<Record> records= new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            Record record= buildRecord();
            records.add(record);

        }
        return records;

    }
    public Record buildRecord()
    {
        Record record= new Record();
        record.setName(getRandomName());
        record.setSalary(getRandomSalary());
        record.setAge(getAge());
        record.setExperience(getRandomExperience());
        return record;
    }
    private String getRandomName()
    {
        String name[]={"rina","tina","saurabh","ram","yash","suresh"};
        int randomIndex = new Random().nextInt(name.length);
        return name[randomIndex];
    }
    private float getRandomExperience()
    {
        float min=1;
        float max=15;
        return min+new Random().nextFloat(max-min);
    }
    private double getRandomSalary()
    {
        double min=10000.00;
        double max=1000000;
        return min+new Random().nextDouble(max-min);
    }
    private int getAge()
    {
        int min=22;
        int max=50;
        return min+new Random().nextInt(max-min);
    }


}
