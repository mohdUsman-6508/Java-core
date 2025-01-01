package CollectionsFramework.Collection.List.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //LIFO
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        System.out.println(st.pop());
        System.out.println(st.contains(1));

        for (int val : st) {
            System.out.print(val + " ");
        }

        st.insertElementAt(2, 1);

        //linked list as stack
        LinkedList<Integer> l = new LinkedList<>();
        System.out.println();
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);

        l.removeLast();
        System.out.println(l);

        //ArrayList as stack
        ArrayList<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s);
        s.remove(s.size() - 1);
        System.out.println(s);

    }
}
