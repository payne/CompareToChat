import java.util.*;
import java.io.*;

public class CompareableDemoApp {
				public static void main(String[] args) {
								Set<Person> set = new TreeSet<>();
								for (String a: args) {
									Person p = new Person(a);
									System.out.println(p);
									set.add(p);
								}
								System.out.println(set);
								System.out.println("Normal Termination.");
				}
}

class Person implements Comparable {
				private int age;
				private String name;
				Person(String asString) {
					// assume asString is like "Matt:53"
					int colon = asString.indexOf(':');
					name = asString.substring(0,colon);
					age = Integer.parseInt(asString.substring(colon+1));
				}

				public String toString() { return name + " " + age; }
				public int compareTo(Object other) {
								Person otherPerson = (Person) other;
								// ascending: 
								// return this.age - otherPerson.age;
								// decending:
								return otherPerson.age - this.age;
				}
}

