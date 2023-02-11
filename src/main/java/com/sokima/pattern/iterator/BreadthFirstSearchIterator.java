package com.sokima.pattern.iterator;

import com.sokima.pattern.iterator.node.Node;
import com.sokima.pattern.iterator.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implementation of {@link TreeIterator<E>}.
 * BreadthFirstSearchIterator traverses {@link Tree<E>} according to Breadth-First Search algorithm.
 * Implementation based on FIFO queue.
 *
 * @author Roman Denysov
 */
public class BreadthFirstSearchIterator<E> implements TreeIterator<E> {

    private final Queue<Node<E>> queue;

    public BreadthFirstSearchIterator(Node<E> vertex) {
        this.queue = new LinkedList<>();
        queue.add(vertex);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public E next() {
        Node<E> current = queue.poll();
        queue.addAll(current.child());
        return current.item();
    }
}
