package packageDay10;
import java.io.*;

class Dano1 implements Serializable {
    public int age;
    public int id;

    // Constructor
    Dano1(int age, int id) {
        this.age = age;
        this.id = id;
    }
}

public class SerializationProcess {
	
    // Serialization is the process of converting an object into a stream of
	//bytes to write the object to a file
    // Deserialization is the process of converting the stream 
	//of bytes back into an object, reading the file into the system
	
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dano1 a = new Dano1(23, 10);
        Dano1 ab = new Dano1(43, 434);

        // Serialization
        FileOutputStream fos = new FileOutputStream("R:\\File\\SerializationProcess.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
        oos.close();
        
        System.out.println("Object serialized successfully!");
        
        FileInputStream fi = new FileInputStream("R:\\File\\SerializationProcess.txt");
        ObjectInputStream ois = new ObjectInputStream(fi);
        ab = (Dano1)ois.readObject();
        
        System.out.println("Object deserialized successfully!");
        System.out.println("Age: " + ab.age + ", ID: " + ab.id);
        ois.close();
        
        
    }
}
