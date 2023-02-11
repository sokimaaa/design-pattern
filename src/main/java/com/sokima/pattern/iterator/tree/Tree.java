package com.sokima.pattern.iterator.tree;

import com.sokima.pattern.iterator.node.Node;

import java.util.Iterator;
import java.util.List;

/**
 * Interface describes methods to manipulate Tree.
 *
 * @param <E> - the type stores in {@link Node}
 * @author Roman Denysov
 */
public interface Tree<E> {
    Iterator<E> iteratorBFS();

    Iterator<E> iteratorDFS();

    // some other methods to manipulate tree
}
