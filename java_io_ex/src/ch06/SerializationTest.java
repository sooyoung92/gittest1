package ch06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

	String name;
	String job;

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {

		return name + " , " + job;
	}

}

public class SerializationTest {

	public static void main(String[] args) {

		Person person1 = new Person("�̼���", "��ǥ�̻�");
		Person person2 = new Person("������", "���̻�");

		try (FileOutputStream fos = new FileOutputStream("serial.out")) {

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(person1);
			oos.writeObject(person2);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		///////////////////////////////////////////////

		try (FileInputStream fis = new FileInputStream("serial.out")) {

			ObjectInputStream ois = new ObjectInputStream(fis);

			try {

				Person p1 = (Person) ois.readObject();
				Person p2 = (Person) ois.readObject();
				System.out.println(p1);
				System.out.println(p2);

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
