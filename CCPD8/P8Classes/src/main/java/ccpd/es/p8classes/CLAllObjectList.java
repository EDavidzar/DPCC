/*
 * To change this template, choose Tools | Templates
 * *
 */
package ccpd.es.p8classes;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Emilio David Diaus López 2008-2021
 * @param <E>
 */
public class CLAllObjectList<E> extends ArrayList<E> {

    public CLAllObjectList<>() {
        super();

    }

    public CLAllObjectList(Collection<? extends E> c) {
        super(c);
    }

    public CLAllObjectList(int size) {
        super(size);
    }

}
