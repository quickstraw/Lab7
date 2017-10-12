import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public LinkedList<String> list1, list2;

	public LinkedListTest() {
		list1 = new LinkedList<String>();
		list2 = new LinkedList<String>();
	}

	public void step2() {
		String[] strings = new String[] { "Tulsa", "Ada", "Broken Arrow", "Owasso" };
		for (int i = 0; i < strings.length; i++) {
			list1.add(strings[i]);
		}
	}

	public void step3() {
		String okc = "OKC";
		list1.add(1, okc);
	}

	public void step4() {
		String[] strings = new String[] { "74104", "74135", "foo", "hello world", "777" };
		for (int i = 0; i < strings.length; i++) {
			list2.add(strings[i]);
		}
	}

	public void step5() {
		Iterator<String> iter = list2.iterator();
		int i = 1;
		while(iter.hasNext()) {
			list1.add(i, iter.next());
			i += 2;
		}
	}

	public void step6() {
		boolean remove = false;
		for (int i = 0; i < list1.size(); i++) {
			if (remove) {
				list1.remove(i);
				i--;
			}
			remove = !remove;
		}
	}
	
	public LinkedList<String> step7() {
		LinkedList<String> out = new LinkedList<String>();
		Iterator<String> iter = list2.iterator();
		while(iter.hasNext()) {
			out.add(iter.next());
		}
		return out;
	}
	
	public static void main(String[] args) {
		LinkedListTest listTest = new LinkedListTest();
		listTest.step2();
		listTest.step3();
		listTest.step4();
		listTest.step5();
		listTest.step6();
		LinkedList<String> step7 = listTest.step7();
	}

}
