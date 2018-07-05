import java.util.*;
import java.io.*;

public class CompareableDemoApp {
				public static void main(String[] args) {
								Set<String> set = new TreeSet<>();
								for (String a: args) {
									set.add(a);
								}
								System.out.println(set);
								System.out.println("Normal Termination.");
				}
}
								
