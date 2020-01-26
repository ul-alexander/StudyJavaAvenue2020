package Lesson12.Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        if (a.isEmpty() || b.isEmpty()) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>(a);
        list.addAll(b);
        return list;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        if (a.isEmpty() || b.isEmpty()) {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>(a);
        list.retainAll(b);
        return list;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws
            NullPointerException {

        HashSet<Integer> list = new HashSet<>(a);
        list.addAll(b);
        return list;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws
            NullPointerException {

        HashSet<Integer> list = new HashSet<>(a);
        list.retainAll(b);
        return list;

    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws
            NullPointerException {
        //Coll a
        ArrayList<Integer> intersection = new ArrayList<>(a);
        //Retain col b and col a
        intersection.retainAll(b);
        //Create result
        ArrayList<Integer> list = new ArrayList<>(a);
        //union all colections
        list.addAll(b);
        //remove collection a from b+a
        list.removeAll(intersection);

        return list;
    }

}
