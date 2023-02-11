package com.sokima.pattern.iterator.tree;

import com.sokima.pattern.iterator.BreadthFirstSearchIterator;
import com.sokima.pattern.iterator.DepthFirstSearchIterator;
import com.sokima.pattern.iterator.node.Node;

import java.util.Iterator;

/**
 * Implements boilerplate code for Tree Collections.
 *
 * @param <E> - the type stores in {@link Node}
 * @author Roman Denysov
 */
public abstract class AbstractTree<E> implements Tree<E> {
    protected final Node<E> vertex;

    protected AbstractTree(Node<E> vertex) {
        this.vertex = vertex;
    }

    @Override
    public Iterator<E> iteratorBFS() {
        return new BreadthFirstSearchIterator<>(vertex);
    }

    @Override
    public Iterator<E> iteratorDFS() {
        return new DepthFirstSearchIterator<>(vertex);
    }
}
